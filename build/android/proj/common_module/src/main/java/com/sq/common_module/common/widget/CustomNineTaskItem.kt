package com.sq.common_module.common.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ContentLoadingProgressBar
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.common.utils.kt.parseColor
import com.sq.common_module.common.utils.kt.showView
import com.sq.common_module.common.utils.kt.singleClick

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/11/10
 * Time: 16:53
 * 备注：
 */
class CustomNineTaskItem constructor(context: Context, attributeSet: AttributeSet) :
    ConstraintLayout(context, attributeSet, 0) {

    var mTitleLabel: AppCompatTextView
    var mProgress: ContentLoadingProgressBar
    var mProgressLabel: AppCompatTextView
    var mSureLabel: AppCompatTextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.item_custom_nine_tast, this)

        mTitleLabel = view.findViewById(R.id.iv_title)
        mProgress = view.findViewById(R.id.v_progress)
        mProgressLabel = view.findViewById(R.id.tv_progress_label)
        mSureLabel = view.findViewById(R.id.tv_get_prize_num)

        val obtain = context.obtainStyledAttributes(attributeSet, R.styleable.CustomNineTaskItem)
        mTitleLabel.text = obtain.getString(R.styleable.CustomNineTaskItem_nineTaskTitle)
        mProgress.setProgressDrawableTiled(obtain.getDrawable(R.styleable.CustomNineTaskItem_nineTaskProgressBg))
        mProgress.max = obtain.getInt(R.styleable.CustomNineTaskItem_nineTaskProgressMax,1)
        mProgressLabel.setTextColor(obtain.getColor(R.styleable.CustomNineTaskItem_nineTaskProgressLabelColor,
            "#ffffff".parseColor()))
        mSureLabel.setBackgroundResource(obtain.getResourceId(R.styleable.CustomNineTaskItem_nineTaskButtonBg,
            0))

        val isShowProgress =
            obtain.getBoolean(R.styleable.CustomNineTaskItem_nineTaskShowProgress, true)
        if (isShowProgress) {
            mProgress.showView()
            mProgressLabel.showView()
        } else {
            mProgress.hideView()
            mProgressLabel.hideView()
        }
        obtain.recycle()
    }

    fun singleClick(block: () -> Unit) {
        mSureLabel.singleClick {
            block.invoke()
        }
    }
}
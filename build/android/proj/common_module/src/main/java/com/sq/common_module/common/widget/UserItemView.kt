package com.sq.common_module.common.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.inVisibleView
import com.sq.common_module.common.utils.kt.parseColor
import com.sq.common_module.common.utils.kt.showView

class UserItemView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null) :
    ConstraintLayout(context, attributeSet) {
    var mTopView: AppCompatTextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_user_item_view, this)
        mTopView = view.findViewById(R.id.tv_title)
        val tvLeftImage = view.findViewById<AppCompatImageView>(R.id.iv_mine_left)
        val obtain = context.obtainStyledAttributes(attributeSet, R.styleable.UserItemView)
        val stringTop = obtain.getString(R.styleable.UserItemView_userTitleContent)
        val tvLeftImageResource =
            obtain.getResourceId(R.styleable.UserItemView_mineLeftImage, -1)
        if (tvLeftImageResource > 0) tvLeftImage.setImageResource(tvLeftImageResource)
        val color = obtain.getColor(R.styleable.UserItemView_itemTitleColor, "#333333".parseColor())
        mTopView.text = stringTop
        mTopView.setTextColor(color)
        val visible = obtain.getBoolean(R.styleable.UserItemView_itemLineVisible, false)
        val ivLine = view.findViewById<AppCompatImageView>(R.id.v_line)
        if (visible) ivLine.showView() else ivLine.inVisibleView()
        val ivRight = obtain.getResourceId(R.styleable.UserItemView_userRightImage, -1)
        val ivArrow = view.findViewById<ImageView>(R.id.iv_arrow)
        if (ivRight > 0) ivArrow.setImageResource(ivRight)
        obtain.recycle()
    }
}
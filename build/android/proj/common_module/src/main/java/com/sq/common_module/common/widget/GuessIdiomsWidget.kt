package com.sq.common_module.common.widget

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.AnimatorListenerImpl
import com.sq.common_module.common.utils.kt.AnimatorUtils
import com.sq.common_module.common.utils.kt.handleBool

/**
 * Created by town
 * Date :  2022/10/31
 * Time : 10:16
 */
class GuessIdiomsWidget @JvmOverloads constructor(
    context: Context, private val attrs: AttributeSet?,
    private val defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val mList = arrayListOf<String>()
    private var mTvRow1: AppCompatTextView? = null
    private var mTvRow3: AppCompatTextView? = null
    private var mTvRow4: AppCompatTextView? = null
    private var mTvColumn1: AppCompatTextView? = null
    private var mTvColumn2: AppCompatTextView? = null
    private var mTvColumn3: AppCompatTextView? = null
    private var mTvGuessIdioms: AppCompatTextView? = null
    private var alphaGoneAnim: ObjectAnimator? = null
    private var alphaVisibleAnim: ObjectAnimator? = null
    private var animatorSet: AnimatorSet? = null

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_guess_idioms_widget, this)
        mTvRow1 = view.findViewById(R.id.tv_row_1)
        mTvRow3 = view.findViewById(R.id.tv_row_3)
        mTvRow4 = view.findViewById(R.id.tv_row_4)

        mTvColumn1 = view.findViewById(R.id.tv_column_1)
        mTvColumn2 = view.findViewById(R.id.tv_column_2)
        mTvColumn3 = view.findViewById(R.id.tv_column_3)

        mTvGuessIdioms = view.findViewById(R.id.tv_guess)
        animatorSet = AnimatorSet()
        setViewData()
    }

    private fun setViewData() {
        if (mList.isNotEmpty()) {
            mList.forEachIndexed { index, s ->
                when (index) {
                    0 -> mTvRow1?.text = s
                    1 -> mTvRow3?.text = s
                    2 -> mTvRow4?.text = s
                    3 -> mTvColumn1?.text = s
                    4 -> mTvColumn2?.text = s
                    5 -> mTvColumn3?.text = s
                }
            }
        }
    }


    fun setListData(list: List<String>) {
        mList.clear()
        mList.addAll(list)
        setViewData()
    }

    fun setGuessViewData(guess: String, correct: Boolean) {
        mTvGuessIdioms?.run {
            text = guess
            startVisibleAnim(this, correct)
        }

        correct.handleBool({
            mTvColumn1?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvColumn2?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvColumn3?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvRow1?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvRow3?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvRow4?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvGuessIdioms?.setBackgroundResource(R.drawable.ic_guess_box_3)
            mTvGuessIdioms?.setTextColor(Color.parseColor("#000000"))
        }, {
            mTvGuessIdioms?.setTextColor(Color.parseColor("#ff5a5a"))
        })
    }

    fun initGuessView() {
        initView(mTvColumn1!!)
        initView(mTvColumn2!!)
        initView(mTvColumn3!!)
        initView(mTvRow1!!)
        initView(mTvRow3!!)
        initView(mTvRow4!!)
        initView(mTvColumn1!!)

        mTvGuessIdioms?.run {
            scaleX = 1f
            scaleY = 1f
            setBackgroundResource(R.drawable.ic_guess_box_2)
            text = ""
        }
        mTvGuessIdioms?.setTextColor(Color.parseColor("#ff5a5a"))
    }

    private fun initView(textView: AppCompatTextView) {
        textView.run {
            scaleX = 1f
            scaleY = 1f
            setBackgroundResource(R.drawable.ic_guess_box_1)
        }
    }

    private fun startGoneAnim(view: View) {
        alphaGoneAnim = AnimatorUtils.setAlphaGoneAnim(view)
        alphaGoneAnim?.run {
            duration = 500
            addListener(object : AnimatorListenerImpl() {
                override fun onAnimationEnd(p0: Animator) {
                    alphaGoneAnim = null
                }
            })
            start()
        }

    }

    private fun startVisibleAnim(view: View, correct: Boolean) {
        alphaVisibleAnim = AnimatorUtils.setAlphaVisibleAnim(view)
        alphaVisibleAnim?.run {
            duration = 500
            addListener(object : AnimatorListenerImpl() {
                override fun onAnimationEnd(p0: Animator) {
                    alphaVisibleAnim = null
                    if (!correct) startGoneAnim(view) else {
                        //整体显示
                        setScale()
                    }
                }
            })
            start()
        }

    }

    private val scaleSize = 1.05f

    private fun setScale() {
        animatorSet?.duration = 500
        animatorSet?.play(AnimatorUtils.getScaleXAnim(mTvColumn1!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvColumn1!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvColumn2!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvColumn2!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvColumn3!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvColumn3!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvRow1!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvRow1!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvRow3!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvRow3!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvRow4!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvRow4!!, scaleSize))
            ?.with(AnimatorUtils.getScaleXAnim(mTvGuessIdioms!!, scaleSize))
            ?.with(AnimatorUtils.getScaleYAnim(mTvGuessIdioms!!, scaleSize))
        animatorSet?.start()
    }
}
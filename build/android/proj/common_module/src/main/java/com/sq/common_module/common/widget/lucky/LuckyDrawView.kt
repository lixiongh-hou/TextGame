package com.sq.common_module.common.widget.lucky

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sq.common_module.common.bean.NineGridPrizeBean
import com.sq.common_module.common.utils.kt.Decoration
import com.sq.common_module.common.widget.lucky.LuckyDrawUpView.AnimatorEndListener

/**
 * @Author xylitol
 * @Date 2020-11-26 15:47
 * @Desc 继承RecyclerView完成一个3X3的抽奖转盘
 */
class LuckyDrawView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {

    private val animator = ValueAnimator()
    private var luckyIndex = 4//最终抽中的位置
    private var lotteryStatus = 0//当前可以抽奖状态
//    private var onDrawClick: DrawClickListener
    private val adapter: LuckyDrawAdapter
    private var animatorEndClick: AnimatorEndListener? = null

    private var isFistInit = true

    init {
        animator.duration = 2000
        animator.setIntValues(0, 2 * 8 + luckyIndex)
        animator.interpolator = AccelerateDecelerateInterpolator()
        animator.addUpdateListener {
            val position = it.animatedValue as Int
            setCurrentPosition(position % 8)
        }

//        onDrawClick = object : DrawClickListener {
//            override fun onClickDraw() {
//
//            }
//        }
        adapter = LuckyDrawAdapter()
        setAdapter(adapter)
        layoutManager = object : GridLayoutManager(context, 3) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
    }

    fun setLastPosition(position: Int) {
        luckyIndex = position
        animator.setIntValues(0, 2 * 8 + luckyIndex)
        if (lotteryStatus == 0) {
            animator.start()
            lotteryStatus = 1
        }
    }

    fun setOnClick(click: DrawClickListener) {
        adapter.setOnDrawClickListener(click)
    }

    fun setType(type: Int) {
        adapter.setType(type)
        if (type == 5 && isFistInit){
            isFistInit = false
            addItemDecoration(Decoration.GridDecoration(3,10,10))
        }
    }

    fun setDataList(list: List<NineGridPrizeBean>) {
        adapter.setDataList(list)
    }

    fun setOnAnimatorListener(endListener: AnimatorEndListener) {
        animatorEndClick = endListener
        animator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                setCurrentPosition(luckyIndex)
                lotteryStatus = 0
                animatorEndClick?.onEnd()
            }
        })
    }

    private fun setCurrentPosition(position: Int) {
        //刷新当前所在位置
        adapter.setSelectionPosition(position)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        animator.cancel()
    }

    interface DrawClickListener {
        fun onClickDraw()
    }

    interface AnimatorEndListener {
        fun onEnd()
    }

}
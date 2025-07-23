package com.sq.common_module.common.utils.kt

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.blankj.utilcode.util.SizeUtils

import com.sq.common_module.R
import com.sq.common_module.common.utils.java.UIUtils

/**
 * Created by town
 * Date :  2023/6/1
 * Time : 17:55
 */
class RedAnimatorUtils {
    private var times = 0

    interface RedAnimatorCallback {
        fun end() {}
    }

    private var mCallBack: RedAnimatorCallback? = null
    private var animationSetList = arrayListOf<AnimationSet?>()
    private var startLocation: IntArray? = null
    private var anim_mask_layout: ViewGroup? = null//动画层

    init {
        startLocation = IntArray(2) // 一个整型数组，用来存储按钮的在屏幕的X、Y坐标
    }

    fun setAnim(
        context: Activity,
        redView: AppCompatImageView,
        startView: View?,
        endView: View?,
        time: Int, callback: RedAnimatorCallback
    ) {
        times = time
        mCallBack = callback
        redView.setImageResource(R.drawable.ic_small_red)
        startView?.getLocationInWindow(startLocation)
        anim_mask_layout = null
        anim_mask_layout = createAnimLayout(context)
        anim_mask_layout?.addView(redView) //把动画小球添加到动画层
        val view: View? = addViewToAnimLayout(
            anim_mask_layout, redView,
            startLocation
        )
        val endLocation = IntArray(2) // 存储动画结束位置的X、Y坐标
        endView?.getLocationInWindow(endLocation)


        // 计算位移
        val endX = 0 - startLocation!![0] + 40f // 动画位移的X坐标

        val endY = endLocation[1] - startLocation!![1] // 动画位移的y坐标
        val startX = SizeUtils.px2dp(UIUtils.getScreenWidthDp(context).toFloat()) / 2
        val translateAnimationX = TranslateAnimation(
            startX.toFloat(),
            endX.toFloat(), 0f, 0f
        )
        translateAnimationX.interpolator = AccelerateInterpolator()
        translateAnimationX.repeatCount = 0 // 动画重复执行的次数

        translateAnimationX.fillAfter = true

        val translateAnimationY = TranslateAnimation(
            0f, 0f,
            0f, endY.toFloat()
        )
        translateAnimationY.interpolator = AccelerateInterpolator()
        translateAnimationY.repeatCount = 0 // 动画重复执行的次数

        translateAnimationX.fillAfter = true

        val set = AnimationSet(false)
        set.fillAfter = false
        set.addAnimation(translateAnimationY)
        set.addAnimation(translateAnimationX)
        set.duration = 800 // 动画的执行时间

        view!!.startAnimation(set)
        // 动画监听事件
        // 动画监听事件
        set.setAnimationListener(object : Animation.AnimationListener {
            // 动画的开始
            override fun onAnimationStart(animation: Animation) {
                redView.visibility = View.VISIBLE
                //    Log.e("动画","asdasdasdasd");
            }

            override fun onAnimationRepeat(animation: Animation) {}

            // 动画的结束
            override fun onAnimationEnd(animation: Animation) {
                if (times == 1) {
                    mCallBack?.end()
                }
                redView.visibility = View.GONE
                set.cancel()
                animation.cancel()
            }
        })
    }

    /**
     * @Description: 创建动画层
     * @param
     * @return void
     * @throws
     */
    private fun createAnimLayout(context: Activity): ViewGroup? {
        val rootView = context.window.decorView as ViewGroup
        val animLayout = LinearLayout(context)
        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        animLayout.layoutParams = lp
        animLayout.id = Int.MAX_VALUE
        animLayout.setBackgroundResource(android.R.color.transparent)
        rootView.addView(animLayout)
        return animLayout
    }

    private fun addViewToAnimLayout(
        parent: ViewGroup?, view: View?,
        location: IntArray?
    ): View? {
        val x = location?.get(0)
        val y = location?.get(1)
        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        if (x != null) {
            lp.leftMargin = x
        }
        if (y != null) {
            lp.topMargin = y
        }
        view?.layoutParams = lp
        return view
    }


    fun onDestroy() {
        animationSetList.forEach {
            it?.cancel()
        }
    }
}
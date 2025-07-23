package com.sq.common_module.common.widget

import android.app.Activity
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.Display
import android.view.View.MeasureSpec
import android.view.WindowManager
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.isVisible
import com.sq.common_module.common.utils.java.L
import java.lang.Exception
import java.lang.ref.WeakReference
import java.util.*

/**
 * Created by town
 * Date :  2022/10/27
 * Time : 10:06
 * 自动移动view
 */
class AutoMoveImageView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet?,
    private val defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var movePeriodTime = 0 //每次移动间隔时间
    private var everyMoveDistance = 0 //移动距离
    private var fromRightMoveToLeft = false  //从右侧往左侧移动
    private var fromBottomMoveToTop = false //从底部向上移动
    private var isStartTimer = false // 是否开始开启timer
    private var mTimer: Timer? = null
    private var isStopMove = false
    private var isMove = false
    private var viewWidth = 0
    private var mStartRight = 0
    private var mStartBottom = 0
    private var viewHeight = 0
    private var mHandler: MyHandler? = null

    private inner class MyTimerTask : TimerTask() {
        override fun run() {
            mHandler?.sendEmptyMessage(1)
        }

    }

    companion object {
        class MyHandler(autoMoveImageView: AutoMoveImageView) : Handler() {
            private val weakReference: WeakReference<AutoMoveImageView> =
                WeakReference(autoMoveImageView)

            override fun dispatchMessage(msg: Message) {
                super.dispatchMessage(msg)
                weakReference.get()?.let {
                    when (msg.what) {
                        1 -> {
                            it.startViewMove()
                        }
                        else -> {}
                    }
                }
            }
        }
    }


    init {
        mHandler = MyHandler(this)
        movePeriodTime = 10
        everyMoveDistance = 2
        visibility = GONE
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        mStartRight = if (widthMode == MeasureSpec.EXACTLY) {
            widthSize
        } else {
            dp2px(100)
        }
        mStartBottom = if (heightMode == MeasureSpec.EXACTLY) {
            heightSize
        } else {
            dp2px(64)
        }
        setMeasuredDimension(mStartRight, mStartBottom)
    }

    private fun startViewMove() {
        var viewRight: Int
        var viewBottom: Int
        if (isStopMove) {
            visibility = GONE
            isMove = false
            stopTimer()
            return
        }
        visibility = VISIBLE
        isMove = true
        if (viewHeight != 0 && viewWidth != 0) {
            val right = right
            val bottom = bottom
            if (fromRightMoveToLeft) {
                //从右边向左边移动
                val lastRight = right - everyMoveDistance // 右边距离屏幕左侧
                viewRight = mStartRight
                if (lastRight < viewRight) {
                    fromRightMoveToLeft = false
                } else {
                    viewRight = right - everyMoveDistance
                }
            } else {
                //从左边向右边移动
                val lastRight = right + everyMoveDistance
                viewRight = viewWidth
                if (lastRight > viewRight) {
                    fromRightMoveToLeft = true
                } else {
                    viewRight = right + everyMoveDistance
                }
            }
            if (fromBottomMoveToTop) {
                //从下往上移动
                val lastBottom = bottom - everyMoveDistance
                viewBottom = mStartBottom
                if (lastBottom < viewBottom) {
                    fromBottomMoveToTop = false
                } else {
                    viewBottom = bottom - everyMoveDistance
                }
            } else {
                val lastBottom = bottom + everyMoveDistance
                viewBottom = viewHeight
                if (lastBottom > viewBottom) {
                    fromBottomMoveToTop = true
                } else {
                    viewBottom = bottom + everyMoveDistance
                }
            }
            val viewLeft = viewRight - mStartRight
            val viewTop = viewBottom - mStartBottom
            try {
                val layoutParams = layoutParams as RelativeLayout.LayoutParams
                if (layoutParams != null) {
                    layoutParams.setMargins(viewLeft, viewTop, viewRight, viewBottom)
                    setLayoutParams(layoutParams)
                }
            } catch (e: Exception) {
                stopViewMove()
                e.printStackTrace()
            }
        } else {
            layout(0, 0, mStartRight, mStartBottom)
        }
        startTimer()
    }

    fun stopViewMove() {
        movePeriodTime = 10
        isStopMove = true
        visibility = GONE
        stopTimer()
    }

    private fun startTimer() {
        if (isStartTimer) {
            return
        }
        //        C11622.m2281("FloatingWidget", "countdown== startTime");
        isStartTimer = true
        mTimer = Timer()
        mTimer!!.schedule(MyTimerTask(), 0L, movePeriodTime.toLong())
    }

    private fun stopTimer() {
        isStartTimer = false
        val timer = mTimer
        if (timer != null) {
            timer.cancel()
            mTimer!!.purge()
            mTimer = null
        }
    }

    /* renamed from: Ֆ */
    fun startMove() {
        L.i("wwb_visible", isMove.toString())
        if (isMove) {
            return
        }
        startViewMove()
    }

    private fun dp2px(i: Int): Int {
        //dp to px
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            i.toFloat(),
            resources.displayMetrics
        )
            .toInt()
    }

    fun initMove() {
        movePeriodTime = 10
        isStopMove = false
        isMove = false
    }


    fun setHeightDistance(i: Int): AutoMoveImageView {
        movePeriodTime *= 11 - i
        return this
    }

    fun initFloating(activity: Activity?): AutoMoveImageView {
        var defaultDisplay: Display? = null
        activity?.let {
            val displayMetrics = DisplayMetrics()
            val windowManager = activity.windowManager
            if (windowManager != null && windowManager.defaultDisplay.also {
                    defaultDisplay = it
                } != null) {
                defaultDisplay?.getMetrics(displayMetrics)
                viewWidth = displayMetrics.widthPixels
                viewHeight = displayMetrics.heightPixels
            }
        }
        return this
    }

}
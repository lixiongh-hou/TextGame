package com.sq.common_module.common.widget

import android.R
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.sq.common_module.common.utils.kt.AnimatorListenerImpl
import java.text.DecimalFormat
import android.R.attr.animation


/**
 * Created by town
 * Date :  2022/12/2
 * Time : 10:31
 */
class RunTextView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
) :
    AppCompatTextView(context, attributeSet, 0) {
    private var mDf: DecimalFormat? = null
    private var mValueAnimator: ValueAnimator? = null

    init {
        mDf = DecimalFormat("0.000")
        initAnim()
    }

    private fun initAnim() {
        mValueAnimator = ValueAnimator.ofFloat(0f, 0f)
        mValueAnimator?.duration = 1000
        mValueAnimator?.addUpdateListener { animation ->
            val value = animation.animatedValue as Float
            if (value > 0) { //当数值大于0的时候才赋值
                text = mDf!!.format(value.toDouble())
            }
        }

    }

    fun setMoney(money: Float) {
        mValueAnimator!!.setFloatValues(0f, money) //重新设置数值的变化区间
        mValueAnimator!!.start() //开启动画
    }

    /**
     * 取消动画和动画监听（优化内存）
     */
    fun cancel() {
        mValueAnimator!!.removeAllUpdateListeners() //清除监听事件
        mValueAnimator!!.cancel() //取消动画
    }
}
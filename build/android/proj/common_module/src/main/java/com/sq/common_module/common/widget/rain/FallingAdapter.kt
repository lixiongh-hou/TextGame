package com.sq.common_module.common.widget.rain

import android.graphics.Path
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.common.utils.kt.showView
import com.sq.common_module.common.utils.kt.singleClick
import java.util.*
import kotlin.collections.ArrayList

class FallingAdapter(val onclick: OnItemClick?) :
    FallingView.IFallingAdapter<Int>(R.layout.item_red_rain) {
    private val random = Random()
    private val animDuration = 5000L//物件动画时长
    private val count = 10//一屏显示物件的个数

    private val animInterval = ArrayList<Interval>()

    fun setData(data: List<Int>) {
        datas = data
    }

    private fun createPath(parent: ViewGroup, position: Int, view: View): Path =
        Path().apply {
            view.measure(0, 0)
            val width = parent.width - view.measuredWidth
            val height = parent.height
            val swing = width / 3f//x轴摆动范围
            //限制动画区间使物件分布均匀
            if (animInterval.isEmpty()) {
                animInterval.add(Interval(view.measuredWidth / 2f, swing))
                animInterval.add(Interval(swing, swing * 2))
                animInterval.add(Interval(swing * 2, parent.width - view.measuredWidth / 2f))
            }
//            "animInterval:${animInterval.size}".p()
            val interval: Interval
            if (animInterval.size == 1) {
                interval = animInterval[0]
            } else {
                interval = animInterval[random.nextInt(animInterval.size)]
            }
            animInterval.remove(interval)
            val startPointX = random.nextInt(width).toFloat()
            moveTo(startPointX, -view.measuredHeight.toFloat())

            //控制点
            var point1X = random.nextInt(interval.getLength().toInt()) + interval.start
            val point1Y = random.nextInt(height / 2).toFloat()

            var point2X = random.nextInt(interval.getLength().toInt()) + interval.start
            val point2Y = random.nextInt(height / 2).toFloat() + height / 2

            var point3X = random.nextInt(interval.getLength().toInt()) + interval.start

            cubicTo(point1X, point1Y, point2X, point2Y, point3X, height.toFloat())
        }


    override fun convert(parent: ViewGroup, holder: FallingView.Holder) {
        holder.view.findViewById<AppCompatTextView>(R.id.tv_red_amount).hideView()
        holder.config.startTime = holder.position * (animDuration / count)
        holder.view.setOnClickListener {//点中红包回调
//            holder.view.clearAnimation()
//            holder.view.visibility = View.GONE
            if (!singleClick()) return@setOnClickListener
            onclick?.onClick(holder.position)
            holder.view.findViewById<AppCompatTextView>(R.id.tv_red_amount).showView()
            Log.i("wwb_position", "convert: ${holder.position}")
        }
    }

    override fun convertAnim(parent: ViewGroup, holder: FallingView.Holder): Animation {
        val path = createPath(parent, holder.position, holder.view)
        holder.config.path = path
        //旋转方向
        val rotation: Float
        if (random.nextInt(2) == 0) {
            rotation = 30f * random.nextFloat()
        } else {
            rotation = -30f * random.nextFloat()
        }
        val redPackAnim = RedPackAnim(path, rotation, holder.view)
        //动画时长-下落速度
        redPackAnim.duration = (animDuration * (0.6 + random.nextInt(4) * 0.1)).toLong()
        return redPackAnim
    }

    //区间
    class Interval(val start: Float, val end: Float) {
        fun getLength() = end - start
    }

    interface OnItemClick {
        fun onClick(position: Int)
    }
}
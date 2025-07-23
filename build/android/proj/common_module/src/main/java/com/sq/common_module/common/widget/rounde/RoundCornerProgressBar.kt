package com.sq.common_module.common.widget.rounde

import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.annotation.FloatRange
import androidx.core.graphics.withSave
import com.sq.common_module.R
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.toColorInt
import com.sq.common_module.common.utils.kt.dpToPx

/**
 * Created by SamuelGjk on 2019/6/13.
 */
class RoundCornerProgressBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : View(context, attrs, defStyleAttr, defStyleRes) {

    companion object {
        private const val DEFAULT_STROKE_WIDTH: Float = 0F
        private const val DEFAULT_STROKE_COLOR: Int = 0xFFDAE1FE.toInt()
        private const val DEFAULT_PROGRESS_COLOR: Int = 0xFF6087DB.toInt()
    }

    private val strokePaint: Paint = Paint()
    private val progressPaint: Paint = Paint()
    private val progressPath: Path = Path()

    private var strokeWidth: Float = 0F
    private var strokeColor: Int = 0
    private var progressColor: Int = 0

    private var progress: Float = 0F

    init {
        context.withStyledAttributes(attrs, R.styleable.RoundCornerProgressBar) {

            strokeWidth = getDimension(
                R.styleable.RoundCornerProgressBar_rcpb_stroke_width,
                DEFAULT_STROKE_WIDTH.dpToPx.toFloat()
            )
            strokeColor =
                getColor(R.styleable.RoundCornerProgressBar_rcpb_stroke_color, DEFAULT_STROKE_COLOR)
            progressColor = getColor(
                R.styleable.RoundCornerProgressBar_rcpb_progress_color,
                DEFAULT_PROGRESS_COLOR
            )
            progress = getFloat(R.styleable.RoundCornerProgressBar_rcpb_progress, 0F)
            if (progress < 0F) {
                progress = 0F
            } else if (progress > 1F) {
                progress = 1F
            }

        }

        strokePaint.style = Paint.Style.FILL
        strokePaint.strokeWidth = strokeWidth
        strokePaint.color = strokeColor
        strokePaint.isAntiAlias = true

        progressPaint.style = Paint.Style.FILL
        progressPaint.color = progressColor
        progressPaint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val radius: Float = height / 2F

        drawStroke(canvas, radius)

        drawProgress(canvas, radius)
    }

    private fun drawStroke(canvas: Canvas, radius: Float) {
        val left: Float = paddingStart + strokeWidth / 2
        val top: Float = strokeWidth / 2
        val right: Float = width - paddingEnd - strokeWidth / 2
        val bottom: Float = height - strokeWidth / 2

        canvas.drawRoundRect(left, top, right, bottom, radius, radius, strokePaint)
    }

    private fun drawProgress(canvas: Canvas, radius: Float) {
        canvas.withSave {
            val left: Float = strokeWidth + paddingStart
            val top: Float = strokeWidth
            val right: Float =
                (width - paddingStart - paddingEnd - strokeWidth * 2) * progress + left
            val bottom: Float = height - strokeWidth

            progressPath.reset()
            progressPath.addRect(
                left, top, right, bottom, Path.Direction.CW
            )
            clipPath(progressPath)

            drawRoundRect(
                left,
                top,
                if (right < radius * 2 + left) radius * 2 + left else right,
                bottom,
                radius,
                radius,
                progressPaint
            )

        }
    }

    fun setProgressColor(color: String, backColor: String) {
        if (!TextUtils.isEmpty(color)) {
            progressPaint.color = color.toColorInt()
        }
        if (!TextUtils.isEmpty(backColor)) {
            strokePaint.color = backColor.toColorInt()
        }
    }

    private var valueAnimator: ValueAnimator? = null

    fun getProgress(): Float = progress

    fun setProgress(@FloatRange(from = 0.0, to = 1.0) progress: Float) {
        this.progress = progress
        invalidate()
    }

    fun setSmoothProgress(
        @FloatRange(from = 0.0, to = 1.0) progress: Float,
        duration: Long = 1000,
        animatorAdapter: AnimatorListenerAdapter
    ) {
        valueAnimator = ValueAnimator
            .ofFloat(this.progress, progress)
            .setDuration(duration)
        valueAnimator?.interpolator = LinearInterpolator()
        valueAnimator?.addUpdateListener { animation ->
            setProgress(animation.animatedValue as Float)
        }
        valueAnimator?.addListener(animatorAdapter)
        valueAnimator?.start()
    }

    fun cancelAnimator() {
        valueAnimator?.cancel()
    }

    fun pauseAnimator() {
        valueAnimator?.pause()
    }

    fun resumeAnimator() {
        valueAnimator?.resume()
    }
}
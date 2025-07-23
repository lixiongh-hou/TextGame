package com.sq.common_module.common.widget

import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.text.TextUtils
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import com.blankj.utilcode.util.SizeUtils
import com.sq.common_module.R


/**
 * Created by town
 * Date :  2023/9/3
 * Time : 18:02
 */
class MyProgressView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
) : View(context, attrs) {

    private val mRectPaint: Paint = Paint() //背景
    private val mPaintBorder = Paint()  //边框
    private var mBackPaint = Paint()
    private val mLinePaint = Paint()  //直线
    private var mRectAnimator: RectF? = null
    private var mRectBg: RectF? = null
    private var circleBitmap: Bitmap? = null
    private var bitmapCanvas: Canvas? = null
    private var mLinePath: Path? = null
    private var rectWidth = 600f
    private var rectHeight = 100f
    private var mProBackColor: Int = Color.parseColor("#ffffff")
    private var mProgressColor: Int = Color.parseColor("#000000")
    private var currentPercent = 0f
    private var currentProgress = 0
    private var maxProgress = 0

    private var actualWidth = 0
    private var actualHeight = 0
    private var moveDistance = 0f
    private var progressAnimator: ValueAnimator? = null

    init {
        initView(context)
    }


    private fun initView(context: Context) {
        val obtain = context.obtainStyledAttributes(attrs, R.styleable.MyProgressView)
        mProgressColor = obtain.getColor(R.styleable.MyProgressView_myProgressColor, mProgressColor)
        rectHeight = obtain.getDimension(R.styleable.MyProgressView_myProgressHeight, rectHeight)
        rectWidth = obtain.getDimension(R.styleable.MyProgressView_myProgressWidth, rectWidth)
        currentProgress = obtain.getInt(R.styleable.MyProgressView_current_progress, 0)
        maxProgress = obtain.getInt(R.styleable.MyProgressView_max_progress, 0)
        initPaint()
        initRect()
        Log.i("wwb_per", "initView: ${rectWidth}---${rectHeight}")
//        currentPercent = (currentProgress / maxProgress).toFloat()
        obtain.recycle()
    }

    private fun initPaint() {
        mLinePath = Path()
        mRectPaint.apply {
            color = mProBackColor
            isAntiAlias = true
            style = Paint.Style.STROKE
        }

        mLinePaint.apply {
            color = mProgressColor
            isAntiAlias = true
            style = Paint.Style.FILL_AND_STROKE
            xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        }
        mBackPaint.apply {
            color = mProBackColor
            isAntiAlias = true
            style = Paint.Style.FILL
        }
    }
    fun setProgressColor(color: String, backColor: String) {
        if (!TextUtils.isEmpty(color)) {
            mProgressColor = Color.parseColor(color)
        }
        if (!TextUtils.isEmpty(backColor)) {
            mProBackColor = Color.parseColor(backColor)
        }
        initPaint()
        initRect()
    }
    private fun initRect() {
        actualWidth = rectWidth.toInt()
        actualHeight = rectHeight.toInt()
        mRectAnimator = RectF(0F, 0f, actualWidth.toFloat(), actualHeight.toFloat())

        //这里用到了缓存 根据参数创建新位图
        circleBitmap = Bitmap.createBitmap(actualWidth, actualHeight, Bitmap.Config.ARGB_8888)
        //以该bitmap为底创建一块画布
        circleBitmap?.let {
            bitmapCanvas = Canvas(it)
        }
        // 绘制背景
        mRectBg = RectF(0f, 0f, actualWidth.toFloat(), actualHeight.toFloat())

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(rectWidth.toInt(), rectHeight.toInt()

            )
        } else if (widthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(rectWidth.toInt(), height)
        } else if (heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(width, rectHeight.toInt())
        }

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mRectBg?.let {
            bitmapCanvas?.drawRoundRect(it,
                SizeUtils.dp2px(26f).toFloat(),
                SizeUtils.dp2px(26f).toFloat(),
                mBackPaint)
        }

        mLinePath?.apply {
            reset()
            moveTo(moveDistance, -moveDistance)
            lineTo(moveDistance, actualHeight.toFloat())
            lineTo(0f, actualHeight.toFloat())
            lineTo(0f, 0f)
            close()
        }
        mLinePath?.let { bitmapCanvas?.drawPath(it, mLinePaint) }
        //裁剪图片
        circleBitmap?.let { canvas?.drawBitmap(it, 0f, 0f, null) }
        mRectAnimator?.let {
            canvas?.drawRoundRect(it,
                SizeUtils.dp2px(26f).toFloat(),
                SizeUtils.dp2px(26f).toFloat(),
                mRectPaint)
        }
    }

    fun setProgress(progress: Int, time: Long, animatorAdapter: AnimatorListenerAdapter) {
        val percent = progress / maxProgress.toFloat()
        currentProgress = progress
        //从0开始变化
        currentPercent = 0f
        moveDistance = 0f
//        Log.i("wwb_per ", "setProgress: ${percent}}---${currentPercent}---${maxProgress}")
        progressAnimator = ValueAnimator.ofFloat(0f, percent)

        progressAnimator?.apply {
            duration = time
            interpolator = AccelerateDecelerateInterpolator()
//            interpolator = AccelerateInterpolator()

            addUpdateListener { animator ->
                val value: Any = animator.animatedValue
//                Log.i("wwb_per", "initView: ${rectWidth}---${rectHeight}")
//                Log.i("wwb_ani", "setProgress: ${value as Float}")
                // 当前进度百分比，[0,1]
                currentPercent = (animator.animatedValue as Float).toFloat()
                moveDistance = currentPercent * actualWidth
                //重新绘制
                invalidate()
            }
            addListener(animatorAdapter)
            start()
        }

    }


    fun cancelAnimator() {
        progressAnimator?.cancel()
    }

    fun pauseAnimator() {
        progressAnimator?.pause()
    }

    fun resumeAnimator() {
        progressAnimator?.resume()
    }

}
package com.sq.common_module.common.widget

import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import androidx.appcompat.widget.AppCompatImageView
import androidx.cardview.widget.CardView
import com.opensource.svgaplayer.SVGADrawable
import com.opensource.svgaplayer.SVGAImageView
import com.opensource.svgaplayer.SVGAParser
import com.opensource.svgaplayer.SVGAVideoEntity
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.AnimatorUtils
import com.sq.common_module.common.utils.kt.dp
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.common.utils.kt.showView


/**
 * Created by town
 * Date :  2023/9/3
 * Time : 18:02
 */
class MyProgressViewRound @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
) :
    CardView(context, attrs,0) {

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

    private var mProgressBackgroundColor: Int = Color.parseColor("#FFFFFF")
    private var mProgressColor: Int = Color.parseColor("#000000")
    private var currentPercent = 0f
    private var currentProgress = 0
    private var maxProgress = 0

    private var mStartProgressColor: Int = Color.parseColor("#000000")
    private var mEndProgressColor: Int = Color.parseColor("#000000")
    private var mGradientDirection = -1 // -1 无渐变 1 上下 2 左右

    private var mRippleIcon: Int = R.drawable.yellow_ripple_bg_1



    private var actualWidth = 0
    private var actualHeight = 0
    private var moveDistance = 0f
    private var progressAnimator: ValueAnimator? = null


    private var animationScaleView: AppCompatImageView? = null
    private var btnScaleAnimator: AnimatorSet? = null
    private var mHandSvgImageView: SVGAImageView? = null

    init {
        initView(context)
    }


    private fun initView(context: Context) {
        val obtain = context.obtainStyledAttributes(attrs, R.styleable.MyProgressViewRound)
        mProgressColor =
            obtain.getColor(R.styleable.MyProgressViewRound_myProgressColorRound, mProgressColor)
        rectHeight =
            obtain.getDimension(R.styleable.MyProgressViewRound_myProgressHeightRound, rectHeight)
        rectWidth = obtain.getDimension(R.styleable.MyProgressViewRound_myProgressWidthRound, rectWidth)
        currentProgress = obtain.getInt(R.styleable.MyProgressViewRound_current_progressRound, 0)
        maxProgress = obtain.getInt(R.styleable.MyProgressViewRound_max_progressRound, 0)

        mGradientDirection = obtain.getInt(R.styleable.MyProgressViewRound_my_gradient_directionRound, mGradientDirection)
        mStartProgressColor = obtain.getColor(R.styleable.MyProgressViewRound_myStartProgressColorRound, mStartProgressColor)
        mEndProgressColor = obtain.getColor(R.styleable.MyProgressViewRound_myEndProgressColorRound, mEndProgressColor)
        mRippleIcon = obtain.getResourceId(R.styleable.MyProgressViewRound_myProgressRippleRound, mRippleIcon)

        mProgressBackgroundColor = obtain.getColor(R.styleable.MyProgressViewRound_my_progress_color_background,mProgressBackgroundColor)


        initPaint()
        initRect()
        Log.i("wwb_per", "initView: ${rectWidth}---${rectHeight}")
//        currentPercent = (currentProgress / maxProgress).toFloat()
        obtain.recycle()

        animationScaleView = AppCompatImageView(context)
        animationScaleView?.let {
            it.hideView()
            it.layoutParams = LayoutParams(10.dp.toInt(), 10.dp.toInt())
            it.setBackgroundResource(mRippleIcon)
            this.addView(it)
        }

        mHandSvgImageView = SVGAImageView(context)
        mHandSvgImageView?.let {
            it.hideView()
            it.translationZ = 20f
            it.loops = 0
            it.layoutParams = LayoutParams(50.dp.toInt(), 50.dp.toInt())
            this.addView(it)
        }
    }

    private fun initPaint() {
        mLinePath = Path()
        mRectPaint.apply {
            color = mProgressBackgroundColor
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
            color = mProgressBackgroundColor
            isAntiAlias = true
            style = Paint.Style.FILL
        }
    }
    fun setProgressBackground(color: Int){
        mProgressBackgroundColor=color
        initPaint()
        postInvalidate()
    }
    private fun initRect() {
        actualWidth = rectWidth.toInt()
        actualHeight = rectHeight.toInt()
        mRectAnimator = RectF(
            0F,
            0f,
            actualWidth.toFloat(),
            actualHeight.toFloat()
        )

        //这里用到了缓存 根据参数创建新位图
        circleBitmap =
            Bitmap.createBitmap(actualWidth, actualHeight, Bitmap.Config.ARGB_8888)
        //以该bitmap为底创建一块画布
        circleBitmap?.let {
            bitmapCanvas = Canvas(it)
        }
        // 绘制背景
        mRectBg = RectF(0f, 0f, actualWidth.toFloat(), actualHeight.toFloat())


        if (mGradientDirection != -1){
            if (mGradientDirection == 2){
                // 创建线性渐变色
                val shader = LinearGradient(0f,  0f,rectWidth ,0f , mStartProgressColor, mEndProgressColor, Shader.TileMode.CLAMP)
                // 设置画线的颜色为渐变色
                mLinePaint.shader = shader
            }else{
                // 创建线性渐变色
                val shader = LinearGradient(rectWidth,  0f,rectWidth ,rectHeight , mStartProgressColor, mEndProgressColor, Shader.TileMode.CLAMP)
                // 设置画线的颜色为渐变色
                mLinePaint.shader = shader
            }
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(
                rectWidth.toInt(), rectHeight.toInt()

            )
        } else if (widthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(rectWidth.toInt(), height)
        } else if (heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(width, rectHeight.toInt())
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        animationScaleView?.let {
            val left = ((rectWidth - it.width) / 2f).toInt()
            val top = ((rectHeight - it.height) / 2f).toInt()
            val right = left + it.width
            val bottom = top + it.height
            it.layout(left, top, right, bottom)
        }

        mHandSvgImageView?.let {
            val left = (rectWidth - it.width).toInt()
            val top = ((rectHeight - it.height) / 2f).toInt()
            val right = left + it.width
            val bottom = top + it.height
            it.layout(left, top, right, bottom)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mRectBg?.let { bitmapCanvas?.drawRoundRect(it, 54f, 54f, mBackPaint) }

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
        mRectAnimator?.let { canvas?.drawRoundRect(it, 54f, 54f, mRectPaint) }
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

    fun setProgress(progress: Int, time: Long, animatorAdapter: AnimatorListenerAdapter ,progressBlock:MyProgressViewRoundBlock? = null) {
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
                progressBlock?.onProgress(currentPercent)
                invalidate()
            }
            addListener(animatorAdapter)
            start()
        }
    }




    fun startScaleAnimation(){
        animationScaleView?.let {
            it.showView()
            btnScaleAnimator = AnimatorSet()
            btnScaleAnimator?.apply {
                interpolator = AccelerateDecelerateInterpolator()
                play(
                    AnimatorUtils.getScaleXAnim(it, 50f)
                        .also { it.repeatCount = Animation.INFINITE })
                    ?.with(AnimatorUtils.getScaleYAnim(it, 50f)
                        .also { it.repeatCount = Animation.INFINITE })
                duration = 1500L
                start()
            }
        }

        mHandSvgImageView?.let {
            it.showView()
            val parser = SVGAParser(context)
            parser.decodeFromAssets("guide_hand.svga", object : SVGAParser.ParseCompletion{
                override fun onComplete(videoItem: SVGAVideoEntity) {
                    val drawable = SVGADrawable(videoItem)
                    it.setImageDrawable(drawable)
                    it.startAnimation()
                }

                override fun onError() {

                }
            },null)
        }
    }

    fun endScaleAnimation(){
        btnScaleAnimator?.cancel()
        btnScaleAnimator = null
    }


    fun cancelAnimator() {
        btnScaleAnimator?.cancel()
        progressAnimator?.cancel()
    }

    interface MyProgressViewRoundBlock{
        fun onProgress(value:Float){}
    }

}
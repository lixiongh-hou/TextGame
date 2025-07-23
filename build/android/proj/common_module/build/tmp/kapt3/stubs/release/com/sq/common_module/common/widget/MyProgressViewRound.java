package com.sq.common_module.common.widget;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.opensource.svgaplayer.SVGADrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.kt.AnimatorUtils;

/**
 * Created by town
 * Date :  2023/9/3
 * Time : 18:02
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001JB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0002J\u0010\u00102\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u00010\rH\u0014J0\u00105\u001a\u00020.2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0014J\u0018\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bH\u0014J\u001e\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ*\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010FJ\u000e\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020\bJ\u0006\u0010I\u001a\u00020.R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/sq/common_module/common/widget/MyProgressViewRound;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actualHeight", "", "actualWidth", "animationScaleView", "Landroidx/appcompat/widget/AppCompatImageView;", "bitmapCanvas", "Landroid/graphics/Canvas;", "btnScaleAnimator", "Landroid/animation/AnimatorSet;", "circleBitmap", "Landroid/graphics/Bitmap;", "currentPercent", "", "currentProgress", "mBackPaint", "Landroid/graphics/Paint;", "mEndProgressColor", "mGradientDirection", "mHandSvgImageView", "Lcom/opensource/svgaplayer/SVGAImageView;", "mLinePaint", "mLinePath", "Landroid/graphics/Path;", "mPaintBorder", "mProgressBackgroundColor", "mProgressColor", "mRectAnimator", "Landroid/graphics/RectF;", "mRectBg", "mRectPaint", "mRippleIcon", "mStartProgressColor", "maxProgress", "moveDistance", "progressAnimator", "Landroid/animation/ValueAnimator;", "rectHeight", "rectWidth", "cancelAnimator", "", "endScaleAnimation", "initPaint", "initRect", "initView", "onDraw", "canvas", "onLayout", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setProgress", "progress", "time", "", "animatorAdapter", "Landroid/animation/AnimatorListenerAdapter;", "progressBlock", "Lcom/sq/common_module/common/widget/MyProgressViewRound$MyProgressViewRoundBlock;", "setProgressBackground", "color", "startScaleAnimation", "MyProgressViewRoundBlock", "common_module_release"})
public final class MyProgressViewRound extends androidx.cardview.widget.CardView {
    private final android.util.AttributeSet attrs = null;
    private final android.graphics.Paint mRectPaint = null;
    private final android.graphics.Paint mPaintBorder = null;
    private android.graphics.Paint mBackPaint;
    private final android.graphics.Paint mLinePaint = null;
    private android.graphics.RectF mRectAnimator;
    private android.graphics.RectF mRectBg;
    private android.graphics.Bitmap circleBitmap;
    private android.graphics.Canvas bitmapCanvas;
    private android.graphics.Path mLinePath;
    private float rectWidth = 600.0F;
    private float rectHeight = 100.0F;
    private int mProgressBackgroundColor;
    private int mProgressColor;
    private float currentPercent = 0.0F;
    private int currentProgress = 0;
    private int maxProgress = 0;
    private int mStartProgressColor;
    private int mEndProgressColor;
    private int mGradientDirection = -1;
    private int mRippleIcon;
    private int actualWidth = 0;
    private int actualHeight = 0;
    private float moveDistance = 0.0F;
    private android.animation.ValueAnimator progressAnimator;
    private androidx.appcompat.widget.AppCompatImageView animationScaleView;
    private android.animation.AnimatorSet btnScaleAnimator;
    private com.opensource.svgaplayer.SVGAImageView mHandSvgImageView;
    
    @kotlin.jvm.JvmOverloads
    public MyProgressViewRound(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MyProgressViewRound(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void initView(android.content.Context context) {
    }
    
    private final void initPaint() {
    }
    
    public final void setProgressBackground(int color) {
    }
    
    private final void initRect() {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas canvas) {
    }
    
    public final void setProgress(int progress, long time, @org.jetbrains.annotations.NotNull
    android.animation.AnimatorListenerAdapter animatorAdapter) {
    }
    
    public final void setProgress(int progress, long time, @org.jetbrains.annotations.NotNull
    android.animation.AnimatorListenerAdapter animatorAdapter, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.widget.MyProgressViewRound.MyProgressViewRoundBlock progressBlock) {
    }
    
    public final void startScaleAnimation() {
    }
    
    public final void endScaleAnimation() {
    }
    
    public final void cancelAnimator() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/widget/MyProgressViewRound$MyProgressViewRoundBlock;", "", "onProgress", "", "value", "", "common_module_release"})
    public static abstract interface MyProgressViewRoundBlock {
        
        public abstract void onProgress(float value);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            public static void onProgress(@org.jetbrains.annotations.NotNull
            com.sq.common_module.common.widget.MyProgressViewRound.MyProgressViewRoundBlock $this, float value) {
            }
        }
    }
}
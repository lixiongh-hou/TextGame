package com.sq.common_module.common.widget;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.*;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.blankj.utilcode.util.SizeUtils;
import com.sq.common_module.R;

/**
 * Created by town
 * Date :  2023/9/3
 * Time : 18:02
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010\'\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0014J\u0018\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0014J\u0006\u0010-\u001a\u00020$J\u0006\u0010.\u001a\u00020$J\u001e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020$2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/sq/common_module/common/widget/MyProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actualHeight", "", "actualWidth", "bitmapCanvas", "Landroid/graphics/Canvas;", "circleBitmap", "Landroid/graphics/Bitmap;", "currentPercent", "", "currentProgress", "mBackPaint", "Landroid/graphics/Paint;", "mLinePaint", "mLinePath", "Landroid/graphics/Path;", "mPaintBorder", "mProBackColor", "mProgressColor", "mRectAnimator", "Landroid/graphics/RectF;", "mRectBg", "mRectPaint", "maxProgress", "moveDistance", "progressAnimator", "Landroid/animation/ValueAnimator;", "rectHeight", "rectWidth", "cancelAnimator", "", "initPaint", "initRect", "initView", "onDraw", "canvas", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "pauseAnimator", "resumeAnimator", "setProgress", "progress", "time", "", "animatorAdapter", "Landroid/animation/AnimatorListenerAdapter;", "setProgressColor", "color", "", "backColor", "common_module_release"})
public final class MyProgressView extends android.view.View {
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
    private int mProBackColor;
    private int mProgressColor;
    private float currentPercent = 0.0F;
    private int currentProgress = 0;
    private int maxProgress = 0;
    private int actualWidth = 0;
    private int actualHeight = 0;
    private float moveDistance = 0.0F;
    private android.animation.ValueAnimator progressAnimator;
    
    @kotlin.jvm.JvmOverloads
    public MyProgressView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MyProgressView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final void initView(android.content.Context context) {
    }
    
    private final void initPaint() {
    }
    
    public final void setProgressColor(@org.jetbrains.annotations.NotNull
    java.lang.String color, @org.jetbrains.annotations.NotNull
    java.lang.String backColor) {
    }
    
    private final void initRect() {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas canvas) {
    }
    
    public final void setProgress(int progress, long time, @org.jetbrains.annotations.NotNull
    android.animation.AnimatorListenerAdapter animatorAdapter) {
    }
    
    public final void cancelAnimator() {
    }
    
    public final void pauseAnimator() {
    }
    
    public final void resumeAnimator() {
    }
}
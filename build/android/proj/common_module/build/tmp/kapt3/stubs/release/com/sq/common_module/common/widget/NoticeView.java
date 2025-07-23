package com.sq.common_module.common.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.java.L;

/**
 * @author : cpf
 * @date : 2/21/21
 * description : 垂直滚动消息
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001HB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0014J\b\u00109\u001a\u000208H\u0014J\u0010\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0014J(\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020\'2\u0006\u0010?\u001a\u00020\'2\u0006\u0010@\u001a\u00020\'2\u0006\u0010A\u001a\u00020\'H\u0014J\u0014\u0010B\u001a\u0002082\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u000208J\u0006\u0010G\u001a\u000208R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b$\u0010 R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001e\u00100\u001a\u00020\u001c8F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lcom/sq/common_module/common/widget/NoticeView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "data", "", "", "delayMs", "", "getDelayMs", "()J", "setDelayMs", "(J)V", "durationMs", "getDurationMs", "setDurationMs", "interpolator", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "job", "Lkotlinx/coroutines/Job;", "nowDis", "", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "paint2", "getPaint2", "paint2$delegate", "position", "", "getPosition", "()I", "setPosition", "(I)V", "startDis", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "()F", "setTextSize", "(F)V", "valueAnimator", "Landroid/animation/ValueAnimator;", "onAttachedToWindow", "", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "setData", "setOnItemClickListener", "itemClickListener", "Lcom/sq/common_module/common/widget/NoticeView$OnNoticeItemClickListener;", "startAnimInternal", "stopAnimInternal", "OnNoticeItemClickListener", "common_module_release"})
public final class NoticeView extends android.view.View {
    private kotlinx.coroutines.Job job;
    private android.animation.ValueAnimator valueAnimator;
    private float startDis = 0.0F;
    private float nowDis = 0.0F;
    private java.util.List<java.lang.String> data;
    private final kotlin.Lazy paint$delegate = null;
    private final kotlin.Lazy paint2$delegate = null;
    private int position = 0;
    
    /**
     * 字体大小，默认为View高度的1/3
     */
    @androidx.annotation.Px
    private float textSize;
    
    /**
     * 字体颜色，默认为GRAY
     */
    @androidx.annotation.ColorInt
    private int textColor;
    
    /**
     * 滚动动画时间，单位毫秒
     */
    private long durationMs;
    
    /**
     * 滚动延迟时间，单位毫秒
     */
    private long delayMs;
    
    /**
     * 动画插值器
     */
    @org.jetbrains.annotations.NotNull
    private android.view.animation.Interpolator interpolator;
    
    public NoticeView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final android.graphics.Paint getPaint() {
        return null;
    }
    
    private final android.graphics.Paint getPaint2() {
        return null;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    public final void setTextSize(float p0) {
    }
    
    public final float getTextSize() {
        return 0.0F;
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    public final void setTextColor(int p0) {
    }
    
    public final long getDurationMs() {
        return 0L;
    }
    
    public final void setDurationMs(long p0) {
    }
    
    public final long getDelayMs() {
        return 0L;
    }
    
    public final void setDelayMs(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.animation.Interpolator getInterpolator() {
        return null;
    }
    
    public final void setInterpolator(@org.jetbrains.annotations.NotNull
    android.view.animation.Interpolator p0) {
    }
    
    /**
     * 设置数据
     */
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> data) {
    }
    
    /**
     * 设置Item点击事件
     */
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.NoticeView.OnNoticeItemClickListener itemClickListener) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    public final void startAnimInternal() {
    }
    
    public final void stopAnimInternal() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/widget/NoticeView$OnNoticeItemClickListener;", "", "onNoticeItemClick", "", "position", "", "common_module_release"})
    public static abstract interface OnNoticeItemClickListener {
        
        public abstract void onNoticeItemClick(int position);
    }
}
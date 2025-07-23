package com.sq.common_module.common.widget.rounde;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import com.sq.common_module.R;

/**
 * Created by SamuelGjk on 2019/6/13.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0006\u0010\u001d\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\u0010\u0010!\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J\"\u0010&\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/sq/common_module/common/widget/rounde/RoundCornerProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "progress", "", "progressColor", "progressPaint", "Landroid/graphics/Paint;", "progressPath", "Landroid/graphics/Path;", "strokeColor", "strokePaint", "strokeWidth", "valueAnimator", "Landroid/animation/ValueAnimator;", "cancelAnimator", "", "drawProgress", "canvas", "Landroid/graphics/Canvas;", "radius", "drawStroke", "getProgress", "onDraw", "pauseAnimator", "resumeAnimator", "setProgress", "setProgressColor", "color", "", "backColor", "setSmoothProgress", "duration", "", "animatorAdapter", "Landroid/animation/AnimatorListenerAdapter;", "Companion", "common_module_release"})
public final class RoundCornerProgressBar extends android.view.View {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.widget.rounde.RoundCornerProgressBar.Companion Companion = null;
    private static final float DEFAULT_STROKE_WIDTH = 0.0F;
    private static final int DEFAULT_STROKE_COLOR = -2432514;
    private static final int DEFAULT_PROGRESS_COLOR = -10450981;
    private final android.graphics.Paint strokePaint = null;
    private final android.graphics.Paint progressPaint = null;
    private final android.graphics.Path progressPath = null;
    private float strokeWidth = 0.0F;
    private int strokeColor = 0;
    private int progressColor = 0;
    private float progress = 0.0F;
    private android.animation.ValueAnimator valueAnimator;
    
    @kotlin.jvm.JvmOverloads
    public RoundCornerProgressBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public RoundCornerProgressBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public RoundCornerProgressBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public RoundCornerProgressBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void drawStroke(android.graphics.Canvas canvas, float radius) {
    }
    
    private final void drawProgress(android.graphics.Canvas canvas, float radius) {
    }
    
    public final void setProgressColor(@org.jetbrains.annotations.NotNull
    java.lang.String color, @org.jetbrains.annotations.NotNull
    java.lang.String backColor) {
    }
    
    public final float getProgress() {
        return 0.0F;
    }
    
    public final void setProgress(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float progress) {
    }
    
    public final void setSmoothProgress(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float progress, long duration, @org.jetbrains.annotations.NotNull
    android.animation.AnimatorListenerAdapter animatorAdapter) {
    }
    
    public final void cancelAnimator() {
    }
    
    public final void pauseAnimator() {
    }
    
    public final void resumeAnimator() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sq/common_module/common/widget/rounde/RoundCornerProgressBar$Companion;", "", "()V", "DEFAULT_PROGRESS_COLOR", "", "DEFAULT_STROKE_COLOR", "DEFAULT_STROKE_WIDTH", "", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
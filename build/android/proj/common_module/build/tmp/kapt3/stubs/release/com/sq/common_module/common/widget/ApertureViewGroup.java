package com.sq.common_module.common.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import com.sq.common_module.R;

/**
 * @ClassName: apertureView
 * @Author: 史大拿
 * @CreateDate: 11/28/22$ 1:35 PM$
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J(\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b\'\u0010(\u00a8\u00063"}, d2 = {"Lcom/sq/common_module/common/widget/ApertureViewGroup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "getAnimator", "()Landroid/animation/ObjectAnimator;", "animator$delegate", "Lkotlin/Lazy;", "color1", "Landroid/graphics/LinearGradient;", "getColor1", "()Landroid/graphics/LinearGradient;", "color1$delegate", "color2", "getColor2", "color2$delegate", "value", "", "currentSpeed", "setCurrentSpeed", "(F)V", "mBorderAngle", "mBorderWidth", "mColor1", "mColor2", "mDuration", "mMiddleColor", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "rectF$delegate", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "common_module_release"})
public final class ApertureViewGroup extends android.widget.LinearLayout {
    private int mColor1 = 0;
    private int mColor2 = 0;
    private float mBorderWidth = 0.0F;
    private float mBorderAngle = 0.0F;
    private int mDuration = 0;
    private int mMiddleColor = 0;
    private final android.graphics.Paint paint = null;
    private final kotlin.Lazy rectF$delegate = null;
    private final kotlin.Lazy color1$delegate = null;
    private final kotlin.Lazy color2$delegate = null;
    private final kotlin.Lazy animator$delegate = null;
    private float currentSpeed = 0.0F;
    
    @kotlin.jvm.JvmOverloads
    public ApertureViewGroup(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ApertureViewGroup(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ApertureViewGroup(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final android.graphics.RectF getRectF() {
        return null;
    }
    
    private final android.graphics.LinearGradient getColor1() {
        return null;
    }
    
    private final android.graphics.LinearGradient getColor2() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getAnimator() {
        return null;
    }
    
    private final void setCurrentSpeed(float value) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override
    protected void dispatchDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}
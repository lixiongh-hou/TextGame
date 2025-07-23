package com.sq.common_module.common.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.kt.AnimatorListenerImpl;
import com.sq.common_module.common.utils.kt.AnimatorUtils;

/**
 * Created by town
 * Date :  2022/10/31
 * Time : 10:16
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010\'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/sq/common_module/common/widget/GuessIdiomsWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alphaGoneAnim", "Landroid/animation/ObjectAnimator;", "alphaVisibleAnim", "animatorSet", "Landroid/animation/AnimatorSet;", "mList", "Ljava/util/ArrayList;", "", "mTvColumn1", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvColumn2", "mTvColumn3", "mTvGuessIdioms", "mTvRow1", "mTvRow3", "mTvRow4", "scaleSize", "", "initGuessView", "", "initView", "textView", "setGuessViewData", "guess", "correct", "", "setListData", "list", "", "setScale", "setViewData", "startGoneAnim", "view", "Landroid/view/View;", "startVisibleAnim", "common_module_release"})
public final class GuessIdiomsWidget extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.util.AttributeSet attrs = null;
    private final int defStyleAttr = 0;
    private final java.util.ArrayList<java.lang.String> mList = null;
    private androidx.appcompat.widget.AppCompatTextView mTvRow1;
    private androidx.appcompat.widget.AppCompatTextView mTvRow3;
    private androidx.appcompat.widget.AppCompatTextView mTvRow4;
    private androidx.appcompat.widget.AppCompatTextView mTvColumn1;
    private androidx.appcompat.widget.AppCompatTextView mTvColumn2;
    private androidx.appcompat.widget.AppCompatTextView mTvColumn3;
    private androidx.appcompat.widget.AppCompatTextView mTvGuessIdioms;
    private android.animation.ObjectAnimator alphaGoneAnim;
    private android.animation.ObjectAnimator alphaVisibleAnim;
    private android.animation.AnimatorSet animatorSet;
    private final float scaleSize = 1.05F;
    
    @kotlin.jvm.JvmOverloads
    public GuessIdiomsWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GuessIdiomsWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void setViewData() {
    }
    
    public final void setListData(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list) {
    }
    
    public final void setGuessViewData(@org.jetbrains.annotations.NotNull
    java.lang.String guess, boolean correct) {
    }
    
    public final void initGuessView() {
    }
    
    private final void initView(androidx.appcompat.widget.AppCompatTextView textView) {
    }
    
    private final void startGoneAnim(android.view.View view) {
    }
    
    private final void startVisibleAnim(android.view.View view, boolean correct) {
    }
    
    private final void setScale() {
    }
}
package com.sq.common_module.common.widget.lucky;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sq.common_module.common.bean.NineGridPrizeBean;
import com.sq.common_module.common.utils.kt.Decoration;
import com.sq.common_module.common.widget.lucky.LuckyDrawUpView.AnimatorEndListener;

/**
 * @Author xylitol
 * @Date 2020-11-26 15:47
 * @Desc 继承RecyclerView完成一个3X3的抽奖转盘
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002#$B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0014\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawAdapter;", "animator", "Landroid/animation/ValueAnimator;", "animatorEndClick", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawView$AnimatorEndListener;", "isFistInit", "", "lotteryStatus", "luckyIndex", "onDetachedFromWindow", "", "setCurrentPosition", "position", "setDataList", "list", "", "Lcom/sq/common_module/common/bean/NineGridPrizeBean;", "setLastPosition", "setOnAnimatorListener", "endListener", "setOnClick", "click", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawView$DrawClickListener;", "setType", "type", "AnimatorEndListener", "DrawClickListener", "common_module_release"})
public final class LuckyDrawView extends androidx.recyclerview.widget.RecyclerView {
    private final android.animation.ValueAnimator animator = null;
    private int luckyIndex = 4;
    private int lotteryStatus = 0;
    private final com.sq.common_module.common.widget.lucky.LuckyDrawAdapter adapter = null;
    private com.sq.common_module.common.widget.lucky.LuckyDrawView.AnimatorEndListener animatorEndClick;
    private boolean isFistInit = true;
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setLastPosition(int position) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawView.DrawClickListener click) {
    }
    
    public final void setType(int type) {
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> list) {
    }
    
    public final void setOnAnimatorListener(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawView.AnimatorEndListener endListener) {
    }
    
    private final void setCurrentPosition(int position) {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawView$DrawClickListener;", "", "onClickDraw", "", "common_module_release"})
    public static abstract interface DrawClickListener {
        
        public abstract void onClickDraw();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawView$AnimatorEndListener;", "", "onEnd", "", "common_module_release"})
    public static abstract interface AnimatorEndListener {
        
        public abstract void onEnd();
    }
}
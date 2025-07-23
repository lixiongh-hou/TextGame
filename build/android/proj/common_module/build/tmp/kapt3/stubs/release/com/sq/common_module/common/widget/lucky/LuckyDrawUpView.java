package com.sq.common_module.common.widget.lucky;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sq.common_module.R;
import com.sq.common_module.common.bean.NineGridPrizeBean;
import com.sq.common_module.common.utils.kt.Decoration;
import com.sq.common_module.common.widget.lucky.LuckyDrawView.AnimatorEndListener;

/**
 * @Author xylitol
 * @Date 2020-11-26 15:47
 * @Desc 继承RecyclerView完成一个3X3的抽奖转盘
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\'()B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0014\u0010\u001b\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpAdapter;", "animator", "Landroid/animation/ValueAnimator;", "animatorEndClick", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$AnimatorEndListener;", "dataLiStArr", "Ljava/util/ArrayList;", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$LuckyDataBean;", "Lkotlin/collections/ArrayList;", "isFistInit", "", "lotteryStatus", "luckyIndex", "onDetachedFromWindow", "", "setCurrentPosition", "position", "setDataList", "list", "", "Lcom/sq/common_module/common/bean/NineGridPrizeBean;", "setLastPosition", "setOnAnimatorListener", "endListener", "setOnClick", "click", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$DrawClickListener;", "setType", "type", "AnimatorEndListener", "DrawClickListener", "LuckyDataBean", "common_module_release"})
public final class LuckyDrawUpView extends androidx.recyclerview.widget.RecyclerView {
    private final android.animation.ValueAnimator animator = null;
    private int luckyIndex = 4;
    private int lotteryStatus = 0;
    private final com.sq.common_module.common.widget.lucky.LuckyDrawUpAdapter adapter = null;
    private com.sq.common_module.common.widget.lucky.LuckyDrawUpView.AnimatorEndListener animatorEndClick;
    private boolean isFistInit = true;
    private java.util.ArrayList<com.sq.common_module.common.widget.lucky.LuckyDrawUpView.LuckyDataBean> dataLiStArr;
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawUpView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawUpView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public LuckyDrawUpView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setLastPosition(int position) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawUpView.DrawClickListener click) {
    }
    
    public final void setType(int type) {
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> list) {
    }
    
    public final void setOnAnimatorListener(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawUpView.AnimatorEndListener endListener) {
    }
    
    private final void setCurrentPosition(int position) {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$DrawClickListener;", "", "onClickDraw", "", "common_module_release"})
    public static abstract interface DrawClickListener {
        
        public abstract void onClickDraw();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$AnimatorEndListener;", "", "onEnd", "", "common_module_release"})
    public static abstract interface AnimatorEndListener {
        
        public abstract void onEnd();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012\u00a8\u0006*"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$LuckyDataBean;", "", "unSelectRes", "", "selectRes", "midRes", "midColor", "unSelectColor", "selectColor", "isHuawei", "", "(IIIIIIZ)V", "()Z", "setHuawei", "(Z)V", "getMidColor", "()I", "setMidColor", "(I)V", "getMidRes", "setMidRes", "getSelectColor", "setSelectColor", "getSelectRes", "setSelectRes", "getUnSelectColor", "setUnSelectColor", "getUnSelectRes", "setUnSelectRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "common_module_release"})
    public static final class LuckyDataBean {
        private int unSelectRes;
        private int selectRes;
        private int midRes;
        private int midColor;
        private int unSelectColor;
        private int selectColor;
        private boolean isHuawei;
        
        @org.jetbrains.annotations.NotNull
        public final com.sq.common_module.common.widget.lucky.LuckyDrawUpView.LuckyDataBean copy(int unSelectRes, int selectRes, int midRes, int midColor, int unSelectColor, int selectColor, boolean isHuawei) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public LuckyDataBean() {
            super();
        }
        
        public LuckyDataBean(int unSelectRes, int selectRes, int midRes, int midColor, int unSelectColor, int selectColor, boolean isHuawei) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getUnSelectRes() {
            return 0;
        }
        
        public final void setUnSelectRes(int p0) {
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSelectRes() {
            return 0;
        }
        
        public final void setSelectRes(int p0) {
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getMidRes() {
            return 0;
        }
        
        public final void setMidRes(int p0) {
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getMidColor() {
            return 0;
        }
        
        public final void setMidColor(int p0) {
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getUnSelectColor() {
            return 0;
        }
        
        public final void setUnSelectColor(int p0) {
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getSelectColor() {
            return 0;
        }
        
        public final void setSelectColor(int p0) {
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean isHuawei() {
            return false;
        }
        
        public final void setHuawei(boolean p0) {
        }
    }
}
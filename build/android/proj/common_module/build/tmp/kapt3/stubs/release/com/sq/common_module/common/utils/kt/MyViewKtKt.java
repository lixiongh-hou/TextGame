package com.sq.common_module.common.utils.kt;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0016\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u000f*\u00020\u0010\u001a\u001e\u0010\u0012\u001a\u00020\u000f*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0003\u001a\u0016\u0010\u0017\u001a\u00020\u000f*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015\u001a\u001e\u0010\u0017\u001a\u00020\u000f*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0018\u001a\u00020\u0019\u001a#\u0010\u001a\u001a\u00020\u000f*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003\u001a\u001a\u0010\"\u001a\u00020\u000f*\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003\u001a\"\u0010&\u001a\u00020\u000f*\u00020\'2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003\u001a\u0012\u0010(\u001a\u00020\u000f*\u00020\u00102\u0006\u0010)\u001a\u00020\u0019\u001a\n\u0010*\u001a\u00020\u000f*\u00020\u0010\u001a0\u0010+\u001a\u00020\u000f*\u00020,2\u000e\b\u0004\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0.2\u000e\b\u0004\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0.H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00060"}, d2 = {"getAllRoundBg", "Landroid/graphics/drawable/GradientDrawable;", "v", "", "radii", "getBgDrawable", "getLeftGradientDrawable", "array", "", "v1", "", "v2", "getLeftGradientDrawableR", "getTopGradientDrawable", "hideView", "", "Landroid/view/View;", "inVisibleView", "initGridRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "myBaseAdapter", "Lcom/sq/common_module/common/utils/kt/MyBaseAdapter;", "count", "initLinearRecycler", "isHorizontal", "", "loadNetImage", "Landroid/widget/ImageView;", "url", "placeHolder", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "setBackGroundRes", "r1", "r2", "setDrawableImg", "Landroid/widget/TextView;", "type", "res", "setImageRes", "Landroidx/appcompat/widget/AppCompatImageView;", "showOrHide", "show", "showView", "startRefreshLoadMore", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "refresh", "Lkotlin/Function0;", "loadMore", "common_module_release"})
public final class MyViewKtKt {
    
    /**
     * Created by town
     * Date :  2022/10/12
     * Time : 14:09
     */
    public static final void hideView(@org.jetbrains.annotations.NotNull
    android.view.View $this$hideView) {
    }
    
    public static final void showView(@org.jetbrains.annotations.NotNull
    android.view.View $this$showView) {
    }
    
    public static final void inVisibleView(@org.jetbrains.annotations.NotNull
    android.view.View $this$inVisibleView) {
    }
    
    public static final void showOrHide(@org.jetbrains.annotations.NotNull
    android.view.View $this$showOrHide, boolean show) {
    }
    
    public static final void setBackGroundRes(@org.jetbrains.annotations.NotNull
    android.view.View $this$setBackGroundRes, boolean v, int r1, int r2) {
    }
    
    public static final void setDrawableImg(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setDrawableImg, int type, int res) {
    }
    
    public static final void loadNetImage(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$loadNetImage, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.Integer placeHolder) {
    }
    
    public static final void initLinearRecycler(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$initLinearRecycler, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<?> myBaseAdapter) {
    }
    
    public static final void initLinearRecycler(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$initLinearRecycler, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<?> myBaseAdapter, boolean isHorizontal) {
    }
    
    public static final void initGridRecycler(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$initGridRecycler, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<?> myBaseAdapter, int count) {
    }
    
    public static final void startRefreshLoadMore(@org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.SmartRefreshLayout $this$startRefreshLoadMore, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> loadMore) {
    }
    
    public static final void setImageRes(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatImageView $this$setImageRes, boolean v, int r1, int r2) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getBgDrawable(int v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getTopGradientDrawable(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getLeftGradientDrawable(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getLeftGradientDrawableR(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getLeftGradientDrawableR(@org.jetbrains.annotations.NotNull
    java.lang.String v1, @org.jetbrains.annotations.NotNull
    java.lang.String v2, int radii) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getTopGradientDrawable(@org.jetbrains.annotations.NotNull
    int[] array) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getLeftGradientDrawable(@org.jetbrains.annotations.NotNull
    int[] array, int radii) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.GradientDrawable getAllRoundBg(int v, int radii) {
        return null;
    }
}
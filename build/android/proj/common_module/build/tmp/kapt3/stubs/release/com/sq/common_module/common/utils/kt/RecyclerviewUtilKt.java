package com.sq.common_module.common.utils.kt;

import android.view.View;
import com.chad.library.adapter.base.BaseDelegateMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001aD\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\r2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a0\u0010\u000e\u001a\u00020\u000f*\u00020\t2\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00102\u000e\b\u0004\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0012"}, d2 = {"setMultiRecyclerListData", "", "T", "t", "", "page", "adapter", "Lcom/sq/common_module/common/utils/kt/MyDelegateMultiAdapter;", "refresh", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "mEmptyView", "Landroid/view/View;", "setRecyclerListData", "Lcom/sq/common_module/common/utils/kt/MyBaseAdapter;", "setRefreshAndLoadMore", "", "Lkotlin/Function0;", "loadMore", "common_module_release"})
public final class RecyclerviewUtilKt {
    
    public static final <T extends java.lang.Object>int setRecyclerListData(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> t, int page, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<T> adapter, @org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.SmartRefreshLayout refresh, @org.jetbrains.annotations.Nullable
    android.view.View mEmptyView) {
        return 0;
    }
    
    public static final <T extends java.lang.Object>int setMultiRecyclerListData(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> t, int page, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyDelegateMultiAdapter<T> adapter, @org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.SmartRefreshLayout refresh, @org.jetbrains.annotations.Nullable
    android.view.View mEmptyView) {
        return 0;
    }
    
    public static final void setRefreshAndLoadMore(@org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.SmartRefreshLayout $this$setRefreshAndLoadMore, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> loadMore) {
    }
}
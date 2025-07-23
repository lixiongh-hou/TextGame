package com.sq.common_module.common.utils.kt;

import android.view.View;
import com.chad.library.adapter.base.BaseDelegateMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

/**
 * Created by town.
 * Date: 2021/12/23
 * Time: 6:07 下午
 * 统一处理recyclerview
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/sq/common_module/common/utils/kt/MyBaseAdapter;", "T", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "layout", "", "(I)V", "convert", "", "holder", "item", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "common_module_release"})
public class MyBaseAdapter<T extends java.lang.Object> extends com.chad.library.adapter.base.BaseQuickAdapter<T, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    
    public MyBaseAdapter(int layout) {
        super(0, null);
    }
    
    @java.lang.Override
    protected void convert(@org.jetbrains.annotations.NotNull
    com.chad.library.adapter.base.viewholder.BaseViewHolder holder, T item) {
    }
}
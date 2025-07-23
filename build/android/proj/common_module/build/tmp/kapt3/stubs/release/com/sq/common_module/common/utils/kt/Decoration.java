package com.sq.common_module.common.utils.kt;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.HashMap;

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/4/18
 * Time: 09:26
 * 备注：
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nJ.\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/sq/common_module/common/utils/kt/Decoration;", "", "()V", "GridDecoration", "Lcom/sq/common_module/common/utils/kt/RecyclerViewGridDecoration;", "spanCount", "", "rowSpacing", "spacing", "includeEdge", "", "LinearDecoration", "Lcom/sq/common_module/common/utils/kt/RecyclerViewSpacesItemDecoration;", "top", "bottom", "left", "right", "common_module_release"})
public final class Decoration {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.Decoration INSTANCE = null;
    
    private Decoration() {
        super();
    }
    
    /**
     * RecyclerView 线性布局
     *
     * @param top    上
     * @param bottom 下
     * @param left   左
     * @param right  右
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.kt.RecyclerViewSpacesItemDecoration LinearDecoration(int top, int bottom, int left, int right) {
        return null;
    }
    
    /**
     * RecyclerView 网格布局
     *
     * @param spanCount   一行几列
     * @param spacing     空格多少
     * @param includeEdge 是否判断最左边和最右边有空格
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.kt.RecyclerViewGridDecoration GridDecoration(int spanCount, int rowSpacing, int spacing, boolean includeEdge) {
        return null;
    }
}
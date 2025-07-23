package com.sq.common_module.common.utils.kt;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.HashMap;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sq/common_module/common/utils/kt/RecyclerViewSpacesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mSpaceValueMap", "Ljava/util/HashMap;", "", "", "(Ljava/util/HashMap;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Companion", "common_module_release"})
public final class RecyclerViewSpacesItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final java.util.HashMap<java.lang.String, java.lang.Integer> mSpaceValueMap = null;
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.RecyclerViewSpacesItemDecoration.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOP_DECORATION = "top_decoration";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BOTTOM_DECORATION = "bottom_decoration";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LEFT_DECORATION = "left_decoration";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RIGHT_DECORATION = "right_decoration";
    
    public RecyclerViewSpacesItemDecoration(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.Integer> mSpaceValueMap) {
        super();
    }
    
    @java.lang.Override
    public void getItemOffsets(@org.jetbrains.annotations.NotNull
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sq/common_module/common/utils/kt/RecyclerViewSpacesItemDecoration$Companion;", "", "()V", "BOTTOM_DECORATION", "", "LEFT_DECORATION", "RIGHT_DECORATION", "TOP_DECORATION", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
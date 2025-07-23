package com.sq.common_module.common.utils.kt;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.sq.common_module.R;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a\u001e\u0010\b\u001a\u00020\u0007*\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001aN\u0010\n\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u000b28\b\u0004\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\rH\u0086\b\u00f8\u0001\u0000\u001aN\u0010\n\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u001328\b\u0004\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\rH\u0086\b\u00f8\u0001\u0000\u001aN\u0010\u0014\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u000b28\b\u0004\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\rH\u0086\b\u00f8\u0001\u0000\u001aN\u0010\u0014\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u001328\b\u0004\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\rH\u0086\b\u00f8\u0001\u0000\u001a\u001e\u0010\u0015\u001a\u00020\u0007*\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a\u001e\u0010\u0016\u001a\u00020\u0007*\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0017"}, d2 = {"throttleClick", "Landroid/view/View$OnClickListener;", "wait", "", "block", "Lkotlin/Function1;", "Landroid/view/View;", "", "groupSingleClick", "Landroidx/constraintlayout/widget/Group;", "setOnChildItemSingleClick", "Lcom/sq/common_module/common/utils/kt/MyBaseAdapter;", "click", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "view", "", "position", "Lcom/sq/common_module/common/utils/kt/MyDelegateMultiAdapter;", "setOnItemSingleClick", "singleClick", "singleDelayClick", "common_module_release"})
public final class ViewClickKtKt {
    
    /**
     * Created by town
     * Date :  2022/10/12
     * Time : 16:32
     */
    public static final void setOnItemSingleClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<?> $this$setOnItemSingleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Integer, kotlin.Unit> click) {
    }
    
    public static final void setOnChildItemSingleClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyBaseAdapter<?> $this$setOnChildItemSingleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Integer, kotlin.Unit> click) {
    }
    
    public static final void setOnItemSingleClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyDelegateMultiAdapter<?> $this$setOnItemSingleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Integer, kotlin.Unit> click) {
    }
    
    public static final void setOnChildItemSingleClick(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.MyDelegateMultiAdapter<?> $this$setOnChildItemSingleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Integer, kotlin.Unit> click) {
    }
    
    public static final void singleClick(@org.jetbrains.annotations.NotNull
    android.view.View $this$singleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> block) {
    }
    
    public static final void singleDelayClick(@org.jetbrains.annotations.NotNull
    android.view.View $this$singleDelayClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.view.View.OnClickListener throttleClick(long wait, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> block) {
        return null;
    }
    
    public static final void groupSingleClick(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.Group $this$groupSingleClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> block) {
    }
}
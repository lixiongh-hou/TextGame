package com.sq.common_module.common.widget.rain;

import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sq.common_module.R;
import java.util.*;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082D\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingAdapter;", "Lcom/sq/common_module/common/widget/rain/FallingView$IFallingAdapter;", "", "onclick", "Lcom/sq/common_module/common/widget/rain/FallingAdapter$OnItemClick;", "(Lcom/sq/common_module/common/widget/rain/FallingAdapter$OnItemClick;)V", "animDuration", "", "animInterval", "Ljava/util/ArrayList;", "Lcom/sq/common_module/common/widget/rain/FallingAdapter$Interval;", "count", "getOnclick", "()Lcom/sq/common_module/common/widget/rain/FallingAdapter$OnItemClick;", "random", "Ljava/util/Random;", "convert", "", "parent", "Landroid/view/ViewGroup;", "holder", "Lcom/sq/common_module/common/widget/rain/FallingView$Holder;", "convertAnim", "Landroid/view/animation/Animation;", "createPath", "Landroid/graphics/Path;", "position", "view", "Landroid/view/View;", "setData", "data", "", "Interval", "OnItemClick", "common_module_release"})
public final class FallingAdapter extends com.sq.common_module.common.widget.rain.FallingView.IFallingAdapter<java.lang.Integer> {
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.widget.rain.FallingAdapter.OnItemClick onclick = null;
    private final java.util.Random random = null;
    private final long animDuration = 5000L;
    private final int count = 10;
    private final java.util.ArrayList<com.sq.common_module.common.widget.rain.FallingAdapter.Interval> animInterval = null;
    
    public FallingAdapter(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.widget.rain.FallingAdapter.OnItemClick onclick) {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.widget.rain.FallingAdapter.OnItemClick getOnclick() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> data) {
    }
    
    private final android.graphics.Path createPath(android.view.ViewGroup parent, int position, android.view.View view) {
        return null;
    }
    
    @java.lang.Override
    public void convert(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.rain.FallingView.Holder holder) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.animation.Animation convertAnim(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.rain.FallingView.Holder holder) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingAdapter$Interval;", "", "start", "", "end", "(FF)V", "getEnd", "()F", "getStart", "getLength", "common_module_release"})
    public static final class Interval {
        private final float start = 0.0F;
        private final float end = 0.0F;
        
        public Interval(float start, float end) {
            super();
        }
        
        public final float getStart() {
            return 0.0F;
        }
        
        public final float getEnd() {
            return 0.0F;
        }
        
        public final float getLength() {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingAdapter$OnItemClick;", "", "onClick", "", "position", "", "common_module_release"})
    public static abstract interface OnItemClick {
        
        public abstract void onClick(int position);
    }
}
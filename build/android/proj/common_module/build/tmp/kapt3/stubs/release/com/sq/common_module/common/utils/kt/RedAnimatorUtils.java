package com.sq.common_module.common.utils.kt;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.*;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import com.blankj.utilcode.util.SizeUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.java.UIUtils;

/**
 * Created by town
 * Date :  2023/6/1
 * Time : 17:55
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/sq/common_module/common/utils/kt/RedAnimatorUtils;", "", "()V", "anim_mask_layout", "Landroid/view/ViewGroup;", "animationSetList", "Ljava/util/ArrayList;", "Landroid/view/animation/AnimationSet;", "mCallBack", "Lcom/sq/common_module/common/utils/kt/RedAnimatorUtils$RedAnimatorCallback;", "startLocation", "", "times", "", "addViewToAnimLayout", "Landroid/view/View;", "parent", "view", "location", "createAnimLayout", "context", "Landroid/app/Activity;", "onDestroy", "", "setAnim", "redView", "Landroidx/appcompat/widget/AppCompatImageView;", "startView", "endView", "time", "callback", "RedAnimatorCallback", "common_module_release"})
public final class RedAnimatorUtils {
    private int times = 0;
    private com.sq.common_module.common.utils.kt.RedAnimatorUtils.RedAnimatorCallback mCallBack;
    private java.util.ArrayList<android.view.animation.AnimationSet> animationSetList;
    private int[] startLocation;
    private android.view.ViewGroup anim_mask_layout;
    
    public RedAnimatorUtils() {
        super();
    }
    
    public final void setAnim(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatImageView redView, @org.jetbrains.annotations.Nullable
    android.view.View startView, @org.jetbrains.annotations.Nullable
    android.view.View endView, int time, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.RedAnimatorUtils.RedAnimatorCallback callback) {
    }
    
    /**
     * @Description: 创建动画层
     * @param
     * @return void
     * @throws
     */
    private final android.view.ViewGroup createAnimLayout(android.app.Activity context) {
        return null;
    }
    
    private final android.view.View addViewToAnimLayout(android.view.ViewGroup parent, android.view.View view, int[] location) {
        return null;
    }
    
    public final void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/utils/kt/RedAnimatorUtils$RedAnimatorCallback;", "", "end", "", "common_module_release"})
    public static abstract interface RedAnimatorCallback {
        
        public abstract void end();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            public static void end(@org.jetbrains.annotations.NotNull
            com.sq.common_module.common.utils.kt.RedAnimatorUtils.RedAnimatorCallback $this) {
            }
        }
    }
}
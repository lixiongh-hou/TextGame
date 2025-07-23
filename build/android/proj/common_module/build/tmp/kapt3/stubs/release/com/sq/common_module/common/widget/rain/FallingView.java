package com.sq.common_module.common.widget.rain;

import android.content.Context;
import android.graphics.*;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;

/**
 * File FallingView.kt
 * Date 12/25/20
 * Author lucas
 * Introduction 飘落物件控件
 *             规则：通过适配器实现
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002:\u0004/012B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010$\u001a\u00020\u001eH\u0014J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010&\u001a\u00020\u001eH\u0016J\u001a\u0010\'\u001a\u00020\u001e\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0\u0017J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0013J\u0014\u0010,\u001a\u00020\u001e2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002J\u0006\u0010-\u001a\u00020\u001eJ\u0006\u0010.\u001a\u00020\u001eR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingView;", "Landroid/widget/FrameLayout;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "kotlin.jvm.PlatformType", "cacheHolder", "Ljava/util/HashSet;", "Lcom/sq/common_module/common/widget/rain/FallingView$Holder;", "fallingListener", "Lcom/sq/common_module/common/widget/rain/FallingView$OnFallingListener;", "handlerTask", "Landroid/os/Handler;", "iFallingAdapter", "Lcom/sq/common_module/common/widget/rain/FallingView$IFallingAdapter;", "lastStartTime", "", "paint", "Landroid/graphics/Paint;", "position", "assistLine", "", "path", "Landroid/graphics/Path;", "canvas", "Landroid/graphics/Canvas;", "initView", "onDetachedFromWindow", "onDraw", "run", "setAdapter", "T", "adapter", "setOnFallingListener", "onFallingListener", "showItem", "startFalling", "stopFalling", "Config", "Holder", "IFallingAdapter", "OnFallingListener", "common_module_release"})
public final class FallingView extends android.widget.FrameLayout implements java.lang.Runnable {
    private final java.lang.String TAG = null;
    private android.os.Handler handlerTask;
    private com.sq.common_module.common.widget.rain.FallingView.IFallingAdapter<?> iFallingAdapter;
    private int position = 0;
    private com.sq.common_module.common.widget.rain.FallingView.OnFallingListener fallingListener;
    private long lastStartTime = 0L;
    private final java.util.HashSet<com.sq.common_module.common.widget.rain.FallingView.Holder> cacheHolder = null;
    private final android.graphics.Paint paint = null;
    
    public FallingView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public FallingView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public FallingView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void initView(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    public final void startFalling() {
    }
    
    public final void stopFalling() {
    }
    
    @java.lang.Override
    public void run() {
    }
    
    private final void showItem(com.sq.common_module.common.widget.rain.FallingView.IFallingAdapter<?> adapter) {
    }
    
    public final <T extends java.lang.Object>void setAdapter(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.rain.FallingView.IFallingAdapter<T> adapter) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void assistLine(android.graphics.Path path, android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    public final void setOnFallingListener(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.rain.FallingView.OnFallingListener onFallingListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingView$Holder;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "config", "Lcom/sq/common_module/common/widget/rain/FallingView$Config;", "getConfig", "()Lcom/sq/common_module/common/widget/rain/FallingView$Config;", "setConfig", "(Lcom/sq/common_module/common/widget/rain/FallingView$Config;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "getView", "()Landroid/view/View;", "common_module_release"})
    public static final class Holder {
        @org.jetbrains.annotations.NotNull
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull
        private com.sq.common_module.common.widget.rain.FallingView.Config config;
        private int position = 0;
        
        public Holder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sq.common_module.common.widget.rain.FallingView.Config getConfig() {
            return null;
        }
        
        public final void setConfig(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.widget.rain.FallingView.Config p0) {
        }
        
        public final int getPosition() {
            return 0;
        }
        
        public final void setPosition(int p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingView$IFallingAdapter;", "T", "", "layoutId", "", "(I)V", "datas", "", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "getLayoutId", "()I", "convert", "", "parent", "Landroid/view/ViewGroup;", "holder", "Lcom/sq/common_module/common/widget/rain/FallingView$Holder;", "convertAnim", "Landroid/view/animation/Animation;", "common_module_release"})
    public static abstract class IFallingAdapter<T extends java.lang.Object> {
        private final int layoutId = 0;
        @org.jetbrains.annotations.Nullable
        private java.util.List<? extends T> datas;
        
        public IFallingAdapter(@androidx.annotation.LayoutRes
        int layoutId) {
            super();
        }
        
        public final int getLayoutId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<T> getDatas() {
            return null;
        }
        
        public final void setDatas(@org.jetbrains.annotations.Nullable
        java.util.List<? extends T> p0) {
        }
        
        public abstract void convert(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.widget.rain.FallingView.Holder holder);
        
        @org.jetbrains.annotations.NotNull
        public abstract android.view.animation.Animation convertAnim(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.widget.rain.FallingView.Holder holder);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingView$Config;", "", "()V", "anim", "Landroid/view/animation/Animation;", "getAnim", "()Landroid/view/animation/Animation;", "setAnim", "(Landroid/view/animation/Animation;)V", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "common_module_release"})
    public static final class Config {
        private long startTime = 0L;
        @org.jetbrains.annotations.Nullable
        private android.view.animation.Animation anim;
        @org.jetbrains.annotations.Nullable
        private android.graphics.Path path;
        
        public Config() {
            super();
        }
        
        public final long getStartTime() {
            return 0L;
        }
        
        public final void setStartTime(long p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.view.animation.Animation getAnim() {
            return null;
        }
        
        public final void setAnim(@org.jetbrains.annotations.Nullable
        android.view.animation.Animation p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Path getPath() {
            return null;
        }
        
        public final void setPath(@org.jetbrains.annotations.Nullable
        android.graphics.Path p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/sq/common_module/common/widget/rain/FallingView$OnFallingListener;", "", "onStart", "", "onStop", "common_module_release"})
    public static abstract interface OnFallingListener {
        
        public abstract void onStart();
        
        public abstract void onStop();
    }
}
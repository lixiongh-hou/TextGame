package com.sq.common_module.common;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/sq/common_module/common/OptHandleInterface;", "", "optHandleDestroy", "", "startPageTimeOut", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "cb", "Lkotlin/Function0;", "startPageTimeOutAgain", "updateOptimizing", "tv", "Landroidx/appcompat/widget/AppCompatTextView;", "updateOtherOptimizing", "text", "", "Companion", "common_module_release"})
public abstract interface OptHandleInterface {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.OptHandleInterface.Companion Companion = null;
    
    public abstract void updateOptimizing(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatTextView tv);
    
    public abstract void startPageTimeOut(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> cb);
    
    public abstract void startPageTimeOutAgain(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> cb);
    
    public abstract void updateOtherOptimizing(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatTextView tv, @org.jetbrains.annotations.NotNull
    java.lang.String text);
    
    public abstract void optHandleDestroy();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void updateOptimizing(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.OptHandleInterface $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.AppCompatTextView tv) {
        }
        
        public static void startPageTimeOut(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.OptHandleInterface $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> cb) {
        }
        
        public static void startPageTimeOutAgain(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.OptHandleInterface $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> cb) {
        }
        
        public static void updateOtherOptimizing(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.OptHandleInterface $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleCoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.AppCompatTextView tv, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
        }
        
        public static void optHandleDestroy(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.OptHandleInterface $this) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/OptHandleInterface$Companion;", "", "()V", "pageTimeOutJon", "Lkotlinx/coroutines/Job;", "updateOptimizingJob", "common_module_release"})
    public static final class Companion {
        private static kotlinx.coroutines.Job updateOptimizingJob;
        private static kotlinx.coroutines.Job pageTimeOutJon;
        
        private Companion() {
            super();
        }
    }
}
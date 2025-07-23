package com.sq.common_module.common;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/sq/common_module/common/BaseStepInterface;", "", "onCheckProgress", "", "v", "", "onCheckSuccess", "onOptProgress", "onOptSuccess", "onStartOpt", "common_module_release"})
public abstract interface BaseStepInterface {
    
    public abstract void onCheckProgress(int v);
    
    public abstract void onCheckSuccess();
    
    public abstract void onStartOpt();
    
    public abstract void onOptProgress(int v);
    
    public abstract void onOptSuccess();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onCheckProgress(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseStepInterface $this, int v) {
        }
        
        public static void onCheckSuccess(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseStepInterface $this) {
        }
        
        public static void onStartOpt(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseStepInterface $this) {
        }
        
        public static void onOptProgress(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseStepInterface $this, int v) {
        }
        
        public static void onOptSuccess(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseStepInterface $this) {
        }
    }
}
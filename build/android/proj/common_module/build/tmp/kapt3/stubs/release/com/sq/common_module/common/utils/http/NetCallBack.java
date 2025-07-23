package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.widget.LoadingDialog;
import io.reactivex.rxjava3.core.Observable;

/**
 * Created by town.
 * Date: 2021/7/13
 * Time: 9:28 AM
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/sq/common_module/common/utils/http/NetCallBack;", "T", "", "onFail", "", "e", "", "onSuccess", "data", "(Ljava/lang/Object;)V", "common_module_release"})
public abstract interface NetCallBack<T extends java.lang.Object> {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable
    T data);
    
    public abstract void onFail(@org.jetbrains.annotations.Nullable
    java.lang.Throwable e);
    
    /**
     * Created by town.
     * Date: 2021/7/13
     * Time: 9:28 AM
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static <T extends java.lang.Object>void onFail(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.utils.http.NetCallBack<T> $this, @org.jetbrains.annotations.Nullable
        java.lang.Throwable e) {
        }
    }
}
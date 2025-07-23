package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.utils.java.L;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.net.SocketException;
import java.net.SocketTimeoutException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0007"}, d2 = {"handlerError", "", "errorResult", "Lcom/sq/common_module/common/utils/http/ErrorResult;", "any", "", "refreshToken", "common_module_release"})
public final class BaseObserverKt {
    
    public static final void handlerError(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.ErrorResult errorResult, @org.jetbrains.annotations.NotNull
    java.lang.Object any) {
    }
    
    public static final void refreshToken(@org.jetbrains.annotations.NotNull
    java.lang.Object any) {
    }
}
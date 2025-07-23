package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.utils.java.L;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.net.SocketException;
import java.net.SocketTimeoutException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0006H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/sq/common_module/common/utils/http/BaseObserver;", "T", "Lio/reactivex/rxjava3/core/Observer;", "Lcom/sq/common_module/common/utils/http/BaseResult;", "()V", "onComplete", "", "onError", "e", "", "onFail", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "onSuccess", "data", "(Ljava/lang/Object;)V", "refreshRequest", "common_module_release"})
public abstract class BaseObserver<T extends java.lang.Object> implements io.reactivex.rxjava3.core.Observer<com.sq.common_module.common.utils.http.BaseResult<T>> {
    
    public BaseObserver() {
        super();
    }
    
    @java.lang.Override
    public void onSubscribe(@org.jetbrains.annotations.Nullable
    io.reactivex.rxjava3.disposables.Disposable d) {
    }
    
    @java.lang.Override
    public void onNext(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.utils.http.BaseResult<T> t) {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.Nullable
    java.lang.Throwable e) {
    }
    
    @java.lang.Override
    public void onComplete() {
    }
    
    public abstract void onSuccess(T data);
    
    public abstract void onFail(@org.jetbrains.annotations.Nullable
    java.lang.Throwable e);
    
    public void refreshRequest() {
    }
}
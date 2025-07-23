package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.utils.java.L;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.net.SocketException;
import java.net.SocketTimeoutException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0015\u001a\u00020\u0005H\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/sq/common_module/common/utils/http/BaseMergerObserver;", "R", "Lio/reactivex/rxjava3/core/Observer;", "()V", "onComplete", "", "onError", "e", "", "onFail", "onNext", "t", "(Ljava/lang/Object;)V", "onSubscribe", "d", "Lio/reactivex/rxjava3/disposables/Disposable;", "onSuccess", "data", "", "msg", "", "refreshRequest", "common_module_release"})
public abstract class BaseMergerObserver<R extends java.lang.Object> implements io.reactivex.rxjava3.core.Observer<R> {
    
    public BaseMergerObserver() {
        super();
    }
    
    @java.lang.Override
    public void onNext(R t) {
    }
    
    @java.lang.Override
    public void onSubscribe(@org.jetbrains.annotations.Nullable
    io.reactivex.rxjava3.disposables.Disposable d) {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.Nullable
    java.lang.Throwable e) {
    }
    
    @java.lang.Override
    public void onComplete() {
    }
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable
    java.lang.Object data, @org.jetbrains.annotations.Nullable
    java.lang.String msg);
    
    public abstract void onFail(@org.jetbrains.annotations.Nullable
    java.lang.Throwable e);
    
    public void refreshRequest() {
    }
}
package com.sq.common_module.common.net;


import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/***
 * 观察者基类
 * @param <T>
 */
public class BaseObserver<T> implements Observer<T> {
    BaseModel baseMvvmModel;
    MvvmDataObserver<T> mvvmDataObserver;

    public BaseObserver(BaseModel mvvmModel, MvvmDataObserver<T> observer) {
        this.baseMvvmModel = mvvmModel;
        this.mvvmDataObserver = observer;
    }

    @Override
    public void onSubscribe(Disposable d) {
        if (baseMvvmModel != null) {
            baseMvvmModel.addDisposable(d);
        }
    }

    @Override
    public void onNext(T t) {
        mvvmDataObserver.onSuccess(t, false);
    }

    @Override
    public void onError(Throwable e) {
        Log.d("OkHttp", "onError: " + e);
        if (e instanceof ExceptionHandle.ResponeThrowable) {
            switch (((ExceptionHandle.ResponeThrowable) e).code) {
                case 5000:
                    //登录超时
                    ExceptionHandle.ResponeThrowable error = (ExceptionHandle.ResponeThrowable) e;
                    break;
                default:
                    ExceptionHandle.ResponeThrowable e1 = ((ExceptionHandle.ResponeThrowable) e);
                    if (e1.message == null) {
                        e1.message = "";
                    }
                    ExceptionHandle.ResponeThrowable error1 = new ExceptionHandle.ResponeThrowable(e1.message);
                    error1.message = e1.message;
                    error1.code = e1.code;
                    mvvmDataObserver.onFailure(error1);
                    break;
            }
        } else {
            mvvmDataObserver.onFailure(new ExceptionHandle.ResponeThrowable(e, ExceptionHandle.ERROR.UNKNOWN));
        }
    }

    @Override
    public void onComplete() {

    }
}

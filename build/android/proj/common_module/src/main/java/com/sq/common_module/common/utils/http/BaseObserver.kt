package com.sq.common_module.common.utils.http

import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.toast
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.net.SocketException
import java.net.SocketTimeoutException


//普通简化
abstract class BaseObserver<T> : Observer<BaseResult<T>> {

    override fun onSubscribe(d: Disposable?) {
//        DisposeManager.getInstance().addDisposable(d)
    }

    override fun onNext(t: BaseResult<T>?) {
        t?.let {
            when (it.code) {
                0 -> {
                    onSuccess(it.data as T)
                }
            }
        }
    }

    override fun onError(e: Throwable?) {
        L.i("wwb_onerror", e?.message)
        //因为后台返回数据结构变化，故转为数据异常处理
        when (e) {
            is SocketTimeoutException -> {
                refreshRequest()
            }
            is ErrorResult -> {
                handlerError(e, this@BaseObserver)
            }
            is SocketException -> {
                refreshRequest()
            }
            else -> {
                e?.printStackTrace()
            }
        }
        onFail(e)
    }

    override fun onComplete() {
    }

    abstract fun onSuccess(data: T)

    abstract fun onFail(e: Throwable?)

    open fun refreshRequest() {}
}

//合并网络请求
abstract class BaseMergerObserver<R> : Observer<R> {
    override fun onNext(t: R) {
        if (t is BaseResult<*>) {
            if (t.code == 0) {
                onSuccess(t.data, t.msg)
            }
        }
    }

    override fun onSubscribe(d: Disposable?) {
//        DisposeManager.getInstance().addDisposable(d)
    }

    override fun onError(e: Throwable?) {
        onFail(e)
        //数据异常处理
        if (e is ErrorResult) {
            handlerError(e, this@BaseMergerObserver)
        } else if (e is SocketException) {
            refreshRequest()
        } else {
            e?.printStackTrace()
        }

    }

    override fun onComplete() {
    }

    abstract fun onSuccess(data: Any?, msg: String? = "")

    abstract fun onFail(e: Throwable?)

    open fun refreshRequest() {}
}

fun handlerError(errorResult: ErrorResult, any: Any) {
    when (errorResult.code) {
        -100 -> {

            errorResult.msg.toast()
        }
        //用户需要注册
        -101 -> {
            if (errorResult.msg == "请登录") {
//                refreshToken(any)
//                MyActivityUtils.toLoginActivity()
            } else errorResult.msg.toast()

        }
        //需要登录云信
        -102 -> {

        }


    }
}

fun refreshToken(any: Any) {
    if (any is BaseObserver<*>) any.refreshRequest()
}





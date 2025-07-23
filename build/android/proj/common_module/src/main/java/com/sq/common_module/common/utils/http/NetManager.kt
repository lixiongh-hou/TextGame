package com.sq.common_module.common.utils.http

import com.sq.common_module.common.utils.kt.simpleObservable
import com.sq.common_module.common.widget.LoadingDialog
import io.reactivex.rxjava3.core.Observable

/**
 * Created by town.
 * Date: 2021/7/13
 * Time: 9:28 AM
 */

//abstract class NetCallBack<T> {
//    abstract fun onSuccess(data: T?) :Unit
//}

interface NetCallBack<T> {
    fun onSuccess(data: T?)

    fun onFail(e: Throwable?) {}
}

var postNum = 1
fun <T> Observable<BaseResult<T>>.handleRequest(
    loadingDialog: LoadingDialog? = null,
    callBack: NetCallBack<T>
) {

//    loadingDialog?.let {
//        if (!it.isShowing) it.show()
//    }

    this.simpleObservable()
        .doOnError {
//            L.i("wwb_socket","doOnError")
        }
        .subscribe(object : BaseObserver<T>() {
            override fun onSuccess(data: T) {
                postNum = 1
                callBack.onSuccess(data)
                loadingDialog?.dismissDialog()
            }

            override fun onFail(e: Throwable?) {
                callBack.onFail(e)
                loadingDialog?.dismissDialog()
            }

            override fun refreshRequest() {
                if (postNum <= 5) handleRequest(null, callBack)
                ++postNum
            }
        })
}

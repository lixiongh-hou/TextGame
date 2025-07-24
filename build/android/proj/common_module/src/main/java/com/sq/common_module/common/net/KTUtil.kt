package com.sq.common_module.common.net

import android.annotation.SuppressLint
import android.view.View
import com.google.gson.Gson
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody


/**
 * 请求简化封装
 */
@SuppressLint("CheckResult")
inline fun <reified F, T : Any> request(
    mvvmModel: BaseModel<T, BaseCustomViewModel>,
    observer: MvvmDataObserver<T>,
    block: F.() -> Observable<T>,
) {
    val request = MyApi.getService(F::class.java).block()
    request
        .compose(MyApi.instance!!.applySchedulers())
        .subscribe(BaseObserver(mvvmModel, observer) as Observer<T>)
}
/**
 * 安全地将BaseModel转换为指定泛型类型的BaseModel
 */
@Suppress("UNCHECKED_CAST")
fun <T : Any, VM : BaseCustomViewModel> BaseModel<*, VM>.asType(): BaseModel<T, VM> {
    return this as BaseModel<T, VM>
}
/**
 * 获取参数的json形式
 */

fun getRequestBody(any: Any?): RequestBody {
    return Gson().toJson(any).toRequestBody("application/json;charset=utf-8".toMediaType())
}



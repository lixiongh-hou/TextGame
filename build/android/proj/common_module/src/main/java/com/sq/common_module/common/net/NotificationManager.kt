package com.sq.common_module.common.net

import android.util.Log
import com.sq.common_module.common.bean.LoginBean
import com.sq.common_module.common.utils.http.BaseResult

object NotificationManager : BaseModel<BaseResult<LoginBean>, BaseCustomViewModel>() {
    fun a(){
        var callback = object : MvvmDataObserver<LoginBean> {
            override fun onSuccess(t: LoginBean, isFromDataCache: Boolean) {
                Log.d("sdasdas", "onSuccess: $t")
            }

            override fun onFailure(e: Throwable) {
            }

        }
        val map = HashMap<String, String>()

//        request<HomeApi, UserSexAgeBean>(this.asType(), callback) {
//            queryUserInfoByList(getRequestBody(map))
//        }
    }

    override fun load() {
    }

    override fun onSuccess(
        t: BaseResult<LoginBean>,
        isFromDataCache: Boolean,
    ) {
    }

    override fun onFailure(e: Throwable) {
    }
}

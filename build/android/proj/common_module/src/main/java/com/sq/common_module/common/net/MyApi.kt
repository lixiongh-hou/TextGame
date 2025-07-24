package com.sq.common_module.common.net

import io.reactivex.rxjava3.functions.Function
import okhttp3.Interceptor


/**
 * 网络请求的api
 */
class MyApi : NetworkApi() {



    override fun getInterceptor(): Interceptor {
        return Interceptor { chain: Interceptor.Chain ->
//            val timeStr = TestUtil.getTimeStr()
            val builder = chain.request().newBuilder()
//            val str = StringBuffer()
//            val userId = SPStaticUtils.getString(SPContant.USERID, "")
////            if (!userId.isEmpty()) {
////                str.append("avatar=" + SPStaticUtils.getString(SPContant.AVATAR, "") + ";")
////                str.append("fullname=" + SPStaticUtils.getString(SPContant.FULLNAME, "") + ";")
////                str.append("userid=" + SPStaticUtils.getString(SPContant.USERID, "") + ";")
////                str.append("email=" + SPStaticUtils.getString(SPContant.EMAIL, "") + ";")
////                str.append("username=" + SPStaticUtils.getString(SPContant.USERNAME, "") + ";")
////                str.append("jwt=" + SPStaticUtils.getString(SPContant.JWT, "") + ";")
////                builder.addHeader("Cookie", str.toString())
////            }
////            builder.addHeader("Source", "source")
////            builder.addHeader("Authorization", TestUtil.getAuthorization(timeStr))
//            builder.addHeader("Date", timeStr)
//            if (!getToken().isEmpty()) {
//                builder.addHeader("sessionId", getToken())
//            }
            chain.proceed(builder.build())
        }
    }

    /**
     * 这里是app的错误
     *
     * @param <T>
     * @return
    </T> */
    override fun <T : Any> getAppErrorHandler(): Function<T, T> {
        return Function { response: T ->
//            //response中code码不会0 出现错误
//            if (response is BaseResp<*> && !(response as BaseResp<*>).success) {
//                //这里处理错误
//                val exception = ExceptionHandle.ServerException()
//                exception.code =
//                    if ((response as BaseResp<*>).errorCode.isEmpty()) 0 else (response as BaseResp<*>).errorCode.toInt()
//                (response as BaseResp<*>).errorMsg
//                exception.message = (response as BaseResp<*>).errorMsg
//                throw exception
//            }
            response
        }
    }

    //http://192.168.1.148/minipro/json/heyCarUser/sendSmsByLoginApp.do
    override fun getFormal(): String {
        return "https://hehk.top/"
    }

    override fun getTest(): String {
        return "https://hehk.top/"
    }


    companion object {
        @Volatile
        private var sInstance: MyApi? = null
        val instance: MyApi?
            get() {
                if (sInstance == null) {
                    synchronized(MyApi::class.java) {
                        if (sInstance == null) {
                            sInstance = MyApi()
                        }
                    }
                }
                return sInstance
            }

        fun <T> getService(service: Class<T>): T {
            return instance!!.getRetrofit(service).create(service)
        }
    }
}


package com.sq.common_module.common.gromore.tt

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by town
 * Date :  2022/10/28
 * Time : 15:24
 */
object DpSdkHelper {

    var isDPInitSuccess = false

    /**
     * 初始化 内容sdk
     */
    fun initDp(application: Context) {
        try {
//            initDpSdk(application)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

//    private fun initDpSdk(application: Context) {
//        val configBuilder = DPSdkConfig.Builder()
//            .debug(true)
//            .needInitAppLog(false)
////            .initListener { isSuccess -> //注意：1如果您的初始化没有放到application，请确保使用时初始化已经成功
////                //     2如果您的初始化在application
////                //isSuccess=true表示初始化成功
////                //初始化失败，可以再次调用初始化接口（建议最多不要超过3次)
////                isDPInited = isSuccess
////
////            }
//            .initListener { isSuccess, message ->
//                Log.e(
//                    TTSDKHelper.TAG,
//                    "$isSuccess-------$message"
//                )
//                isDPInitSuccess= isSuccess
//            }
//        DPSdk.init(application, "dp_config.json", configBuilder.build())
//
//    }


}
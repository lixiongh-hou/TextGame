package com.sq.common_module.common.pange

import android.content.Context
import android.util.Log
import com.blankj.utilcode.util.AppUtils
import com.bytedance.sdk.openadsdk.TTAdConfig
import com.bytedance.sdk.openadsdk.TTAdSdk
import com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfig
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.HashMap
import com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig

import com.bytedance.sdk.openadsdk.TTCustomController
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot
import com.bytedance.sdk.openadsdk.mediation.MediationConstant

import com.bytedance.sdk.openadsdk.mediation.ad.MediationSplashRequestInfo
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.*


/**
 * Created by town
 * Date :  2023/8/10
 * Time : 17:18
 */
object TTADManagerHolder {
    var sInit = false

    //step1:接入网盟广告sdk的初始化操作，详情见接入文档和穿山甲平台说明
    inline fun init(context: Context, crossinline ttCallBack: (s: Boolean) -> Unit) {
        if (!sInit) {
            L.i("wwb_ttInit", "startInit----")
            TTAdSdk.init(
                context,
                buildConfig(context)
            )
            TTAdSdk.start(
                object : TTAdSdk.Callback {
                    override fun success() {
//                        Log.i(
//                           ,
//                            "success: " + TTAdSdk.isInitSuccess()
//                        )
                        L.i("wwb_ttInit", TTAdSdk.isInitSuccess().toString())
                        L.i("wwb_mac", "TTAdSdk")
                        sInit = true
                        ttCallBack.invoke(true)
                    }

                    override fun fail(code: Int, msg: String) {
//                        Log.i(
//                            com.union_test.toutiao.config.TTAdManagerHolder.TAG,
//                            "fail:  code = $code msg = $msg"
//                        )
                        sInit = false
                        ttCallBack.invoke(false)
                    }
                })
            sInit = true
        }
    }


    fun buildConfig(context: Context): TTAdConfig? {

        var jsonObject: JSONObject? = null

        //读取json文件，本地缓存的配置
        try {
            jsonObject = JSONObject(getJson("site_config.json", context))
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return TTAdConfig.Builder()
            /**
             * 注：需要替换成在媒体平台申请的appID ，切勿直接复制
             */
            .appId(getMMKVString(UserInfoManager.GROMORE_APP_ID))
//            .appId("5146999")
            .appName(AppUtils.getAppName())
            /**
             * 上线前需要关闭debug开关，否则会影响性能
             */
            .debug(AppUtils.isAppDebug())
            /**
             * 使用聚合功能此开关必须设置为true，默认为false，不会初始化聚合模板，聚合功能会吟唱
             */
            .useMediation(true)
            .customController(getTTCustomController())
            .setMediationConfig(
                MediationConfig.Builder().setMediationConfigUserInfoForSegment(
                    getUserInfoForSegment()
                ).setCustomLocalConfig(jsonObject).build()
            )
            //      .customController(getTTCustomController()) //如果您需要设置隐私策略请参考该api
            //                .setMediationConfig(new MediationConfig.Builder() //可设置聚合特有参数详细设置请参考该api
            //                        .setMediationConfigUserInfoForSegment(getUserInfoForSegment())//如果您需要配置流量分组信息请参考该api
            //                        .build())
            .build()
    }

    private fun getUserInfoForSegment(): MediationConfigUserInfoForSegment {
        val userInfo = MediationConfigUserInfoForSegment()
        userInfo.userId = getMMKVString(UserInfoManager.USER_ID)
//        userInfo.gender = MediationConfigUserInfoForSegment.GENDER_MALE
        userInfo.channel = getMMKVString(UserInfoManager.APP_CHANNEL)
//        userInfo.subChannel = "msdk-sub-channel"
//        userInfo.age = 999
//        userInfo.userValueGroup = "msdk-demo-user-value-group"
//        val customInfos: MutableMap<String, String> = HashMap()
//        customInfos["aaaa"] = "test111"
//        customInfos["bbbb"] = "test222"
//        userInfo.customInfos = customInfos

        /**
         * GMConfigUserInfoForSegment设置流量分组的信息
         * 注意：
         * 1、请每次都传入新的info对象
         * 2、字符串类型的值只能是大小写字母，数字，下划线，连字符，字符个数100以内 ( [A-Za-z0-9-_]{1,100} ) ，不符合规则的信息将被过滤掉，不起作用。
         */

        return userInfo
    }

    private fun getJson(fileName: String, context: Context): String {
        val stringBuilder = StringBuilder()
        try {
            val `is` = context.assets.open(fileName!!)
            val bufferedReader = BufferedReader(InputStreamReader(`is`))
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }

    //函数返回值表示隐私开关开启状态，未重写函数使用默认值
    private fun getTTCustomController(): TTCustomController? {
        return object : TTCustomController() {
            override fun isCanUseWifiState(): Boolean {
                L.i("wwb_mac", "isCanUseWifiState")
                return if (isNoAndroidId()) false else getMMKVBool(
                    UserInfoManager.REQUEST_AD
                )
            }

            override fun getMacAddress(): String? {
                L.i("wwb_mac", "getMacAddress")
                return super.getMacAddress()
            }

            override fun isCanUseWriteExternal(): Boolean {
                return if (isNoAndroidId()) false else super.isCanUseWriteExternal()
            }

            override fun getDevOaid(): String? {
//                L.i("wwb_oaid", getMMKVString(UserInfoManager.OAID))
                return ""
            }

            override fun isCanUseAndroidId(): Boolean {
                return false
            }

            override fun getAndroidId(): String? {
                return ""
            }

            override fun getMediationPrivacyConfig(): MediationPrivacyConfig? {
                return object : MediationPrivacyConfig() {
                    override fun isLimitPersonalAds(): Boolean {
                        return super.isLimitPersonalAds()
                    }

                    override fun isProgrammaticRecommend(): Boolean {
                        return super.isProgrammaticRecommend()
                    }
                }
            }

            override fun isCanUsePermissionRecordAudio(): Boolean {
                return super.isCanUsePermissionRecordAudio()
            }

            override fun alist(): Boolean {
//                return !(isVivo()
////                        && AppCodeUtils.isSixModule()
//                        )
                return false
            }
            override fun isCanUseLocation(): Boolean {
                return false
            }
        }
    }


    fun splashMediation(): MediationAdSlot {
        //第一步、创建开屏自定义兜底对象
        val csjSplashRequestInfo: MediationSplashRequestInfo = object : MediationSplashRequestInfo(
            MediationConstant.ADN_PANGLE,  // 穿山甲
            getMMKVString(UserInfoManager.SPLASH_OPEN_AD_ID),  // adn开屏广告代码位Id，注意不是聚合广告位Id
            getMMKVString(UserInfoManager.GROMORE_APP_ID),  // adn应用id，注意要跟初始化传入的保持一致
            "" // adn没有appKey时，传入空即可
        ) {}
        return MediationAdSlot.Builder()
            .setMuted(false)
            .setVolume(0.5f)
            .setMediationSplashRequestInfo(csjSplashRequestInfo)
            .build()
    }
}


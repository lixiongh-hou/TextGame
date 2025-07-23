package com.sq.common_module.common.utils.http

import android.os.Build
import androidx.collection.ArrayMap
import com.blankj.utilcode.util.*
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.TDInfoUtils.isVpnConnected
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.java.StringArraySortUtil
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.saveMMKVString
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:22
 */
class MyInterceptor @Inject constructor() : Interceptor {
    val appCode = HttpHeaderUtils.appCode
    val channelCode = HttpHeaderUtils.channelCode
    override fun intercept(chain: Interceptor.Chain): Response {
        L.i("wwb_http", "$appCode-----$channelCode")
        val request = chain.request()
        val builder = request.newBuilder()
        val urlString = "${request.url.toString()}curTimeStamp"
        (TimeUtils.getNowMills() / 1000).toString().saveMMKVString(urlString)
//        L.i("服务器请求url:",request.url.toString())
        val mParaMap: Map<String, String>? = null
        //builder.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
        for (key in needSignHeaderMap(urlString).keys) {
            builder.addHeader(
                key,
                needSignHeaderMap(urlString)[key]!!
            )
        }
        val strSign: String = EncryptUtils.encryptMD5ToString(
            StringArraySortUtil
                .gtStitchingString(
                    includePrivatekeyHeaderMap(urlString, mParaMap)
                )
        ).toLowerCase()

        /**
         * root ISROOT
         * 模拟器 SIMULATOR
         * 小版本 VERSIONCODE
         */
        builder.apply {
            addHeader("PLATFORM", "android")
            addHeader("PLATFORMVERSION", "android" + DeviceUtils.getSDKVersionName().toString())
            addHeader("SIGN", strSign)
            addHeader("ISROOT", DeviceUtils.isDeviceRooted().toString())
            addHeader("SIMULATOR", DeviceUtils.isEmulator().toString())
            addHeader("IMEI", getMMKVString(UserInfoManager.I_MEI))
            addHeader("ANDROIDID", UserInfoManager.ANDROID_ID)
            builder.addHeader("BUNDLEID", AppUtils.getAppPackageName())
            if (!HttpHeaderUtils.postOaidOrIemi) {
                addHeader("IMEIORIGIN", getMMKVString(UserInfoManager.IMEIORIGIN))
                addHeader("OAID", getMMKVString(UserInfoManager.OAID))
            }
            addHeader("IDFA", "")
            addHeader("VERSIONCODE",  HttpHeaderUtils.versionCode)
            addHeader("UA", System.getProperty("http.agent"))
            addHeader("DEVICEBRAND", DeviceUtils.getManufacturer())
            addHeader("DEVICEMODEL", DeviceUtils.getModel())
            addHeader("DATAVERSION", getDataVersion())
            addHeader("wifiSecure", HttpHeaderUtils.wifiSecure)
            addHeader(
                "HASSIM",
                PhoneUtils.isSimCardReady().toString()
            )
            addHeader(
                "ISDEVMODE",
                DeviceUtils.isDevelopmentSettingsEnabled()
                    .toString()
            )
            addHeader(
                "VPN",
                (Utils.getApp()?.isVpnConnected
                    ?: false).toString()
            )
            addHeader("ISM8", isXiaomiMi8.toString())
        }


        val newRequest = builder.build()
        val proceed = chain.proceed(newRequest)


//        try {
//            val responseBody = proceed.body
//            val contentLength = responseBody?.contentLength()
//            val source = responseBody?.source()
//            source?.request(Integer.MAX_VALUE.toLong())
//            val buffer = source?.buffer()
//            if (contentLength?.toInt() != 0) {
////            L.i("服务器返回数据：", "" + buffer?.clone()?.readString(Charset.forName("UTF-8")))
//                L.v(
//                    "baseResult:",
//                    request.url.toString() + ":" + buffer?.clone()
//                        ?.readString(Charset.forName("UTF-8"))
//                )
//            }
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

        return proceed
    }

    // 判断设备型号是否包含"mi 8"
    // 判断设备厂商是否为Xiaomi
    val isXiaomiMi8: Boolean
        get() {
            // 判断设备厂商是否为Xiaomi
            if ("xiaomi".equals(Build.MANUFACTURER, ignoreCase = true)) {
                // 获取设备型号
                val model: String = Build.MODEL.toLowerCase()

                // 判断设备型号是否包含"mi 8"
                if (model.contains("mi 8")) {
                    return true
                }
            }
            return false
        }

    /**
     * 参与加签的字段
     *
     * @param
     * @return
     */
    private fun needSignHeaderMap(urlString: String): Map<String, String> {
        val sortMap: MutableMap<String, String> = ArrayMap()
//        sortMap["APPCODE"] = "1"
        sortMap["APPCODE"] = appCode
        sortMap["VERSION"] = AppUtils.getAppVersionName()
        sortMap["CHANNELCODE"] = channelCode
        sortMap["INNERVERSION"] = UserInfoManager.INNER_VERSION
//        sortMap["CHANNELCODE"] = "huawei"
//        sortMap["CHANNELCODE"] = getMMKVString(UserInfoManager.APP_CHANNEL)
        sortMap["TOKEN"] = getMMKVString(UserInfoManager.USER_TOKEN)
        sortMap["T"] = getMMKVString(urlString)
//        sortMap["T"] = ""
        sortMap["DEVICEID"] =UserInfoManager.DEVICEID
        return sortMap
    }

    /**
     * 添加privatekey的http请求头
     *
     * @param paraMap
     * @return
     */
    private fun includePrivatekeyHeaderMap(
        urlString: String,
        paraMap: Map<String, String>?
    ): Map<String, String>? {
        val headerMap: MutableMap<String, String> = ArrayMap()
        needSignHeaderMap(urlString).let { headerMap.putAll(it) }
        headerMap["privatekey"] = UserInfoManager.KEY_PRIVATE_KEY
        if (paraMap != null) {
            headerMap.putAll(paraMap)
        }
        return headerMap
    }

    private fun getDataVersion(): String {
//        return if (AppCodeConstant.isBelongFirsUI()) "1" else "2"
        return "4"
    }

}
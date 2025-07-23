package com.sq.common_module.common.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import androidx.core.content.ContextCompat
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.DeviceUtils
import com.blankj.utilcode.util.PhoneUtils
import com.sq.common_module.common.utils.java.L

/**
 * Created by town
 * Date :  2023/7/25
 * Time : 11:34
 */
object TDInfoUtils {
    var isRiskOpen = false //开屏
    var isRiskOpenReward = false //激励视频
    var isRiskOpenWithdraw = false //提现
    val riskAppcodeList =
        arrayOf(
            "20001",
            "20003",
            "20004",
            "20006",
            "20008",
            "20005",
            "20009",
            "20010",
            "20011",
            "20019",
            "20020",
            "20023",
            "20063",
            "20015",
            "20031"
        )

    fun getTDBean(): TDInfoBean {
        return TDInfoBean("4abb49ae954612853b39fbbb4f7c0c7f", "xinyihudong_and", "xinyihudong")
    }


    private fun getAppKey(): String {
        return when (HttpHeaderUtils.appCode) {
            "20001" -> "4abb49ae954612853b39fbbb4f7c0c7f"

            "20003" -> "d25b54222662f22990acd13b70f27f1a"

            "20004" -> "e696f66c5a406a68f54ea6eeacae2940"

            "20006" -> "76c5329333ce42efc00aaa1125a9b5b7"

            "20008" -> "dbf3eb8e9b4ae5b5835110e685c16385"

            "20005" -> "995b539b92e556943fb0fa8f43b90ed0"

            "20009" -> "922fdf0c7762a00c137a6a2991b28f31"

            "20010" -> "dd02a22c892415bda72356807b1d90a5"

            "20011" -> "10d8306d98642d8ed1bab757b1037a50"

            "20023" -> "b7e52d25c6ecb34cf00dc2ea32bc5603"

            "20019" -> "e9be6303eab8274c05c20a88aab24cda"

            "20020" -> "c3d04c0a32ace31feb0f48368c162227"

            "20031" -> "7324cb46bfd23dc4496f1c7072fd030a"

            "20063" -> "563acff5503a4b596227efdb049bd95c"

            "20015" -> "2df2771dc08891a3bfbf5f5283f3885a"

            else -> "4abb49ae954612853b39fbbb4f7c0c7f"
        }
    }


    /**
     * 是否是异常设备
     */
//    fun isAbnormalEquipment(): Boolean {

//        L.i(
//            "wwb----screen",
//            "ScreenActivity---initView---${PhoneUtils.isSimCardReady()}---${DeviceUtils.isDevelopmentSettingsEnabled()}----${ActivityUtils.getTopActivity().isVpnConnected}"
//        )
//        if (HttpHeaderUtils.appCode == "55008" && HttpHeaderUtils.channelCode.contains("xxl_vivo")) {
//            return true
//        } else {
//            return false
//        }
//    }


    /**
     * 是否是Vpn连接
     */
    val Context.isVpnConnected: Boolean
        @RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
        get() {
            val manager =
                ContextCompat.getSystemService(applicationContext, ConnectivityManager::class.java)
                    ?: return false
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                manager.getNetworkCapabilities(manager.activeNetwork)
                    ?.hasInternetValidatedTransport(
                        NetworkCapabilities.TRANSPORT_VPN
                    ) ?: false
            } else {
                manager.activeNetworkInfo?.type == ConnectivityManager.TYPE_VPN
            }
        }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun NetworkCapabilities.hasInternetValidatedTransport(transportType: Int): Boolean {
        return hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) and hasCapability(
            NetworkCapabilities.NET_CAPABILITY_VALIDATED
        ) and hasTransport(transportType)
    }
}


data class TDInfoBean(val appKey: String, val appName: String, val partnerCode: String)
package com.sq.common_module.common.utils.kt

import com.sq.common_module.common.utils.HttpHeaderUtils

/**
 * Created by town
 * Date :  2023/10/18
 * Time : 11:56
 */
object AppCodeConstant {
    private val wifiList =
        arrayListOf("50001", "50002", "55008", "55013", "55003", "55017", "55022", "55011", "55007")
    private val cleanList = arrayListOf("65001", "65002", "65010")
    private val weatherList = arrayListOf("85001")
    fun isWifiModule() = wifiList.contains(HttpHeaderUtils.appCode)
    fun isCleanModule() = cleanList.contains(HttpHeaderUtils.appCode)

    fun isAreaWeatherModule() = weatherList.contains(HttpHeaderUtils.appCode)

    fun isStepOrBatteryModule() =
        (!wifiList.contains(HttpHeaderUtils.appCode) && !cleanList.contains(HttpHeaderUtils.appCode) && !weatherList.contains(
            HttpHeaderUtils.appCode
        ))
}
package com.sq.common_module.common.utils.kt

/**
 * Created by town
 * Date :  2022/12/6
 * Time : 15:00
 */


val wzOneModule = arrayOf("999999")


object AppCodeUtils {

    fun getAppCode(): String = getMMKVString(UserInfoManager.APP_CODE)


    fun isWzOneModule(): Boolean =
        wzOneModule.findAppCodeByList()


    private fun Array<String>.findAppCodeByList(): Boolean =
        this.any { it == getMMKVString(UserInfoManager.APP_CODE) }

    fun isWiFiCode(): Boolean {
        return false
    }
}

//fun isHideSplashBottom(): Boolean {
//    return false
//    return AppCodeUtils.isEightModule() ||
//            AppCodeUtils.isWifiOneModule() ||
//            AppCodeUtils.isWifiTwoModule() ||
//            AppCodeUtils.isTwelveModule() ||
//            AppCodeUtils.isWifiThreeModule() ||
//            AppCodeUtils.isModule20019() ||
//            AppCodeUtils.isModule20020() ||
//            AppCodeUtils.isModule20023() ||
//            AppCodeUtils.isWifiFourModule() ||
//            AppCodeUtils.isWifiFourModule()
//}

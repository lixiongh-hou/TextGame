package com.sq.common_module.common.utils.kt

/**
 * Created by lsy
 * Date : 2023/11/3
 * Desc : 埋点事件&构建工具
 */
object TrackEventConst {

    /**
     * 未定义 占位符
     */
    const val E_UNDEFINED = "undefined"

    /**
     * 开屏
     */
    const val E_OPEN_SCREEN = "openScreen"

    /**
     *开屏广告
     */
    const val E_OPEN_SCREEN_AD = "openScreenAd"

    /**
     * 加速页面
     */
    const val E_GUIDE_ACC = "networkSpeedUpPage"

    /**
     * 加速-加速结果页面
     */
    const val E_GUIDE_ACC_RESULT = "networkSpeedUpFinishPage"

    /**
     * 加速-加速结果-4项页面
     */
    const val E_GUIDE_ACC_RESULT_ITEM = "networkSpeedUpListPage"

    /**
     * 加速-加速结果-4项-首页
     */
    const val E_GUIDE_ACC_RESULT_ITEM_HOME = "home"

    /**
     * 4项-wifi-防蹭保护
     */
    const val E_GUIDE_ACC_WIFI_1 = "wifiPreventNetwork"

    /**
     * 4项-wifi-信号加强
     */
    const val E_GUIDE_ACC_WIFI_2 = "wifiEnhancedSignal"

    /**
     * 4项-wifi-网络加固
     */
    const val E_GUIDE_ACC_WIFI_3 = "wifiStrengthNetwork"

    /**
     * 4项-wifi-WIFI卫士
     */
    const val E_GUIDE_ACC_WIFI_4 = "wifiGuard"

    /**
     * 4项-5g-流量保护
     */
    const val E_GUIDE_ACC_5G_1 = "wifiFlowProtection"

    /**
     * 4项-5g-防蹭保护
     */
    const val E_GUIDE_ACC_5G_2 = "wifiPreventNetwork"

    /**
     * 4项-5g-系统网络
     */
    const val E_GUIDE_ACC_5G_3 = "wifiSystemNetwork"

    /**
     * 4项-5g-WIFI卫士
     */
    const val E_GUIDE_ACC_5G_4 = "wifiGuard"

    /**
     * 链接wifi
     */
    const val E_CONNECT_WIFI = "ConnectWifi"

    /**
     * 链接wifi-ad
     */
    const val E_CONNECT_WIFI_AD = "ConnectWifiAd"

    /**
     * wifi tab
     */
    const val E_ENTRY_WIFI_PAGE="entryWifiPage"

    /**
     * 加速页面视频
     */
    const val E_NETWORK_SPEED_UP_PAGE = "networkSpeedUpPage"

    /**
     * 构建4项事件
     * @param isWifi wifi or 5g
     * @param pos item pos
     * @param isPre start or end
     */
    fun build4ItemConst(isWifi: Boolean, pos: Int, isPre: Boolean): String {
        return StringBuilder()
            .append(if (isWifi) "wifi-" else "5g-")
            .append(
                if (isWifi) {
                    when (pos) {
                        1 -> E_GUIDE_ACC_WIFI_1
                        2 -> E_GUIDE_ACC_WIFI_2
                        3 -> E_GUIDE_ACC_WIFI_3
                        4 -> E_GUIDE_ACC_WIFI_4
                        else -> E_UNDEFINED
                    }
                } else {
                    when (pos) {
                        1 -> E_GUIDE_ACC_5G_1
                        2 -> E_GUIDE_ACC_5G_2
                        3 -> E_GUIDE_ACC_5G_3
                        4 -> E_GUIDE_ACC_5G_4
                        else -> E_UNDEFINED
                    }
                }
            )
            .append(if (isPre) "-Pre" else "-Finish")
            .toString()
    }

}
package com.sq.common_module.common.utils

import com.sq.common_module.common.bean.ToWIfiPageBean

/**
 * Created by town
 * Date :  2023/5/22
 * Time : 9:21
 */
object HttpHeaderUtils {
    var appCode = ""
    var channelCode = ""
    var mActivityCount = 0
    var wifiSecure = ""
    var versionCode=""
    var isWifiXXL = true
    var toWifiAcceleration = false
    var toCleanAcceleration = false
    var toGuideWifiOptimize = false
    var guideBean: ToWIfiPageBean? = null
    var ksAppId = ""
    var ylhAppId = ""

    var toGuideCleanOptimize = false

    var isCreatedOver24Hours = false
    var homeSplashFinish = false //开屏广告页面是否关闭
    var isHomeForeground = true  //是否处于前台
    var isShowSplashAd = false
    var isRewardShowing = false //激励视频是否播放
    var isWxOrZfb = false  //是否打开微信或者支付宝
    var isRewardClose = true  //激励视频是否关闭
    var isWifiOptimizing = false    //wifi优化是否进行

    var isWiFiOpt = false  //是否wifi优化过程中

    var postOaidOrIemi = false

    var isRiskUser = 0 //0 正常用户  1风控用户
    var planId: String = ""
}
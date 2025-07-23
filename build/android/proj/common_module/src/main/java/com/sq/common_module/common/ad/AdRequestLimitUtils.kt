package com.sq.common_module.common.ad

import com.blankj.utilcode.util.AppUtils
import com.sq.common_module.common.bean.SystemCheckBean
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.RetrofitUtils
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.isLessAdMode
import java.util.Date

/**
 * Created by town
 * Date :  2024/1/15
 * Time : 13:38
 * 广告请求风控接口限制
 */
object AdRequestLimitUtils {
    var splashAdId = ""
    var feedAdId = ""
    var fullAdId = ""
    var rewardAdId = ""

    var startTime = 0L
    var endTime = 0L
    var isInnerRisk = false

    inline fun requestSystemRisk(type: Int, crossinline invoke: (s: String) -> Unit) {
        endTime = Date().time
        L.i(
            "wwb_request_time_start",
            "广告${type}----${endTime}-----${startTime}-----${(endTime - startTime >= 60000)}"
        )
        if (endTime - startTime >= 60000 && HttpHeaderUtils.appCode != "79000" && HttpHeaderUtils.appCode != "50009") {
            startTime = Date().time
            L.i(
                "wwb_request_time_end",
                "广告${type}----${endTime}-----${startTime}-----${(endTime - startTime >= 60000)}"
            )
            RetrofitUtils().getApiService().getSystemCheck()
                .handleRequest(null, object : NetCallBack<SystemCheckBean> {
                    override fun onSuccess(data: SystemCheckBean?) {
                        data?.let {
                            isInnerRisk = it.isRisk
                            splashAdId = it.splashInfo.adUnitId
                            feedAdId = it.feedInfo.adUnitId
                            fullAdId = it.fullInfo.adUnitId
                            rewardAdId = it.rewardInfo.adUnitId
                            //这里判断一下是否是低ecpm，使用低ecpm的id
                            if (UserInfoManager.lowEcpmUser == 0 && isLessAdMode().not()) {
                                feedAdId = it.xxlLowInfo.adUnitId
                                fullAdId = it.screenLowInfo.adUnitId
                            }
                            if (AppUtils.isAppDebug()) {
//                        应用ID：5525610
//                        激励视频-默认：102805515
//                        开屏-默认：102804526
//                        信息流-默认：102803580
//                        插全屏-默认：102805702
//                                splashAdId = "102804526"
//                                feedAdId = "102803580"
//                                fullAdId = "102805702"
//                                rewardAdId = "102805515"
//                                "102805515".saveMMKVString(UserInfoManager.REWARD_AD_ID)
//                                "102805702".saveMMKVString(UserInfoManager.NEW_PERSON_FULL_AD_ID)
//                                "102803580".saveMMKVString(UserInfoManager.SPECIAL_FEED_AD_ID)
                            }
                            invoke.invoke(getAdId(type))
                        }
                    }
                })
        } else {
            invoke.invoke(getAdId(type))
        }
    }

    fun getAdId(type: Int): String {
        return when (type) {
            ADType.SPLASH_AD -> splashAdId
            ADType.FEED_LIST_AD ->if (UserInfoManager.lowEcpmUser == 0 && isLessAdMode().not()) getMMKVString(
                UserInfoManager.LOW_ECPM_FEED_AD_ID
            ) else feedAdId

            ADType.FULL_AD -> if (UserInfoManager.lowEcpmUser == 0 && isLessAdMode().not()) getMMKVString(UserInfoManager.LOW_ECPM_FULL_AD_ID) else fullAdId
            ADType.REWARD_AD -> rewardAdId
            else -> ""
        }
    }
}
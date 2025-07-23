package com.sq.common_module.common.ad

import android.app.Activity
import com.blankj.utilcode.util.ActivityUtils

import com.sq.common_module.common.pange.TTFullAdUtils
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVBool
import com.sq.common_module.common.utils.kt.getMMKVInt
import com.sq.common_module.common.utils.kt.getMMKVIntWithDef
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.isLessAdMode
import com.sq.common_module.common.utils.kt.saveMMKVBool
import com.sq.common_module.common.utils.kt.saveMMKVInt
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 15:55
 * 插全屏统一处理
 */
interface FullCallBack {
    fun showFullSuccess(ecpm: String?) {}

    fun closeFullAd() {}

    fun loadFullFail() {}
}


class FullAdUtils
@Inject constructor(
    private val groMoreFullAdUtils: TTFullAdUtils,

    ) {
    private var mAdPlatformType = ADPlatFromType.GROMORE_AD // 广告平台类型

    fun showOtherSimpleFullAd(
        activity: Activity,
    ) {
        showFullAd(ADPlatFromType.GROMORE_AD, activity, "0", "otherTask", object : FullCallBack {})
    }

    fun showFullAd(
        adPlatformType: Int,
        activity: Activity,
        fullId: String,
        actionName: String,
        fullCallBack: FullCallBack,
        ignoreLessAdMode: Boolean = false,
    ) {
        var finalId = fullId
        if (HttpHeaderUtils.isHomeForeground && ActivityUtils.getTopActivity() != null && ActivityUtils.getTopActivity()::class.java.javaClass.name.contains(
                "Stub_"
            )
        ) {
            return
        }
        if (isLessAdMode()) {
            val lessAdLimit = getMMKVBool(UserInfoManager.IS_LESSAD_LIMIT)
            val cqpLimit = getMMKVIntWithDef(UserInfoManager.CQP_LIMIT, -1)
            if (lessAdLimit && cqpLimit == 0) {
                //如果信息流的限制达到上限，直接返回掉
                return
            }
            if (getMMKVInt(UserInfoManager.IS_LESS_AD_OPEN_LIMIT) == 0) {
                return
            } else {
                if (getMMKVInt(UserInfoManager.IS_LESS_AD_OPEN_LIMIT) > UserInfoManager.fullOpenTime && UserInfoManager.fullOpenTime != -1) {
                    UserInfoManager.fullOpenTime++
                    return
                } else {
                    UserInfoManager.fullOpenTime = 0
                    if (lessAdLimit && cqpLimit > 0) {
                        //这里需要开始展示广告了，直接次数减1
                        (cqpLimit - 1).saveMMKVInt(UserInfoManager.CQP_LIMIT)
                    }
                }
            }

        } else if (UserInfoManager.lowEcpmUser != 1) {
            //低质量的用户限制
            val limit = getMMKVIntWithDef(UserInfoManager.LOW_INTERVAL, -1)
            if (limit == 0) {
                return
            }
            if (limit > UserInfoManager.fullOpenTime && UserInfoManager.fullOpenTime != -1) {
                UserInfoManager.fullOpenTime++
                return
            } else {
                UserInfoManager.fullOpenTime = 0
            }
            //低ecpm走的逻辑
            finalId = getMMKVString(UserInfoManager.LOW_ECPM_FULL_AD_ID)
        } else {
            //正式版开屏的间隔，1代表没有间隔
            val xxlLimit = getMMKVIntWithDef(UserInfoManager.IS_OFFICIAL_LIMIT, 1)
            if (UserInfoManager.fullOpenTime != -1) {
                UserInfoManager.fullOpenTime =
                    if (UserInfoManager.fullOpenTime < 1) 1 else UserInfoManager.fullOpenTime

                if (xxlLimit > 1 && xxlLimit > UserInfoManager.fullOpenTime) {
                    UserInfoManager.fullOpenTime++
                    return
                } else {
                    UserInfoManager.fullOpenTime = 1
                }
            } else {
                UserInfoManager.fullOpenTime = 1
            }

        }

        if (activity.isDestroyed) return

        if (HttpHeaderUtils.appCode == "30011" && getMMKVBool("TwoTimeShowFull")) {
            false.saveMMKVBool("TwoTimeShowFull")
            return
        }
        mAdPlatformType = adPlatformType
        when (mAdPlatformType) {

            else -> groMoreFullAdUtils.initTTFullAd(
                activity, finalId, actionName, fullCallBack
            )
        }
    }


    fun onDestroy() {
        when (mAdPlatformType) {

            ADPlatFromType.KS_AD -> {}
            else -> groMoreFullAdUtils.onDestroy()
        }
    }
}
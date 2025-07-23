package com.sq.common_module.common.ad

import android.app.Activity
import android.widget.FrameLayout
import com.kwad.sdk.core.b.a.it

import com.sq.common_module.common.pange.MyFeedAdUtils
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVBool
import com.sq.common_module.common.utils.kt.getMMKVInt
import com.sq.common_module.common.utils.kt.getMMKVIntWithDef
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.isHUAWEI
import com.sq.common_module.common.utils.kt.isLessAdMode
import com.sq.common_module.common.utils.kt.isVivo
import com.sq.common_module.common.utils.kt.saveMMKVBool
import com.sq.common_module.common.utils.kt.saveMMKVInt
import com.sq.common_module.common.utils.kt.saveMMKVParcelable
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 16:52
 * 信息流广告统一处理
 */

interface FeedAdInterface {
    fun showAdBack(loadSuccess: Boolean)

    fun closeFeedAd() {}
}

class FeedAdUtils
@Inject constructor(
    private val groMoreFeedAdUtils: MyFeedAdUtils,
) {
    private var mAdPlatformType = ADPlatFromType.GROMORE_AD // 广告平台类型

    fun showSimpleFeedAd(
        activity: Activity,
        container: FrameLayout,
        mWidth: Int,
        actionName: String,
        feedAdInterface: FeedAdInterface,
    ) {
        showFeedAd(
            ADPlatFromType.GROMORE_AD,
            activity,
            container,
            mWidth,
            0,
            "0",
            actionName,
            feedAdInterface
        )
    }

    fun showOtherSimpleFeed(
        activity: Activity,
        adView: FrameLayout,
        actionName: String = "otherTask",
    ) {
        adView.post {
            showSimpleFeedAd(activity, adView, adView.width, actionName, object : FeedAdInterface {
                override fun showAdBack(loadSuccess: Boolean) {

                }
            })
        }
    }

    fun showFeedAd(
        platform: Int,
        activity: Activity,
        container: FrameLayout,
        mWidth: Int,
        mHeight: Int,
        adId: String,
        actionName: String,
        feedAdInterface: FeedAdInterface,
    ) {
        var finalId = adId
        L.i("wwb_native", "$mWidth----  ${isHiddenFeedAds()}")
        if (isLessAdMode()) {
            val lessAdLimit = getMMKVBool(UserInfoManager.IS_LESSAD_LIMIT)
            val xxlLimit = getMMKVIntWithDef(UserInfoManager.XXL_LIMIT, -1)
            if (lessAdLimit && xxlLimit == 0) {
                //如果信息流的限制达到上限，直接返回掉
                return
            }
            if (getMMKVInt(UserInfoManager.IS_LESS_AD_OPEN_LIMIT) == 0) {
                return
            } else {
                if (getMMKVInt(UserInfoManager.IS_LESS_AD_OPEN_LIMIT) > UserInfoManager.feedOpenTime && UserInfoManager.feedOpenTime != -1) {
                    UserInfoManager.feedOpenTime++
                    return
                } else {
                    UserInfoManager.feedOpenTime = 0
                    if (lessAdLimit && xxlLimit > 0) {
                        //这里需要开始展示广告了，直接次数减1
                        (xxlLimit - 1).saveMMKVInt(UserInfoManager.XXL_LIMIT)
                    }
                }
            }

        } else if (UserInfoManager.lowEcpmUser != 1) {

            //低质量的用户限制
            val limit = getMMKVIntWithDef(UserInfoManager.LOW_INTERVAL, -1)
            if (limit == 0) {
                return
            }
            if (limit > UserInfoManager.feedOpenTime && UserInfoManager.feedOpenTime != -1) {
                UserInfoManager.feedOpenTime++
                return
            } else {
                UserInfoManager.feedOpenTime = 0
            }
            //低ecpm走的逻辑
            finalId = getMMKVString(UserInfoManager.LOW_ECPM_FEED_AD_ID)
        } else {
            //正式版开屏的间隔，1代表没有间隔
            val xxlLimit = getMMKVIntWithDef(UserInfoManager.IS_OFFICIAL_LIMIT, 1)
            if (UserInfoManager.feedOpenTime != -1) {
                UserInfoManager.feedOpenTime =
                    if (UserInfoManager.feedOpenTime < 1) 1 else UserInfoManager.feedOpenTime

                if (xxlLimit > 1 && xxlLimit > UserInfoManager.feedOpenTime) {
                    UserInfoManager.feedOpenTime++
                    return
                } else {
                    UserInfoManager.feedOpenTime = 1
                }
            } else {
                UserInfoManager.feedOpenTime = 1
            }

        }

        mAdPlatformType = platform
        when (mAdPlatformType) {
            else -> groMoreFeedAdUtils.loadFeedAd(
                activity, container, mWidth, mHeight, finalId, actionName, feedAdInterface
            )
        }
    }

//
//    fun onResume() {
//        when (mAdPlatformType) {
//            ADPlatFromType.GROMORE_AD -> groMoreFeedAdUtils.onResume()
//
//        }
//    }

    fun onDestroy() {
        when (mAdPlatformType) {

            else -> groMoreFeedAdUtils.onDestroy()
        }
    }

    private fun isHiddenFeedAds(): Boolean {
        if (isLessAdMode()) {
            val wifiCodeArr = arrayListOf("55011", "55016", "55023", "55019", "55013", "55018")
            if (isVivo()) return true
            if (isHUAWEI() && wifiCodeArr.contains(HttpHeaderUtils.appCode)) return true
            return false
        } else {
            return false
        }
    }

}
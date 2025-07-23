package com.sq.common_module.common.ad

import android.app.Activity
import android.widget.FrameLayout

import com.sq.common_module.common.pange.TTSplashAdUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVBool
import com.sq.common_module.common.utils.kt.getMMKVIntWithDef
import com.sq.common_module.common.utils.kt.isLessAdMode
import com.sq.common_module.common.utils.kt.saveMMKVInt
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 17:12
 * 开屏广告统一处理
 */

interface SplashAdInterface {
    fun goToMainActivity() {}
    fun loadSplashAdCallBack(loadSuccess: Boolean) {}
    fun goToMainActivity(loadSuccess: Boolean) {}

}


class SplashAdUtils
@Inject constructor(
    private val groMoreSplashUtils: TTSplashAdUtils

) {
    private var mAdPlatformType = ADPlatFromType.KS_AD // 广告平台类型

    fun loadSplashAd(
        type: Int,
        activity: Activity,
        adId: String,
        container: FrameLayout,
        splashBack: SplashAdInterface
    ) {
        val kpLimit = getMMKVIntWithDef(UserInfoManager.KP_LIMIT, -1)
        val lessAdLimit = getMMKVBool(UserInfoManager.IS_LESSAD_LIMIT)
        if (isLessAdMode()) {

            if (lessAdLimit && kpLimit == 0) {
                //如果信息流的限制达到上限，直接返回掉
                return
            }
            if (lessAdLimit && kpLimit > 0) {
                //这里需要开始展示广告了，直接次数减1
                (kpLimit - 1).saveMMKVInt(UserInfoManager.KP_LIMIT)
            }
        } else if (UserInfoManager.lowEcpmUser ==0) {
            //低质量的用户，直接跳过开屏
            splashBack.goToMainActivity(false)
            return
        }
        mAdPlatformType = type
        L.i("wwb_splash_ad", "loadSplashAd $mAdPlatformType")
        when (mAdPlatformType) {

            ADPlatFromType.GROMORE_AD -> groMoreSplashUtils.loadTTSplashAd(
                activity,
                container,
                adId,
                splashBack
            )
        }
    }

    fun showSplashAd() {
        L.i("wwb_splash_ad", "showSplashAd $mAdPlatformType")
        when (mAdPlatformType) {
//            ADPlatFromType.KS_AD -> ksSplashUtils.showSplashAd()
//
//            ADPlatFromType.GDT_AD -> gdtSplashAdUtils.requestGDTSplashScreenAd(
//                activity,
//                container,
//                adId,
//                splashBack
//            )
            ADPlatFromType.GROMORE_AD -> groMoreSplashUtils.showSplashAd()
        }
    }

    fun destroy() {
        L.i("wwb_splash_ad", "destroy $mAdPlatformType")
        when (mAdPlatformType) {

            ADPlatFromType.GROMORE_AD -> groMoreSplashUtils.onDestroy(true)
        }
    }
}
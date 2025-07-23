package com.sq.common_module.common.pange

import android.app.Activity
import android.util.Log
import com.blankj.utilcode.util.ActivityUtils
import com.bytedance.sdk.openadsdk.*
import com.sq.common_module.common.ad.*
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.http.SyncAdInfoUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.*

import java.util.*
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/8/11
 * Time : 13:51
 */
class TTFullAdUtils @Inject constructor(private val syncAdInfoUtils: SyncAdInfoUtils) {
    private var mActivity: Activity? = null
    private var mFullAdId = ""
    private var showFullAd = false  //是否展示插全屏

    private var mFullCallBack: FullCallBack? = null

    private var mActionName = ""
    private var timeDate = ""
    private var mTTFullScreenVideoAd // 插全屏广告对象
            : TTFullScreenVideoAd? = null
    private var mFullScreenVideoListener // 广告加载监听器
            : TTAdNative.FullScreenVideoAdListener? = null
    private var mFullScreenVideoAdInteractionListener // 广告展示监听器
            : TTFullScreenVideoAd.FullScreenVideoAdInteractionListener? = null
    private var mEcpm = ""
    fun initTTFullAd(
        activity: Activity,
        adId: String,
        actionName: String,
        fullCallBack: FullCallBack,
    ) {
        AdRequestLimitUtils.requestSystemRisk(ADType.FULL_AD) { fullAdId ->
            mActivity = activity
            mFullAdId = fullAdId
            mActionName = actionName
            mFullCallBack = fullCallBack
            timeDate = Date().time.toString()
            L.i("wwb_reward_ud", AdIdRecord.fullId)

            if (HttpHeaderUtils.isRiskUser == 1 || !TTAdSdk.isInitSuccess() || mFullAdId == "") return@requestSystemRisk

            true.saveMMKVBool(UserInfoManager.REQUEST_AD)
            /** 1、创建AdSlot对象  */
            val adslot = AdSlot.Builder()
                .setCodeId(mFullAdId)
                .setUserID(getMMKVString(UserInfoManager.USER_ID))
                .setOrientation(TTAdConstant.ORIENTATION_VERTICAL)
                .build()
            syncAdInfo(0, null, 1)
            /** 2、创建TTAdNative对象  */
            val adNativeLoader = TTAdSdk.getAdManager().createAdNative(mActivity)

            /** 3、创建加载、展示监听器  */
            initListeners()

            /** 4、加载广告  */
            adNativeLoader.loadFullScreenVideoAd(adslot, mFullScreenVideoListener)
        }

    }


    private fun initListeners() {
        // 广告加载监听器
        mFullScreenVideoListener = object : TTAdNative.FullScreenVideoAdListener {
            override fun onError(code: Int, message: String) {
                // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onError   mFullCallBack is${mFullCallBack == null}")
//                Log.d(Const.TAG, "InterstitialFull onError code = $code msg = $message")
                loadAdFailLog(code.toString(), message)
                mFullCallBack?.loadFullFail()
            }

            override fun onFullScreenVideoAdLoad(ad: TTFullScreenVideoAd) {
                // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onFullScreenVideoAdLoad   mFullCallBack is${mFullCallBack == null}")
//                Log.d(Const.TAG, "InterstitialFull onFullScreenVideoLoaded")
                mTTFullScreenVideoAd = ad

            }

            override fun onFullScreenVideoCached() {
                //                Log.d(Const.TAG, "InterstitialFull onFullScreenVideoCached")
            }

            override fun onFullScreenVideoCached(ad: TTFullScreenVideoAd) {
                // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onFullScreenVideoCached   mFullCallBack is${mFullCallBack == null}")
//                Log.d(Const.TAG, "InterstitialFull onFullScreenVideoCached")
                mTTFullScreenVideoAd = ad
                syncAdInfo(0, null, 2)
                mTTFullScreenVideoAd?.mediationManager?.isReady?.let {
                    if (it) {
                        showInterstitialFullAd()
                    }
                }
            }
        }
        // 广告展示监听器
        mFullScreenVideoAdInteractionListener =
            object : TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
                override fun onAdShow() {
                    // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onAdShow   mFullCallBack is${mFullCallBack == null}")
//                    Log.d(Const.TAG, "InterstitialFull onAdShow")
                    val lowLimit = getMMKVIntWithDef(UserInfoManager.LOW_LIMIT, 100)
                    mEcpm = mTTFullScreenVideoAd?.mediationManager?.showEcpm?.ecpm.toString()
                    if (UserInfoManager.lowEcpmUser == -1) {
                        if (mEcpm.isEmpty()) {
                            UserInfoManager.lowEcpmUser = 0
                        } else if (mEcpm.toDouble() / 100 < lowLimit) {
                            UserInfoManager.lowEcpmUser = 0
                        } else {
                            UserInfoManager.lowEcpmUser = 1
                        }
                    }
                    syncAdInfo(0, null, 3, mTTFullScreenVideoAd?.mediationManager?.showEcpm?.slotId)
                    mFullCallBack?.showFullSuccess(mTTFullScreenVideoAd?.mediationManager?.showEcpm?.ecpm)
                }

                override fun onAdVideoBarClick() {
//                    Log.d(Const.TAG, "InterstitialFull onAdVideoBarClick")
                    syncAdInfo(1, null, 4)
                }

                override fun onAdClose() {
                    syncAdInfo(0, 1, 5)
                    // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onAdClose   mFullCallBack is${mFullCallBack == null}")
                    mFullCallBack?.closeFullAd()
//                    Log.d(Const.TAG, "InterstitialFull onAdClose")
                }

                override fun onVideoComplete() {
                    // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onVideoComplete   mFullCallBack is${mFullCallBack == null}")
//                    Log.d(Const.TAG, "InterstitialFull onVideoComplete")
                }

                override fun onSkippedVideo() {
                    // L.i("reward_yhs", "${TTFullAdUtils::class.java.simpleName} onSkippedVideo   mFullCallBack is${mFullCallBack == null}")
//                    Log.d(Const.TAG, "InterstitialFull onSkippedVideo")
                }
            }
    }

    // 在加载成功后展示广告
    private fun showInterstitialFullAd() {
        if (mTTFullScreenVideoAd == null) {
//            Log.d(Const.TAG, "请先加载广告或等待广告加载完毕后再调用show方法")
            return
        }

//        if ( ActivityUtils.getActivityList().first().javaClass != mActivity?.javaClass){
//            return
//        }
        /** 5、设置展示监听器，展示广告  */
        mTTFullScreenVideoAd!!.setFullScreenVideoAdInteractionListener(
            mFullScreenVideoAdInteractionListener
        )
        mTTFullScreenVideoAd!!.showFullScreenVideoAd(mActivity)
    }

    fun onDestroy() {
        /** 6、在onDestroy中销毁广告  */
        if (mTTFullScreenVideoAd != null && mTTFullScreenVideoAd!!.mediationManager != null) {
            mTTFullScreenVideoAd!!.mediationManager.destroy()
            mTTFullScreenVideoAd = null
        }
        mFullCallBack?.let {
            mFullCallBack = null
        }
    }


    private fun syncAdInfo(isClick: Int, isEnd: Int? = null, status: Int, slotId: String? = null) {
        syncAdInfoUtils.toSyncAdInfoServer(
            "${getTransId(ADPlatFromType.GROMORE_AD, mFullAdId)}${timeDate}",
            ADPlatFromType.GROMORE_AD,
            ADType.FULL_AD,
            mEcpm,
            mActionName,
            isClick,
            getMMKVString(UserInfoManager.GROMORE_APP_ID),
            mFullAdId, isEnd, status, slotId
        )
    }

    private fun loadAdFailLog(errCode: String, errMsg: String) {
        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mFullAdId, errCode, errMsg)
    }
}
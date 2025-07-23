//package com.sq.common_module.common.gromore.sigle
//
//import android.app.Activity
//import com.bytedance.msdk.api.AdError
//import com.bytedance.msdk.api.v2.ad.interstitialFull.GMInterstitialFullAdLoadCallback
//import com.google.gson.Gson
//import com.sq.common_module.common.ad.ADPlatFromType
//import com.sq.common_module.common.ad.ADType
//import com.sq.common_module.common.ad.FullCallBack
//import com.sq.common_module.common.ad.getTransId
//import com.sq.common_module.common.gromore.impl.GMInterstitialFullAdListenerImpl
//import com.sq.common_module.common.gromore.preload.PreLoadInterstitialFullManager
//import com.sq.common_module.common.utils.http.SyncAdInfoUtils
//import com.sq.common_module.common.utils.java.L
//import com.sq.common_module.common.utils.kt.UserInfoManager
//import com.sq.common_module.common.utils.kt.getMMKVString
//import org.json.JSONObject
//import java.util.*
//import javax.inject.Inject
//
///**
// * Created by town
// * Date :  2022/11/14
// * Time : 15:10
// * 插全屏
// */
//class GroMoreFullAdUtils @Inject constructor(private val syncAdInfoUtils: SyncAdInfoUtils) {
//    private var mActivity: Activity? = null
//    private var mFullAdId = ""
//    private var showFullAd = false  //是否展示插全屏
//    private var mPreLoadInterstitialFullManager: PreLoadInterstitialFullManager? = null
//    private var mFullCallBack: FullCallBack? = null
//
//    private var mActionName = ""
//    private var timeDate = ""
//    fun initGroMoreFullActivity(
//        activity: Activity,
//        fullAdId: String,
//        actionName: String,
//        fullCallBack: FullCallBack
//    ) {
//        mActivity = activity
//        mFullAdId = fullAdId
//        mActionName = actionName
//        mFullCallBack = fullCallBack
//        timeDate = Date().time.toString()
//        startShowFullAd()
//    }
//
//    private val mGMInterstitialFullAdListener = object : GMInterstitialFullAdListenerImpl() {
//        override fun onInterstitialFullShow() {
//            super.onInterstitialFullShow()
////            mIsShow = true
////            preload()
//            syncAdInfo(0)
//            mFullCallBack?.showFullSuccess(mPreLoadInterstitialFullManager?.ecpm)
//
////            L.i("wwb_full_adSlot","${mPreLoadInterstitialFullManager?.gmInterstitialFullAd?.adLoadInfoList}----" +
////                    "${mPreLoadInterstitialFullManager?.gmInterstitialFullAd?.adSlot?.adUnitId}")
//        }
//
//        override fun onInterstitialFullClosed() {
//            super.onInterstitialFullClosed()
//            mFullCallBack?.closeFullAd()
//        }
//
//        override fun onInterstitialFullClick() {
//            super.onInterstitialFullClick()
//            syncAdInfo(1)
//        }
//
//        override fun onInterstitialFullShowFail(adError: AdError) {
//            super.onInterstitialFullShowFail(adError)
//            loadAdFailLog(adError.code.toString(), adError.message)
//            mFullCallBack?.loadFullFail()
//        }
//    }
//
//    /**
//     * 展示插全屏
//     */
//    private fun startShowFullAd() {
//        mPreLoadInterstitialFullManager =
//            PreLoadInterstitialFullManager(mActivity, mFullAdId, object :
//                GMInterstitialFullAdLoadCallback {
//                override fun onInterstitialFullAdLoad() {
//                    L.d("TTMediationSDK_GMInterstitialFullAdListener", "onInterstitialFullAdLoad")
////                "插全屏加载成功".toast()
//                    mPreLoadInterstitialFullManager?.let {
//                        if (it.isReady) {
//                            it.show(mActivity, mGMInterstitialFullAdListener)
//                        }
//                    }
//                }
//
//                override fun onInterstitialFullCached() {
//                    L.d("TTMediationSDK_GMInterstitialFullAdListener", "onInterstitialFullCached")
////                "插全屏缓存成功".toast()
//                }
//
//                override fun onInterstitialFullLoadFail(adError: AdError) {
//                }
//            })
//    }
//
//    fun onDestroy() {
//        mPreLoadInterstitialFullManager?.destroy()
//        mPreLoadInterstitialFullManager = null
//    }
//
//    private fun syncAdInfo(isClick: Int) {
//        mPreLoadInterstitialFullManager?.ecpm?.let {
//            syncAdInfoUtils.toSyncAdInfoServer(
//                "${getTransId(ADPlatFromType.GROMORE_AD, mFullAdId)}${timeDate}",
//                ADPlatFromType.GROMORE_AD,
//                ADType.FULL_AD,
//                it,
//                mActionName,
//                isClick,
//                getMMKVString(UserInfoManager.GROMORE_APP_ID),
//                mFullAdId
//            )
//        }
//    }
//
//    private fun loadAdFailLog(errCode: String, errMsg: String) {
//        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mFullAdId, errCode, errMsg)
//    }
//}
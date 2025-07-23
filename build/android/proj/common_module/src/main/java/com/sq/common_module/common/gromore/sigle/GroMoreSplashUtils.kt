//package com.sq.common_module.common.gromore.sigle
//
//import android.app.Activity
//import android.widget.FrameLayout
//import com.blankj.utilcode.util.BarUtils
//import com.blankj.utilcode.util.SizeUtils
//import com.bytedance.msdk.api.AdError
//import com.bytedance.msdk.api.TTAdConstant
//import com.bytedance.msdk.api.UIUtils
//import com.bytedance.msdk.api.v2.GMNetworkPlatformConst
//import com.bytedance.msdk.api.v2.GMNetworkRequestInfo
//import com.bytedance.msdk.api.v2.ad.splash.GMSplashAd
//import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener
//import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdLoadCallback
//import com.bytedance.msdk.api.v2.slot.GMAdSlotSplash
//import com.sq.common_module.common.ad.ADPlatFromType
//import com.sq.common_module.common.ad.ADType
//import com.sq.common_module.common.ad.SplashAdInterface
//import com.sq.common_module.common.ad.getTransId
//import com.sq.common_module.common.gromore.SplashUtils
//import com.sq.common_module.common.splash.SplashMinWindowManager
//import com.sq.common_module.common.utils.http.SyncAdInfoUtils
//import com.sq.common_module.common.utils.java.L
//import com.sq.common_module.common.utils.kt.UserInfoManager
//import com.sq.common_module.common.utils.kt.getMMKVString
//import java.util.*
//import javax.inject.Inject
//
///**
// * Created by town
// * Date :  2023/7/17
// * Time : 17:14
// */
//class GroMoreSplashUtils @Inject constructor(private val syncAdInfoUtils: SyncAdInfoUtils) {
//    private var mTTSplashAd: GMSplashAd? = null
//    private var mActivity: Activity? = null
//    private var mSplashContainer: FrameLayout? = null
//    private var mSplashBack: SplashAdInterface? = null
//
//    private var loadSplashSuccess = false
//    private var timeDate = ""
//    private var mSplashAdId = ""
//    private var splashEcpm = "0"
//
//
//    fun loadSplashAd(
//        activity: Activity,
//        adId: String,
//        container: FrameLayout,
//        splashBack: SplashAdInterface
//    ) {
//        mSplashAdId = adId
//        mActivity = activity
//        mSplashContainer = container
//        mSplashBack = splashBack
//        timeDate = Date().time.toString()
//        //设置不支持小窗模式
//        SplashMinWindowManager.getInstance().isSupportSplashMinWindow = false
//        if (adId == "") return
//        /**
//         * 注：每次加载开屏广告的时候需要新建一个TTSplashAd，否则可能会出现广告填充问题
//         * （ 例如：mTTSplashAd = new TTSplashAd(this, mAdUnitId);）
//         */
//        mTTSplashAd = GMSplashAd(activity, mSplashAdId)
//        mTTSplashAd?.setAdSplashListener(object : GMSplashAdListener {
//            override fun onAdClicked() {
////            baiduSplashAdClicked = true
//                syncAdInfo(1)
//                //            showToast("开屏广告被点击");
//                L.i("wwb_splash_ad", "onAdClicked")
//            }
//
//            override fun onAdShow() {
//                syncAdInfo(0)
//                //            showToast("开屏广告展示");
//                L.i("wwb_splash_ad", "onAdShow")
//            }
//
//            /**
//             * show失败回调。如果show时发现无可用广告（比如广告过期），会触发该回调。
//             * 开发者应该结合自己的广告加载、展示流程，在该回调里进行重新加载。
//             * @param adError showFail的具体原因
//             */
//            override fun onAdShowFail(adError: AdError) {
////            showToast("开屏广告展示失败");
//                L.i("wwb_splash_ad", "onAdShowFail" + adError.code + "---" + adError.message)
//
//                // 开发者应该结合自己的广告加载、展示流程，在该回调里进行重新加载
//                mActivity?.let {
//                    mSplashContainer?.let { it1 ->
//                        mSplashBack?.let { it2 ->
//                            loadSplashAd(
//                                it, mSplashAdId,
//                                it1, it2
//                            )
//                        }
//                    }
//                }
//            }
//
//            override fun onAdSkip() {
////            showToast("开屏广告点击跳过按钮");
////            Log.d(TAG, "onAdSkip");
////            goToMainActivity()
//                mSplashBack?.goToMainActivity()
////            preloadAds(); // 预加载广告
//            }
//
//            override fun onAdDismiss() {
////            showToast("开屏广告倒计时结束关闭");
////            if (isBaiduSplashAd && onPaused && baiduSplashAdClicked) {
////                // 这种情况下，百度开屏广告不能在onAdDismiss中跳转，需要在onResume中跳转主页。
////                return
////            }
////            goToMainActivity()
//                mSplashBack?.goToMainActivity()
////            preloadAds(); // 预加载广告
//            }
//        })
//
//        //step3:创建开屏广告请求参数AdSlot,具体参数含义参考文档
//        val adSlot = GMAdSlotSplash.Builder()
//            .setImageAdSize(
//                UIUtils.getScreenWidth(activity),
//                UIUtils.getScreenHeight(activity) + SizeUtils.dp2px(
//                    BarUtils.getActionBarHeight().toFloat()
//                )
//            ) // 单位px
//            .setSplashPreLoad(true) //开屏gdt开屏广告预加载
//            .setMuted(false) //声音开启
//            .setVolume(1f) //admob 声音配置，与setMuted配合使用
//            .setTimeOut(6000) //设置超时
//            .setSplashButtonType(TTAdConstant.SPLASH_BUTTON_TYPE_FULL_SCREEN)
//            .setDownloadType(TTAdConstant.DOWNLOAD_TYPE_POPUP)
//            .setSplashShakeButton(true) //开屏摇一摇开关，默认开启，目前只有gdt支持
//            .build()
//
//
//        //自定义兜底方案 选择使用
//        var networkRequestInfo: GMNetworkRequestInfo? = SplashUtils.getGMNetworkRequestInfo()
//
//        if (getMMKVString(UserInfoManager.SPLASH_OPEN_AD_ID) == "") {
//            networkRequestInfo = null
//        }
//
//        //step4:请求广告，调用开屏广告异步请求接口，对请求回调的广告作渲染处理
//
//        //step4:请求广告，调用开屏广告异步请求接口，对请求回调的广告作渲染处理
//        mTTSplashAd?.loadAd(adSlot, networkRequestInfo, object : GMSplashAdLoadCallback {
//            override fun onSplashAdLoadFail(adError: AdError) {
////                Log.d(TAG, adError.message);
//
//                L.i(
//                    "wwb_splash_ad",
//                    "load splash ad error : " + adError.code + ", " + adError.message
//                )
//                loadSplashSuccess = false
//                loadAdFailLog(adError.code.toString() + "", adError.message)
//                //                goToMainActivity();
////                ToastUtils.showLong("广告请求失败---" + adError.code + "----" + adError.message);
////                preloadAds(); // 预加载广告
//
//                // 获取本次waterfall加载中，加载失败的adn错误信息。
//                if (mTTSplashAd != null) {
//                    L.i(
//                        "wwb_splash_ad",
//                        "ad load infos: " + mTTSplashAd!!.adLoadInfoList.toString()
//                    )
//                }
//            }
//
//            override fun onSplashAdLoadSuccess() {
//                if (mTTSplashAd != null) {
//                    if (mTTSplashAd!!.adNetworkPlatformId == GMNetworkPlatformConst.SDK_NAME_KLEVIN) {
//                        //游可赢开屏与其他ADN开屏不同，是单独开启一个Activity，而不是通过传入的container添加，需要做符合业务的特殊处理
//                    }
//                    // 根据需要选择调用isReady()
////                    if (mTTSplashAd.isReady()) {
////                        mTTSplashAd.showAd(mSplashContainer);
////                    }
////                    ToastUtils.showLong("广告请求成功");
//
//                    loadSplashSuccess = true
//
//                    mTTSplashAd?.showEcpm?.preEcpm?.let {
//                        splashEcpm = it
//                    }
////                    L.i(
////                        "wwb_splash_ad",
////                        "load splash ad success " + mTTSplashAd!!.showEcpm.preEcpm + "---"
////                    )
//                    //初始化卡片开屏相关数据
////                    SplashCardManager.getInstance().init(HomeSplashActivity.this, mTTSplashAd, mSplashContainer, new SplashCardManager.Callback() {
////                        @Override
////                        public void onSplashCardStart() {
////                            // 当动画开始时回调，您可以在此处理渲染卡片背后的界面等操作
////                            L.i("wwb_splash_ad", "onSplashCardStart");
////                        }
////
////                        @Override
////                        public void onSplashCardClose() {
////                            L.i("wwb_splash_ad", "onSplashCardClose");
////                            // 当卡片关闭时回调，您可以在这里处理Activity的关闭操作等
////                            goToMainActivity();
//////                            if (mSplashContainer != null) {
//////                                mSplashContainer.removeAllViews();
//////                            }
//////                            finish();
////                        }
////
////                        @Override
////                        public void onSplashCardClick() {
////                            Log.e(TAG, "onSplashCardClick");
////                        }
////
////                        @Override
////                        public void onSplashClickEyeClick() {
////                            Log.e(TAG, "onSplashClickEyeClick");
////                        }
////                    });
//
////                    initSplashMinWindowData(mTTSplashAd, mSplashContainer);
////                    isBaiduSplashAd =
////                        mTTSplashAd!!.adNetworkPlatformId == GMNetworkPlatformConst.SDK_NAME_BAIDU
//                    //                    Logger.e(AppConst.TAG, "adNetworkPlatformId: " + mTTSplashAd.getAdNetworkPlatformId() + "   adNetworkRitId：" + mTTSplashAd.getAdNetworkRitId() + "   preEcpm: " + mTTSplashAd.getPreEcpm());
//                    // 获取本次waterfall加载中，加载失败的adn错误信息。
//                    L.i("wwb_splash_ad", "ad load infos: " + mTTSplashAd!!.adLoadInfoList)
//                }
//                L.i("wwb_splash_ad", "load splash ad success " + mTTSplashAd!!.preEcpm + "---")
//            }
//
//            // 注意：***** 开屏广告加载超时回调已废弃，统一走onSplashAdLoadFail，GroMore作为聚合不存在SplashTimeout情况。*****
//            override fun onAdLoadTimeout() {}
//        })
//    }
//
//    fun showSplashAd() {
//        L.i("wwb_splash_ad", "showSplashAd ${mTTSplashAd == null}")
//        mTTSplashAd?.showAd(mSplashContainer)
//    }
//
//    fun destroy() {
//        mSplashContainer?.removeAllViews()
//        if (mTTSplashAd != null) {
//            mTTSplashAd!!.destroy() //跨页面展示开屏小窗时不能对相关广告进行销毁
//            mTTSplashAd = null
//        }
//    }
//
//    private fun syncAdInfo(isClick: Int) {
//        syncAdInfoUtils.toSyncAdInfoServer(
//            getTransId(ADPlatFromType.GROMORE_AD, mSplashAdId) + timeDate,
//            ADPlatFromType.GROMORE_AD,
//            ADType.SPLASH_AD,
//            splashEcpm,
//            "splash",
//            isClick, getMMKVString(UserInfoManager.GROMORE_APP_ID), mSplashAdId
//        )
//    }
//
//    private fun loadAdFailLog(errCode: String, errMsg: String) {
//        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mSplashAdId, errCode, errMsg)
//    }
//}
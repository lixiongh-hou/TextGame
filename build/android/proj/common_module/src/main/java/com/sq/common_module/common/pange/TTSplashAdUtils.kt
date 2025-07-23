package com.sq.common_module.common.pange

import android.app.Activity
import android.util.Log
import android.widget.FrameLayout
import androidx.core.view.postDelayed
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.SizeUtils
import com.bytedance.sdk.openadsdk.*
import com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
import com.sq.common_module.common.ad.*
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.http.SyncAdInfoUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.java.UIUtils
import com.sq.common_module.common.utils.kt.*
import java.util.*
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/8/14
 * Time : 15:50
 */
class TTSplashAdUtils @Inject constructor(private val syncAdInfoUtils: SyncAdInfoUtils) {
    private var TAG = TTSplashAdUtils::class.simpleName
    private var timeDate = ""
    private var mSplashBack: SplashAdInterface? = null
    private var mSplashAdId = ""

    private var mCsjSplashAd: CSJSplashAd? = null

    private var mCSJSplashAdListener: CSJSplashAdListener? = null
    private var mCSJSplashInteractionListener: CSJSplashAd.SplashAdListener? = null
    private var flContainer: FrameLayout? = null
    private var loadAdSuccess = false

    private var splashEcpm = ""

    private var splashRequestAdNum = 0
    private var mActivity: Activity? = null
    private var isLoadSplash = false

    @Inject
    lateinit var trackEventUtils: TrackEventUtils

    fun loadTTSplashAd(
        activity: Activity,
        container: FrameLayout,
        adId: String,
        splashBack: SplashAdInterface
    ) {
        AdRequestLimitUtils.requestSystemRisk(ADType.SPLASH_AD) { splashId ->
            mActivity = activity
            timeDate = Date().time.toString()
            mSplashBack = splashBack
            if (adId.isNotEmpty() && AdIdRecord.splashAdIdTwice == adId) {
                mSplashAdId = adId
            } else {
                mSplashAdId = splashId
            }
            flContainer = container
            L.i("TTMediationSDK_", "loadTTSplashAd----${TTAdSdk.isInitSuccess()}")
//        container.postDelayed({ loadAd(activity) }, 1000)

            if (!TTAdSdk.isInitSuccess() || HttpHeaderUtils.isRiskUser == 1 || mSplashAdId == "") return@requestSystemRisk

            if (!isLoadSplash) {
                true.saveMMKVBool(UserInfoManager.REQUEST_AD)
                recordAdTrace(0)
                loadAd(activity)
                isLoadSplash = true
            }
        }

    }

    private fun loadAd(activity: Activity) {
        /** 1、创建AdSlot对象  */
        val adSlot = AdSlot.Builder()
            .setCodeId(mSplashAdId)
            .setImageAcceptedSize(
                UIUtils.getScreenWidthInPx(activity),
                UIUtils.getScreenHeightInPx(activity) + SizeUtils.dp2px(
                    BarUtils.getActionBarHeight().toFloat()
                )
            )
            .setMediationAdSlot(TTADManagerHolder.splashMediation())
            .build()
        syncAdInfo(0, null, 1)

        /** 2、创建TTAdNative对象  */
        val adNativeLoader = TTAdSdk.getAdManager().createAdNative(activity)


        /** 3、创建加载、展示监听器  */
        initListeners()


        /** 4、加载广告  */
        adNativeLoader.loadSplashAd(adSlot, mCSJSplashAdListener, 5000)
    }

    private fun initListeners() {
        // 广告加载监听器
        mCSJSplashAdListener = object : CSJSplashAdListener {
            override fun onSplashRenderSuccess(csjSplashAd: CSJSplashAd) {
                /** 5、渲染成功后，展示广告  */
                mCsjSplashAd = csjSplashAd
                mCsjSplashAd?.setSplashAdListener(mCSJSplashInteractionListener)
//                val splashView = mCsjSplashAd?.splashView
                UIUtils.removeFromParent(mCsjSplashAd?.splashView)
                mSplashBack?.loadSplashAdCallBack(true)
                recordAdTrace(1)
                trackEventUtils.onEvent(TrackEventConst.E_OPEN_SCREEN_AD)
            }

            override fun onSplashLoadSuccess(p0: CSJSplashAd?) {
                L.d("wwb_ttInit", "splash load success")
                loadAdSuccess = true
                isLoadSplash = false
                syncAdInfo(0, null, 2)
            }

            override fun onSplashLoadFail(csjAdError: CSJAdError) {
                L.i(
                    "wwb_ttInit",
                    "fail${csjAdError.code}----${csjAdError.msg}---${TTAdSdk.isInitSuccess()}"
                )
                isLoadSplash = false
                loadAdSuccess = false
                loadAdFailLog(csjAdError.code.toString(), csjAdError.msg)
                mSplashBack?.loadSplashAdCallBack(false)
                recordAdTrace(2)

            }

            override fun onSplashRenderFail(csjSplashAd: CSJSplashAd, csjAdError: CSJAdError) {
                L.d(
                    "wwb_ttInit",
                    "splash render fail, errCode: " + csjAdError.code + ", errMsg: " + csjAdError.msg
                )
                loadAdSuccess = false
//                loadAdFailLog(csjAdError.code.toString(), csjAdError.msg)
            }
        }
        // 广告展示监听器
        mCSJSplashInteractionListener = object : CSJSplashAd.SplashAdListener {
            override fun onSplashAdShow(csjSplashAd: CSJSplashAd) {
                L.d(TAG, "splash show--${csjSplashAd.mediationManager.showEcpm.ecpm}")
                splashEcpm = csjSplashAd.mediationManager.showEcpm.ecpm
                val lowLimit = getMMKVIntWithDef(UserInfoManager.LOW_LIMIT, 100)
                if (UserInfoManager.lowEcpmUser == -1) {
                    if (splashEcpm.isEmpty()) {
                        UserInfoManager.lowEcpmUser = 0
                    } else if (splashEcpm.toDouble() / 100 < lowLimit) {
                        UserInfoManager.lowEcpmUser = 0
                    } else {
                        UserInfoManager.lowEcpmUser = 1
                    }
                }
                syncAdInfo(0, null, 3, csjSplashAd.mediationManager.showEcpm.slotId)
            }

            override fun onSplashAdClick(csjSplashAd: CSJSplashAd) {
                L.d(TAG, "splash click")
                syncAdInfo(1, null, 4)
            }

            override fun onSplashAdClose(csjSplashAd: CSJSplashAd, i: Int) {
                L.d(TAG, "splash close")
                //                finish();
//                mCsjSplashAd?.startClickEye()
                syncAdInfo(0, 1, 5)
                mSplashBack?.goToMainActivity(loadAdSuccess)
            }
        }
    }


    fun showSplashAd() {
        flContainer?.removeAllViews()
        mCsjSplashAd?.splashView?.let {
            flContainer?.addView(it)
        }
    }

    fun onDestroy(finish: Boolean? = true) {
        /** 6、在onDestroy中销毁广告  */
        if (mCsjSplashAd != null && mCsjSplashAd!!.mediationManager != null) {
            mCsjSplashAd!!.mediationManager.destroy()
        }
        finish?.let {
            if (it) {
                splashRequestAdNum = 0
            }
        }
    }


    private fun syncAdInfo(isClick: Int, isEnd: Int? = null, status: Int, slotId: String? = null) {
        syncAdInfoUtils.toSyncAdInfoServer(
            getTransId(ADPlatFromType.GROMORE_AD, mSplashAdId) + timeDate,
            ADPlatFromType.GROMORE_AD,
            ADType.SPLASH_AD,
            splashEcpm,
            "splash",
            isClick,
            getMMKVString(UserInfoManager.GROMORE_APP_ID),
            mSplashAdId,
            isEnd,
            status,
            slotId
        )
    }

    private fun loadAdFailLog(errCode: String, errMsg: String) {
        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mSplashAdId, errCode, errMsg)
    }

    private fun recordAdTrace(status: Int) {
        syncAdInfoUtils.recordAdTrace(
            getTransId(ADPlatFromType.GROMORE_AD, mSplashAdId) + timeDate,
            ADPlatFromType.GROMORE_AD,
            ADType.SPLASH_AD.toString(),
            getMMKVString(UserInfoManager.GROMORE_APP_ID),
            mSplashAdId,
            status
        )
    }
}
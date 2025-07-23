package com.sq.common_module.common.base

import android.app.Activity
import android.widget.FrameLayout
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.SizeUtils
import com.bytedance.sdk.openadsdk.*
import com.sq.common_module.common.ad.ADPlatFromType
import com.sq.common_module.common.ad.ADType
import com.sq.common_module.common.ad.SplashAdInterface
import com.sq.common_module.common.ad.getTransId
import com.sq.common_module.common.bean.ReportFlagBean
import com.sq.common_module.common.pange.TTADManagerHolder
import com.sq.common_module.common.pange.TTSplashAdUtils
import com.sq.common_module.common.ui.BackToForegroundActivity
import com.sq.common_module.common.utils.RetrofitUtils
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.SyncAdInfoUtils
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.java.UIUtils
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.getRequestBody
import com.sq.common_module.common.utils.kt.saveMMKVBool
import java.util.*
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/12/8
 * Time : 15:30
 */
class SplashAdShowUtil @Inject constructor() {
    private var TAG = TTSplashAdUtils::class.simpleName
    private var timeDate = ""
    private var mSplashBack: SplashAdInterface? = null
    private var mSplashAdId = ""

    private var mCsjSplashAd: CSJSplashAd? = null

    private var mCSJSplashAdListener: TTAdNative.CSJSplashAdListener? = null
    private var mCSJSplashInteractionListener: CSJSplashAd.SplashAdListener? = null
    private var flContainer: FrameLayout? = null
    private var loadAdSuccess = false

    private var splashEcpm = "0"

    private var splashRequestAdNum = 0
    private var mActivity: Activity? = null
    private var isLoadSplash = false

    @Inject
    lateinit var syncAdInfoUtils: SyncAdInfoUtils
    fun loadTTSplashAd(
        activity: Activity,
        container: FrameLayout,
        adId: String,
        splashBack: SplashAdInterface
    ) {
        true.saveMMKVBool(UserInfoManager.REQUEST_AD)
        mActivity = activity
        timeDate = Date().time.toString()
        mSplashBack = splashBack
        mSplashAdId = adId
        flContainer = container
        L.i("wwb_ttInit", "loadTTSplashAd----${TTAdSdk.isInitSuccess()}")

        if (TTAdSdk.isInitSuccess()) {
            if (!isLoadSplash && ActivityUtils.getTopActivity() is BackToForegroundActivity) {
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


        /** 2、创建TTAdNative对象  */
        val adNativeLoader = TTAdSdk.getAdManager().createAdNative(activity)


        /** 3、创建加载、展示监听器  */
        initListeners()


        /** 4、加载广告  */
        adNativeLoader.loadSplashAd(adSlot, mCSJSplashAdListener, 5000)
    }

    private fun initListeners() {
        // 广告加载监听器
        mCSJSplashAdListener = object : TTAdNative.CSJSplashAdListener {
            override fun onSplashRenderSuccess(csjSplashAd: CSJSplashAd) {
                /** 5、渲染成功后，展示广告  */
                mCsjSplashAd = csjSplashAd
                mCsjSplashAd?.setSplashAdListener(mCSJSplashInteractionListener)
//                val splashView = mCsjSplashAd?.splashView
                UIUtils.removeFromParent(mCsjSplashAd?.splashView)
                showSplashAd()
                recordAdTrace(1)
            }

            override fun onSplashLoadSuccess(p0: CSJSplashAd?) {
                L.d("wwb_ttInit", "splash load success")
                loadAdSuccess = true
                isLoadSplash = false
            }


            override fun onSplashLoadFail(csjAdError: CSJAdError) {
                L.i(
                    "wwb_ttInit",
                    "fail${csjAdError.code}----${csjAdError.msg}---${TTAdSdk.isInitSuccess()}"
                )
                recordAdTrace(2)
                isLoadSplash = false
                loadAdSuccess = false
                loadAdFailLog(csjAdError.code.toString(), csjAdError.msg)
                mSplashBack?.loadSplashAdCallBack(false)
                onDestroy()
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
                syncAdInfo(0)
            }

            override fun onSplashAdClick(csjSplashAd: CSJSplashAd) {
                L.d(TAG, "splash click")
                syncAdInfo(1)
            }

            override fun onSplashAdClose(csjSplashAd: CSJSplashAd, i: Int) {
                L.d(TAG, "splash close")
                //                finish();
//                mCsjSplashAd?.startClickEye()
                mSplashBack?.loadSplashAdCallBack(true)
                onDestroy()
            }
        }
    }


    fun showSplashAd() {
        flContainer?.removeAllViews()
        mCsjSplashAd?.splashView?.let {
            flContainer?.addView(it)
        }
    }

    fun onDestroy() {
        /** 6、在onDestroy中销毁广告  */
        if (mCsjSplashAd != null && mCsjSplashAd!!.mediationManager != null) {
            mCsjSplashAd!!.mediationManager.destroy()
            mCsjSplashAd = null
        }
    }


    private fun syncAdInfo(isClick: Int) {
        val map = HashMap<String, String>()
        map["transId"] = getTransId(ADPlatFromType.GROMORE_AD, mSplashAdId) + timeDate
        map["ecpm"] = splashEcpm
        map["activityName"] = "splash"
        map["adNetwork"] = ADPlatFromType.GROMORE_AD.toString()
        map["adUnitType"] = ADType.SPLASH_AD.toString()
        map["isClick"] = isClick.toString()
        map["adSiteId"] = getMMKVString(UserInfoManager.GROMORE_APP_ID)
        map["adUnitId"] = mSplashAdId
        RetrofitUtils().getApiService().syncAdInfo(getRequestBody(map))
            .handleRequest(null, object : NetCallBack<ReportFlagBean> {
                override fun onSuccess(data: ReportFlagBean?) {

                }
            })
    }

    private fun loadAdFailLog(errCode: String, errMsg: String) {
        val map = HashMap<String, String>()
        map["adNetwork"] = ADPlatFromType.GROMORE_AD.toString()
        map["adUnitId"] = mSplashAdId
        map["errCode"] = errCode
        map["errMsg"] = errMsg
        RetrofitUtils().getApiService().loadAdFailLog(getRequestBody(map))
            .handleRequest(null, object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {

                }
            })
    }

    fun recordAdTrace(status: Int) {
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
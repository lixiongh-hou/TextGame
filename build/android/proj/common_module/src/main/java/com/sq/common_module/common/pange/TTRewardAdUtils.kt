package com.sq.common_module.common.pange

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleCoroutineScope
import cn.tongdun.mobrisk.TDRisk
import com.blankj.utilcode.util.AppUtils
import com.bytedance.sdk.openadsdk.*
import com.google.gson.Gson
import com.sq.common_module.common.ad.*
import com.sq.common_module.common.bean.GetRewardBean
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.TDInfoUtils
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.SyncAdInfoUtils
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/8/10
 * Time : 17:38
 */
class TTRewardAdUtils @Inject constructor(
    private val syncAdInfoUtils: SyncAdInfoUtils,
    private val repository: CommonRepository,
) {
    private val TAG = TTRewardAdUtils::class.simpleName
    private var mFragmentManager: FragmentManager? = null
    private var mRewardAdInterface: RewardAdInterface? = null
    private var mActivity: Activity? = null
    private var mAdId = ""
    private var rewardLoadingDialog: RewardLoadingDialog? = null
    private var mEcpm = ""
    private var mTransId = ""
    private var mRewardBean: GetRewardBean? = null
    private var mActionName = ""
    private var mRewardLogId: Int? = null
    private var mWithdrawType: String? = null
    private var requestSuccess: Boolean? = null
    private var timeDate = ""
    private var mRewardVideoListener // 广告加载监听器
            : TTAdNative.RewardVideoAdListener? = null
    private var mRewardVideoAdInteractionListener // 广告展示监听器
            : TTRewardVideoAd.RewardAdInteractionListener? = null
    private var mTTRewardVideoAd // 插全屏广告对象
            : TTRewardVideoAd? = null
    private var loadRewardResult = false

    private var mJob: Job? = null

    private var rewardReady = true
    private var isGetReward = false
    private var lifecycleScope: LifecycleCoroutineScope? = null
    private var isOnCloseAD = false
    private var isVideoComplete = false

    private fun resetValues() {
        isOnCloseAD = false
        rewardReady = true
        isGetReward = false
        requestSuccess = null
    }

    fun initTTReward(
        life: LifecycleCoroutineScope,
        activity: Activity,
        adId: String,
        fragmentManager: FragmentManager,
        actionName: String,
        rewardAdInterface: RewardAdInterface, showLoadingDialog: Boolean = true,
        logId: Int? = null, withdrawTypestring: String? = null,
    ) {
        AdRequestLimitUtils.requestSystemRisk(ADType.REWARD_AD) { rewardId ->
            lifecycleScope = life
            riskRequest = false
            mRewardLogId = logId
            mActionName = actionName
            mFragmentManager = fragmentManager
            mRewardAdInterface = rewardAdInterface
            mActivity = activity
            mAdId = rewardId
            mWithdrawType = withdrawTypestring
//        rewardLoadingDialog = RewardLoadingDialog()
            timeDate = Date().time.toString()
//            if (!TTAdSdk.isInitSuccess() ||  HttpHeaderUtils.isRiskUser == 1) return@requestSystemRisk
            if (mAdId == "" || !TTAdSdk.isInitSuccess() || HttpHeaderUtils.isRiskUser == 1) {
//                if (AppCodeConstant.isStepOrBatteryModule()) {
//                    //
//                    getRewardByActivityV2(
//                        mTransId,
//                        mEcpm,
//                        mActionName,
//                        mRewardLogId
//                    )
//                    return@requestSystemRisk
//                } else {
                    mRewardAdInterface?.loadAdFail()
                    return@requestSystemRisk
//                }
            }

            true.saveMMKVBool(UserInfoManager.REQUEST_AD)
            if (showLoadingDialog && rewardLoadingDialog == null) {
                rewardLoadingDialog =
                    RewardLoadingDialog()
            }

            mTransId = getTransId(ADPlatFromType.GROMORE_AD, mAdId) + Date().time


            loadAd()
            mFragmentManager?.let {
                rewardLoadingDialog?.show(it, "")
                if (mJob == null) {
                    mJob = lifecycleScope?.launch {
                        getDownTimer(30).collect { time ->
                            L.i(TAG, "${time}---${loadRewardResult}")
                            if (loadRewardResult) {
                                mJob?.cancel()
                                mJob = null
                            }

                            if (time == 0 && (!loadRewardResult)) {
                                riskRequest = false
                                onDestroy(1)
                                toastLoadRewardFail()
                                return@collect
                            }
                        }
                    }
                }
            }
        }
    }


    private fun loadAd() {
        L.i("wwb_reward_ud", AdIdRecord.rewardId)
        resetValues()
        if (mAdId == "") {
            mAdId = AdIdRecord.rewardId
        }
        syncADInfo(0, null, 1)
        if (mTTRewardVideoAd == null) {
            /** 1、创建AdSlot对象  */
            val adslot = AdSlot.Builder()
                .setCodeId(mAdId)
                .setUserID(getMMKVString(UserInfoManager.USER_ID))
                .setOrientation(TTAdConstant.ORIENTATION_VERTICAL)
                .build()

            /** 2、创建TTAdNative对象  */
            val adNativeLoader = TTAdSdk.getAdManager().createAdNative(mActivity)

            /** 3、创建加载、展示监听器  */
            initListeners()

            /** 4、加载广告  */
            adNativeLoader.loadRewardVideoAd(adslot, mRewardVideoListener)


//        mFragmentManager?.let {
//            if (mTTRewardVideoAd != null) {
//                rewardLoadingDialog?.show(it, "")
//            } else {
//                loadAd()
//            }
//
//        }

        }
    }

    private fun initListeners() {
        // 广告加载监听器
        mRewardVideoListener = object : TTAdNative.RewardVideoAdListener {
            override fun onError(i: Int, s: String) {
                L.i(TAG, "reward load fail: errCode: $i, errMsg: $s")
//                mIsLoadFail = true
                loadRewardResult = true
                loadAdFailLog(i.toString(), s)
                toastLoadRewardFail()
                dismissRewardDialog()
                mRewardAdInterface?.loadAdFail()
                DialogNumUtils.rewardDialogNum--
            }

            override fun onRewardVideoAdLoad(ttRewardVideoAd: TTRewardVideoAd) {
                L.i(TAG, "reward load success")
                loadRewardResult = true
                mTTRewardVideoAd = ttRewardVideoAd
            }

            override fun onRewardVideoCached() {
                loadRewardResult = true
                L.i(TAG, "reward cached success")
            }

            override fun onRewardVideoCached(ttRewardVideoAd: TTRewardVideoAd) {
                loadRewardResult = true
                L.i(
                    TAG,
                    "reward cached success 2---${ttRewardVideoAd.mediationManager?.adLoadInfo?.size}----${ttRewardVideoAd.mediationManager?.cacheList?.size}"
                )
                ttRewardVideoAd.mediationManager?.adLoadInfo?.forEach {
                    L.i(
                        TAG,
                        "loadCach------${it.mediationRit}----${it.adnName}---${it.errCode}---${it.errMsg}--${mTTRewardVideoAd?.mediationManager?.showEcpm?.ecpm}--${mTTRewardVideoAd?.mediationManager?.showEcpm?.slotId}"
                    )
                }
                syncADInfo(0, null, 2)
                //风控校验
                if ((TDInfoUtils.riskAppcodeList.any { it == HttpHeaderUtils.appCode } && TDInfoUtils.isRiskOpen)) initTDSdk() else showReward()
            }
        }
        // 广告展示监听器
        mRewardVideoAdInteractionListener =
            object : TTRewardVideoAd.RewardAdInteractionListener {
                override fun onAdShow() {
                    L.i(TAG, "reward show")
//                    mTTRewardVideoAd?.mediationManager?.adLoadInfo?.forEach {
//                        L.i(
//                            TAG,
//                            "show------${it.mediationRit}----${it.adnName}---${it.errCode}---${it.errMsg}----${mTTRewardVideoAd?.mediationManager?.showEcpm?.ecpm}--${mTTRewardVideoAd?.mediationManager?.showEcpm?.slotId}"
//                        )
//                    }
                    dismissRewardDialog()
                    mTTRewardVideoAd?.mediationManager?.showEcpm?.ecpm?.let {
                        mEcpm = it
                    }
                    DialogNumUtils.rewardDialogNum--
                    mRewardAdInterface?.loadAdSuccess()
//                preLoadAd()
                    syncADInfo(0, null, 3, mTTRewardVideoAd?.mediationManager?.showEcpm?.slotId)
                    HttpHeaderUtils.isRewardShowing = true
                    HttpHeaderUtils.isRewardClose = false
                }

                override fun onAdVideoBarClick() {
                    dismissRewardDialog()
                    syncADInfo(1, null, 4)
//                    Log.i(Const.TAG, "reward click")
                }

                override fun onAdClose() {
//                    Log.i(Const.TAG, "reward close")
                    isOnCloseAD = true
                    riskRequest = false
                    dismissRewardDialog()
                    syncADInfo(0, 1, 5)
                    HttpHeaderUtils.isHomeForeground = true
                    HttpHeaderUtils.isRewardClose = true
//                    if (!(AppCodeConstant.isWifiModule() || AppCodeConstant.isCleanModule() || AppCodeConstant.isAreaWeatherModule()) && !isGetReward) {
//                        "奖励领取失败，请观看完整广告".toast()
//                    }
                    if (requestSuccess == null) {
                        if (isGetReward) queryRewardResult()
                        else mRewardAdInterface?.getRewardFail()
                    } else {
                        postOnAdClose()
                    }

                    onDestroy()
                    L.i("wwb_rewardonSkippedVideo", "onAdClose---$requestSuccess")
                }

                override fun onVideoComplete() {
                    L.i(TAG, "reward onVideoComplete")
                    isVideoComplete = true
//
                }

                override fun onVideoError() {
                    L.i(TAG, "reward onVideoError")
                }

                override fun onRewardVerify(b: Boolean, i: Int, s: String, i1: Int, s1: String) {
//                    Log.i(Const.TAG, "reward onRewardVerify")
                }

                override fun onRewardArrived(
                    isRewardValid: Boolean,
                    rewardType: Int,
                    extraInfo: Bundle,
                ) {
                    if (isOnCloseAD) return
                    L.i(TAG, "reward onRewardArrived")
                    isGetReward = true
                    dismissRewardDialog()
                    getRewardByActivity(
                        mTransId,
                        mEcpm,
                        mActionName,
                        mRewardLogId
                    )
                }

                override fun onSkippedVideo() {
                    L.i("wwb_rewardonSkippedVideo", "reward onSkippedVideo")
                }
            }
    }

    private fun postOnAdClose() {
        if (requestSuccess == true) {
            mRewardBean?.let { mRewardAdInterface?.getRewardSuccess(it) }
        } else {
            mRewardAdInterface?.getRewardFail()
            if (isVideoComplete)
                mRewardAdInterface?.adVideoComplete()
        }

    }

    private fun queryRewardResult() {
        lifecycleScope?.launch(Dispatchers.Default) {
            if (requestSuccess == null) {
                delay(500)
                queryRewardResult()
            } else {
                postOnAdClose()
            }
        }
    }

    // 广告加载成功后，开始展示广告
    private fun showRewardVideoAd() {
        if (mTTRewardVideoAd == null) {
//            Log.i(Const.TAG, "请先加载广告或等待广告加载完毕后再调用show方法")
            return
        }
        mActivity?.let {
            if (it.isFinishing) return
        }
        /** 5、设置展示监听器，展示广告  */
        mTTRewardVideoAd!!.setRewardAdInteractionListener(mRewardVideoAdInteractionListener)
        mTTRewardVideoAd!!.showRewardVideoAd(mActivity)
    }

    fun onDestroy(way: Int = 0) {
        /** 6、在onDestroy中销毁广告  */
        resetValues()
        if (mTTRewardVideoAd != null && mTTRewardVideoAd!!.mediationManager != null) {
            mTTRewardVideoAd!!.mediationManager.destroy()
            mTTRewardVideoAd = null
        }
        dismissRewardDialog()
        if (way != 1) {
            mRewardAdInterface?.let {
                mRewardAdInterface = null
            }
        }
        mJob?.cancel()
        mJob = null
    }


    private fun dismissRewardDialog() {
        rewardLoadingDialog?.onDialogMiss()
        rewardLoadingDialog = null
    }

    /**
     * 同步广告信息
     */
    private fun syncADInfo(isClick: Int, isEnd: Int? = null, status: Int, slotId: String? = null) {
        syncAdInfoUtils.toSyncAdInfoServer(
            mTransId,
            ADPlatFromType.GROMORE_AD,
            ADType.REWARD_AD,
            mEcpm,
            mActionName,
            isClick,
            getMMKVString(UserInfoManager.GROMORE_APP_ID),
            mAdId,
            isEnd,
            status,
            slotId
        )
    }

    private fun loadAdFailLog(errCode: String, errMsg: String) {
        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mAdId, errCode, errMsg)
    }

    /**
     * 获取奖励
     */
    private fun getRewardByActivity(
        transId: String,
        ecpm: String,
        activityName: String,
        logId: Int? = null,
    ) {
        repository.getRewardByActivity(
            transId,
            ecpm,
            activityName,
            logId,
            withdrawTypestring = mWithdrawType
        )
            .handleRequest(null, object : NetCallBack<GetRewardBean> {
                override fun onSuccess(data: GetRewardBean?) {
                    requestSuccess = true
                    mRewardBean = data
                }

                override fun onFail(e: Throwable?) {
                    requestSuccess = false
                    isVideoComplete = true
                }
            })
    }

    private fun getRewardByActivityV2(
        transId: String,
        ecpm: String,
        activityName: String,
        logId: Int? = null,
    ) {
        repository.getRewardByActivityV2(
            transId,
            ecpm,
            activityName,
            logId,
            withdrawTypestring = mWithdrawType
        )
            .handleRequest(null, object : NetCallBack<GetRewardBean> {
                override fun onSuccess(data: GetRewardBean?) {
                    requestSuccess = true
                    mRewardBean = data
                    mRewardBean?.let { mRewardAdInterface?.getRewardSuccess(it) }
                }

                override fun onFail(e: Throwable?) {
                    requestSuccess = false
                    mRewardAdInterface?.getRewardFail()
                }
            })
    }


    private fun initTDSdk() {
//        val blackBox = TDRisk.getBlackBox()
//
//        if (blackBox != "") {
//            checkRisk(blackBox)
//        } else {
//            TDRisk.getBlackBox { checkRisk(it) }
//        }
    }

    private var riskRequest = false

    /**
     * 风控
     */
    private fun checkRisk(blackBox: String) {
        mTTRewardVideoAd?.mediationManager?.isReady?.let { isReady ->
            L.i(TAG, "checkRisk${isReady}----riskRequest${riskRequest}")
//            "--激励视频isReady${isReady}----加载激励视频${loadRewardResult}".toast()
            rewardReady = isReady
            if (isReady) {
                if (riskRequest) return
                riskRequest = true
                syncAdInfoUtils.checkRisk(blackBox, "watchRewardAd") {
                    if (it.actionType == 0) {
                        dismissRewardDialog()
                        showRewardVideoAd()
                    } else {
                        dismissRewardDialog()
//                        if (AppCodeConstant.isWifiModule()) {
//                            dismissRewardDialog()
//                            return@checkRisk
//                        } else {
//                            AppUtils.exitApp()
//                        }
                    }
                }
            } else {
                loadAdFailLog("-9999", "加载广告成功isReady${isReady}")
                mJob?.cancel()
                mJob = null
                riskRequest = false
                onDestroy()
                dismissRewardDialog()
                toastLoadRewardFail()
            }
        }
    }

    private fun showReward() {
        mTTRewardVideoAd?.mediationManager?.isReady?.let { isReady ->
            rewardReady = isReady

            if (isReady) {
                dismissRewardDialog()
                showRewardVideoAd()
            } else {
                //一般是设备时间跟当前北京时间不一致
                loadAdFailLog("-9999", "加载广告成功isReady${isReady}")
                mJob?.cancel()
                mJob = null
                onDestroy()
                dismissRewardDialog()
                toastLoadRewardFail()
            }
        }
    }


    private fun toastLoadRewardFail() {
        return
        if (!(AppCodeConstant.isWifiModule() || AppCodeConstant.isCleanModule() || AppCodeConstant.isAreaWeatherModule())) "视频加载失败,请重新点击".toast()

    }
}
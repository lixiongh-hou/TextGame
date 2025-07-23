//package com.sq.common_module.common.gromore.sigle
//
//import android.app.Activity
//import android.text.TextUtils
//import androidx.fragment.app.FragmentManager
//import com.bytedance.msdk.api.AdError
//import com.bytedance.msdk.api.reward.RewardItem
//import com.bytedance.msdk.api.v2.GMAdConstant
//import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
//import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback
//import com.sq.common_module.common.ad.*
//import com.sq.common_module.common.bean.GetRewardBean
//import com.sq.common_module.common.gromore.impl.GMRewardAdListenerImpl
//import com.sq.common_module.common.gromore.preload.PreLoadRewardManager
//import com.sq.common_module.common.repository.CommonRepository
//import com.sq.common_module.common.utils.http.NetCallBack
//import com.sq.common_module.common.utils.http.SyncAdInfoUtils
//import com.sq.common_module.common.utils.http.handleRequest
//import com.sq.common_module.common.utils.java.L
//import com.sq.common_module.common.utils.kt.UserInfoManager
//import com.sq.common_module.common.utils.kt.getMMKVString
//import com.sq.common_module.common.utils.kt.toast
//import org.json.JSONObject
//import java.util.*
//import javax.inject.Inject
//
///**
// * Created by town
// * Date :  2022/11/11
// * Time : 11:41
// */
//
//
//class GroMoreRewardAdUtils @Inject constructor(
//    private val syncAdInfoUtils: SyncAdInfoUtils,
//    private val repository: CommonRepository
//) {
//    private var mActivity: Activity? = null
//    private var mPreLoadRewardManager: PreLoadRewardManager? = null
//    private var mIsShow = false     //是否展示过了
//    private var mIsLoadFail = false //是否load失败
//    private lateinit var mGMRewardedAdListener: GMRewardedAdListener
//    private lateinit var mGMRewardedPlayAgainListener: GMRewardedAdListener
//    private var videoEcpm = "0"
//    private var mTransId = ""
//    private var mRewardId = ""
//    private var mFragmentManager: FragmentManager? = null
//    private var mRewardAdInterface: RewardAdInterface? = null
//    private var mActionName = ""
//    private var mRewardBean: GetRewardBean? = null
//
//    //    companion object {
////        val instance: GroMoreRewardSingleUtils by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { GroMoreRewardSingleUtils() }
////    }
//    private var rewardLoadingDialog: RewardLoadingDialog? = null
//    private var mRewardLogId: Int? = null
//    private var mWithdrawType: String? = null
//    private var requestSuccess = true
//    fun initGroMoreRewardActivity(
//        activity: Activity,
//        rewardId: String,
//        actionName: String,
//        fragmentManager: FragmentManager,
//        rewardAdInterface: RewardAdInterface,
//        showLoadingDialog: Boolean = true, logId: Int? = null, withdrawTypestring: String? = null
//    ) {
//        mRewardLogId = logId
//        mFragmentManager = fragmentManager
//        mRewardAdInterface = rewardAdInterface
//        mActivity = activity
//        mRewardId = rewardId
//        mActionName = actionName
//        mWithdrawType = withdrawTypestring
//        L.i("wwb_rewardId", mRewardId)
//        if (showLoadingDialog && rewardLoadingDialog == null) rewardLoadingDialog =
//            RewardLoadingDialog()
//        mTransId = getTransId(ADPlatFromType.GROMORE_AD, mRewardId) + Date().time
//        initRewardAd()
//    }
//
//    private fun initRewardAd() {
//        mGMRewardedAdListener = object : GMRewardAdListenerImpl() {
//            override fun onRewardedAdShow() {
//                super.onRewardedAdShow()
//                videoEcpm = mPreLoadRewardManager?.getEcpm().toString()
//                mIsShow = true
//                mRewardAdInterface?.loadAdSuccess()
////                preLoadAd()
//                syncADInfo(0)
//            }
//
//            override fun onRewardVerify(rewardItem: RewardItem) {
//                val customData = rewardItem.customData
//                L.i("wwb_reward", customData.toString())
//                if (customData != null) {
//                    // 首先判断是否启用了GroMore的服务端验证
//                    val isGroMoreServerSideVerify =
//                        customData[RewardItem.KEY_IS_GROMORE_SERVER_SIDE_VERIFY] as Boolean?
//                    if (isGroMoreServerSideVerify != null && isGroMoreServerSideVerify) {
//                        // 开启了GroMore的服务端激励验证，这里可以获取GroMore的服务端激励验证信息
//                        val isVerify = rewardItem.rewardVerify()
//                        // 如果isVerify=false，则可以根据下面的错误码来判断为什么是false，
//                        //  1、如果errorCode为40001/40002/50001/50002，则是因为请求异常导致，媒体可以根据自己的判断决定是否发放奖励。
//                        //  2、否则，就是媒体服务端回传的验证结果是false，此时应该不发放奖励。
//                        val reason = customData[RewardItem.KEY_REASON]
//                        if (reason != null) {
//                            L.i(
//                                "TTMediationSDK_AdRewardManager",
//                                "rewardItem，开发者服务器回传的reason，开发者不传时为空"
//                            )
//                        }
//                        val errorCode = customData[RewardItem.KEY_ERROR_CODE]
//                        if (errorCode != null) {
//                            val errorMsg = customData[RewardItem.KEY_ERROR_MSG]
//                            L.i(
//                                "TTMediationSDK_AdRewardManager",
//                                "rewardItem, gromore服务端验证异常时的错误信息，未发生异常时为0或20000：errorCode:$errorCode, errMsg: $errorMsg"
//                            )
//                        }
//                        val gromoreExtra = customData[RewardItem.KEY_GROMORE_EXTRA]
////                        val json = JSONObject(gromoreExtra.toString())
////                        if (json.has("transId")) {
////                            mTransId = json.getString("transId")
////                        }
////                        L.i(
////                            "TTMediationSDK_AdRewardManager",
////                            "rewardItem, 开发者通过AdSlot传入的extra信息，会透传给媒体的服务器。开发者不传时为空，extra:$gromoreExtra---${mTransId}"
////                        )
//                    } else {
//                        // 未开启GroMore的服务端激励验证，这里获取adn的激励验证信息
//                        val adnName = customData[RewardItem.KEY_ADN_NAME] as String?
//                        if (!TextUtils.isEmpty(adnName)) {
//                            when (adnName) {
//                                RewardItem.KEY_GDT -> L.i(
//                                    "TTMediationSDK_AdRewardManager",
//                                    "rewardItem gdt: " + customData[RewardItem.KEY_GDT_TRANS_ID]
//                                )
//                                RewardItem.KEY_PANGLE -> L.i(
//                                    "TTMediationSDK_AdRewardManager",
//                                    "rewardItem pangle: " + customData[RewardItem.KEY_TRANS_ID]
//                                )
//                            }
//                        }
//                        //穿山甲服务端验证新增的接口参数也放在customData中，可以按需获取数据，如：
////                        if (customData != null) {
////                            val rewardType =
////                                customData[RewardItem.KEY_REWARD_TYPE] as String? //获取奖励类型
////                            val extraInfo =
////                                customData[RewardItem.KEY_EXTRA_INFO] as Bundle? //获取额外参数
////                            //从extraInfo中拿参数
//////                            float rewardPropose = extraInfo.getFloat(TTRewardVideoAd.REWARD_EXTRA_KEY_REWARD_PROPOSE); //获取奖励百分比
////                        }
//                    }
//                }
//                dismissRewardDialog()
//                getRewardByActivity(
//                    mTransId,
//                    videoEcpm,
//                    mActionName,
//                    mRewardLogId
//                )
//            }
//
//            override fun onRewardedAdClosed() {
//                L.i("wwb_clsose", "----close")
//                dismissRewardDialog()
//                if (requestSuccess) {
//                    mRewardBean?.let { mRewardAdInterface?.getRewardSuccess(it) }
//                } else {
//                    mRewardAdInterface?.getRewardFail()
//                }
//
//            }
//
//            override fun onRewardClick() {
//                super.onRewardClick()
//                dismissRewardDialog()
//                syncADInfo(1)
//            }
//
//            override fun onRewardedAdShowFail(adError: AdError) {
//                super.onRewardedAdShowFail(adError)
//                dismissRewardDialog()
//
//            }
//
//            override fun onSkippedVideo() {
////                rewardLoadingDialog?.onDialogMiss()
////                mRewardAdInterface?.skipRewardAd()
//            }
//        }
//
//        //穿山甲再看一次视频
//        mGMRewardedPlayAgainListener = object : GMRewardAdListenerImpl() {
//            override fun onRewardedAdShow() {
//                super.onRewardedAdShow()
//                mIsShow = true
//            }
//        }
//
//    }
//
//    /**
//     * 预加载广告
//     */
//    fun preLoadAd() {
//        mPreLoadRewardManager =
//            PreLoadRewardManager(mActivity, mRewardId, mTransId, GMAdConstant.VERTICAL, object :
//                GMRewardedAdLoadCallback {
//                override fun onRewardVideoAdLoad() {
////                    dismissRewardDialog()
//                    L.i("TTMediationSDK_AdRewardManager", "onRewardVideoAdLoad 加载广告成功")
//                    mPreLoadRewardManager?.getEcpm()
//                }
//
//                override fun onRewardVideoCached() {
//                    L.i("TTMediationSDK_AdRewardManager", "onRewardVideoCached  缓存成功")
//                    showRewardAd()
////                    videoEcpm = mPreLoadRewardManager?.ecpm.toString()
//                    dismissRewardDialog()
//                }
//
//                override fun onRewardVideoLoadFail(adError: AdError) {
//                    L.i("TTMediationSDK_AdRewardManager", "${adError.code}----${adError.message}")
//                    mIsLoadFail = true
//                    loadAdFailLog(adError.code.toString(), adError.message)
//                    "视频广告加载失败，请重新点击".toast()
//                    dismissRewardDialog()
//                    mRewardAdInterface?.loadAdFail()
//                }
//            })
//
//        mFragmentManager?.let {
//            if (mPreLoadRewardManager?.rewardAd != null) {
//                rewardLoadingDialog?.show(it, "")
//            } else {
//                preLoadAd()
//            }
//
//        }
//    }
//
//    private fun showRewardAd() {
//        mPreLoadRewardManager?.let {
//            if (it.isReady) {
//                it.show(mActivity, mGMRewardedAdListener, mGMRewardedPlayAgainListener)
//            }
//        }
//    }
//
//    fun onDestroy() {
//        mPreLoadRewardManager?.destroy()
//        mPreLoadRewardManager = null
//        dismissRewardDialog()
//        mRewardAdInterface = null
//    }
//
//    private fun dismissRewardDialog() {
//        rewardLoadingDialog?.onDialogMiss()
//        rewardLoadingDialog = null
//    }
//
//    /**
//     * 同步广告信息
//     */
//    private fun syncADInfo(isClick: Int) {
//        syncAdInfoUtils.toSyncAdInfoServer(
//            mTransId,
//            ADPlatFromType.GROMORE_AD,
//            ADType.REWARD_AD,
//            videoEcpm,
//            mActionName,
//            isClick, getMMKVString(UserInfoManager.GROMORE_APP_ID), mRewardId
//        )
//    }
//
//    private fun loadAdFailLog(errCode: String, errMsg: String) {
//        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mRewardId, errCode, errMsg)
//    }
//
//    /**
//     * 获取奖励
//     */
//    private fun getRewardByActivity(
//        transId: String,
//        ecpm: String,
//        activityName: String,
//        logId: Int? = null
//    ) {
//        repository.getRewardByActivity(
//            transId,
//            ecpm,
//            activityName,
//            logId,
//            withdrawTypestring = mWithdrawType
//        )
//            .handleRequest(null, object : NetCallBack<GetRewardBean> {
//                override fun onSuccess(data: GetRewardBean?) {
//                    requestSuccess = true
//                    data?.let {
//                        mRewardBean = it
//                    }
//                }
//
//                override fun onFail(e: Throwable?) {
//                    requestSuccess = false
//                }
//            })
//    }
//}
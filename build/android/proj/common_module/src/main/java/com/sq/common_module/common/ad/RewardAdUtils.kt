package com.sq.common_module.common.ad

import android.animation.AnimatorSet
import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.bean.GetRewardBean

import com.sq.common_module.common.pange.TTRewardAdUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.DialogNumUtils
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.WiFiBaseUtils
import com.sq.common_module.common.utils.kt.getDownTimer
import com.sq.common_module.common.utils.kt.getMMKVBool
import com.sq.common_module.common.utils.kt.getMMKVIntWithDef
import com.sq.common_module.common.utils.kt.isLessAdMode
import com.sq.common_module.common.utils.kt.saveMMKVInt
import com.sq.common_module.databinding.DialogRewardLoadingBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.lang.ref.WeakReference
import java.util.*
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 14:08
 * 统一处理激励视频类型广告
 */
interface RewardAdInterface {
    fun getRewardInfo(mTransId: String, videoEcpm: String) {}

    fun getRewardSuccess(data: GetRewardBean) {}

    fun getRewardFail() {}

    fun loadAdSuccess() {}

    fun loadAdFail() {}

    fun loadTimeOut() {}
    fun adVideoComplete() {}
}

class RewardLoadingDialog : BaseDialogFragment<DialogRewardLoadingBinding>() {
    private var animatorSet: AnimatorSet? = null

    private var currentProgress = 0
    private var mTimer: Timer? = null
    private var myHandler: MyHandler? = null

    companion object {
        class MyHandler(rewardLoadingDialog: RewardLoadingDialog) :
            Handler(Looper.getMainLooper()) {
            private val weakReference: WeakReference<RewardLoadingDialog> =
                WeakReference(rewardLoadingDialog)

            override fun dispatchMessage(msg: Message) {
                super.dispatchMessage(msg)




                if (msg.what == 1) {
                    weakReference.get()?.mBindView?.loadingBar?.progress =
                        weakReference.get()?.currentProgress!!
                    if (weakReference.get()?.currentProgress == 1000) {
                        weakReference.get()?.currentProgress = 0
                    }
                    weakReference.get()?.mTimer?.schedule(weakReference.get()?.MyTask(), 10)
                }
            }
        }
    }

    inner class MyTask : TimerTask() {
        override fun run() {
            try {
                currentProgress += 10
                myHandler?.sendMessage(Message().also { it.what = 1 })
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    override fun setLayout(): Int = R.layout.dialog_reward_loading

    override fun initView() {
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
//        animatorSet = AnimatorSet()
        mTimer = Timer()
        myHandler = MyHandler(this)
        Log.e("RewardLoadingDialog", "Binding class: ${mBindView::class.java.name}")
//        animatorSet?.apply {
//            duration = 500
//            play(
//                AnimatorUtils.getScaleXBackAnim(mBindView.iv1, 0.8f)
//                    .also { it.repeatCount = ValueAnimator.INFINITE })
//                .with(
//                    AnimatorUtils.getScaleBackYAnim(mBindView.iv1, 0.8f)
//                        .also { it.repeatCount = ValueAnimator.INFINITE })
//                .with(
//                    AnimatorUtils.getScaleXBackAnim(mBindView.iv2, 0.8f)
//                        .also { it.repeatCount = ValueAnimator.INFINITE })
//                .with(
//                    AnimatorUtils.getScaleBackYAnim(mBindView.iv2, 0.8f)
//                        .also { it.repeatCount = ValueAnimator.INFINITE })
//            start()
//        }

        mTimer?.schedule(MyTask(), 10)
        lifecycleScope.launch {
            getDownTimer(30, true)
                .collect {
                    if (it == 0) {
                        dialog?.dismiss()
                    }
                }
        }
    }

    override fun initRequest() {

    }

    override fun initClick() {

    }

    fun onDialogMiss() {
        mTimer?.cancel()
        myHandler = null
        mTimer = null
        dialog?.dismiss()
        myHandler?.removeCallbacksAndMessages(null)
    }

    override fun show(manager: FragmentManager, tag: String?) {
        if (DialogNumUtils.rewardDialogNum > 0) return
        try {
            manager.beginTransaction().remove(this).commit()
            DialogNumUtils.rewardDialogNum++
            super.show(manager, tag)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
//        animatorSet?.cancel()
        mTimer?.cancel()
        myHandler?.removeCallbacksAndMessages(null)
        myHandler = null
        mTimer = null

    }
}


class RewardAdUtils
@Inject constructor(
    private val groMoreRewardAdUtils: TTRewardAdUtils,

    ) {
    private var mAdPlatformType = ADPlatFromType.GROMORE_AD // 广告平台类型
    private var timeOut = -1
    private var isTimeOut = false
    private var timeOutJob: Job? = null
    private var loadStatus: Boolean? = null

    fun initAd(
        life: LifecycleCoroutineScope,
        adPlatformType: Int,
        activity: Activity,
        rewardId: String,
        actionName: String,
        fragmentManager: FragmentManager,
        rewardAdInterface: RewardAdInterface,
        showDialog: Boolean = true,
        logId: Int? = null,
        withdrawTypestring: String? = null,
        loadTimeOut: Long = -1,
    ) {
        mAdPlatformType = adPlatformType
        val lessAdLimit = getMMKVBool(UserInfoManager.IS_LESSAD_LIMIT)
        val rewardLimit = getMMKVIntWithDef(UserInfoManager.REWARD_LIMIT, -1)
        if (isLessAdMode()) {
            if (lessAdLimit && rewardLimit == 0) {
                //如果信息流的限制达到上限，直接返回掉
                rewardAdInterface.loadAdFail()
                return
            }
            if (lessAdLimit && rewardLimit > 0) {
                //这里需要开始展示广告了，直接次数减1
                (rewardLimit - 1).saveMMKVInt(UserInfoManager.REWARD_LIMIT)
            }
        }
//        else if (UserInfoManager.lowEcpmUser != 1) {
//            //低质量的用户，直接跳过激励视频
//            rewardAdInterface.loadAdFail()
//            return
//        }



        val adInterface = object : RewardAdInterface {
            override fun getRewardInfo(mTransId: String, videoEcpm: String) {
                if (!isTimeOut) rewardAdInterface.getRewardInfo(mTransId, videoEcpm)
            }

            override fun getRewardSuccess(data: GetRewardBean) {
                if (!isTimeOut) rewardAdInterface.getRewardSuccess(data)
            }

            override fun getRewardFail() {
                if (!isTimeOut)
                    rewardAdInterface.getRewardFail()
            }

            override fun loadAdSuccess() {
                loadStatus = true
                destroyTimeOut()
                if (!isTimeOut)
                    rewardAdInterface.loadAdSuccess()
            }

            override fun loadAdFail() {
                loadStatus = false
                destroyTimeOut()
                if (!isTimeOut)
                    rewardAdInterface.loadAdFail()
            }

            override fun loadTimeOut() {
                rewardAdInterface.loadTimeOut()
            }

            override fun adVideoComplete() {
                if (!isTimeOut) rewardAdInterface.adVideoComplete()

            }
        }


        initTimeOut(life, adInterface, loadTimeOut)

        when (adPlatformType) {

//            ADPlatFromType.KS_AD -> {
//                ksRewardUtils.initKsReward(
//                    activity,
//                    rewardId,
//                    fragmentManager,
//                    actionName,
//                    rewardAdInterface,
//                    logId, withdrawTypestring = withdrawTypestring
//                )
//            }
//            ADPlatFromType.GDT_AD -> gdtRewardUtils.initGdtReward(
//                activity,
//                rewardId,
//                fragmentManager,
//                actionName,
//                rewardAdInterface, logId, withdrawTypestring = withdrawTypestring
//            )

            else -> {
                groMoreRewardAdUtils.initTTReward(
                    life,
                    activity,
                    rewardId,
                    fragmentManager, actionName,
                    adInterface, showDialog, logId, withdrawTypestring = withdrawTypestring
                )
            }

        }
    }

    /**
     * 超时
     * @param timeOut 毫秒
     */
    private fun initTimeOut(
        scope: LifecycleCoroutineScope,
        callback: RewardAdInterface,
        timeOut: Long,
    ) {
        if (timeOut < 1) return
        timeOutJob = scope.launch(Dispatchers.Default) {
            getDownTimer(timeOut.div(1000).toInt()).collect {
                if (it == 0 && loadStatus == null) {
                    isTimeOut = true
                    callback.loadTimeOut()
                    L.w("wolf", "RewardAD 触发超时")
                }
            }
        }
    }

    private fun destroyTimeOut() {
        timeOutJob?.cancel()
        timeOutJob = null
    }

    /**
     * 加载广告
     */
    fun preLoadRewardAd() {
        when (mAdPlatformType) {
//
//            ADPlatFromType.KS_AD -> ksRewardUtils.loadKsReward()
//            ADPlatFromType.GDT_AD -> gdtRewardUtils.loadGDTReward()

//            else -> groMoreRewardAdUtils.preLoadAd()
        }
    }


    fun onDestroy() {
        destroyTimeOut()
        when (mAdPlatformType) {
            ADPlatFromType.GROMORE_AD -> {
                groMoreRewardAdUtils.onDestroy()
            }
        }
    }

}
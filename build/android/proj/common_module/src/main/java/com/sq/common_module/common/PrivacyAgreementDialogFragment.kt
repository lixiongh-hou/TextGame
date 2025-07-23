package com.sq.common_module.common

import android.animation.AnimatorSet
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.animation.Animation
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.SpanUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.event.AgreePrivacyEvent
import com.sq.common_module.common.ui.BackAppDialogFragment
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.UMConfigUtils
import com.sq.common_module.common.utils.kt.*
import com.sq.common_module.databinding.FragmentPrivacyAgreement1Binding
import com.umeng.commonsdk.UMConfigure
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus

/**
 * Created by town
 * Date :  2022/10/26
 * Time : 18:03
 */
@AndroidEntryPoint
class PrivacyAgreementDialogFragment : BaseDialogFragment<FragmentPrivacyAgreement1Binding>() {
    private var aniSet: AnimatorSet? = null

    override fun setLayout(): Int = R.layout.fragment_privacy_agreement1

    @SuppressLint("SetTextI18n")
    override fun initView() {
        //背景透明
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog!!.window?.setGravity(Gravity.CENTER)
        mBindView.tvDesc.text = "感谢您的信任并使用${AppUtils.getAppName()}"
        mBindView.tvContentTop.text =
            "在您使用${AppUtils.getAppName()}提供的服务时,我们将在您阅读完毕并同意相关协议后,按照更新后隐私政策的规定收集、使用及共享您的个人信息.我们希望通过隐私政策向您介绍我们如何收集、处理、使用您的个人信息."

        if (HttpHeaderUtils.appCode == "390000") {
            SpanUtils.with(mBindView.btnGoHome).append("已阅读并同意\n")
                .append("《用户协议》及《隐私政策》")
                .setFontSize(9, true).create()
        }


        SpanUtils.with(mBindView.tvAgreePrivacy).append("查看完整版")
            .append("《用户协议》")
            .setClickSpan(resources.getColor(R.color.color_agreement, null), false) {
                MyActivityUtils.startBaseWebViewActivity(
                    "用户协议",
                    USER_AGREEMENT_URL,
                    false
                )
            }
            .append("及")
            .append("《隐私政策》")
            .setClickSpan(resources.getColor(R.color.color_agreement, null), false) {
                MyActivityUtils.startBaseWebViewActivity(
                    "隐私政策",
                    PRIVACY_AGREEMENT_URL,
                    false
                )
            }
            .create()
        if (HttpHeaderUtils.isWifiXXL) {
            aniSet = AnimatorSet().apply {
                play(
                    AnimatorUtils.getScaleXBackAnim(mBindView.btnGoHome, 1.2f)
                        .also { it.repeatCount = Animation.INFINITE })
                    .with(
                        AnimatorUtils.getScaleBackYAnim(mBindView.btnGoHome, 1.2f)
                            .also { it.repeatCount = Animation.INFINITE })
                duration = 1000
                start()
            }
        }
    }

    override fun initRequest() {

    }

    override fun initClick() {
        mBindView.btnGoHome.singleClick {
            UMConfigUtils.submitPolicyGrantResult(context?.applicationContext, true)
            dialog?.dismiss()
            true.saveMMKVBool(UserInfoManager.IS_AGREE_PRIVACY)
            EventBus.getDefault().post(AgreePrivacyEvent())
        }
        mBindView.tvBack.singleClick {
            false.saveMMKVBool(UserInfoManager.IS_AGREE_PRIVACY)
            BackAppDialogFragment.showBackAppDialog(childFragmentManager, object :
                BackAppDialogFragment.BackAppCallBack {
                override fun close() {
                    dialog?.dismiss()
                }
            })

        }
//        mBindView.tvUserPolicy.singleClick {
//            MyActivityUtils.startBaseWebViewActivity(
//                "隐私政策",
//                PRIVACY_AGREEMENT_URL,
//                false
//            )
//        }
//        mBindView.tvUserProtocol.singleClick {
//            MyActivityUtils.startBaseWebViewActivity(
//                "用户协议",
//                USER_AGREEMENT_URL,
//                false
//            )
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        aniSet?.cancel()
    }
}
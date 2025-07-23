package com.sq.common_module.common

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import com.blankj.utilcode.util.SpanUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.event.AgreePrivacyEvent
import com.sq.common_module.common.ui.BackAppDialogFragment
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.UMConfigUtils
import com.sq.common_module.common.utils.kt.*
import com.sq.common_module.databinding.FragmentPrivacyAgreementFirstBinding
import com.umeng.analytics.MobclickAgent
import com.umeng.commonsdk.UMConfigure
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus

/**
 * Created by town
 * Date :  2023/11/28
 * Time : 17:46
 */
@AndroidEntryPoint
class PrivacyAgreementFirstDialogFragment :
    BaseDialogFragment<FragmentPrivacyAgreementFirstBinding>() {
    override fun setLayout(): Int = R.layout.fragment_privacy_agreement_first

    override fun initView() {
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.window?.setGravity(Gravity.CENTER)
        SpanUtils.with(mBindView.tvDesc)
            .append("   感谢您选择使用我们app，我们非常重视您的个人信息和隐私保护。为了更好保障您的个人权益，在您使用我们的产品前请务必审慎阅读")
            .append("《用户协议》")
            .setClickSpan("#2E85FF".parseColor(), false) {
                MyActivityUtils.startBaseWebViewActivity(
                    "用户协议",
                    USER_AGREEMENT_URL,
                    false
                )
            }.append("和")
            .append("《隐私政策》")
            .setClickSpan("#2E85FF".parseColor(), false) {
                MyActivityUtils.startBaseWebViewActivity(
                    "隐私政策",
                    PRIVACY_AGREEMENT_URL,
                    false
                )
            }
            .append("。")
            .append(
                "点击“同意并继续”按钮，表示您已知情并同意以上协议和以下约定。\n" +
                        "1,为了保障软件的安全运行和账户安全，我们会申请收集您的设备信息"
            )
            .append("(包括IMEI、MAC地址、OAID、AndroidID、设备序列号)、")
            .setForegroundColor(Color.parseColor("#ff5353"))
            .append("IP地址、安装列表信息")
            .append(
                "\n" +
                        "2,我们尊重您的选择权，我们也会为您提供注销渠道\n" +
                        "3,具体内容点击上方链接查看,并以它为准"
            )
            .create()
    }

    override fun initRequest() {

    }

    override fun initClick() {
        mBindView.tvConfirm.singleClick {
            UMConfigUtils.submitPolicyGrantResult(context?.applicationContext, true)
            dialog?.dismiss()
            true.saveMMKVBool(UserInfoManager.IS_AGREE_PRIVACY)
            EventBus.getDefault().post(AgreePrivacyEvent())
        }
        mBindView.tvCancel.singleClick {
            false.saveMMKVBool(UserInfoManager.IS_AGREE_PRIVACY)
            BackAppDialogFragment.showBackAppDialog(childFragmentManager, object :
                BackAppDialogFragment.BackAppCallBack {
                override fun close() {
                    dialog?.dismiss()
                }
            })
        }
    }
}
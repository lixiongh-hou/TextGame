package com.sq.common_module.common.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.blankj.utilcode.util.SpanUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.event.AgreePrivacyEvent
import com.sq.common_module.common.utils.UMConfigUtils
import com.sq.common_module.common.utils.kt.*
import com.sq.common_module.databinding.FragmentBackAppBinding
import org.greenrobot.eventbus.EventBus

/**
 * Created by town
 * Date :  2023/12/20
 * Time : 11:46
 */
class BackAppDialogFragment : BaseDialogFragment<FragmentBackAppBinding>() {


    companion object {
        private var mCallBack: BackAppCallBack? = null
        fun showBackAppDialog(fragment: FragmentManager, callBack: BackAppCallBack) {
            mCallBack = callBack
            val backAppDialogFragment = BackAppDialogFragment()
            backAppDialogFragment.show(fragment, "")
        }
    }

    override fun setLayout(): Int = R.layout.fragment_back_app

    override fun initView() {
        SpanUtils.with(mBindView.tvContent)
            .append("根据国家规定,需同意协议内容方可进入应用,您可以通过阅读完整版")
            .append("《用户协议》")
            .setClickSpan("#0293FC".parseColor(),false){
                MyActivityUtils.startBaseWebViewActivity(
                    "用户协议",
                    USER_AGREEMENT_URL,
                    false
                )
            }
            .append("和")
            .append("《隐私政策》")
            .setClickSpan("#0293FC".parseColor(),false){
                MyActivityUtils.startBaseWebViewActivity(
                    "隐私政策",
                    PRIVACY_AGREEMENT_URL,
                    false
                )
            }
            .append("了解详细信息。如您同意,请点击'同意'开始接受我们的服务")
            .create()
    }

    override fun initRequest() {

    }

    override fun initClick() {
        mBindView.tvAgree.singleClick {
            mCallBack?.close()
            UMConfigUtils.submitPolicyGrantResult(context?.applicationContext, true)
            dialog?.dismiss()
            true.saveMMKVBool(UserInfoManager.IS_AGREE_PRIVACY)
            EventBus.getDefault().post(AgreePrivacyEvent())
        }
        mBindView.tvCancel.singleClick {
            //不同意隐私协议，退出app
            UMConfigUtils.submitPolicyGrantResult(context?.applicationContext, false)
            activity?.finish()
        }
        mBindView.ivClose.singleClick { dialog?.dismiss() }
    }

    override fun onStart() {
        super.onStart()
        val win = dialog!!.window
        // 一定要设置Background，如果不设置，window属性设置无效
        win!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val dm = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(dm)
        val params = win.attributes
        params.gravity = Gravity.CENTER
        // 使用ViewGroup.LayoutParams，以便Dialog 宽度充满整个屏幕
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        win.attributes = params
    }

    interface BackAppCallBack {
        fun close()
    }
}
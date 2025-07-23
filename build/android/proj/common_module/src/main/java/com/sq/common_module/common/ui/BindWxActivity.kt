package com.sq.common_module.common.ui

import com.blankj.utilcode.util.AppUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.common.event.WXLoginEvent
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.kt.*
import com.sq.common_module.common.widget.LoadingDialog
import com.sq.common_module.databinding.ActivityBindWxBinding
import com.tencent.mm.opensdk.modelmsg.SendAuth
import com.tencent.mm.opensdk.openapi.IWXAPI
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/4/3
 * Time : 15:11
 */
@AndroidEntryPoint
class BindWxActivity : BaseMVVMActivity<ActivityBindWxBinding>() {
    private var isChecked = false
    private val mWXApi: IWXAPI by lazy { wxPayApi(mContext) }


    @Inject
    lateinit var repository: CommonRepository
    override fun setLayout(): Int = R.layout.activity_bind_wx

    override fun initView() {
        EventBus.getDefault().register(this)
        setTitle("登录绑定微信")
        mBindView.icLogo.setImageResource(AppUtils.getAppIconId())
    }

    override fun initClick() {
        mBindView.icCheck.setOnClickListener {
            isChecked = !isChecked
            mBindView.icCheck.setImageRes(
                isChecked,
                R.drawable.ic_wx_checked,
                R.drawable.ic_wx_unchecked
            )
        }

        mBindView.ivConfirm.singleClick {
            if (!isChecked) {
                "请先同意相关协议".toast()
                return@singleClick
            }
            //拉起微信
            mWXApi.sendReq(SendAuth.Req().also {
                it.scope = "snsapi_userinfo"
                it.state = "${AppUtils.getAppPackageName()}_wx"
//                it.state = "wechat_sdk_demo_test"
            })
        }

        mBindView.tvUserPolicy.singleClick {
            MyActivityUtils.startBaseWebViewActivity("用户协议", USER_AGREEMENT_URL, false)
        }

        mBindView.tvAppPrivacy.singleClick {
            MyActivityUtils.startBaseWebViewActivity("隐私政策", PRIVACY_AGREEMENT_URL, false)
        }
    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun wxLoginCallBack(event: WXLoginEvent) {
        bindWx(event.code)
    }
    var bindWxPost = false
    private fun bindWx(code: String) {
        if (bindWxPost) return
        bindWxPost = true
        repository.bindWx(getMMKVString(UserInfoManager.WX_APP_ID), code)
            .handleRequest(LoadingDialog(mContext), object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {
                    data?.let {
                        "登录成功".toast()
                        finish()
                        bindWxPost = false
                    }
                }
                override fun onFail(e: Throwable?) {
                    super.onFail(e)
                    bindWxPost = false
                }
            })
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}
package com.sq.common_module.common.ui.auth

import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.bean.InitData
import com.sq.common_module.common.event.HomeRefreshEvent
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.kt.*
import com.sq.common_module.common.widget.LoadingDialog
import com.sq.common_module.databinding.DialogRealAuthBinding
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/4/18
 * Time : 15:31
 * 实名认证
 */
@AndroidEntryPoint
class RealAuthDialogFragment : BaseDialogFragment<DialogRealAuthBinding>() {
    @Inject
    lateinit var repository: CommonRepository
    private var authSuccess = false
    override fun setLayout(): Int = R.layout.dialog_real_auth

    override fun initView() {
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
    }

    override fun initRequest() {

    }

    override fun initClick() {
        mBindView.tvConfirm.singleClick {
            if (authSuccess) {
                getInitData()
            } else {
                if (mBindView.etName.text.toString().isEmpty()) {
                    "请输入姓名".toast()
                    return@singleClick
                }
                if (mBindView.etNumber.text.toString().isEmpty()) {
                    "请输入身份证号".toast()
                    return@singleClick
                } else {
                    if (mBindView.etNumber.text.toString().length < 18) {
                        "请输入正确的身份证号".toast()
                        return@singleClick
                    }

                }
                toAuth()
            }
        }
    }


    private fun toAuth() {
        repository.toRealAuth(mBindView.etName.text.toString(), mBindView.etNumber.text.toString())
            .handleRequest(
                LoadingDialog(requireContext()), object : NetCallBack<List<String>> {
                    override fun onSuccess(data: List<String>?) {
                        authSuccess = true
                        mBindView.v2.inVisibleView()
                        mBindView.tvName.inVisibleView()
                        mBindView.etName.inVisibleView()
                        mBindView.v3.inVisibleView()
                        mBindView.tvNumber.inVisibleView()
                        mBindView.etNumber.inVisibleView()
                        mBindView.ivAuthSuccess.showView()
                        mBindView.v4.inVisibleView()
                        mBindView.tvFailDesc.inVisibleView()
                        mBindView.tvConfirm.text = "确认"
                    }

                    override fun onFail(e: Throwable?) {
                        authSuccess = false
                        mBindView.v4.showView()
                        mBindView.tvFailDesc.showView()
                    }
                }
            )
    }

    private fun getInitData() {
        repository.getInitData()
            .handleRequest(LoadingDialog(requireContext()), object : NetCallBack<InitData> {
                override fun onSuccess(data: InitData?) {
                    data?.let {
                        it.isRealAuth.saveMMKVBool(UserInfoManager.USER_REAL_AUTH)
                        dialog?.dismiss()
                        EventBus.getDefault().post(HomeRefreshEvent())
                    }
                }
            })
    }
}
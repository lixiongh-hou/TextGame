package com.sq.common_module.common.ui

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseDialogFragment
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.kt.CommonDialogCallBack
import com.sq.common_module.common.utils.kt.singleClick
import com.sq.common_module.databinding.DialogDeleteAccountBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/5/9
 * Time : 10:39
 */
@AndroidEntryPoint
class DeleteAccountDialog : BaseDialogFragment<DialogDeleteAccountBinding>() {
    @Inject
    lateinit var repository: CommonRepository

    private val desc1 = "若审核通过,  15天内您的账号将被注销\n" +
            "成功。注销完成后,  该设备无法再次注\n" +
            "册或使用此APP,  请您谨慎操作\n"
    private var desc2 = "您已于2023年5月8日申请注销账号\n" +
            "15天内可取消申请\n"

    private var mType = 1 //1注销  2取消注销

    companion object {
        private var mCallBack: CommonDialogCallBack? = null
        fun showDeleteAccountDialog(
            fragmentManager: FragmentManager,
            type: Int,
            desc: String,
            callback: CommonDialogCallBack
        ) {
            mCallBack = callback
            val deleteAccountDialog = DeleteAccountDialog()
            val bundle = Bundle()
            bundle.putInt("type", type)
            bundle.putString("desc", desc)
            deleteAccountDialog.arguments = bundle
            deleteAccountDialog.show(fragmentManager, "")
        }
    }

    override fun setLayout(): Int = R.layout.dialog_delete_account

    override fun initView() {
        arguments?.let {
            mType = it.getInt("type")
            desc2 = "您已于${it.getString("desc")}申请注销账号\n" +
                    "15天内可取消申请\n"
        }
        if (mType == 1) {
            mBindView.tvTitle.text = "注销账号"
            mBindView.tvCancel.text = "取消"
            mBindView.tvConfirm.text = "确认注销"
            mBindView.tvDesc.text = desc1
        } else {
            mBindView.tvTitle.text = "账号注销中"
            mBindView.tvCancel.text = "退出APP"
            mBindView.tvConfirm.text = "取消注销"
            mBindView.tvDesc.text = desc2
        }
    }

    override fun initRequest() {

    }

    override fun initClick() {
        mBindView.tvConfirm.singleClick {
            dialog?.dismiss()
            mCallBack?.confirm()
        }
        mBindView.tvCancel.singleClick {
            dialog?.dismiss()
            mCallBack?.cancel()
        }
    }
}
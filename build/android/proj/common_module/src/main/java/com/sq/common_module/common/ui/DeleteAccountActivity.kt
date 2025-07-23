package com.sq.common_module.common.ui

import android.graphics.Color
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.kt.CommonDialogCallBack
import com.sq.common_module.common.utils.kt.setBackGroundRes
import com.sq.common_module.common.utils.kt.setImageRes
import com.sq.common_module.common.utils.kt.singleClick
import com.sq.common_module.common.utils.kt.toast
import com.sq.common_module.common.widget.LoadingDialog
import com.sq.common_module.databinding.ActivityDeleteAccountBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/5/8
 * Time : 16:08
 * 注销账号
 */
@AndroidEntryPoint
class DeleteAccountActivity : BaseMVVMActivity<ActivityDeleteAccountBinding>() {
    @Inject
    lateinit var repository: CommonRepository
    private var isSelected = false
    override fun setLayout(): Int = R.layout.activity_delete_account

    override fun initView() {
        setTitle("注销账号")
    }

    override fun initClick() {
        mBindView.ivSelected.setOnClickListener {
            isSelected = !isSelected
            selectedImg()
        }
        mBindView.tvConfirm.singleClick {
            if (!isSelected) {
                "请同意上述重要提示".toast()
                return@singleClick
            }
//            CleanUtils.cleanAppUserData()
            DeleteAccountDialog.showDeleteAccountDialog(
                supportFragmentManager,
                1,"",
                object : CommonDialogCallBack {
                    override fun confirm() {
                        deleteAccount()
                        "您已成功注销账户".toast()
                    }
                })
        }
    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }

    private fun selectedImg() {
        mBindView.ivSelected.setImageRes(
            isSelected,
            R.drawable.ic_selected_delete_account,
            R.drawable.ic_unselected_delete_account
        )

        mBindView.tvConfirm.setBackGroundRes(
            isSelected,
            R.drawable.tv_delete_account_selected_bg,
            R.drawable.tv_delete_account_unselected_bg
        )
        mBindView.tvConfirm.setTextColor(if (isSelected) Color.WHITE else Color.parseColor("#999999"))

    }


    private fun deleteAccount() {
        repository.delayDeleteSelf()
            .handleRequest(LoadingDialog(mContext), object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {
                    finish()
                }
            })
    }
}
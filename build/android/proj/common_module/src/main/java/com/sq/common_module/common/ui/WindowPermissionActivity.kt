package com.sq.common_module.common.ui

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.PermissionUtils
import com.blankj.utilcode.util.RomUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.common.utils.kt.setImageRes
import com.sq.common_module.common.utils.kt.singleClick
import com.sq.common_module.databinding.ActivityWindowPermissionBinding

/**
 * Created by town
 * Date :  2023/6/19
 * Time : 10:53
 */
class WindowPermissionActivity : BaseMVVMActivity<ActivityWindowPermissionBinding>() {
    override fun setLayout(): Int = R.layout.activity_window_permission

    @RequiresApi(Build.VERSION_CODES.M)
    override fun initView() {
        setTitle("悬浮窗管理")
        mBindView.ivWindowGuide.setImageRes(
            RomUtils.isOppo(),
            R.drawable.ic_window_guide_1,
            R.drawable.ic_window_guide_2
        )
        mBindView.tvConfirm.text = if (PermissionUtils.isGrantedDrawOverlays()) "已开启" else "去开启"
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun initClick() {
        mBindView.tvConfirm.singleClick {
            PermissionUtils.requestDrawOverlays(object : PermissionUtils.SimpleCallback {
                override fun onGranted() {
                    mBindView.tvConfirm.text = "已开启"
                }

                override fun onDenied() {
                    mBindView.tvConfirm.text = "去开启"
                }
            })
        }
    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }

}
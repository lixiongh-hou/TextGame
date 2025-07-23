package com.sq.common_module.common.utils

import android.Manifest
import android.app.Activity
import android.view.View
import com.blankj.utilcode.util.PermissionUtils
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVInt
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.common.utils.kt.saveMMKVInt
import com.sq.common_module.common.utils.kt.showView

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2024/3/19
 * Time: 16:08
 * 备注：
 */
object BusPermissionUtils {
    inline fun getWiFiListPermission(
        activity: Activity?,
        tipView: View?,
        crossinline block: () -> Unit
    ) {
        var refusePer: Int
        tipView?.showView()
        activity?.let {
            refusePer = getMMKVInt(UserInfoManager.REFUSE_WIFI_LIST_PERMISSION)
            PermissionUtils.permission(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
                .callback(object : PermissionUtils.SimpleCallback {
                    override fun onGranted() {
                        tipView?.hideView()
                        block.invoke()
                        0.saveMMKVInt(UserInfoManager.REFUSE_WIFI_LIST_PERMISSION)
                    }

                    override fun onDenied() {
                        tipView?.hideView()
                        if (refusePer >= 2) {
                            PermissionUtils.launchAppDetailsSettings()
                        }
                        refusePer++
                        refusePer.saveMMKVInt(UserInfoManager.REFUSE_WIFI_LIST_PERMISSION)
                    }
                }).rationale { _, shouldRequest ->
                    shouldRequest.again(true)
                }.request()
        }
    }

    inline fun getNoisePermission(
        activity: Activity?,
        tipView: View?,
        crossinline block: () -> Unit
    ) {
        tipView?.showView()
        activity?.let {
            PermissionUtils.permission(Manifest.permission.RECORD_AUDIO)
                .callback(object : PermissionUtils.SimpleCallback {
                    override fun onGranted() {
                        tipView?.hideView()
                        block.invoke()
                    }

                    override fun onDenied() {
                        tipView?.hideView()
                    }
                }).rationale { _, shouldRequest ->
                    shouldRequest.again(true)
                }.request()
        }
    }
}
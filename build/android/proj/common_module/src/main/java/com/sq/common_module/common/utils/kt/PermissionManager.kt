package com.sq.common_module.common.utils.kt

import com.blankj.utilcode.constant.PermissionConstants
import com.blankj.utilcode.util.PermissionUtils
import com.sq.common_module.common.utils.java.CalendarReminderUtil

/**
 * Created by town
 * Date :  2022/11/9
 * Time : 13:44
 */
inline fun requestPermission(permission: String,crossinline granted: () -> Unit,crossinline deny: () -> Unit) {
    if (PermissionUtils.isGranted(permission)) {
        granted()
    } else {
        PermissionUtils.permission(permission)
            .callback(object : PermissionUtils.SimpleCallback {
                override fun onGranted() {
                    granted()
                }

                override fun onDenied() {
                    deny()
                }
            }).request()
    }
}
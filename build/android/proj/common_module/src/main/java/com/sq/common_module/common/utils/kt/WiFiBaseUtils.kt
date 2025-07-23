package com.sq.common_module.common.utils.kt

import android.content.Intent
import android.provider.Settings
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.StringUtils
import com.sq.common_module.common.utils.HttpHeaderUtils

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2024/1/12
 * Time: 16:34
 * 备注：
 */

object WiFiBaseUtils {
//    fun isNotShowRewardClick(): Boolean {
//        if (isNotShowReward()) {
//            ActivityUtils.startActivity(Intent(Settings.ACTION_WIFI_SETTINGS))
//            return true
//        }
//        return false
//    }
//
//    fun isNotShowReward(): Boolean {
//        if (StringUtils.isEmpty(getMMKVString(UserInfoManager.WIFI_REWARD_ID)) || HttpHeaderUtils.isRiskUser == 1 || isLessVivoAd()) {
//            return true
//        }
//        return false
//    }
    var notBtnShowReward = false

}
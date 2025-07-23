package com.sq.common_module.common.ad

import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVString
import java.util.*

/**
 * Created by town
 * Date :  2022/11/22
 * Time : 15:40
 */
object ADType {
    const val SPLASH_AD = 0
    const val FEED_LIST_AD = 1
    const val FULL_AD = 2
    const val REWARD_AD = 3
}

object ADPlatFromType {
    const val GROMORE_AD = 0
    const val KS_AD = 2
    const val GDT_AD = 1
}

fun getTransId(adPlatFromType: Int, mAdUnitId: String): String {
    return "${adPlatFromType}_${getMMKVString(UserInfoManager.USER_ID)}_${mAdUnitId}_"
}

object AdIdRecord {
    var rewardId = ""
    var feedId = ""
    var fullId = ""
    var screenImageAdId = ""
    var screenVideoAdId = ""
    var splashAdIdTwice = ""
}
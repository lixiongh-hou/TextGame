package com.sq.common_module.common.utils.kt

import com.sq.common_module.common.utils.HttpHeaderUtils

/**
 * Created by town.
 * Date: 2021/8/23
 * Time: 3:36 下午
 */
val USER_AGREEMENT_URL = "${getBaseUrl()}h5/userAgreement"  //用户协议
val PRIVACY_AGREEMENT_URL = "${getBaseUrl()}h5/privacyAgreement"  //隐私协议
var ONLINE_SERVICE =
    "${getBaseUrl()}h5/onlineService" //在线客服

val INVITE_FRIEND = "${getBaseUrl()}/h5/invite"
val NORMAL_QUESTION = "${getBaseUrl()}h5/normalQuestion" //常见问题
val USER_INFO_AGREEMENT = "${getBaseUrl()}h5/userInfoAgreement" //个人信息收集清单
val THIRD_SKD_LIST = "${getBaseUrl()}h5/thirdSdkList" //三方sdk
val PERMISSION_LIST = "${getBaseUrl()}h5/permissionList" //权限列表
val FEED_BACK = "${getBaseUrl()}h5/feedback?appCode=${HttpHeaderUtils.appCode}" //问题反馈
val INVITE_FRIEND_NEW = "${getBaseUrl()}/h5/invite2"






package com.sq.common_module.common.bean

/**
 * create by apple on 2024/7/2 09:24
 * 说明：
 * 0-非会员，
 * 1-月费会员，
 * 3-年费会员，
 * 4-终身会员,
 * 6-周会员
 **/
data class UseVipBean(
    val avatar: String,
    val defaultPayMode: String,
    var isBindPhone: Boolean,
    val phone: String,
    val defaultPayType:String,
    val alipayStatus:Boolean,
    val wechatStatus:Boolean,
    val alipayReduction:Double,
    val pwd: String,
    val uid: Int,
    var isVip: Boolean,
    val vipInfo: List<VipInfo>,
    val vipTimeStr: String,
    val vipType: Int,
    val vipDesc: String,
    val isNeedLogin: Boolean,
    val customerServiceUrl:String
) {
    data class VipInfo(
        val id: Int,
        val name: String,
        val originPrice: String,
        val price: String,
        val tag: String,
        val type: Int,
    )
}

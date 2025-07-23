package com.sq.common_module.common.utils.kt

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.blankj.utilcode.util.StringUtils

/**
 * Created by town
 * Date :  2022/10/27
 * Time : 17:14
 */
object MyActivityUtils {

    private val aRouter = ARouter.getInstance()
    private val audit by lazy { getAuditRoutPath() }
    private val path by lazy { getRoutPath() }
    private val jlPath by lazy { getJlRoutPath() }

    private fun getAuditRoutPath(): String {
        return when {
            AppCodeUtils.isWzOneModule() -> "wz1"
            else -> ""
        }
    }

    private fun getRoutPath(): String {
        return when {
            AppCodeUtils.isWzOneModule() -> "wz1"
            else -> ""
        }
    }

    private fun getJlRoutPath(): String {
        return when {

            else -> ""
        }
    }

    private fun isShowJlUI() = if (getMMKVInt(UserInfoManager.IS_JL_OFFICIAL) == 1) true else false

    fun toAuditMainActivity() {
        Log.i("dsfsdffc", "1111" + isShowJlUI() + "###" + isXxlJl())
        aRouter.build(if (isShowJlUI()) "/wz1/MainActivity" else "/wz1/MainActivity")
            .navigation()

    }

    fun toAuditDetailActivity(num: Int, title: String, content: String) {
        aRouter.build("/$audit/detailActivity").withInt("num", num).withString("title", title)
            .withString("content", content)
            .navigation()
    }

    fun toAuditMyInfoActivity() {
        aRouter.build("/$audit/MyInfoActivity").navigation()
    }

    fun toAuditMyAboutActivity() {
        aRouter.build("/$audit/aboutActivity").navigation()
    }

    fun toAuditAboutUsActivity() {
        aRouter.build("/audit/AboutUsActivity").navigation()
    }

    fun toMotionRecordsActivity() {
        aRouter.build("/$audit/motionRecordsActivity").navigation()
    }

    fun toScreenActivity(jump: Int = -1) {
        aRouter.build("/home/ScreenActivity")
            .withInt("jump", jump)
            .navigation()
    }

    fun toHomeSplashActivity(jump: Int = -1) {
        aRouter.build("/home/SplashActivity")
            .withInt("jump", jump)
            .navigation()
    }

    fun toMainActivity(tab: Int, jump: Int = -1) {
        Log.i("dsfsdffc", "22222" + isShowJlUI() + "###" + isXxlJl())
        if (isXxlJl()) {
            aRouter.build(if (isShowJlUI()) "/$jlPath/MainActivity" else "/$audit/MainActivity")
                .withInt("pos", tab)
                .withInt("jump", jump)
                .navigation()
        } else {
            aRouter.build(if (isShowJlUI()) "/$path/MainActivity" else "/$path/MainActivity")
                .withInt("pos", tab)
                .withInt("jump", jump)
                .navigation()
        }


    }

    fun toMainActivity(tab: Int, showWithdrawal: Boolean) {
        aRouter.build("/$path/MainActivity")
            .withInt("pos", tab)
            .withBoolean("showWithdrawal", showWithdrawal)
            .navigation()
    }

    /**
     * 打开进入wifi加速页面
     */
    fun toEntryWifiAccelerationActivity() {
        aRouter.build("/$path/EntryWifiAccelerationActivity")
            .navigation()
    }

    /**
     * 打开进入引导优化页面
     */
    fun toGuideOptimizeActivity(way: Int = -1) {
        aRouter.build("/$path/GuideOptimizeActivity")
            .withInt("way", way)
            .navigation()
    }

    /**
     * 打开进入优化页面
     */
    fun toOptimizeActivity(type: Int) {
        aRouter.build("/$path/OptimizeActivity")
            .withInt("type", type)
            .withBoolean("isNotify", true)
            .navigation()
    }

    //限时红包雨
    fun toRedRainActivity() {
        aRouter.build("/$path/redRainActivity").navigation()
    }

    //大转盘
    fun toBigWheelActivity() {
        aRouter.build("/$path/BigWheelActivity").navigation()
    }

    //天天抽红包
    fun toDayDayGetRedActivity() {
        aRouter.build("/$path/DayDayGetRedActivity").navigation()
    }

    //幸运大翻牌
    fun toLuckyFlopActivity() {
        aRouter.build("/$path/LuckyFlopActivity").navigation()
    }

    //新人百元红包
    fun toNewPersonCashActivity() {
        aRouter.build("/$path/NewPersonCashActivity").navigation()
    }

    //用户金币记录
    fun toCoinLogActivity() {
        aRouter.build("/$path/CoinLogActivity").navigation()
    }

    //答题王活动
    fun toAnswerQuestionsActivity() {
        aRouter.build("/$path/AnswerQuestionsActivity").navigation()
    }

    //百元现金天天领
    fun toReceiveCashActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/ReceiveCashActivity" else "/$path/ReceiveCashActivity")
            .navigation()
    }

    //百元红包记录
    fun toReceiveCoinLogActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/ReceiveCoinLogActivity" else "/$path/ReceiveCoinLogActivity")
            .navigation()
    }

    //我的提现
    fun toWithdrawalMoneyActivity() {
        aRouter.build("/$path/WithdrawalMoneyActivity").navigation()
    }

    //提现记录
    fun toWithdrawalHistoryActivity() {
        aRouter.build("/$path/WithdrawalHistoryActivity").navigation()
    }

    fun toNineGridActionActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/NineGirdActionActivity" else "/$path/NineGirdActionActivity")
            .navigation()
    }

    fun toGuessActionActivity() {
        aRouter.build("/$path/GuessActionActivity").navigation()
    }

    fun toEveryActionActivity() {
        aRouter.build("/$path/EveryActionActivity").navigation()
    }

    //余额明细
    fun toTaskCoinLogActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/CoinLogActivity" else "/$path/CoinLogActivity")
            .navigation()
    }

    //我的余额
    fun toTaskMyBalanceActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/MyBalanceActivity" else "/$path/MyBalanceActivity")
            .navigation()
    }

    //隐私设置
    fun toTaskMyPrivacySettingActivity() {
        aRouter.build(if (isShowJlUI()) "/$jlPath/MyPrivacySettingActivity" else "/$path/MyPrivacySettingActivity")
            .navigation()
    }

    //我的设置
    fun toTaskMySettingActivity(isBindWx: Boolean) {
        aRouter.build(if (isShowJlUI()) "/$jlPath/MySettingActivity" else "/$path/MySettingActivity")
            .withBoolean("isBindWx", isBindWx)
            .navigation()
    }

    //引导城市添加
    fun toAddCityActivity() {
        aRouter.build("/weatherCommon/AddCityActivity").navigation()
    }

    //引导开启定位权限
    fun toOpenLocationPermissionActivity() {
        aRouter.build("/weatherCommon/OpenLocationPermissionActivity").navigation()
    }

    /**
     * 跳转到webview
     */

    fun startBaseWebViewActivity(
        title: String,
        url: String,
        hide: Boolean,
    ) {
        if (TextUtils.isEmpty(url)) {
            return
        }

        aRouter.build("/base/BaseWebViewActivity")
            .withString("title", title)
            .withString("url", url)
            .withBoolean("hide", hide)
            .navigation()
    }

    fun startAppActivity(activity: Activity?, openType: Int, url: String?, title: String?) {
        //应用内浏览器打开
        if (openType == 0) {
            if (title != null) {
                if (url != null) {
                    startUrlSkip(activity, url, title)
                }
            }
        }
        //打开外部浏览器
        if (openType == 1) {
            if (activity != null) {
                startOutUrlActivity(activity, url)
            }
        }
    }

    private fun startOutUrlActivity(activity: Activity, url: String?) {
        if (StringUtils.isEmpty(url)) return
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        if (intent.resolveActivity(activity.packageManager) != null) {
            activity.startActivity(intent)
        }
    }

    private fun startUrlSkip(context: Context?, url: String, title: String) {
        if (StringUtils.isEmpty(url)) return
        if (url.contains("http")) {
            startBaseWebViewActivity(title, url, false)
        } else {
            startActivity(url)
        }
    }

    private fun startActivity(url: String) {

    }
}
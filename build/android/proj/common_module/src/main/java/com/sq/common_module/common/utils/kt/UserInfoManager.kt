package com.sq.common_module.common.utils.kt

import com.blankj.utilcode.util.TimeUtils
import java.util.Date

/**
 * Created by town
 * Date :  2022/10/12
 * Time : 15:45
 */
object UserInfoManager {
    var DEVICEID: String = ""
    var ANDROID_ID: String = ""
    val LOW_INTERVAL: String = "LOW_INTERVAL"
    val LOW_LIMIT: String = "LOW_LIMIT"

    var lowEcpmUser = -1//默认不是低质量的用户-1是没有初始化，0是低质量 1是高质量
    val BACK_TO_FRONT = "BACK_TO_FRONT"
    const val IS_LESS_AD_OPEN_LIMIT = "is_less_ad_open_limit"//纯净版插全屏打开次数
    val IS_LESSAD_LIMIT = "IS_LESSAD_LIMIT"
    val IS_OFFICIAL_LIMIT = "IS_OFFICIAL_LIMIT"//正式版的间隔
    val KP_LIMIT = "KP_LIMIT"
    val REWARD_LIMIT = "REWARD_LIMIT"
    val CQP_LIMIT = "CQP_LIMIT"
    val XXL_LIMIT = "XXL_LIMIT"
    val CQP_VIDEO_LIMIT = "CQP_VIDEO_LIMIT"
    val CQP_IMG_LIMIT = "CQP_IMG_LIMIT"
    var feedOpenTime = -1
    var fullOpenTime = -1
    const val INNER_VERSION = "20241203"

    const val KEY_PRIVATE_KEY: String = "hangzhouhaocai888@#¥"

    const val KEY_IMEI_ORIGIN = "imeiOrigin" //设备原始imei

    const val USER_TOKEN = "userToken" //

    const val USER_ID = "userId"

    const val IS_BIND_PHONE = "IS_BIND_PHONE"

    const val USER_PHONE = "userPhone"
    const val IS_JL_OFFICIAL = "isJlOfficial"

    const val I_MEI = "iMei"

    const val APP_CODE = "appCode"

    const val APPLICATION_ID = "applicationId"

    const val APP_CHANNEL = "appChannel"

    const val OAID = "oa_id" //

    const val IMEIORIGIN = "IMEI_ORIGIN" //

    const val TT_APP_ID = "ttAppId"

    const val PUSH_APP_TYPE = "pushAppType" //推广类型

    const val GRO_SPLASH_ID = "groSplashId" //闪屏广告id

    const val GRO_BANNER_ID = "groBannerId" //banner广告id

    const val GRO_REWARD_ID = "groRewardId"  //激励视频广告id

    const val GRO_FULL_ID = "groFullId"  //插全屏id

    const val IS_AGREE_PRIVACY = "isAgreePrivacy"

    const val IS_AUDIT = "isAudit"

    const val REFUSE_WIFI_LIST_PERMISSION = "refuse_wifi_list_permission" // 二次拒绝判断

    const val GUESS_SHOW_FULL_AD = "guessShowFullAd"//猜谜语 展示插全屏

    const val USER_STEP = "user_step"// 用户步数

    const val TAB_SELECT_POSITION = "tab_select_position"

    const val GUESS_FEED_AD_FROM = "guess_full_ad_from" //猜成语信息流

    const val GUESS_FEED_AD_ID = "guess_full_ad_id" //猜成语信息流id

    const val ADD_DESKTOP_APPWIDGET = "add_desktop_appwidget" //添加桌面小组件

    const val USER_BIND_WX = "user_bind_wx"

    const val USER_BIND_ZFB = "user_bind_zfb"

    const val SHOW_EVERY_SIGN = "show_every_sign" //展示每日签到

    const val ALI_APP_ID = "ali_app_id"
    const val WX_APP_ID = "wx_app_id"

    const val AUDIT_USER_STEP = "audit_user_step"
    const val AUDIT_USER_TOTAL_STEP = "audit_user_total_step"
    const val SHOW_TOMORROW_TIPS = "show_withdrawal_tomorrow_tips"

    const val BATTERY_HEALTH = "battery_health"
    const val SHOW_NEW_PERSON = "show_new_person"

    const val GROMORE_APP_ID = "gromore_app_id"

    const val KS_APP_ID = "ks_app_id"

    const val YLH_APP_ID = "ylh_app_id"

    const val SPLASH_AD_PLATFORM = "splash_ad_platform" //开屏页广告平台

    const val SPLASH_AD_ID = "splash_ad_id" //开屏页广告id
    const val LOW_ECPM_FULL_AD_ID = "LOW_ECPM_FULL_AD_ID" //低ecpm的插全屏广告
    const val LOW_ECPM_FEED_AD_ID = "LOW_ECPM_FEED_AD_ID" //低ecpm的信息流广告

    const val SPLASH_OPEN_AD_ID = "splash_open_ad_id" //开屏页兜底代码位

    const val SHOW_SIGN_NUMBER = "show_sign_number"//展示签到弹窗次数

    const val NEW_PERSON_FULL_AD_PLATFORM = "new_person_full_ad_platform"

    const val NEW_PERSON_FULL_AD_ID = "new_person_full_ad_id"

    const val REWARD_AD_PLATFORM = "reward_ad_platform"

    const val REWARD_AD_ID = "reward_ad_id"

    const val SHOW_CASH_RED_DIALOG = "show_cash_red_dialog"

    const val GET_NEW_PERSON_REWARD = "get_new_person_reward"

    const val USER_HUNDRED_AMOUNT = "user_hundred_amount"

    const val USER_FIRST_THIRD_TAB = "user_first_third_tab"

    const val WX_SHOP_TIPS = "wx_shop_tips"

    const val IS_LESS_AD = "is_less_ad"//纯净版

    const val SPECIAL_FEED_AD_ID = "special_feed_ad_id" //特殊信息流广告id

    const val SPECIAL_FEED_AD_PLATFORM = "special_feed_ad_platform"

    const val IS_ALIVE = "is_alive"

    const val CHECKED_PRIVACY = "checked_privacy" //是否同意

    const val APP_WIDGET_EVERY_SHOW = "app_widget_every_show"//小组件每日弹的次数


    const val USER_TRANSID = "user_transId"

    const val USER_REAL_AUTH = "user_real_auth"

    const val SPECIAL_REC = "special_rec"//个性化开关

    const val IS_STARTING_ALIVE = "is_starting_alive"//是否正在保活倒计时

    const val ALIVE_START_TIME = "alive_start_time"//保活开始时间戳

    const val STEP_DETECTOR = "mStepDetector"//当前步数

    const val WITHDRAW_PLATFORM_TYPE = "withdraw_platform_type"

    const val SHOW_PUSH = "jPush"

    const val USE_MUSIC_CHARGE = "use_music_charge"//


    const val WIFI_ACCELERATION_PROGRESS = "wifi_acceleration_progress"

    const val CONNECTED_WIFI = "connected_wifi"     //连接过wifi　
    const val SAFE_TEST_SUCCESS = "safetestsuccess"     //安全检测

    const val GUIDE_OPT_IS_WIFI = "guide_opt_is_wifi"     //引导 优化页面 是否wifi

    const val IS_HIDDEN_PROGRESS_BTN = "is_hidden_progress_btn"     //隐藏加载进度
    const val IS_USE_FULL_SCREEN = "is_use_full_screen"     //是否使用插全屏

    const val CLEAR_DANGER_DATA = "clear_danger_data"     //清理数据
    const val CLEAR_HOME_DATA = "clear_home_data"     //清理首页数据
    const val CLEAR_TOOL_TAB_DATA = "clear_tool_tab_data"     //清理工具tab数据
    const val CLEAR_HOME_TAB_DATA = "clear_home_tab_data"     //清理hometab数据

    const val IS_AUIDT_CLEAR_HOME = "is_auidt_clear_home"     //已清理首页
    const val IS_AUIDT_FIRST_CLEAR_HOME = "is_auidt_first_clear_home"     //首次清理首页
    const val IS_AUIDT_SCAN_HOME = "is_auidt_scan_home"     //扫描首页


    const val CLEAR_SAFE_DAY = "clear_safe_day"     //开始守护时间
    const val CLEAR_WECHAT_DANGER = "clear_wechat_danger_hidden"     //微信危险
    const val WIFI_NOTE_BOOK = "wifi_note_book"     //wifi记事本

    const val GUIDE_OPEN_LOCATION = "guide_open_location"

    const val WEATHER_MY_XZ = "weather_my_xz"    //我的星座

    const val REQUEST_AD = "request_ad" //发起请求广告

    const val CURRENT_NET_SPEED = "current_net_speed" //当前网速

    const val CLEAN_V2_KS = "clean_v2_ks"    //快手清理

    const val WIFI_V8_NET_SPEED = "wifi_v8_net_speed"


    val EVERY_TASK_1 = "${TimeUtils.date2String(Date(), "yyyy-MM-dd")}_1"
    val EVERY_TASK_2 = "${TimeUtils.date2String(Date(), "yyyy-MM-dd")}_2"
    val EVERY_TASK_3 = "${TimeUtils.date2String(Date(), "yyyy-MM-dd")}_3"
    val EVERY_TASK_4 = "${TimeUtils.date2String(Date(), "yyyy-MM-dd")}_4"


    const val IS_MODE_SWITCHING = "IS_MODE_SWITCHING" // 用电技巧
    const val IS_GARBAGE_REMOVE = "IS_GARBAGE_REMOVE" // 手机加速


    const val IS_VIRUS_SCAN = "IS_VIRUS_SCAN" // 过充保护
    const val IS_PHONE_SPEED = "IS_PHONE_SPEED" // 待机时长

    const val IS_CLEAN_PHOTO = "IS_CLEAN_PHOTO" //清理相册
    const val IS_VIDEO_SPEED = "IS_VIDEO_SPEED" //短视频加速
    const val IS_BATTERY_INFO = "IS_BATTERY_INFO" //电池信息
    const val IS_SPEED_TEST = "IS_SPEED_TEST" // 网络测速
    const val IS_POWER_SAVE = "IS_POWER_SAVE" // 省电优化
    const val IS_POWER_SAVING = "IS_Power_Saving" // 省电模式
    const val IS_TRAFFIC_PROTECTION = "IS_TRAFFIC_PROTECTION" // 流量监控
    const val IS_ALL_FIND_KILL = "IS_ALL_FIND_KILL" // 全盘查杀
    const val IS_BIG_FILE_MANAGER = "IS_BIG_FILE_MANAGER" // 大文件管理


    const val IS_WIFI_PWD_LEAK = "IS_WIFI_PWD_LEAK" // 密码泄漏
    const val IS_STRONGER_SIGNAL = "IS_STRONGER_SIGNAL" // 网络卡顿
    const val IS_DEVICE_SQUA = "IS_DEVICE_SQUA" // 蹭网设备
    const val IS_PAY_SAFE = "IS_PAY_SAFE" // 支付安全
    const val IS_SYSTEM_BATTERY = "IS_SYSTEM_BATTERY" //耗电优化
    const val IS_NET_REINFORCE = "IS_NET_REINFORCE" //网络加固
    const val IS_WIFI_GUARD = "IS_WIFI_GUARD" //wifi卫士

    const val IS_SYSTEM_NET = "IS_SYSTEM_NET" //系统网络
    const val IS_GAME_CONSUME = "IS_GAME_CONSUME" //游戏发热
    const val IS_VIDEO_CONSUME = "IS_VIDEO_CONSUME" //视频发热

    const val IS_CHECK_SECURITY = "IS_CHECK_SECURITY" //安全检测
    const val IS_APP_SECURITY = "IS_APP_SECURITY" //软件检测
    const val IS_NET_TEST = "IS_NET_TEST" //网络诊断

    const val IS_FULL_SCAN = "IS_FULL_SCAN" //全盘扫描
    const val IS_ELE_SKILLS = "IS_ELE_SKILLS" //用点技巧
    const val IS_POWER_OPTION = "IS_POWER_OPTION" //耗电优化
    const val IS_CAMERA_DETECTION = "IS_CAMERA_DETECTION" //摄像头检测
    const val IS_APP_MANAGER = "IS_APP_MANAGER" //应用管理


    const val IS_SCREEN_POWER = "IS_SCREEN_POWER" //屏幕省电
    const val IS_BATTERY_PROTECT = "IS_BATTERY_PROTECT" //电池体检
    const val IS_PHONE_COOL = "IS_PHONE_COOL" //电池降温
    const val IS_BATTERY_POWER = "IS_BATTERY_POWER" //耗电监控
    const val IS_CHARGING = "IS_CHARGING" // 充电优化
    const val IS_BATTERY_MAINTEN = "IS_BATTERY_MAINTEN" // 电池保养
    const val IS_BATTERY_HEALTH = "IS_BATTERY_HEALTH" // 电池健康
    const val IS_CHARGING_RECORDS = "IS_CHARGING_RECORDS" // 充电记录
    const val IS_PLUG_BLOCKING = "IS_PLUG_BLOCKING" // 插件屏蔽

}
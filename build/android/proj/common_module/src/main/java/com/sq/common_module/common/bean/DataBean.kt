package com.sq.common_module.common.bean

import android.os.Parcelable
import com.sq.common_module.R
import kotlinx.parcelize.Parcelize
import java.util.stream.DoubleStream

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:35
 */
data class InitData(
    val lowOfficialInterval:String,
    val lowLimit: String,
    val officialInterval: Int,
    val lessAdInterval: Int,
    val backToFrontTwice: Int, //后台返前台展示双开屏开关，0-关闭，1-开启
    val isLessAdLimit: Boolean,
    val lessAdLimit: LessAdLimitBean? = null,
    var twiceOpenScreen: Int,
    val IMEI: String,
    var isJlOfficial:Int,
    val isAudit: Boolean,
    val countDownSwitch: Boolean,
    val isShowUseNotice: Boolean,
    val isShowDiscount: Boolean,
    val phoneService: String,
    val countDownText: String,
    val deliveryDes: String,
    val serviceTime: String,
    val myBoxNotice: String,
    val predictMaxIncome: String,
    val myDeliverNotice: String,
    val noticeText: String,
    val percentDesc: String,
    val myDeliverTips: String,
    val videoLink: String,
    val latestVersion: String,
    val latestVersionDesc: String,
    val isPopupUpdate: Int,
    val updateUrl: String,
    val isShowReward: Boolean,
    val recycleDescribe: String,
    val loginBanner: String,
    val aliAppId: String,
    val wxAppId: String,
    val gromoreAppId: String,
    val ksAppId: String,
    val ylhAppId: String,
    val adInfo: RewardAdInfo,
    val xxlLowInfo: RewardAdInfo,
    val screenLowInfo: RewardAdInfo,
    val fullAdInfo: RewardAdInfo,
    val adInfo3: RewardAdInfo,
    val wxTransferNotice: String,
    val lessAd: Boolean,
    val adInfo4: RewardAdInfo,
    val isAlive: Boolean,
    val updateType: Int,
    val downloadUrl: String,
    val toVersion: String,
    val isRealAuth: Boolean,
    val isApplyDelete: Boolean,
    val deleteTime: String,
    val pangleLinkAppId: String,
    val isRiskOpen: Boolean,
    val withdrawPlatformType: Int,//提现平台类型0:汇服八方(现在用的)1:微分(需要调用支付查询接口)
    var showSplashTimes: Int,
    var showSplashSeconds: Int,
    val isRiskOpenReward: Boolean,
    val isRiskOpenWithdraw: Boolean,
    val showAdType: Int,
    val isAutoloadAd: Boolean,
    val jPush: Boolean,
    val planId:String
){
    data class LessAdLimitBean(
        val cqpImgLimit: String?,
        val cqpLimit: String?,
        val cqpVideoLimit: String?,
        val kpLimit: String?,
        val rewardLimit: String?,
        val xxlLimit: String?,
    )
}


data class LoginBean(
    val token: String,
    val uid: String,
    val isCreatedOver24Hours: Boolean
)


data class GuessIdiomsBean(
    val gameLevel: Int,
    val questions: List<QuestionBean>,
    val todayRemainJoinTimes: Int,
    val activityName: String
)

data class QuestionBean(
    val answer: String,
    val answerArr: List<String>,
    val correctAnswerIndex: Int,
    val errorAnswer: String,
    val id: Int,
    val question: List<String>
)


data class MotionRecords(
    val createTime: String,
    val km: String,
    val time: String,
    val kilocalorie: String,
    val step: String
)


data class BigWheelBean(
    val activityName: String,
    val banner: List<String>?,
    val prizes: List<WheelPrizeBean>,
    val remainJoinTimes: Int,
    val rule: String,
    val adFrom: Int,
    val adType: Int,
    val adId: String
)

data class WheelPrizeBean(
    val name: String,
    val pic: String,
    val type: String
)


data class HomeChildBean(
    val activityName: String?,
    val appCode: String?,
    val btnUrl: String?,
    val createdTime: String?,
    val descri: String?,
    val id: Int?,
    val linkUrl: String?,
    val openType: Int?,
    val picUrl: String?,
    val residueSeconds: Int?,
    val scene: String?,
    val sceneDesc: String?,
    val sort: Int?,
    val tag: String?,
    val title: String?,
    val updatedTime: String?
)


data class BaseInfo(
    val avatar: String,
    val coin: String,
    val leftSeconds: Int,
    val amount: String,
    val coinCanExchangeAmount: String,
    val historyWithdrawAmount: String,
    val id: Int,
    val name: String,
    val isBindWx: Boolean,
    val isBindZfb: Boolean,
    val isAddComponent: Int,
    val flowAdInfo: RewardAdInfo,
    val fullAdInfo: RewardAdInfo,
    val activityName: String,
    val toolsCoursePic: String,
    val rule: String?
)

data class CoinWithdrawData(
    val rule: String,
    val userCoin: String,
    val userCoinValue: String,
    val withdrawGoods: List<WithdrawGood>?,
    val fullAdInfo: RewardAdInfo,
    val isBindWx: Boolean,
    val list: List<String>
)

data class WithdrawGood(
    val amount: String?,
    var isDefault: Int?,
    val needCoin: String?
)

data class CoinLogData(
    val changeNum: String,
    val createdTime: String,
    val detailDesc: String,
    val createdAt: String
)

data class NormQuestionData(
    val activityNam: String,
    val questions: List<Question>,
    val todayRemainJoinTimes: Int
)

data class Question(
    val answer: String,
    val answerArr: List<String>,
    val correctAnswerIndex: Int,
    val createdTime: String,
    val errorAnswer: String,
    val id: Int,
    val question: String,
    val sort: Int,
    val type: Int,
    val updatedTime: String
)

@Parcelize
data class GetRewardBean(
    val rewardCoin: String,
    val userCoin: String,
    val rewardType: Int,
    //0 无任何奖励 1 奖励现金豆 2 奖励现金 3 奖励摇一摇金币 4 奖励摇一摇现金 5奖励百元活动现金 6奖励猜成语体力
    // 7 奖励猜成语答案 8 提现额度 9 奖励手机碎片 10 抽手机特权卡 11 抽手机参与次数 12 直接提现
    val nextCanJoinActivityName: String,
    val rewardLogId: Int,
    val nextJoinTime: String,
    val userAmount: String,
    val rewardArrIndex: Int,
//    val adFrom: Int,
    val adUnitType: Int,
    val adUnitId: String,
    val nextActivityAdNetwork: Int,
    val nextActivityAdUnitType: Int,
    val nextActivityAdUnitId: String,
    val currentActivityName: String,
    val rewardCoinAmount: String,
    val distanceToLowestWithdrawAmount: String,
    val adNetwork: Int,
    val quickWithdrawAmount: String?,
    val withdrawOrderId: String,


    ) : Parcelable

data class LuckyFlopBean(
    val activityName: String,
    val adFrom: Int,
    val adId: String,
    val adType: Int,
    val remainJoinTimes: Int,
    val rule: String
)

data class WithdrawalBean(
    val userCoin: String,
    val userAmount: String,
    val rule: String,
    val userBindWx: Boolean,
    val userBindZfb: Boolean,
    val activityName: String,
    val unlockAdFrom: Int,
    val unlockAdType: Int,
    val unlockAdId: String,
    val adFrom: Int,
    val adType: Int,
    val adId: String,
    val OpSite: List<String>,
    val tomorrowQuickWithdraw: TomorrowQuickWithdrawBean?,
    val withdrawGoods: List<WithdrawalListBean>
)

data class TomorrowQuickWithdrawBean(
    val bannerPic: String,
    val activityName: String,
    val adFrom: Int,
    val adType: Int,
    val adId: String,
    val isUnlockTomorrowWithdrawAmount: Boolean
)

data class WithdrawalListBean(
    val withdrawRowId: Int,
    val withdrawAmount: String,
    val isTodayCanWithdraw: Boolean,
    val unlockStatus: Int,
    val validDay: String,
    val withdrawType: String,
    val desc: String
)

data class WithdrawHistoryListBean(
    val statusDesc: String,
    val typeDesc: String,
    val createdTime: String,
    val applyNum: String,
    val amount: String
)

data class WithdrawBulletScreenListBean(
    val amount: String,
    val nickName: String,
    val timeDesc: String
)

data class RedRainPreBean(
    val adFrom: Int,
    val adType: Int,
    val adId: String,
    val activityName: String,
    val rule: String
)

data class SignPreData(
    val activityName: String,
    val adNetwork: Int,
    val adUnitId: String,
    val adUnitType: Int,
    val currentAmount: String,
    val distanceToEndDays: Int,
    val distanceToHundredAmount: String,
    val joinDay: String,
    val remainJoinTimes: Int,
    val rule: String,
    val signActivityName: String,
    val signData: List<SignData>,
    val todayExtTimesInfo: TodayExtTimesInfo,
    val todayIsSign: Boolean,
    val todaySignIndex: Int,
    val isFirstJoin: Boolean,
    val isReset: Boolean,
    val list: List<HundredListBean>
)

data class HundredListBean(
    val avatar: String,
    val text: String
)

data class TodayExtTimesInfo(
    val idiomQuestion: IdiomQuestion,
    val luckyTurnTable: LuckyTurnTable,
    val redBagRain: RedBagRain
)

data class IdiomQuestion(
    val activityName: String,
    val btnPic: String,
    val desc: String,
    val joinTimes: Int,
    val needJoinTimes: Int,
    val picUrl: String,
    val rewardAmount: String,
    val title: String
)

data class LuckyTurnTable(
    val activityName: String,
    val btnPic: String,
    val desc: String,
    val joinTimes: Int,
    val needJoinTimes: Int,
    val picUrl: String,
    val rewardAmount: String,
    val title: String
)

data class RedBagRain(
    val activityName: String,
    val btnPic: String,
    val desc: String,
    val joinTimes: Int,
    val needJoinTimes: Int,
    val picUrl: String,
    val rewardAmount: String,
    val title: String
)

data class SignData(
    val amount: String,
    val isSign: Boolean
)

data class HundredRewardLogData(
    val logs: List<RewardLog>
)

data class RewardLog(
    val newAmount: String,
    val rewardAmount: String,
    val type: Int,
    val createdAt: String
)

data class ReportFlagBean(
    val reportFlag: Boolean,
    val registerReportFlag: Boolean,
    val keepFlag: Boolean
)

data class WfWithdrawBean(
    val status: Int,//状态0:提现中1:提现成功2:提现失败，提现账户异常，具体原因请查看《活动规则》内的异常说明。
)


data class ToWIfiPageBean(
    val isInformationFlow: Boolean,
    val isUsedWifiEnhancedSignal: Boolean,
    val isUsedWifiFlowProtection: Boolean,
    val isUsedWifiFluency: Boolean,
    val isUsedWifiGuard: Boolean,
    val isUsedWifiPreventNetwork: Boolean,
    val isUsedWifiStrengthNetwork: Boolean,
    val isUsedWifiSystemNetwork: Boolean,

    var isUsedCleanWechat: Boolean,
    var isUsedCleanRubbish: Boolean,
    var isUsedCleanVirusDetection: Boolean,
    var isUsedCleanBatterySaving: Boolean,
    var isUsedCleanSpeedUp: Boolean,
    var isUsedCleanFluency: Boolean,
    var isUsedCleanAdClean: Boolean,
)

data class ToadyWeatherBean(
    val tips: String,
    val air_tips: String,
    val temperatureDiff1: String,
    val temperatureDiff2: String,
    val fate: FateX,
    val almanac: Almanac,
    val infoAdInfo: WInfoAdInfo,
    val life: Life,
    val realTimeWeather: RealTimeWeather,
    val weekWeather: WeekWeather
)

data class WInfoAdInfo(
    val adNetwork: Int,
    val adSiteId: String,
    val adUnitId: String,
    val adUnitType: Int,
    val openAppCodeId: String
)

/**
 * 'aries' => '白羊座'
 * 'taurus' => '金牛座'
 * 'gemini' => '双子座'
 * 'cancer' => '巨蟹座'
 * 'leo' => '狮子座'
 * 'virgo' => '处女座'
 * 'libra' => '天秤座'
 * 'scorpio' => '天蝎座'
 * 'sagittarius' => '射手座'
 * 'capricorn' => '摩羯座'
 * 'aquarius' => '水瓶座'
 * 'pisces' => '双鱼座'
 */
data class FateX(
    val aquarius: Aquarius?,
    val aries: Aries?,
    val cancer: Cancer?,
    val capricorn: Capricorn?,
    val gemini: Gemini?,
    val leo: Leo?,
    val libra: Libra?,
    val pisces: Pisces?,
    val sagittarius: Sagittarius?,
    val scorpio: Scorpio?,
    val taurus: Taurus?,
    val virgo: Virgo?
)

data class Aquarius(
    val star: Int?,
    val tips: String?
)

data class Aries(
    val star: Int?,
    val tips: String?
)

data class Cancer(
    val star: Int?,
    val tips: String?
)

data class Capricorn(
    val star: Int?,
    val tips: String?
)

data class Gemini(
    val star: Int?,
    val tips: String?
)

data class Leo(
    val star: Int?,
    val tips: String?
)

data class Libra(
    val star: Int?,
    val tips: String?
)

data class Pisces(
    val star: Int?,
    val tips: String?
)

data class Sagittarius(
    val star: Int?,
    val tips: String?
)

data class Scorpio(
    val star: Int?,
    val tips: String?
)

data class Taurus(
    val star: Int?,
    val tips: String?
)

data class Virgo(
    val star: Int?,
    val tips: String?
)

data class Almanac(
    val nongli: String?,
    val yi: String?,
    val ji: String?
)

data class Life(
    val city: String?,
    val cityid: String?,
    val `data`: LifeData?,
    val update_time: String?
)

data class RealTimeWeather(
    val city: String?,
    val cityid: String?,
    val country: String?,
    val day: Day?,
    val errcode: Int?,
    val errmsg: String?,
    val hours: List<Hour>?,
    val latitude: String?,
    val leader: String?,
    val longitude: String?,
    val month: List<Month>?,
    val timeZone: String?,
    val updateTime: String?,
    val updateTimeFormat: String?,
    val updateTimeServer: String?
)

data class WeekWeather(
    val aqi: Aqi?,
    val city: String?,
    val cityEn: String?,
    val cityid: String?,
    val country: String?,
    val countryEn: String?,
    val `data`: List<WeekX>?,
    val nums: Int?,
    val update_time: String?
)

data class LifeData(
    val chenlian: Chenlian?,
    val chuanyi: Chuanyi?,
    val diaoyu: Diaoyu?,
    val fangshai: Fangshai?,
    val fenghan: Fenghan?,
    val fengzheng: Fengzheng?,
    val ganmao: Ganmao?,
    val ganzao: Ganzao?,
    val guangjie: Guangjie?,
    val guomin: Guomin?,
    val huachuan: Huachuan?,
    val huazhuang: Huazhuang?,
    val jiaotong: Jiaotong?,
    val kongtiao: Kongtiao?,
    val kouzhao: Kouzhao?,
    val liangshai: Liangshai?,
    val lukuang: Lukuang?,
    val lvyou: Lvyou?,
    val meifa: Meifa?,
    val pijiu: Pijiu?,
    val shushidu: Shushidu?,
    val taiyangjing: Taiyangjing?,
    val wuran: Wuran?,
    val xiche: Xiche?,
    val xinqing: Xinqing?,
    val yeshenghuo: Yeshenghuo?,
    val yuehui: Yuehui?,
    val yundong: Yundong?,
    val yusan: Yusan?,
    val zhongshu: Zhongshu?,
    val ziwaixian: Ziwaixian?
)

data class Chenlian(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Chuanyi(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Diaoyu(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Fangshai(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Fenghan(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Fengzheng(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Ganmao(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Ganzao(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Guangjie(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Guomin(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Huachuan(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Huazhuang(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Jiaotong(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Kongtiao(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Kouzhao(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Liangshai(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Lukuang(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Lvyou(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Meifa(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Pijiu(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Shushidu(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Taiyangjing(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Wuran(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Xiche(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Xinqing(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Yeshenghuo(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Yuehui(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Yundong(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Yusan(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Zhongshu(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Ziwaixian(
    val desc: String?,
    val level: String?,
    val name: String?
)

data class Day(
    val air: String?,
    val air_level: String?,
    val alarm: List<Any>?,
    val altimeter: String?,
    val aqi: Aqi?,
    val barometerTrend: String?,
    val dewPoint: String?,
    val feelsLike: String?,
    val humidity: String?,
    val icon: String?,
    val phrase: String?,
    val phrase_img: String?,
    val temperature: String?,
    val temperatureMaxSince7am: String?,
    val uvDescription: String?,
    val uvIndex: String?,
    val visibility: String?,
    val windDirCompass: String?,
    val windDirDegrees: String?,
    val windLevel: String?,
    val windSpeed: String?
)

data class Hour(
    val air: String?,
    val cloudCover: Int?,
    val dayOfWeek: String?,
    val dayOrNight: String?,
    val humidity: Int?,
    val icon: Int?,
    val precipPct: Int?,
    val pressure: Double?,
    val rain_pcpn: String?,
    val tem: Int?,
    val temfeels: Int?,
    val time: String?,
    val timeUtc: Int?,
    val uvIndex: Int?,
    val visibility: Float?,
    val wea: String?,
    val wea_img: String?,
    val wind: String?,
    val windLevel: String?,
    val windSpeed: Int?
)

data class Month(
    val air: String?,
    val date: String?,
    val dateOfWeek: String?,
    val day: DayX?,
    val moonIcon: String?,
    val moonPhrase: String?,
    val moonrise: String?,
    val moonset: String?,
    val night: Night?,
    val rain_pcpn: String?,
    val sunrise: String?,
    val sunset: String?
)

data class Aqi(
    val air: String?,
    val air_level: String?,
    val air_tips: String?,
    val city: String?,
    val cityEn: String?,
    val cityid: String?,
    val co: String?,
    val co_desc: String?,
    val country: String?,
    val countryEn: String?,
    val jinghuaqi: String?,
    val kaichuang: String?,
    val kouzhao: String?,
    val no2: String?,
    val no2_desc: String?,
    val o3: String?,
    val o3_desc: String?,
    val pm10: String?,
    val pm10_desc: String?,
    val pm25: String?,
    val pm25_desc: String?,
    val so2: String?,
    val so2_desc: String?,
    val update_time: String?,
    val waichu: String?,
    val yundong: String?
)

data class DayX(
    val cloudPct: String?,
    val humidity: String?,
    val icon: String?,
    val narrative: String?,
    val phrase: String?,
    val phrase_img: String?,
    val precipPct: String?,
    val precipType: String?,
    val temperature: String?,
    val uvDescription: String?,
    val uvIndex: String?,
    val windDirCompass: String?,
    val windDirDegrees: String?,
    val windLevel: String?,
    val windPhrase: String?,
    val windSpeed: String?
)

data class Night(
    val cloudPct: String?,
    val humidity: String?,
    val icon: String?,
    val narrative: String?,
    val phrase: String?,
    val phrase_img: String?,
    val precipPct: String?,
    val precipType: String?,
    val temperature: String?,
    val uvDescription: String?,
    val uvIndex: String?,
    val windDirCompass: String?,
    val windDirDegrees: String?,
    val windLevel: String?,
    val windPhrase: String?,
    val windSpeed: String?
)

data class WeekX(
    val air: String?,
    val air_level: String?,
    val air_tips: String?,
    val alarm: List<Any>?,
    val date: String?,
    val day: String?,
    val hours: List<HourX>?,
    val humidity: String?,
    val index: List<Index>?,
    val moonPhrase: String?,
    val moonrise: String?,
    val moonset: String?,
    val narrative: String?,
    val phrase: String?,
    val pressure: String?,
    val rain: String?,
    val rain_pcpn: String?,
    val sunrise: String?,
    val sunset: String?,
    val tem: String?,
    val tem1: String?,
    val tem2: String?,
    val uvDescription: String?,
    val uvIndex: String?,
    val visibility: String?,
    val wea: String?,
    val wea_day: String?,
    val wea_day_img: String?,
    val wea_img: String?,
    val wea_night: String?,
    val wea_night_img: String?,
    val week: String?,
    val win: List<String>?,
    val win_meter: String?,
    val win_speed: String?
)

data class HourX(
    val hours: String?,
    val tem: String?,
    val wea: String?,
    val wea_img: String?,
    val win: String?,
    val win_speed: String?
)

data class Index(
    val desc: String?,
    val level: String?,
    val title: String?
)

data class CurrentWeatherBean(
    val day: CurrentDayBean?,
    val max: Int?,
    val min: Int?,
    val night: CurrentNightBean?,
    var area: String? = "",
    var areaId: Int = 0
)

data class CurrentDayBean(
    val phrase: String?,
    val phrase_img: String?
)

data class CurrentNightBean(
    val phrase: String?,
    val phrase_img: String?
)

data class SystemCheckBean(
    val isRisk: Boolean,
    val splashInfo: RewardAdInfo,
    val twiceOpenScreenInfo: RewardAdInfo,
    val xxlLowInfo:RewardAdInfo,
    val screenLowInfo:RewardAdInfo,
    val feedInfo: RewardAdInfo,
    val fullInfo: RewardAdInfo,
    val rewardInfo: RewardAdInfo,
    val screenVideoInfo: RewardAdInfo,
    val screenImageInfo: RewardAdInfo,
)
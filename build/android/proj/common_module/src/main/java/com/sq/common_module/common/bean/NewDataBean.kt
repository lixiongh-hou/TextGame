package com.sq.common_module.common.bean

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by town
 * Date :  2022/12/23
 * Time : 15:32
 */
@Parcelize
data class GuessPreBean(
    val activities: List<GuessActivity>,
    val getReward: RewardAdInfo,
    val getTimes: Int,
    val idiomQuestionLevel: Int,
    val idiomQuestionProgress: Int,
    val leftTime: Int,
    val levelMap: List<LevelMap>,
    val questions: List<GuessQuestionBean>,
    val skipReward: RewardAdInfo,
    val infoAd: RewardAdInfo,
    val todayTimes: Int,
    val nextLevelNeedRounds: Int,
    val isBindWx: Boolean,
) : Parcelable

@Parcelize
data class GuessActivity(
    val key: String,
    val describe: String,
) : Parcelable

@Parcelize
data class LevelMap(
    var isGetToday: Boolean,
    val level: Int,
    val name: String,
    val salary: Int,
) : Parcelable

@Parcelize
data class GuessQuestionBean(
    val answer: String,
    val answerArr: List<String>,
    val correctAnswerIndex: Int,
    val errorAnswer: String,
    val idx1: Int,
    val id: Int,
    val question: List<String>,
    val sort: Int,
    val type: Int,
) : Parcelable

@Parcelize
data class RewardAdInfo(
    val adNetwork: Int,
    val adSiteId: String,
    val adUnitId: String,
    val adUnitType: Int,
    val openAppCodeId: String?,
) : Parcelable

@Parcelize
data class ShakePreBean(
    val shakeCoin: String,
    val shakeAmount: String,
    val leftSeconds: Int,
    val times: String,
    val nextExtra: Int,
    val activityName: List<GuessActivity>,
    val list: List<ShakeListBean>,
    val list2: List<ShakeListBean>,
    val isFirstJoin: Boolean,
    val isReset: Boolean,
    val getReward: RewardAdInfo,
    val skipReward: RewardAdInfo,
    val progress: String,
    val oneDayLeftSeconds: Int,
    val isBindWx: Boolean,
    val rule: String,
) : Parcelable

@Parcelize
data class ShakeListBean(
    val phone: String, val text: String,
) : Parcelable


data class NineGridPreBean(
    val isTodayFirst: Boolean,
    var remainJoinTimes: Int,
    val pieces: String,
    val isAddTimes: Boolean,
    val joinTimesProgress1: Int,
    val joinTimesProgress2: Int,
    val joinTimesProgress3: Int,
    val progress0CanGet: Boolean,
    val progress1CanGet: Boolean,
    val progress2CanGet: Boolean,
    val progress3CanGet: Boolean,
    val getReward: RewardAdInfo,
    val skipReward: RewardAdInfo,
    val adInfo: RewardAdInfo,
    val prizes: List<NineGridPrizeBean>,
    val activityNames: List<GuessActivity>,
    val rule: String,
    val name: String,
    val img: List<String>,
    val list: List<ShakeListBean>,
)

data class NineGridPrizeBean(
    var name: String,
    val pic: String,
    val type: String,
    val num: String,
    val progress: Int? = null,
)

data class ShakeRewardLogBean(
    val changeNum: String,
    val typeDesc: String,
    val createdTime: String,
    val createdAt: String,
    val detailDesc: String,
    val accountType: Int,
)

@Parcelize
data class NewHomeBean(
    val fixedFloat: List<FixedFloatBean>,
    val float: List<FixedFloatBean>,
    val hotActivities: List<String>,
    val howToEarnMoney: String,
    val middleOpSite: MiddleOpSiteBean,
    val showNewUserWithdraw: Boolean,
    val showSevenDayPopup: Boolean,
    val topFloatActivity: List<TopFloatActivity>,
    val uid: Int,
    val userAmount: String,
    val userCoin: String,
    val watchAdWithdraw: MiddleOpSiteBean,
    val flowAdInfo: RewardAdInfo,
    val fullAdInfo: RewardAdInfo,
    val stimulateAdInfo: RewardAdInfo,
    val todayGetCashRedBagTimes: Int,
    val isRedBagForNew: Boolean,
    val isBindWx: Boolean,
    val isBindZfb: Boolean,
    val isFirstIn: Boolean,
    val list: List<String>,
    val listNew: List<ListNew>,
    val todayIsSign: Boolean,
    val todayIsJoinTwoDaysQuickWithdraw: Boolean,

    ) : Parcelable

@Parcelize
data class FixedFloatBean(
    val activityName: String,
    val appCode: String,
    val btnUrl: String,
    val createdTime: String,
    val descri: String,
    val id: Int,
    val linkUrl: String,
    val openType: Int,
    val picUrl: String,
    val scene: String,
    val sceneDesc: String,
    val sort: Int,
    val tag: String,
    val title: String,
    val updatedTime: String,
) : Parcelable

@Parcelize
data class MiddleOpSiteBean(
    val buttonPic: String,
    val desc: String,
    val pic: String,
    val toUrl: String,
    val watchTimes: Int?,
    val needWatchTimes: Int?,
    val todayWatchTimes: Int?,

    ) : Parcelable

@Parcelize
data class ListNew(
    val phone: String,
    val amount: String,
) : Parcelable

@Parcelize
data class TopFloatActivity(
    val activityName: String,
    val name: String,
    val pic: String,
    val rewardCoin: String,
    val url: String,
) : Parcelable


data class EverySignPreBean(
    val activityName: String,
    val adNetwork: Int,
    val adUnitId: String,
    val adUnitType: Int,
    val rule: String,
    val signInfo: List<SignInfo>,
    val flowAdNetwork: Int,
    val flowAdUnitType: Int,
    val flowAdUnitId: String,
    val signDays: Int,
    val todayIsSign: Boolean,
    val todaySignRewardAmount: String,
)

data class SignInfo(
    val amount: String,
    val index: Int,
    val isGet: Boolean,
    val isToday: Boolean,
)

data class CashRedPreBean(
    val todayGetCashRedBagLimitTimes: Int,
    val todayGetCashRedBagTimes: Int,
    val flowAdInfo: RewardAdInfo,
    val fullAdInfo: RewardAdInfo,
    val stimulateAdInfo: RewardAdInfo,
    val redBagType: Int,
    val watchWithdrawInfo: MiddleOpSiteBean,
    val activityName: String,
    val showWithdrawSign: Boolean,
    val showDailySign: Boolean,
)

data class CashRedWheelBean(
    val activityName: String,
    val prizes: List<NineGridPrizeBean>,
)

data class CashRedWheelPrizeBean(
    val title: String,
    val amount: String,
)


data class HomeWithdrawalBean(
    val adNetwork: Int,
    val adSiteId: String,
    val adUnitType: Int,
    val rule: String,
    val twoDaysWithdrawBanner: String,
    val userAmount: String,
    val userBindWx: Boolean,
    val userBindZfb: Boolean,
    val watchAdWithdraw: WatchAdWithdrawBean,
    val withdrawGoods: List<WithdrawGoodBean>,
    val stimulateAdInfo: RewardAdInfo,
    val fullAdInfo: RewardAdInfo,
    val flowAdInfo: RewardAdInfo,
    val isGetNewUserQuicklyWithdraw: Boolean,
    val list: List<String>?,
)

data class WatchAdWithdrawBean(
    val buttonPic: String,
    val desc: String,
    val needWatchTimes: Int,
    val pic: String,
    val toUrl: String,
    val watchTimes: Int,
    val todayWatchTimes: Int,
)

data class WithdrawGoodBean(
    val activityName: String,
    val btnPic: String,
    val canWithdraw: Boolean,
    val desc: String,
    val isSecondDay: Boolean,
    val tag: String,
    val watchAdTimes: Int,
    val withdrawAmount: String,
    val withdrawType: String,
    val subTitle: String,
)

data class NewRainRedBean(
    val remainJoinTimes: Int,
    val activityName: String,
    val adInfo: RewardAdInfo,
)


data class WithdrawForNewPreBean(
    val activityName: String,
    val isBindWx: Boolean,
    val isBindZfb: Boolean,
    val adInfo: RewardAdInfo,
)


data class ShakeWithdrawalBean(
    val shakeCoin: String,
    val shakeCoinAmount: String,
    val withdrawList: List<ShakeWithdrawalListBean>,
    val bullets: List<BulletsListBean>,
    val isBindWx: Boolean,
    val isBindZfb: Boolean,
    val rule: String?,
)

data class ShakeWithdrawalListBean(
    val status: Int,
    val amount: String,
    val shakeAmount: String,
    val rewardNum: Int,
    val title: String,
)

data class BulletsListBean(
    val name: String,
    val amount: String,
)

data class AliSignBean(
    val isBindZfb: Boolean,
    val signInfo: List<AliSingInfo>,
    val activityName: String,
    val rule: String,
    val flowAdInfo: RewardAdInfo,
)

data class AliSingInfo(
    val withdrawAmount: String,
    val day: String,
    val isGet: Boolean,
    val amount: String,
    val isToday: Boolean,
)

@Parcelize
data class UserHierarchyBean(
    val watchedCount: Int,
    val needWatch: Int,
    val canWithdraw: Boolean,
    val adInfo: RewardAdInfo,
) : Parcelable

data class CheckRiskBean(val actionType: Int)

@Parcelize
data class WifiPreBean(
    val activities: List<ActionListBean>,
    val dimension: List<DimensionBean>,
    val clean: List<ActionListBean>,
    val cleanTools: List<DimensionBean>,
    val cleanV2: List<DimensionBean>,
    val items: List<DimensionBean>,
    val infoAd: RewardAdInfo,
    val isWatchAdFirst: Boolean,
    val rewardAd: RewardAdInfo,
    val skipReward: RewardAdInfo,
    val tools: List<DimensionBean>,
    val wifiList: List<String>,
    val uid: Int,
) : Parcelable

@Parcelize
data class ActionListBean(
    val describe: String,
    val isUse: Boolean,
    val key: String,
) : Parcelable

@Parcelize
data class DimensionBean(
    val isUse: Boolean,
    val key: String,
    val name: String,
    val tag: String,
) : Parcelable

@Parcelize
data class CityListBean(
    val city: String,
    val country: String,
    val isMy: Int,
    var showTag: Boolean,
    val leader: String,
    val maxTem: String,
    val minTem: String,
    val nowTem: Int,
    val regionCode: Long,
    val wea: String,
    val wea_icon: String,
    val wea_img: String,
    val air: Int,
    val air_level: String
) : Parcelable

@Parcelize
data class SelectCityBean(
    val letterData: List<String>,
    val regionData: List<RegionData>
) : Parcelable

@Parcelize
data class RegionData(
    val list: List<CityNameBean>,
    val nameFirst: String
) : Parcelable

@Parcelize
data class CityNameBean(
    val code: String,
    val level: Int,
    val name: String,
    val nameFirst: String
) : Parcelable
package com.sq.common_module.common.event

/**
 * Created by town
 * Date :  2022/10/26
 * Time : 18:20
 */
class ImageUpDataView()
class DeleteFileByPermissionEvent()
class AgreePrivacyEvent()
class SHowFullEvent()
class ShowDataListEvent(val type:Int)

class GuessChallengeAgainEvent()

class GuessCorrectTipsEvent()

class HomeRefreshEvent(val isHomeLucky: Boolean? = false)

class CashDoubleResultEvent(val showRedAnimator: Boolean? = false)

class HomeCashRedDownTimeEvent()

class WXLoginEvent(val code: String)

class NewPeopleEvent(val isDraw: Boolean = false)

class BindZfbEvent()

class CloseWithdrawalDialogEvent()

//"showWithdrawSign":true,//是否展示支付宝提现签到
//	"showDailySign":true,//是否展示每日签到
class HomeShowFullAdEvent(val type: Int, val showDailySign: Boolean, val showWithdrawSign: Boolean)

class RefreshWithdrawalDialogEvent()

class DismissNewPersonDialog

class CancelUpdateEvent()

class SmallCashEvent(val amount: String)

class TTInitCallBackEvent(val initSuccess: Boolean, val duration: Long)

class WifiTestResultEvent(val speed: String)

class GuideOptResultEvent(val type: Int)

class HomeAliSingGetEvent()

class OptBackFullAd

class ChangeXZEvent(val xz: String)

class SwitchTabEvent(val index: Int)
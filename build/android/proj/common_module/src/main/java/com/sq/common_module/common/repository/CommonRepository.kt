package com.sq.common_module.common.repository

import com.google.gson.JsonObject
import com.sq.common_module.common.bean.*
import com.sq.common_module.common.utils.http.ApiService
import com.sq.common_module.common.utils.http.BaseResult
import com.sq.common_module.common.utils.kt.getRequestBody
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

/**
 * Created by town
 * Date :  2022/10/24
 * Time : 18:21
 */
class CommonRepository @Inject constructor(private val apiService: ApiService) {

    fun getInitData(): Observable<BaseResult<InitData>> = apiService.getInitData()

    fun toLogin(): Observable<BaseResult<LoginBean>> = apiService.toLogin()

    fun getCompany(keyword: String): Observable<BaseResult<List<CompanyBean>>> {
        val map = HashMap<String, String>()
        map["keyword"] = keyword
        return apiService.getCompany(getRequestBody(map))
    }

    fun getEnterpriseInfo(creditNo: String): Observable<BaseResult<EnterpriseInfoBean>> {
        val map = HashMap<String, String>()
        map["creditNo"] = creditNo
        return apiService.getEnterpriseInfo(getRequestBody(map))
    }

    fun getGuessData(): Observable<BaseResult<GuessIdiomsBean>> = apiService.getGuessData()

    fun saveUserActivityLog(activityName: String): Observable<BaseResult<JsonObject>> {
        val map = HashMap<String, String>()
        map["activityName"] = activityName
        return apiService.saveUserActivityLog(getRequestBody(map))
    }

    fun getLuckyTurnTablePreData(): Observable<BaseResult<BigWheelBean>> =
        apiService.getLuckyTurnTablePreData()

    fun getHomeData(): Observable<BaseResult<NewHomeBean>> = apiService.getHomeData()

    fun baseInfo(): Observable<BaseResult<BaseInfo>> = apiService.baseInfo()

    fun getUserCoinLog(): Observable<BaseResult<List<CoinLogData>>> = apiService.getUserCoinLog()

    fun getHundredRewardLog(): Observable<BaseResult<HundredRewardLogData>> =
        apiService.getHundredRewardLog()

    fun getCoinWithdrawData(): Observable<BaseResult<CoinWithdrawData>> =
        apiService.getCoinWithdrawData()

    fun getNormQuestionList(): Observable<BaseResult<NormQuestionData>> =
        apiService.getNormQuestionList()

    fun getRewardByActivity(
        transId: String,
        ecpm: String,
        activityName: String,
        logId: Int? = null,
        coin: String? = null,
        withdrawTypestring: String? = null
    ): Observable<BaseResult<GetRewardBean>> {
        val map = HashMap<String, String>()
        map["transId"] = transId
        map["ecpm"] = ecpm
        map["activityName"] = activityName
        if (logId == null) map["logId"] = "0" else map["logId"] = logId.toString()
        coin?.let { map["coin"] = it }
        withdrawTypestring?.let { map["withdrawType"] = it }
        return apiService.getRewardByActivity(getRequestBody(map))
    }

    fun syncAdInfo(
        transId: String,
        adNetwork: Int,
        adUnitType: Int,
        ecpm: String,
        activityName: String,
        isClick: Int,
        adSiteId: String,
        adUnitId: String,
        isEnd: Int? = null,
        status: Int,
        slotId: String? = null
    ): Observable<BaseResult<ReportFlagBean>> {
        val map = HashMap<String, String>()
        map["transId"] = transId
        map["ecpm"] = ecpm
        map["activityName"] = activityName
        map["adNetwork"] = adNetwork.toString()
        map["adUnitType"] = adUnitType.toString()
        map["isClick"] = isClick.toString()
        map["adSiteId"] = adSiteId
        map["adUnitId"] = adUnitId
        map["status"] = status.toString()
        isEnd?.let {
            map["isEnd"] = it.toString()
        }
        slotId?.let {
            map["adSlotId"] = it
        }

        return apiService.syncAdInfo(getRequestBody(map))
    }

    fun getDrawCardPreBean(): Observable<BaseResult<LuckyFlopBean>> =
        apiService.getDrawCardPreBean()

    fun getDailyRedPreBean(): Observable<BaseResult<LuckyFlopBean>> =
        apiService.getDailyRedPreBean()

    fun getWithdrawalPreBean(): Observable<BaseResult<WithdrawalBean>> =
        apiService.getWithdrawalPreBean()

    fun submitWithdrawal(
        amount: String,
        isQuickWithdraw: Int,
        payType: String
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["amount"] = amount
        map["isQuickWithdraw"] = isQuickWithdraw.toString()
        //快速提现传1  其他传0
        map["withdrawType"] = payType
        return apiService.submitWithdrawal(getRequestBody(map))
    }

    fun getWithdrawHistoryBean(page: Int): Observable<BaseResult<List<WithdrawHistoryListBean>>> {
        val map = HashMap<String, String>()
        map["page"] = page.toString()
        return apiService.getWithdrawHistoryBean(getRequestBody(map))
    }

    fun getWithdrawBulletScreenBean(): Observable<BaseResult<List<WithdrawBulletScreenListBean>>> =
        apiService.getWithdrawBulletScreenBean()


    fun getRedRainPreBean(): Observable<BaseResult<RedRainPreBean>> = apiService.getRedRainPreBean()


    fun getGuessPreData(): Observable<BaseResult<GuessPreBean>> = apiService.getGuessPreData()

    fun submitCoinWithdraw(
        withdrawCoinNum: String,
        withdrawAmount: String
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["withdrawCoinNum"] = withdrawCoinNum
        map["withdrawAmount"] = withdrawAmount
        return apiService.submitCoinWithdraw(getRequestBody(map))
    }

    fun loginOut(): Observable<BaseResult<List<String>>> {
        return apiService.loginOut()
    }

    fun sendCode(phone: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["phone"] = phone
        return apiService.sendCode(getRequestBody(map))
    }


    fun bindPhone(
        phone: String = "",
        code: String = "",
        shanYanToken: String = "",
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        phone.isNotEmpty().apply {
            map["phone"] = phone
        }
        code.isNotEmpty().apply {
            map["code"] = code
        }
        shanYanToken.isNotEmpty().apply {
            map["shanYanToken"] = shanYanToken
        }
        return apiService.bindPhone(getRequestBody(map))
    }

    fun deleteSelf(): Observable<BaseResult<List<String>>> {
        return apiService.deleteSelf()
    }

    fun getHundredSignPreData(): Observable<BaseResult<SignPreData>> {
        return apiService.getHundredSignPreData()
    }

    fun abandonGuessAction(): Observable<BaseResult<List<String>>> = apiService.abandonGuessAction()

    fun getShakePreData(): Observable<BaseResult<ShakePreBean>> = apiService.getShakePreData()

    fun getNineGridPreData(): Observable<BaseResult<NineGridPreBean>> =
        apiService.getNineGridPreData()

    fun getShakeRewardLog(): Observable<BaseResult<List<ShakeRewardLogBean>>> =
        apiService.getShakeRewardLog()

    fun getSignPreData(): Observable<BaseResult<EverySignPreBean>> = apiService.getSignPreData()

    fun getCashRedBagPreData(): Observable<BaseResult<CashRedPreBean>> =
        apiService.getCashRedBagPreData()

    fun getWatchWithdrawPreData(): Observable<BaseResult<CashRedWheelBean>> =
        apiService.getWatchWithdrawPreData()

    fun abandonCashRedWheel(): Observable<BaseResult<List<String>>> =
        apiService.abandonCashRedWheel()

    fun getWithdrawalData(): Observable<BaseResult<HomeWithdrawalBean>> =
        apiService.getWithdrawalData()

    fun getNewRedRainPreData(): Observable<BaseResult<NewRainRedBean>> =
        apiService.getNewRedRainPreData()

    fun upDateUserInfo(isAddComponent: Int): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["isAddComponent"] = isAddComponent.toString()
        return apiService.upDateUserInfo(getRequestBody(map))
    }

    fun bindWx(appId: String, code: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["appId"] = appId
        map["code"] = code
        return apiService.bindWx(getRequestBody(map))
    }

    fun bindZfb(appId: String, token: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["appId"] = appId
        map["token"] = token
        return apiService.bindZfb(getRequestBody(map))
    }

    fun getWithdrawForNewPreData(): Observable<BaseResult<WithdrawForNewPreBean>> =
        apiService.getWithdrawForNewPreData()

    fun getShakeWithdrawInfo(): Observable<BaseResult<ShakeWithdrawalBean>> =
        apiService.getShakeWithdrawInfo()

    fun getDailyWithdrawReward(rewardNum: Int): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["rewardNum"] = rewardNum.toString()
        return apiService.getDailyWithdrawReward(getRequestBody(map))
    }

    fun submitShakeWithdraw(amount: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["amount"] = amount
        return apiService.submitShakeWithdraw(getRequestBody(map))
    }

    fun unbindAccount(): Observable<BaseResult<List<String>>> = apiService.unbindAccount()
    fun unbindPhone(): Observable<BaseResult<List<String>>> = apiService.unbindPhone()
    fun getZfbSevenSignData(): Observable<BaseResult<AliSignBean>> =
        apiService.getZfbSevenSignData()


    fun loadAdFailLog(
        adNetwork: Int,
        adUnitId: String,
        errCode: String,
        errMsg: String
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["adNetwork"] = adNetwork.toString()
        map["adUnitId"] = adUnitId
        map["errCode"] = errCode
        map["errMsg"] = errMsg
        return apiService.loadAdFailLog(getRequestBody(map))
    }

    fun getUserVipInfo(): Observable<BaseResult<UseVipBean>> = apiService.getUserVipInfo()

    fun getUserHierarchyData(): Observable<BaseResult<UserHierarchyBean>> =
        apiService.getUserHierarchyData()

    fun toRealAuth(realName: String, idNo: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["realName"] = realName
        map["idNo"] = idNo
        return apiService.toRealAuth(getRequestBody(map))
    }

    fun delayDeleteSelf(): Observable<BaseResult<List<String>>> = apiService.delayDeleteSelf()

    fun cancelDeleteSelf(): Observable<BaseResult<List<String>>> = apiService.cancelDeleteSelf()


    fun keepAliveLog(actionType: Int): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["actionType"] = actionType.toString()
        return apiService.keepAliveLog(getRequestBody(map))
    }

    fun checkRisk(tdBlackBox: String, scene: String): Observable<BaseResult<CheckRiskBean>> {
        val map = HashMap<String, String>()
        map["tdBlackBox"] = tdBlackBox
        map["scene"] = scene
        return apiService.checkRisk(getRequestBody(map))
    }

    fun getWifiPreData(): Observable<BaseResult<WifiPreBean>> = apiService.getWifiPreData()


    fun queryWfWithdrawResult(thirdOrderId: String): Observable<BaseResult<WfWithdrawBean>> {
        val map = HashMap<String, String>()
        map["thirdOrderId"] = thirdOrderId
        return apiService.queryWfWithdrawResult(getRequestBody(map))
    }

    fun sendActivityResult(activityName: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["activityName"] = activityName
        return apiService.sendActivityResult(getRequestBody(map))
    }

    fun goToWifiPage(): Observable<BaseResult<ToWIfiPageBean>> = apiService.goToWifiPage()

    fun userTrace(event: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["event"] = event
        return apiService.userTrace(getRequestBody(map))
    }

    fun initStatus(status: Int, millisecond: Long): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, Any>()
        map["status"] = status
        map["millsecond"] = millisecond
        return apiService.initStatus(getRequestBody(map))
    }

    fun bindJPushRegId(id: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, Any>()
        map["registrationId"] = id
        return apiService.bindJPushRegId(getRequestBody(map))
    }

    fun todayWeather(city: String, fate: String): Observable<BaseResult<ToadyWeatherBean>> {
        val map = HashMap<String, Any>()
        map["city"] = city
        map["fate"] = fate
        return apiService.todayWeather(getRequestBody(map))
    }

    fun getCurrentWeather(city: String): Observable<BaseResult<List<CurrentWeatherBean>>> {
        val map = HashMap<String, Any>()
        map["city"] = city
        return apiService.getCurrentWeather(getRequestBody(map))

    }

    fun recordAdTrace(
        transId: String,
        adNetwork: Int,
        adUnitType: String,
        adSiteId: String,
        adUnitId: String,
        status: Int
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["transId"] = transId.toString()
        map["adNetwork"] = adNetwork.toString()
        map["adUnitType"] = adUnitType.toString()
        map["adSiteId"] = adSiteId.toString()
        map["adUnitId"] = adUnitId.toString()
        map["status"] = status.toString()
        return apiService.recordAdTrace(getRequestBody(map))
    }

    fun appInfoLog(
        scene: String,
        des: String,
    ): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["scene"] = scene
        map["des"] = des
        return apiService.appInfoLog(getRequestBody(map))
    }

    fun getSystemCheck(): Observable<BaseResult<SystemCheckBean>> = apiService.getSystemCheck()


    fun getRewardByActivityV2(
        transId: String,
        ecpm: String,
        activityName: String,
        logId: Int? = null,
        coin: String? = null,
        withdrawTypestring: String? = null
    ): Observable<BaseResult<GetRewardBean>> {
        val map = HashMap<String, String>()
        map["transId"] = transId
        map["ecpm"] = ecpm
        map["activityName"] = activityName
        if (logId == null) map["logId"] = "0" else map["logId"] = logId.toString()
        coin?.let { map["coin"] = it }
        withdrawTypestring?.let { map["withdrawType"] = it }
        return apiService.getRewardByActivityV2(getRequestBody(map))
    }

    fun getCityListData(regionName: String): Observable<BaseResult<List<CityListBean>>> {
        val map = HashMap<String, String>()
        map["regionName"] = regionName
        return apiService.getCityList(getRequestBody(map))
    }

    fun addCity(regionCode: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["regionCode"] = regionCode
        return apiService.addCity(getRequestBody(map))
    }

    fun deleteCity(regionCode: String): Observable<BaseResult<List<String>>> {
        val map = HashMap<String, String>()
        map["regionCode"] = regionCode
        return apiService.deleteCity(getRequestBody(map))
    }

    fun getSelectCityList(name: String, coin: String): Observable<BaseResult<SelectCityBean>> {
        val map = HashMap<String, String>()
        map["name"] = name
        map["code"] = coin
        return apiService.getSelectCityList(getRequestBody(map))
    }

    fun keySearch(map: HashMap<String, String>): Observable<BaseResult<KeySearchBean>> {
        return apiService.keySearch(getRequestBody(map))
    }

}
package com.sq.common_module.common.utils.http

import com.google.gson.JsonObject
import com.sq.common_module.common.bean.*
import io.reactivex.rxjava3.core.Observable
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:19
 */
interface ApiService {
    //初始化
    @POST("v1/init/getInitData")
    fun getInitData(): Observable<BaseResult<InitData>>

    //登录接口
    @POST("v1/privatePlayer/bindPhone")
    fun bindPhone(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //发送验证码
    @POST("v1/privatePlayer/sendPhoneCode")
    fun sendCode(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //登录
    @POST("v1/login/submit")
    fun toLogin(): Observable<BaseResult<LoginBean>>

    //模糊搜索企业
    @POST("v1/enterprise/getCompany")
    fun getCompany(@Body body: RequestBody): Observable<BaseResult<List<CompanyBean>>>

    //查询企业明细信息
    @POST("v1/enterprise/getEnterpriseInfo")
    fun getEnterpriseInfo(@Body body: RequestBody): Observable<BaseResult<EnterpriseInfoBean>>


    //猜成语活动前置接口
    @POST("v1/activity/getIdiomQuestionList")
    fun getGuessData(): Observable<BaseResult<GuessIdiomsBean>>

    //保存用户参与活动记录
    @POST("v1/activity/saveUserActivityLog")
    fun saveUserActivityLog(@Body body: RequestBody): Observable<BaseResult<JsonObject>>

    //大转盘前置接口
    @POST("v1/activity/getLuckyTurnTablePreData")
    fun getLuckyTurnTablePreData(): Observable<BaseResult<BigWheelBean>>

    //首页接口
    @POST("v1/innerAd/getRecTabData")
    fun getHomeData(): Observable<BaseResult<NewHomeBean>>

    //获取我的基本信息
    @POST("v1/user/baseInfo")
    fun baseInfo(): Observable<BaseResult<BaseInfo>>

    //用户金币记录接口
    @POST("v1/user/getUserCoinLog")
    fun getUserCoinLog(): Observable<BaseResult<List<CoinLogData>>>

    //用户金币记录接口
    @POST("v1/activity/getHundredRewardLog")
    fun getHundredRewardLog(): Observable<BaseResult<HundredRewardLogData>>

    //获取现金豆提现前置信息
    @POST("v1/withdraw/getCoinWithdrawData")
    fun getCoinWithdrawData(): Observable<BaseResult<CoinWithdrawData>>

    //提交现金豆提现
    @POST("v1/withdraw/submitCoinWithdraw")
    fun submitCoinWithdraw(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //退出登录接口
    @POST("v1/user/loginOut")
    fun loginOut(): Observable<BaseResult<List<String>>>

    //注销账户接口
    @POST("v1/user/deleteSelf")
    fun deleteSelf(): Observable<BaseResult<List<String>>>

    //用户金币记录接口
    @POST("v1/activity/getNormQuestionList")
    fun getNormQuestionList(): Observable<BaseResult<NormQuestionData>>

    //获取奖励接口
    @POST("v1/reward/getRewardByActivity")
    fun getRewardByActivity(@Body body: RequestBody): Observable<BaseResult<GetRewardBean>>

    //同步广告信息
    @POST("v1/outerAd/syncUserWatchAdResult")
    fun syncAdInfo(@Body body: RequestBody): Observable<BaseResult<ReportFlagBean>>

    //翻牌活动前置接口
    @POST("v1/activity/getDrawCardPreData")
    fun getDrawCardPreBean(): Observable<BaseResult<LuckyFlopBean>>

    //每日红包前置接口
    @POST("v1/activity/getDailyRedBegPreData")
    fun getDailyRedPreBean(): Observable<BaseResult<LuckyFlopBean>>

    //获取提现前置信息
    @POST("v1/withdraw/getWithdrawData")
    fun getWithdrawalPreBean(): Observable<BaseResult<WithdrawalBean>>

    //提交提现
    @POST("v1/withdraw/submitWithdraw")
    fun submitWithdrawal(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //获取提现历史
    @POST("v1/withdraw/getWithdrawHistory")
    fun getWithdrawHistoryBean(@Body body: RequestBody): Observable<BaseResult<List<WithdrawHistoryListBean>>>

    //提现弹幕
    @POST("v1/withdraw/getWithdrawBulletScreen")
    fun getWithdrawBulletScreenBean(): Observable<BaseResult<List<WithdrawBulletScreenListBean>>>

    //红包雨前置接口
    @POST("v1/activity/getRedBagRainPreData")
    fun getRedRainPreBean(): Observable<BaseResult<RedRainPreBean>>

    //百元前置接口
    @POST("v1/activity/getHundredPreData")
    fun getHundredSignPreData(): Observable<BaseResult<SignPreData>>

    /**
     * 新接口
     */

    //猜成语前置接口
    @POST("v1/activity/idiomQuestion/preData")
    fun getGuessPreData(): Observable<BaseResult<GuessPreBean>>

    //放弃挑战
    @POST("v1/activity/idiomQuestion/abandon")
    fun abandonGuessAction(): Observable<BaseResult<List<String>>>

    //摇一摇前置接口
    @POST("v1/activity/shake/preData")
    fun getShakePreData(): Observable<BaseResult<ShakePreBean>>

    //九宫格 抽手机碎片
    @POST("v1/activity/getLuckyTurnTablePreData")
    fun getNineGridPreData(): Observable<BaseResult<NineGridPreBean>>

    //摇一摇 奖励记录
    @POST("v1/activity/shake/rewardLog")
    fun getShakeRewardLog(): Observable<BaseResult<List<ShakeRewardLogBean>>>

    //每日签到前置接口
    @POST("v1/activity/getSignPreData")
    fun getSignPreData(): Observable<BaseResult<EverySignPreBean>>

    //现金红包前置接口
    @POST("v1/activity/getCashRedBagPreData")
    fun getCashRedBagPreData(): Observable<BaseResult<CashRedPreBean>>

    //现金红包 大转盘
    @POST("v1/activity/getWatchWithdrawPreData")
    fun getWatchWithdrawPreData(): Observable<BaseResult<CashRedWheelBean>>

    //放弃现金红包大转盘奖励
    @POST("v1/reward/giveUpWatchAdWithdrawReward")
    fun abandonCashRedWheel(): Observable<BaseResult<List<String>>>

    //首页提现
    @POST("v1/withdraw/getWithdrawData")
    fun getWithdrawalData(): Observable<BaseResult<HomeWithdrawalBean>>

    //新红包雨前置接口
    @POST("v1/activity/getRedBagRainPreData")
    fun getNewRedRainPreData(): Observable<BaseResult<NewRainRedBean>>

    //更新用户信息
    @POST("v1/user/updateInfo")
    fun upDateUserInfo(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    @POST("v1/bloodSugar/preData")
    fun getUserVipInfo(): Observable<BaseResult<UseVipBean>>

    //绑定微信
    @POST("v1/user/bindWx")
    fun bindWx(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //绑定支付宝
    @POST("v1/user/bindZfb")
    fun bindZfb(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //提现前置接口
    @POST("v1/activity/getWithdrawForNewPreData")
    fun getWithdrawForNewPreData(): Observable<BaseResult<WithdrawForNewPreBean>>

    //摇一摇、获取每日提现信息
    @POST("v1/activity/shake/getShakeWithdrawInfo")
    fun getShakeWithdrawInfo(): Observable<BaseResult<ShakeWithdrawalBean>>

    //摇一摇每日提现
    @POST("v1/activity/shake/getDailyWithdrawReward")
    fun getDailyWithdrawReward(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //摇一摇提现
    @POST("v1/activity/shake/submitShakeWithdraw")
    fun submitShakeWithdraw(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //解绑微信支付宝
    @POST("v1/user/unbindAccount")
    fun unbindAccount(): Observable<BaseResult<List<String>>>
    @POST("v1/privatePlayer/unbindPhone")
    fun unbindPhone(): Observable<BaseResult<List<String>>>
    //支付宝七日签到
    @POST("v1/activity/getSevenDaySignWithdrawPreData")
    fun getZfbSevenSignData(): Observable<BaseResult<AliSignBean>>

    //广告请求失败
    @POST("v1/ad/adFailLog")
    fun loadAdFailLog(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //获取用户分层
    @POST("v1/withdraw/userHierarchy")
    fun getUserHierarchyData(): Observable<BaseResult<UserHierarchyBean>>

    //用户实名认证
    @POST("v1/user/realTaAuth")
    fun toRealAuth(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //延迟注销
    @POST("v1/user/delayDeleteSelf")
    fun delayDeleteSelf(): Observable<BaseResult<List<String>>>

    //取消注销
    @POST("v1/user/cancelDeleteSelf")
    fun cancelDeleteSelf(): Observable<BaseResult<List<String>>>

    @POST("v1/innerAd/keepAliveLog")
    fun keepAliveLog(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //风控检测
    @POST("v1/risk/check")
    fun checkRisk(@Body body: RequestBody): Observable<BaseResult<CheckRiskBean>>

    //wifi前置接口
    @POST("v1/activity/wifi/getPreData")
    fun getWifiPreData(): Observable<BaseResult<WifiPreBean>>

    //查询微分提现结果
    @POST("v1/withdraw/queryWfWithdrawResult")
    fun queryWfWithdrawResult(@Body body: RequestBody): Observable<BaseResult<WfWithdrawBean>>

    //完成活动
    @POST("v1/activity/wifi/finishActivity")
    fun sendActivityResult(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    @POST("v1/activity/wifi/wifiPageOrder")
    fun goToWifiPage(): Observable<BaseResult<ToWIfiPageBean>>

    //用户行为埋点
    @POST("/v1/user/userTrace")
    fun userTrace(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //用户初始化状态记录
    @POST("/v1/user/initStatus")
    fun initStatus(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //绑定极光注册id
    @POST("/v1/user/bindJpushRegistrationId")
    fun bindJPushRegId(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //获取实况天气
    @POST(" /v1/weather/todayWeather")
    fun todayWeather(@Body body: RequestBody): Observable<BaseResult<ToadyWeatherBean>>

    @POST("v1/weather/simpleWeather")
    fun getCurrentWeather(@Body body: RequestBody): Observable<BaseResult<List<CurrentWeatherBean>>>

    //广告跟踪
    @POST("v1/ad/adTrace")
    fun recordAdTrace(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    //4、app信息记录
    @POST("v1/ad/appInfoLog")
    fun appInfoLog(@Body body: RequestBody): Observable<BaseResult<List<String>>>


    //
    @POST("v1/risk/systemCheck")
    fun getSystemCheck(): Observable<BaseResult<SystemCheckBean>>

    @POST("v1/reward/getRewardByActivityV2")
    fun getRewardByActivityV2(@Body body: RequestBody): Observable<BaseResult<GetRewardBean>>

    //城市管理接口
    @POST("v1/weather/cityManage")
    fun getCityList(@Body body: RequestBody): Observable<BaseResult<List<CityListBean>>>

    @POST("v1/weather/addFocus")
    fun addCity(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    @POST("v1/weather/delFocus")
    fun deleteCity(@Body body: RequestBody): Observable<BaseResult<List<String>>>

    @POST("v1/weather/regionInfo")
    fun getSelectCityList(@Body body: RequestBody): Observable<BaseResult<SelectCityBean>>

    //关键字搜索
    @POST("v1/hwmap/keySearch")
    fun keySearch(@Body body: RequestBody): Observable<BaseResult<KeySearchBean>>
}
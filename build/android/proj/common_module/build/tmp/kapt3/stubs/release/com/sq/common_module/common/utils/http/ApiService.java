package com.sq.common_module.common.utils.http;

import com.google.gson.JsonObject;
import com.sq.common_module.common.bean.*;
import io.reactivex.rxjava3.core.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:19
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003H\'J$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001a\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J$\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003H\'J$\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u0003H\'J$\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0003H\'J$\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0003H\'J\u001e\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00040\u0003H\'J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u0003H\'J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\u0003H\'J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\u0003H\'J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00040\u0003H\'J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00040\u0003H\'J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\u0003H\'J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00040\u0003H\'J\u0014\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00040\u0003H\'J\u0014\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00040\u0003H\'J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00040\u0003H\'J\u001e\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00040\u0003H\'J\u001a\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00050\u00040\u0003H\'J\u0014\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00040\u0003H\'J\u0014\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00040\u0003H\'J\u0014\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00040\u0003H\'J\u001a\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00050\u00040\u0003H\'J\u0014\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00040\u0003H\'J\u0014\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00040\u0003H\'J\u0014\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00040\u0003H\'J\u0014\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00040\u0003H\'J\u001a\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u00050\u00040\u0003H\'J\u0014\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00040\u0003H\'J$\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\u00040\u0003H\'J\u0014\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\u00040\u0003H\'J\u0014\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u00040\u0003H\'J\u0014\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00040\u0003H\'J$\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001a\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001e\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0014\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0\u00040\u0003H\'J$\u0010y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001a\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001a\u0010}\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J$\u0010~\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J$\u0010\u007f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/sq/common_module/common/utils/http/ApiService;", "", "abandonCashRedWheel", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/sq/common_module/common/utils/http/BaseResult;", "", "", "abandonGuessAction", "addCity", "body", "Lokhttp3/RequestBody;", "appInfoLog", "baseInfo", "Lcom/sq/common_module/common/bean/BaseInfo;", "bindJPushRegId", "bindPhone", "bindWx", "bindZfb", "cancelDeleteSelf", "checkRisk", "Lcom/sq/common_module/common/bean/CheckRiskBean;", "delayDeleteSelf", "deleteCity", "deleteSelf", "getCashRedBagPreData", "Lcom/sq/common_module/common/bean/CashRedPreBean;", "getCityList", "Lcom/sq/common_module/common/bean/CityListBean;", "getCoinWithdrawData", "Lcom/sq/common_module/common/bean/CoinWithdrawData;", "getCompany", "Lcom/sq/common_module/common/bean/CompanyBean;", "getCurrentWeather", "Lcom/sq/common_module/common/bean/CurrentWeatherBean;", "getDailyRedPreBean", "Lcom/sq/common_module/common/bean/LuckyFlopBean;", "getDailyWithdrawReward", "getDrawCardPreBean", "getEnterpriseInfo", "Lcom/sq/common_module/common/bean/EnterpriseInfoBean;", "getGuessData", "Lcom/sq/common_module/common/bean/GuessIdiomsBean;", "getGuessPreData", "Lcom/sq/common_module/common/bean/GuessPreBean;", "getHomeData", "Lcom/sq/common_module/common/bean/NewHomeBean;", "getHundredRewardLog", "Lcom/sq/common_module/common/bean/HundredRewardLogData;", "getHundredSignPreData", "Lcom/sq/common_module/common/bean/SignPreData;", "getInitData", "Lcom/sq/common_module/common/bean/InitData;", "getLuckyTurnTablePreData", "Lcom/sq/common_module/common/bean/BigWheelBean;", "getNewRedRainPreData", "Lcom/sq/common_module/common/bean/NewRainRedBean;", "getNineGridPreData", "Lcom/sq/common_module/common/bean/NineGridPreBean;", "getNormQuestionList", "Lcom/sq/common_module/common/bean/NormQuestionData;", "getRedRainPreBean", "Lcom/sq/common_module/common/bean/RedRainPreBean;", "getRewardByActivity", "Lcom/sq/common_module/common/bean/GetRewardBean;", "getRewardByActivityV2", "getSelectCityList", "Lcom/sq/common_module/common/bean/SelectCityBean;", "getShakePreData", "Lcom/sq/common_module/common/bean/ShakePreBean;", "getShakeRewardLog", "Lcom/sq/common_module/common/bean/ShakeRewardLogBean;", "getShakeWithdrawInfo", "Lcom/sq/common_module/common/bean/ShakeWithdrawalBean;", "getSignPreData", "Lcom/sq/common_module/common/bean/EverySignPreBean;", "getSystemCheck", "Lcom/sq/common_module/common/bean/SystemCheckBean;", "getUserCoinLog", "Lcom/sq/common_module/common/bean/CoinLogData;", "getUserHierarchyData", "Lcom/sq/common_module/common/bean/UserHierarchyBean;", "getUserVipInfo", "Lcom/sq/common_module/common/bean/UseVipBean;", "getWatchWithdrawPreData", "Lcom/sq/common_module/common/bean/CashRedWheelBean;", "getWifiPreData", "Lcom/sq/common_module/common/bean/WifiPreBean;", "getWithdrawBulletScreenBean", "Lcom/sq/common_module/common/bean/WithdrawBulletScreenListBean;", "getWithdrawForNewPreData", "Lcom/sq/common_module/common/bean/WithdrawForNewPreBean;", "getWithdrawHistoryBean", "Lcom/sq/common_module/common/bean/WithdrawHistoryListBean;", "getWithdrawalData", "Lcom/sq/common_module/common/bean/HomeWithdrawalBean;", "getWithdrawalPreBean", "Lcom/sq/common_module/common/bean/WithdrawalBean;", "getZfbSevenSignData", "Lcom/sq/common_module/common/bean/AliSignBean;", "goToWifiPage", "Lcom/sq/common_module/common/bean/ToWIfiPageBean;", "initStatus", "keepAliveLog", "keySearch", "Lcom/sq/common_module/common/bean/KeySearchBean;", "loadAdFailLog", "loginOut", "queryWfWithdrawResult", "Lcom/sq/common_module/common/bean/WfWithdrawBean;", "recordAdTrace", "saveUserActivityLog", "Lcom/google/gson/JsonObject;", "sendActivityResult", "sendCode", "submitCoinWithdraw", "submitShakeWithdraw", "submitWithdrawal", "syncAdInfo", "Lcom/sq/common_module/common/bean/ReportFlagBean;", "toLogin", "Lcom/sq/common_module/common/bean/LoginBean;", "toRealAuth", "todayWeather", "Lcom/sq/common_module/common/bean/ToadyWeatherBean;", "unbindAccount", "unbindPhone", "upDateUserInfo", "userTrace", "common_module_release"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/init/getInitData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.InitData>> getInitData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/privatePlayer/bindPhone")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindPhone(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/privatePlayer/sendPhoneCode")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> sendCode(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/login/submit")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LoginBean>> toLogin();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/enterprise/getCompany")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CompanyBean>>> getCompany(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/enterprise/getEnterpriseInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.EnterpriseInfoBean>> getEnterpriseInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getIdiomQuestionList")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GuessIdiomsBean>> getGuessData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/saveUserActivityLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.google.gson.JsonObject>> saveUserActivityLog(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getLuckyTurnTablePreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.BigWheelBean>> getLuckyTurnTablePreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/innerAd/getRecTabData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NewHomeBean>> getHomeData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/baseInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.BaseInfo>> baseInfo();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/getUserCoinLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CoinLogData>>> getUserCoinLog();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getHundredRewardLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.HundredRewardLogData>> getHundredRewardLog();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/getCoinWithdrawData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CoinWithdrawData>> getCoinWithdrawData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/submitCoinWithdraw")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitCoinWithdraw(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/loginOut")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> loginOut();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/deleteSelf")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> deleteSelf();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getNormQuestionList")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NormQuestionData>> getNormQuestionList();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/reward/getRewardByActivity")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GetRewardBean>> getRewardByActivity(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/outerAd/syncUserWatchAdResult")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ReportFlagBean>> syncAdInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getDrawCardPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LuckyFlopBean>> getDrawCardPreBean();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getDailyRedBegPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.LuckyFlopBean>> getDailyRedPreBean();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/getWithdrawData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WithdrawalBean>> getWithdrawalPreBean();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/submitWithdraw")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitWithdrawal(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/getWithdrawHistory")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.WithdrawHistoryListBean>>> getWithdrawHistoryBean(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/getWithdrawBulletScreen")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.WithdrawBulletScreenListBean>>> getWithdrawBulletScreenBean();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getRedBagRainPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.RedRainPreBean>> getRedRainPreBean();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getHundredPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SignPreData>> getHundredSignPreData();
    
    /**
     * 新接口
     */
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/idiomQuestion/preData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GuessPreBean>> getGuessPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/idiomQuestion/abandon")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> abandonGuessAction();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/shake/preData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ShakePreBean>> getShakePreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getLuckyTurnTablePreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NineGridPreBean>> getNineGridPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/shake/rewardLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.ShakeRewardLogBean>>> getShakeRewardLog();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getSignPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.EverySignPreBean>> getSignPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getCashRedBagPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CashRedPreBean>> getCashRedBagPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getWatchWithdrawPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CashRedWheelBean>> getWatchWithdrawPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/reward/giveUpWatchAdWithdrawReward")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> abandonCashRedWheel();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/getWithdrawData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.HomeWithdrawalBean>> getWithdrawalData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getRedBagRainPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.NewRainRedBean>> getNewRedRainPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/updateInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> upDateUserInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/bloodSugar/preData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.UseVipBean>> getUserVipInfo();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/bindWx")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindWx(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/bindZfb")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindZfb(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getWithdrawForNewPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WithdrawForNewPreBean>> getWithdrawForNewPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/shake/getShakeWithdrawInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ShakeWithdrawalBean>> getShakeWithdrawInfo();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/shake/getDailyWithdrawReward")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> getDailyWithdrawReward(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/shake/submitShakeWithdraw")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> submitShakeWithdraw(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/unbindAccount")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> unbindAccount();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/privatePlayer/unbindPhone")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> unbindPhone();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/getSevenDaySignWithdrawPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.AliSignBean>> getZfbSevenSignData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/ad/adFailLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> loadAdFailLog(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/userHierarchy")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.UserHierarchyBean>> getUserHierarchyData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/realTaAuth")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> toRealAuth(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/delayDeleteSelf")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> delayDeleteSelf();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/user/cancelDeleteSelf")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> cancelDeleteSelf();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/innerAd/keepAliveLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> keepAliveLog(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/risk/check")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.CheckRiskBean>> checkRisk(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/wifi/getPreData")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WifiPreBean>> getWifiPreData();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/withdraw/queryWfWithdrawResult")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.WfWithdrawBean>> queryWfWithdrawResult(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/wifi/finishActivity")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> sendActivityResult(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/activity/wifi/wifiPageOrder")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ToWIfiPageBean>> goToWifiPage();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/v1/user/userTrace")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> userTrace(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/v1/user/initStatus")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> initStatus(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "/v1/user/bindJpushRegistrationId")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> bindJPushRegId(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = " /v1/weather/todayWeather")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.ToadyWeatherBean>> todayWeather(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/weather/simpleWeather")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CurrentWeatherBean>>> getCurrentWeather(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/ad/adTrace")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> recordAdTrace(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/ad/appInfoLog")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> appInfoLog(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/risk/systemCheck")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SystemCheckBean>> getSystemCheck();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/reward/getRewardByActivityV2")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.GetRewardBean>> getRewardByActivityV2(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/weather/cityManage")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<com.sq.common_module.common.bean.CityListBean>>> getCityList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/weather/addFocus")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> addCity(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/weather/delFocus")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<java.util.List<java.lang.String>>> deleteCity(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/weather/regionInfo")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.SelectCityBean>> getSelectCityList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "v1/hwmap/keySearch")
    public abstract io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<com.sq.common_module.common.bean.KeySearchBean>> keySearch(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody body);
}
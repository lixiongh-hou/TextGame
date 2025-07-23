package com.sq.common_module.common.pange;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import cn.tongdun.mobrisk.TDRisk;
import com.blankj.utilcode.util.AppUtils;
import com.bytedance.sdk.openadsdk.*;
import com.google.gson.Gson;
import com.sq.common_module.common.ad.*;
import com.sq.common_module.common.bean.GetRewardBean;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.TDInfoUtils;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.http.SyncAdInfoUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.*;
import kotlinx.coroutines.Dispatchers;
import java.util.*;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/8/10
 * Time : 17:38
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\bH\u0002J\b\u00102\u001a\u000200H\u0002J1\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u00108J1\u00109\u001a\u0002002\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u00108J\b\u0010:\u001a\u000200H\u0002J\b\u0010;\u001a\u000200H\u0002J]\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u001a2\b\b\u0002\u0010C\u001a\u00020\n2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010EJ\b\u0010F\u001a\u000200H\u0002J\u0018\u0010G\u001a\u0002002\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\bH\u0002J\u0010\u0010J\u001a\u0002002\b\b\u0002\u0010K\u001a\u00020\u001eJ\b\u0010L\u001a\u000200H\u0002J\b\u0010M\u001a\u000200H\u0002J\b\u0010N\u001a\u000200H\u0002J\b\u0010O\u001a\u000200H\u0002J\b\u0010P\u001a\u000200H\u0002J5\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020\u001e2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001e2\u0006\u0010T\u001a\u00020\u001e2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010VJ\b\u0010W\u001a\u000200H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006X"}, d2 = {"Lcom/sq/common_module/common/pange/TTRewardAdUtils;", "", "syncAdInfoUtils", "Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "(Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;Lcom/sq/common_module/common/repository/CommonRepository;)V", "TAG", "", "isGetReward", "", "isOnCloseAD", "isVideoComplete", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "loadRewardResult", "mActionName", "mActivity", "Landroid/app/Activity;", "mAdId", "mEcpm", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "mJob", "Lkotlinx/coroutines/Job;", "mRewardAdInterface", "Lcom/sq/common_module/common/ad/RewardAdInterface;", "mRewardBean", "Lcom/sq/common_module/common/bean/GetRewardBean;", "mRewardLogId", "", "Ljava/lang/Integer;", "mRewardVideoAdInteractionListener", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;", "mRewardVideoListener", "Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;", "mTTRewardVideoAd", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;", "mTransId", "mWithdrawType", "requestSuccess", "Ljava/lang/Boolean;", "rewardLoadingDialog", "Lcom/sq/common_module/common/ad/RewardLoadingDialog;", "rewardReady", "riskRequest", "timeDate", "checkRisk", "", "blackBox", "dismissRewardDialog", "getRewardByActivity", "transId", "ecpm", "activityName", "logId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getRewardByActivityV2", "initListeners", "initTDSdk", "initTTReward", "life", "activity", "adId", "fragmentManager", "actionName", "rewardAdInterface", "showLoadingDialog", "withdrawTypestring", "(Landroidx/lifecycle/LifecycleCoroutineScope;Landroid/app/Activity;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/sq/common_module/common/ad/RewardAdInterface;ZLjava/lang/Integer;Ljava/lang/String;)V", "loadAd", "loadAdFailLog", "errCode", "errMsg", "onDestroy", "way", "postOnAdClose", "queryRewardResult", "resetValues", "showReward", "showRewardVideoAd", "syncADInfo", "isClick", "isEnd", "status", "slotId", "(ILjava/lang/Integer;ILjava/lang/String;)V", "toastLoadRewardFail", "common_module_release"})
public final class TTRewardAdUtils {
    private final com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils = null;
    private final com.sq.common_module.common.repository.CommonRepository repository = null;
    private final java.lang.String TAG = null;
    private androidx.fragment.app.FragmentManager mFragmentManager;
    private com.sq.common_module.common.ad.RewardAdInterface mRewardAdInterface;
    private android.app.Activity mActivity;
    private java.lang.String mAdId = "";
    private com.sq.common_module.common.ad.RewardLoadingDialog rewardLoadingDialog;
    private java.lang.String mEcpm = "";
    private java.lang.String mTransId = "";
    private com.sq.common_module.common.bean.GetRewardBean mRewardBean;
    private java.lang.String mActionName = "";
    private java.lang.Integer mRewardLogId;
    private java.lang.String mWithdrawType;
    private java.lang.Boolean requestSuccess;
    private java.lang.String timeDate = "";
    private com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener mRewardVideoListener;
    private com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener mRewardVideoAdInteractionListener;
    private com.bytedance.sdk.openadsdk.TTRewardVideoAd mTTRewardVideoAd;
    private boolean loadRewardResult = false;
    private kotlinx.coroutines.Job mJob;
    private boolean rewardReady = true;
    private boolean isGetReward = false;
    private androidx.lifecycle.LifecycleCoroutineScope lifecycleScope;
    private boolean isOnCloseAD = false;
    private boolean isVideoComplete = false;
    private boolean riskRequest = false;
    
    @javax.inject.Inject
    public TTRewardAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.repository.CommonRepository repository) {
        super();
    }
    
    private final void resetValues() {
    }
    
    public final void initTTReward(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope life, @org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.RewardAdInterface rewardAdInterface, boolean showLoadingDialog, @org.jetbrains.annotations.Nullable
    java.lang.Integer logId, @org.jetbrains.annotations.Nullable
    java.lang.String withdrawTypestring) {
    }
    
    private final void loadAd() {
    }
    
    private final void initListeners() {
    }
    
    private final void postOnAdClose() {
    }
    
    private final void queryRewardResult() {
    }
    
    private final void showRewardVideoAd() {
    }
    
    public final void onDestroy(int way) {
    }
    
    private final void dismissRewardDialog() {
    }
    
    /**
     * 同步广告信息
     */
    private final void syncADInfo(int isClick, java.lang.Integer isEnd, int status, java.lang.String slotId) {
    }
    
    private final void loadAdFailLog(java.lang.String errCode, java.lang.String errMsg) {
    }
    
    /**
     * 获取奖励
     */
    private final void getRewardByActivity(java.lang.String transId, java.lang.String ecpm, java.lang.String activityName, java.lang.Integer logId) {
    }
    
    private final void getRewardByActivityV2(java.lang.String transId, java.lang.String ecpm, java.lang.String activityName, java.lang.Integer logId) {
    }
    
    private final void initTDSdk() {
    }
    
    /**
     * 风控
     */
    private final void checkRisk(java.lang.String blackBox) {
    }
    
    private final void showReward() {
    }
    
    private final void toastLoadRewardFail() {
    }
}
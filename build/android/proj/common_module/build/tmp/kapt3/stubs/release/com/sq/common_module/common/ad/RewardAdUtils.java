package com.sq.common_module.common.ad;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.bean.GetRewardBean;
import com.sq.common_module.common.pange.TTRewardAdUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.DialogNumUtils;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import com.sq.common_module.common.utils.kt.WiFiBaseUtils;
import com.sq.common_module.databinding.DialogRewardLoadingBinding;
import kotlinx.coroutines.Dispatchers;
import java.lang.ref.WeakReference;
import java.util.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002Jo\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J \u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010\'\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/sq/common_module/common/ad/RewardAdUtils;", "", "groMoreRewardAdUtils", "Lcom/sq/common_module/common/pange/TTRewardAdUtils;", "(Lcom/sq/common_module/common/pange/TTRewardAdUtils;)V", "isTimeOut", "", "loadStatus", "Ljava/lang/Boolean;", "mAdPlatformType", "", "timeOut", "timeOutJob", "Lkotlinx/coroutines/Job;", "destroyTimeOut", "", "initAd", "life", "Landroidx/lifecycle/LifecycleCoroutineScope;", "adPlatformType", "activity", "Landroid/app/Activity;", "rewardId", "", "actionName", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "rewardAdInterface", "Lcom/sq/common_module/common/ad/RewardAdInterface;", "showDialog", "logId", "withdrawTypestring", "loadTimeOut", "", "(Landroidx/lifecycle/LifecycleCoroutineScope;ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Lcom/sq/common_module/common/ad/RewardAdInterface;ZLjava/lang/Integer;Ljava/lang/String;J)V", "initTimeOut", "scope", "callback", "onDestroy", "preLoadRewardAd", "common_module_release"})
public final class RewardAdUtils {
    private final com.sq.common_module.common.pange.TTRewardAdUtils groMoreRewardAdUtils = null;
    private int mAdPlatformType = 0;
    private int timeOut = -1;
    private boolean isTimeOut = false;
    private kotlinx.coroutines.Job timeOutJob;
    private java.lang.Boolean loadStatus;
    
    @javax.inject.Inject
    public RewardAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.pange.TTRewardAdUtils groMoreRewardAdUtils) {
        super();
    }
    
    public final void initAd(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope life, int adPlatformType, @org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String rewardId, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.RewardAdInterface rewardAdInterface, boolean showDialog, @org.jetbrains.annotations.Nullable
    java.lang.Integer logId, @org.jetbrains.annotations.Nullable
    java.lang.String withdrawTypestring, long loadTimeOut) {
    }
    
    /**
     * 超时
     * @param timeOut 毫秒
     */
    private final void initTimeOut(androidx.lifecycle.LifecycleCoroutineScope scope, com.sq.common_module.common.ad.RewardAdInterface callback, long timeOut) {
    }
    
    private final void destroyTimeOut() {
    }
    
    /**
     * 加载广告
     */
    public final void preLoadRewardAd() {
    }
    
    public final void onDestroy() {
    }
}
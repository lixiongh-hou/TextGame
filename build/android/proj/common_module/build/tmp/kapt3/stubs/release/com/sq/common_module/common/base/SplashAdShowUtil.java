package com.sq.common_module.common.base;

import android.app.Activity;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.bytedance.sdk.openadsdk.*;
import com.sq.common_module.common.ad.ADPlatFromType;
import com.sq.common_module.common.ad.ADType;
import com.sq.common_module.common.ad.SplashAdInterface;
import com.sq.common_module.common.bean.ReportFlagBean;
import com.sq.common_module.common.pange.TTADManagerHolder;
import com.sq.common_module.common.pange.TTSplashAdUtils;
import com.sq.common_module.common.ui.BackToForegroundActivity;
import com.sq.common_module.common.utils.RetrofitUtils;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.http.SyncAdInfoUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.java.UIUtils;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import java.util.*;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/12/8
 * Time : 15:30
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000bH\u0002J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002J&\u0010&\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020 J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020 J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/sq/common_module/common/base/SplashAdShowUtil;", "", "()V", "TAG", "", "flContainer", "Landroid/widget/FrameLayout;", "isLoadSplash", "", "loadAdSuccess", "mActivity", "Landroid/app/Activity;", "mCSJSplashAdListener", "Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;", "mCSJSplashInteractionListener", "Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;", "mCsjSplashAd", "Lcom/bytedance/sdk/openadsdk/CSJSplashAd;", "mSplashAdId", "mSplashBack", "Lcom/sq/common_module/common/ad/SplashAdInterface;", "splashEcpm", "splashRequestAdNum", "", "syncAdInfoUtils", "Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "getSyncAdInfoUtils", "()Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "setSyncAdInfoUtils", "(Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;)V", "timeDate", "initListeners", "", "loadAd", "activity", "loadAdFailLog", "errCode", "errMsg", "loadTTSplashAd", "container", "adId", "splashBack", "onDestroy", "recordAdTrace", "status", "showSplashAd", "syncAdInfo", "isClick", "common_module_release"})
public final class SplashAdShowUtil {
    private java.lang.String TAG;
    private java.lang.String timeDate = "";
    private com.sq.common_module.common.ad.SplashAdInterface mSplashBack;
    private java.lang.String mSplashAdId = "";
    private com.bytedance.sdk.openadsdk.CSJSplashAd mCsjSplashAd;
    private com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener mCSJSplashAdListener;
    private com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener mCSJSplashInteractionListener;
    private android.widget.FrameLayout flContainer;
    private boolean loadAdSuccess = false;
    private java.lang.String splashEcpm = "0";
    private int splashRequestAdNum = 0;
    private android.app.Activity mActivity;
    private boolean isLoadSplash = false;
    @javax.inject.Inject
    public com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils;
    
    @javax.inject.Inject
    public SplashAdShowUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.http.SyncAdInfoUtils getSyncAdInfoUtils() {
        return null;
    }
    
    public final void setSyncAdInfoUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.SyncAdInfoUtils p0) {
    }
    
    public final void loadTTSplashAd(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.widget.FrameLayout container, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.SplashAdInterface splashBack) {
    }
    
    private final void loadAd(android.app.Activity activity) {
    }
    
    private final void initListeners() {
    }
    
    public final void showSplashAd() {
    }
    
    public final void onDestroy() {
    }
    
    private final void syncAdInfo(int isClick) {
    }
    
    private final void loadAdFailLog(java.lang.String errCode, java.lang.String errMsg) {
    }
    
    public final void recordAdTrace(int status) {
    }
}
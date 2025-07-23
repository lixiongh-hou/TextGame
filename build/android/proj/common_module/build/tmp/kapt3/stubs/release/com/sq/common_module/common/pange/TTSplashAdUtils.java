package com.sq.common_module.common.pange;

import android.app.Activity;
import android.util.Log;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.bytedance.sdk.openadsdk.*;
import com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener;
import com.sq.common_module.common.ad.*;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.http.SyncAdInfoUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.java.UIUtils;
import com.sq.common_module.common.utils.kt.*;
import java.util.*;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/8/14
 * Time : 15:50
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\rH\u0002J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0002J&\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\r2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0016J\u0017\u0010,\u001a\u00020\"2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0019H\u0002J\u0006\u00101\u001a\u00020\"J5\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u00192\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00192\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00067"}, d2 = {"Lcom/sq/common_module/common/pange/TTSplashAdUtils;", "", "syncAdInfoUtils", "Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "(Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;)V", "TAG", "", "flContainer", "Landroid/widget/FrameLayout;", "isLoadSplash", "", "loadAdSuccess", "mActivity", "Landroid/app/Activity;", "mCSJSplashAdListener", "Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;", "mCSJSplashInteractionListener", "Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;", "mCsjSplashAd", "Lcom/bytedance/sdk/openadsdk/CSJSplashAd;", "mSplashAdId", "mSplashBack", "Lcom/sq/common_module/common/ad/SplashAdInterface;", "splashEcpm", "splashRequestAdNum", "", "timeDate", "trackEventUtils", "Lcom/sq/common_module/common/utils/kt/TrackEventUtils;", "getTrackEventUtils", "()Lcom/sq/common_module/common/utils/kt/TrackEventUtils;", "setTrackEventUtils", "(Lcom/sq/common_module/common/utils/kt/TrackEventUtils;)V", "initListeners", "", "loadAd", "activity", "loadAdFailLog", "errCode", "errMsg", "loadTTSplashAd", "container", "adId", "splashBack", "onDestroy", "finish", "(Ljava/lang/Boolean;)V", "recordAdTrace", "status", "showSplashAd", "syncAdInfo", "isClick", "isEnd", "slotId", "(ILjava/lang/Integer;ILjava/lang/String;)V", "common_module_release"})
public final class TTSplashAdUtils {
    private final com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils = null;
    private java.lang.String TAG;
    private java.lang.String timeDate = "";
    private com.sq.common_module.common.ad.SplashAdInterface mSplashBack;
    private java.lang.String mSplashAdId = "";
    private com.bytedance.sdk.openadsdk.CSJSplashAd mCsjSplashAd;
    private com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener mCSJSplashAdListener;
    private com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener mCSJSplashInteractionListener;
    private android.widget.FrameLayout flContainer;
    private boolean loadAdSuccess = false;
    private java.lang.String splashEcpm = "";
    private int splashRequestAdNum = 0;
    private android.app.Activity mActivity;
    private boolean isLoadSplash = false;
    @javax.inject.Inject
    public com.sq.common_module.common.utils.kt.TrackEventUtils trackEventUtils;
    
    @javax.inject.Inject
    public TTSplashAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.kt.TrackEventUtils getTrackEventUtils() {
        return null;
    }
    
    public final void setTrackEventUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.TrackEventUtils p0) {
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
    
    public final void onDestroy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean finish) {
    }
    
    private final void syncAdInfo(int isClick, java.lang.Integer isEnd, int status, java.lang.String slotId) {
    }
    
    private final void loadAdFailLog(java.lang.String errCode, java.lang.String errMsg) {
    }
    
    private final void recordAdTrace(int status) {
    }
}
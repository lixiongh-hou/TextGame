package com.sq.common_module.common.pange;

import android.app.Activity;
import android.util.Log;
import com.blankj.utilcode.util.ActivityUtils;
import com.bytedance.sdk.openadsdk.*;
import com.sq.common_module.common.ad.*;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.http.SyncAdInfoUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.*;
import java.util.*;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/8/11
 * Time : 13:51
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\fJ\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0006\u0010 \u001a\u00020\u0017J\b\u0010!\u001a\u00020\u0017H\u0002J5\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020$2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/sq/common_module/common/pange/TTFullAdUtils;", "", "syncAdInfoUtils", "Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "(Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;)V", "mActionName", "", "mActivity", "Landroid/app/Activity;", "mEcpm", "mFullAdId", "mFullCallBack", "Lcom/sq/common_module/common/ad/FullCallBack;", "mFullScreenVideoAdInteractionListener", "Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;", "mFullScreenVideoListener", "Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;", "mTTFullScreenVideoAd", "Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;", "showFullAd", "", "timeDate", "initListeners", "", "initTTFullAd", "activity", "adId", "actionName", "fullCallBack", "loadAdFailLog", "errCode", "errMsg", "onDestroy", "showInterstitialFullAd", "syncAdInfo", "isClick", "", "isEnd", "status", "slotId", "(ILjava/lang/Integer;ILjava/lang/String;)V", "common_module_release"})
public final class TTFullAdUtils {
    private final com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils = null;
    private android.app.Activity mActivity;
    private java.lang.String mFullAdId = "";
    private boolean showFullAd = false;
    private com.sq.common_module.common.ad.FullCallBack mFullCallBack;
    private java.lang.String mActionName = "";
    private java.lang.String timeDate = "";
    private com.bytedance.sdk.openadsdk.TTFullScreenVideoAd mTTFullScreenVideoAd;
    private com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener mFullScreenVideoListener;
    private com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener mFullScreenVideoAdInteractionListener;
    private java.lang.String mEcpm = "";
    
    @javax.inject.Inject
    public TTFullAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.SyncAdInfoUtils syncAdInfoUtils) {
        super();
    }
    
    public final void initTTFullAd(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.FullCallBack fullCallBack) {
    }
    
    private final void initListeners() {
    }
    
    private final void showInterstitialFullAd() {
    }
    
    public final void onDestroy() {
    }
    
    private final void syncAdInfo(int isClick, java.lang.Integer isEnd, int status, java.lang.String slotId) {
    }
    
    private final void loadAdFailLog(java.lang.String errCode, java.lang.String errMsg) {
    }
}
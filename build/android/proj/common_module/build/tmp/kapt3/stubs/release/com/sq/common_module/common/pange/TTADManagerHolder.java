package com.sq.common_module.common.pange;

import android.content.Context;
import android.util.Log;
import com.blankj.utilcode.util.AppUtils;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfig;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.HashMap;
import com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationSplashRequestInfo;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.*;

/**
 * Created by town
 * Date :  2023/8/10
 * Time : 17:18
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J9\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2#\b\u0004\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\b\u00f8\u0001\u0000J\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001d"}, d2 = {"Lcom/sq/common_module/common/pange/TTADManagerHolder;", "", "()V", "sInit", "", "getSInit", "()Z", "setSInit", "(Z)V", "buildConfig", "Lcom/bytedance/sdk/openadsdk/TTAdConfig;", "context", "Landroid/content/Context;", "getJson", "", "fileName", "getTTCustomController", "Lcom/bytedance/sdk/openadsdk/TTCustomController;", "getUserInfoForSegment", "Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;", "init", "", "ttCallBack", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "s", "splashMediation", "Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationAdSlot;", "common_module_release"})
public final class TTADManagerHolder {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.pange.TTADManagerHolder INSTANCE = null;
    private static boolean sInit = false;
    
    private TTADManagerHolder() {
        super();
    }
    
    public final boolean getSInit() {
        return false;
    }
    
    public final void setSInit(boolean p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> ttCallBack) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.bytedance.sdk.openadsdk.TTAdConfig buildConfig(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment getUserInfoForSegment() {
        return null;
    }
    
    private final java.lang.String getJson(java.lang.String fileName, android.content.Context context) {
        return null;
    }
    
    private final com.bytedance.sdk.openadsdk.TTCustomController getTTCustomController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot splashMediation() {
        return null;
    }
}
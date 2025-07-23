package com.sq.common_module.common.utils;

import com.sq.common_module.common.bean.ToWIfiPageBean;

/**
 * Created by town
 * Date :  2023/5/22
 * Time : 9:21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b/\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010\'\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u0010\u0017R\u001a\u0010;\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\u001a\u0010>\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u0010\u0017R\u001a\u0010A\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017R\u001a\u0010D\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0015\"\u0004\bF\u0010\u0017R\u001a\u0010G\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR\u001a\u0010J\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\b\u00a8\u0006P"}, d2 = {"Lcom/sq/common_module/common/utils/HttpHeaderUtils;", "", "()V", "appCode", "", "getAppCode", "()Ljava/lang/String;", "setAppCode", "(Ljava/lang/String;)V", "channelCode", "getChannelCode", "setChannelCode", "guideBean", "Lcom/sq/common_module/common/bean/ToWIfiPageBean;", "getGuideBean", "()Lcom/sq/common_module/common/bean/ToWIfiPageBean;", "setGuideBean", "(Lcom/sq/common_module/common/bean/ToWIfiPageBean;)V", "homeSplashFinish", "", "getHomeSplashFinish", "()Z", "setHomeSplashFinish", "(Z)V", "isCreatedOver24Hours", "setCreatedOver24Hours", "isHomeForeground", "setHomeForeground", "isRewardClose", "setRewardClose", "isRewardShowing", "setRewardShowing", "isRiskUser", "", "()I", "setRiskUser", "(I)V", "isShowSplashAd", "setShowSplashAd", "isWiFiOpt", "setWiFiOpt", "isWifiOptimizing", "setWifiOptimizing", "isWifiXXL", "setWifiXXL", "isWxOrZfb", "setWxOrZfb", "ksAppId", "getKsAppId", "setKsAppId", "mActivityCount", "getMActivityCount", "setMActivityCount", "planId", "getPlanId", "setPlanId", "postOaidOrIemi", "getPostOaidOrIemi", "setPostOaidOrIemi", "toCleanAcceleration", "getToCleanAcceleration", "setToCleanAcceleration", "toGuideCleanOptimize", "getToGuideCleanOptimize", "setToGuideCleanOptimize", "toGuideWifiOptimize", "getToGuideWifiOptimize", "setToGuideWifiOptimize", "toWifiAcceleration", "getToWifiAcceleration", "setToWifiAcceleration", "versionCode", "getVersionCode", "setVersionCode", "wifiSecure", "getWifiSecure", "setWifiSecure", "ylhAppId", "getYlhAppId", "setYlhAppId", "common_module_release"})
public final class HttpHeaderUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.HttpHeaderUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String appCode = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String channelCode = "";
    private static int mActivityCount = 0;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String wifiSecure = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String versionCode = "";
    private static boolean isWifiXXL = true;
    private static boolean toWifiAcceleration = false;
    private static boolean toCleanAcceleration = false;
    private static boolean toGuideWifiOptimize = false;
    @org.jetbrains.annotations.Nullable
    private static com.sq.common_module.common.bean.ToWIfiPageBean guideBean;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ksAppId = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String ylhAppId = "";
    private static boolean toGuideCleanOptimize = false;
    private static boolean isCreatedOver24Hours = false;
    private static boolean homeSplashFinish = false;
    private static boolean isHomeForeground = true;
    private static boolean isShowSplashAd = false;
    private static boolean isRewardShowing = false;
    private static boolean isWxOrZfb = false;
    private static boolean isRewardClose = true;
    private static boolean isWifiOptimizing = false;
    private static boolean isWiFiOpt = false;
    private static boolean postOaidOrIemi = false;
    private static int isRiskUser = 0;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String planId = "";
    
    private HttpHeaderUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppCode() {
        return null;
    }
    
    public final void setAppCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChannelCode() {
        return null;
    }
    
    public final void setChannelCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getMActivityCount() {
        return 0;
    }
    
    public final void setMActivityCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWifiSecure() {
        return null;
    }
    
    public final void setWifiSecure(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersionCode() {
        return null;
    }
    
    public final void setVersionCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isWifiXXL() {
        return false;
    }
    
    public final void setWifiXXL(boolean p0) {
    }
    
    public final boolean getToWifiAcceleration() {
        return false;
    }
    
    public final void setToWifiAcceleration(boolean p0) {
    }
    
    public final boolean getToCleanAcceleration() {
        return false;
    }
    
    public final void setToCleanAcceleration(boolean p0) {
    }
    
    public final boolean getToGuideWifiOptimize() {
        return false;
    }
    
    public final void setToGuideWifiOptimize(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.ToWIfiPageBean getGuideBean() {
        return null;
    }
    
    public final void setGuideBean(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.ToWIfiPageBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKsAppId() {
        return null;
    }
    
    public final void setKsAppId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getYlhAppId() {
        return null;
    }
    
    public final void setYlhAppId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getToGuideCleanOptimize() {
        return false;
    }
    
    public final void setToGuideCleanOptimize(boolean p0) {
    }
    
    public final boolean isCreatedOver24Hours() {
        return false;
    }
    
    public final void setCreatedOver24Hours(boolean p0) {
    }
    
    public final boolean getHomeSplashFinish() {
        return false;
    }
    
    public final void setHomeSplashFinish(boolean p0) {
    }
    
    public final boolean isHomeForeground() {
        return false;
    }
    
    public final void setHomeForeground(boolean p0) {
    }
    
    public final boolean isShowSplashAd() {
        return false;
    }
    
    public final void setShowSplashAd(boolean p0) {
    }
    
    public final boolean isRewardShowing() {
        return false;
    }
    
    public final void setRewardShowing(boolean p0) {
    }
    
    public final boolean isWxOrZfb() {
        return false;
    }
    
    public final void setWxOrZfb(boolean p0) {
    }
    
    public final boolean isRewardClose() {
        return false;
    }
    
    public final void setRewardClose(boolean p0) {
    }
    
    public final boolean isWifiOptimizing() {
        return false;
    }
    
    public final void setWifiOptimizing(boolean p0) {
    }
    
    public final boolean isWiFiOpt() {
        return false;
    }
    
    public final void setWiFiOpt(boolean p0) {
    }
    
    public final boolean getPostOaidOrIemi() {
        return false;
    }
    
    public final void setPostOaidOrIemi(boolean p0) {
    }
    
    public final int isRiskUser() {
        return 0;
    }
    
    public final void setRiskUser(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlanId() {
        return null;
    }
    
    public final void setPlanId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}
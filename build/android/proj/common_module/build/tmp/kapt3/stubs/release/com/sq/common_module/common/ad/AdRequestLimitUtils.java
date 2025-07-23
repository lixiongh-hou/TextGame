package com.sq.common_module.common.ad;

import com.blankj.utilcode.util.AppUtils;
import com.sq.common_module.common.bean.SystemCheckBean;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.RetrofitUtils;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import java.util.Date;

/**
 * Created by town
 * Date :  2024/1/15
 * Time : 13:38
 * 广告请求风控接口限制
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"J9\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2#\b\u0004\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020$0&H\u0086\b\u00f8\u0001\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006*"}, d2 = {"Lcom/sq/common_module/common/ad/AdRequestLimitUtils;", "", "()V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "feedAdId", "", "getFeedAdId", "()Ljava/lang/String;", "setFeedAdId", "(Ljava/lang/String;)V", "fullAdId", "getFullAdId", "setFullAdId", "isInnerRisk", "", "()Z", "setInnerRisk", "(Z)V", "rewardAdId", "getRewardAdId", "setRewardAdId", "splashAdId", "getSplashAdId", "setSplashAdId", "startTime", "getStartTime", "setStartTime", "getAdId", "type", "", "requestSystemRisk", "", "invoke", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "s", "common_module_release"})
public final class AdRequestLimitUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.ad.AdRequestLimitUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String splashAdId = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String feedAdId = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String fullAdId = "";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String rewardAdId = "";
    private static long startTime = 0L;
    private static long endTime = 0L;
    private static boolean isInnerRisk = false;
    
    private AdRequestLimitUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSplashAdId() {
        return null;
    }
    
    public final void setSplashAdId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFeedAdId() {
        return null;
    }
    
    public final void setFeedAdId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullAdId() {
        return null;
    }
    
    public final void setFullAdId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRewardAdId() {
        return null;
    }
    
    public final void setRewardAdId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getStartTime() {
        return 0L;
    }
    
    public final void setStartTime(long p0) {
    }
    
    public final long getEndTime() {
        return 0L;
    }
    
    public final void setEndTime(long p0) {
    }
    
    public final boolean isInnerRisk() {
        return false;
    }
    
    public final void setInnerRisk(boolean p0) {
    }
    
    public final void requestSystemRisk(int type, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> invoke) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdId(int type) {
        return null;
    }
}
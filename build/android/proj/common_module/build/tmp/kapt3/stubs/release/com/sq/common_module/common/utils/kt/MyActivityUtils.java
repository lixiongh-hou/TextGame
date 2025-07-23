package com.sq.common_module.common.utils.kt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.StringUtils;

/**
 * Created by town
 * Date :  2022/10/27
 * Time : 17:14
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J,\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u001e\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002J\"\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0006\u0010&\u001a\u00020\u0018J\u0006\u0010\'\u001a\u00020\u0018J\u0006\u0010(\u001a\u00020\u0018J\u001e\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020\u0018J\u0006\u0010/\u001a\u00020\u0018J\u0006\u00100\u001a\u00020\u0018J\u0006\u00101\u001a\u00020\u0018J\u0006\u00102\u001a\u00020\u0018J\u0006\u00103\u001a\u00020\u0018J\u0006\u00104\u001a\u00020\u0018J\u0010\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u001eJ\u0010\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u001eJ\u0006\u00109\u001a\u00020\u0018J\u0016\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0016J\u0018\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u001e2\b\b\u0002\u00108\u001a\u00020\u001eJ\u0006\u0010=\u001a\u00020\u0018J\u0006\u0010>\u001a\u00020\u0018J\u0006\u0010?\u001a\u00020\u0018J\u0006\u0010@\u001a\u00020\u0018J\u000e\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u001eJ\u0006\u0010C\u001a\u00020\u0018J\u0006\u0010D\u001a\u00020\u0018J\u0006\u0010E\u001a\u00020\u0018J\u0010\u0010F\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u001eJ\u0006\u0010G\u001a\u00020\u0018J\u0006\u0010H\u001a\u00020\u0018J\u0006\u0010I\u001a\u00020\u0018J\u000e\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020\u0016J\u0006\u0010L\u001a\u00020\u0018J\u0006\u0010M\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\t\u00a8\u0006N"}, d2 = {"Lcom/sq/common_module/common/utils/kt/MyActivityUtils;", "", "()V", "aRouter", "Lcom/alibaba/android/arouter/launcher/ARouter;", "kotlin.jvm.PlatformType", "audit", "", "getAudit", "()Ljava/lang/String;", "audit$delegate", "Lkotlin/Lazy;", "jlPath", "getJlPath", "jlPath$delegate", "path", "getPath", "path$delegate", "getAuditRoutPath", "getJlRoutPath", "getRoutPath", "isShowJlUI", "", "startActivity", "", "url", "startAppActivity", "activity", "Landroid/app/Activity;", "openType", "", "title", "startBaseWebViewActivity", "hide", "startOutUrlActivity", "startUrlSkip", "context", "Landroid/content/Context;", "toAddCityActivity", "toAnswerQuestionsActivity", "toAuditAboutUsActivity", "toAuditDetailActivity", "num", "content", "toAuditMainActivity", "toAuditMyAboutActivity", "toAuditMyInfoActivity", "toBigWheelActivity", "toCoinLogActivity", "toDayDayGetRedActivity", "toEntryWifiAccelerationActivity", "toEveryActionActivity", "toGuessActionActivity", "toGuideOptimizeActivity", "way", "toHomeSplashActivity", "jump", "toLuckyFlopActivity", "toMainActivity", "tab", "showWithdrawal", "toMotionRecordsActivity", "toNewPersonCashActivity", "toNineGridActionActivity", "toOpenLocationPermissionActivity", "toOptimizeActivity", "type", "toReceiveCashActivity", "toReceiveCoinLogActivity", "toRedRainActivity", "toScreenActivity", "toTaskCoinLogActivity", "toTaskMyBalanceActivity", "toTaskMyPrivacySettingActivity", "toTaskMySettingActivity", "isBindWx", "toWithdrawalHistoryActivity", "toWithdrawalMoneyActivity", "common_module_release"})
public final class MyActivityUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.MyActivityUtils INSTANCE = null;
    private static final com.alibaba.android.arouter.launcher.ARouter aRouter = null;
    private static final kotlin.Lazy audit$delegate = null;
    private static final kotlin.Lazy path$delegate = null;
    private static final kotlin.Lazy jlPath$delegate = null;
    
    private MyActivityUtils() {
        super();
    }
    
    private final java.lang.String getAudit() {
        return null;
    }
    
    private final java.lang.String getPath() {
        return null;
    }
    
    private final java.lang.String getJlPath() {
        return null;
    }
    
    private final java.lang.String getAuditRoutPath() {
        return null;
    }
    
    private final java.lang.String getRoutPath() {
        return null;
    }
    
    private final java.lang.String getJlRoutPath() {
        return null;
    }
    
    private final boolean isShowJlUI() {
        return false;
    }
    
    public final void toAuditMainActivity() {
    }
    
    public final void toAuditDetailActivity(int num, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
    
    public final void toAuditMyInfoActivity() {
    }
    
    public final void toAuditMyAboutActivity() {
    }
    
    public final void toAuditAboutUsActivity() {
    }
    
    public final void toMotionRecordsActivity() {
    }
    
    public final void toScreenActivity(int jump) {
    }
    
    public final void toHomeSplashActivity(int jump) {
    }
    
    public final void toMainActivity(int tab, int jump) {
    }
    
    public final void toMainActivity(int tab, boolean showWithdrawal) {
    }
    
    /**
     * 打开进入wifi加速页面
     */
    public final void toEntryWifiAccelerationActivity() {
    }
    
    /**
     * 打开进入引导优化页面
     */
    public final void toGuideOptimizeActivity(int way) {
    }
    
    /**
     * 打开进入优化页面
     */
    public final void toOptimizeActivity(int type) {
    }
    
    public final void toRedRainActivity() {
    }
    
    public final void toBigWheelActivity() {
    }
    
    public final void toDayDayGetRedActivity() {
    }
    
    public final void toLuckyFlopActivity() {
    }
    
    public final void toNewPersonCashActivity() {
    }
    
    public final void toCoinLogActivity() {
    }
    
    public final void toAnswerQuestionsActivity() {
    }
    
    public final void toReceiveCashActivity() {
    }
    
    public final void toReceiveCoinLogActivity() {
    }
    
    public final void toWithdrawalMoneyActivity() {
    }
    
    public final void toWithdrawalHistoryActivity() {
    }
    
    public final void toNineGridActionActivity() {
    }
    
    public final void toGuessActionActivity() {
    }
    
    public final void toEveryActionActivity() {
    }
    
    public final void toTaskCoinLogActivity() {
    }
    
    public final void toTaskMyBalanceActivity() {
    }
    
    public final void toTaskMyPrivacySettingActivity() {
    }
    
    public final void toTaskMySettingActivity(boolean isBindWx) {
    }
    
    public final void toAddCityActivity() {
    }
    
    public final void toOpenLocationPermissionActivity() {
    }
    
    /**
     * 跳转到webview
     */
    public final void startBaseWebViewActivity(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String url, boolean hide) {
    }
    
    public final void startAppActivity(@org.jetbrains.annotations.Nullable
    android.app.Activity activity, int openType, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String title) {
    }
    
    private final void startOutUrlActivity(android.app.Activity activity, java.lang.String url) {
    }
    
    private final void startUrlSkip(android.content.Context context, java.lang.String url, java.lang.String title) {
    }
    
    private final void startActivity(java.lang.String url) {
    }
}
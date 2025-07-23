package com.sq.common_module.common.utils.kt;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.hjq.toast.Toaster;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.UIUtils;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\t\u001a\u00020\n2#\b\u0004\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\n0\fH\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0086\b\u00f8\u0001\u0000\u001a\u0006\u0010\u0014\u001a\u00020\u0005\u001a\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0006\u0010\u0016\u001a\u00020\u0001\u001a%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u001b\u001a/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u001f\u001a%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u0019\u001a\u00020!2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\"\u001a\u000e\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%\u001a\u0006\u0010&\u001a\u00020\u0005\u001a\u0010\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001e2\b\b\u0002\u0010,\u001a\u00020\u0001\u001a\u0006\u0010-\u001a\u00020\r\u001a\u0006\u0010.\u001a\u00020\r\u001a\u0006\u0010/\u001a\u00020\r\u001a\u0006\u00100\u001a\u00020\r\u001a\u0006\u00101\u001a\u00020\r\u001a\u0006\u00102\u001a\u00020\r\u001a\u0006\u00103\u001a\u00020\r\u001a\u0006\u00104\u001a\u00020\r\u001a\u0006\u00105\u001a\u00020\r\u001a\u0006\u00106\u001a\u00020\r\u001a\u0006\u00107\u001a\u00020\r\u001a\u0006\u00108\u001a\u00020\r\u001a\u0006\u00109\u001a\u00020\r\u001a\u0006\u0010:\u001a\u00020\r\u001a\u0006\u0010;\u001a\u00020\r\u001a\u0006\u0010<\u001a\u00020\r\u001a\u0006\u0010=\u001a\u00020\r\u001a\u0018\u0010>\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u0005\u001a\u0016\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020\u0001\u001a\u001a\u0010D\u001a\u00020\n2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0086\b\u00f8\u0001\u0000\u001a\u000e\u0010F\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0005\u001a\u0018\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001\u001a\u0006\u0010K\u001a\u00020\r\u001a\u0006\u0010L\u001a\u00020\r\u001a,\u0010M\u001a\u00020\n*\u00020\r2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0086\b\u00f8\u0001\u0000\u001aI\u0010P\u001a\u00020\n\"\u0004\b\u0000\u0010Q*\u00020R2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HQ0T2#\b\u0004\u0010U\u001a\u001d\u0012\u0013\u0012\u0011HQ\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0086\b\u00f8\u0001\u0000\u001a\n\u0010V\u001a\u00020\u0005*\u00020\u0001\u001a\u0012\u0010W\u001a\u00020\n*\u00020X2\u0006\u0010Y\u001a\u00020\r\u001a\u001a\u0010Z\u001a\u00020\n*\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\r\u001a \u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0_\"\b\b\u0000\u0010Q*\u00020**\b\u0012\u0004\u0012\u0002HQ0_\u001a\f\u0010`\u001a\u00020\n*\u00020\u0001H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006a"}, d2 = {"KEY_CURRENT_TIME", "", "debugUrl", "mProgressList", "Ljava/util/ArrayList;", "", "getMProgressList", "()Ljava/util/ArrayList;", "releaseUrl", "checkAppListPermission", "", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "b", "commonTryCatch", "t", "Lkotlin/Function0;", "getAppWidgetEveryShowTime", "getBaseUrl", "getCurrentDay", "getDownTimer", "Lkotlinx/coroutines/flow/Flow;", "time", "isReverse", "(ILjava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getDownTimerCustom", "unitTime", "", "(IJLjava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getDownTimerMS", "", "(FLjava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getFeedWidth", "context", "Landroid/content/Context;", "getRandomProgress", "getRequestBody", "Lokhttp3/RequestBody;", "any", "", "getTimeFormat", "formatStr", "handleAttributeUser", "is20005P", "isAudit", "isHUAWEI", "isLessAdMode", "isNoAndroidId", "isOppoChanceL", "isPushFeedApp", "isSpecialGdt", "isSpecialOppo", "isSpecialVivo", "isVIVO", "isVivo", "isXIAOMI", "isXiaomi", "isXxlJl", "isYingyongbao", "loadImageRes", "imageView", "Landroid/widget/ImageView;", "res", "loadImageUrl", "url", "loginDoNext", "next", "secondChangeDetail", "setAnyText", "textView", "Landroid/widget/TextView;", "s", "showLoadRewardTips", "singleClick", "handleBool", "block1", "block2", "observe", "T", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "parseColor", "setEnable", "Landroid/view/View;", "enable", "showCloseView", "life", "Landroidx/lifecycle/LifecycleCoroutineScope;", "loadSuccess", "simpleObservable", "Lio/reactivex/rxjava3/core/Observable;", "toast", "common_module_release"})
public final class CommonUtilsKt {
    
    /**
     * Created by town
     * Date :  2022/10/11
     * Time : 15:20
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String debugUrl = "https://earn-api.shengqu360.com/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String releaseUrl = "https://earn-api.shengqu360.com/";
    private static final java.lang.String KEY_CURRENT_TIME = "currentTime";
    @org.jetbrains.annotations.NotNull
    private static final java.util.ArrayList<java.lang.Integer> mProgressList = null;
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getBaseUrl() {
        return null;
    }
    
    @kotlinx.coroutines.DelicateCoroutinesApi
    public static final void toast(@org.jetbrains.annotations.NotNull
    java.lang.String $this$toast) {
    }
    
    public static final void handleBool(boolean $this$handleBool, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block1, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block2) {
    }
    
    public static final void loginDoNext(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> next) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>io.reactivex.rxjava3.core.Observable<T> simpleObservable(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.core.Observable<T> $this$simpleObservable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> getDownTimer(int time, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isReverse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> getDownTimerMS(float time, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isReverse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> getDownTimerCustom(int time, long unitTime, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isReverse) {
        return null;
    }
    
    /**
     * 获取参数的json形式
     */
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.RequestBody getRequestBody(@org.jetbrains.annotations.Nullable
    java.lang.Object any) {
        return null;
    }
    
    /**
     * 加载图片
     */
    public static final void loadImageUrl(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    /**
     * 加载图片
     */
    public static final void loadImageRes(@org.jetbrains.annotations.Nullable
    android.widget.ImageView imageView, int res) {
    }
    
    /**
     * *
     * textView设置值
     */
    public static final void setAnyText(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable
    java.lang.String s) {
    }
    
    /**
     * 秒转成时分秒
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String secondChangeDetail(int time) {
        return null;
    }
    
    /**
     * 秒转成年月日
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getTimeFormat(long time, @org.jetbrains.annotations.NotNull
    java.lang.String formatStr) {
        return null;
    }
    
    public static final boolean singleClick() {
        return false;
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.ArrayList<java.lang.Integer> getMProgressList() {
        return null;
    }
    
    public static final int getRandomProgress() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCurrentDay() {
        return null;
    }
    
    public static final void setEnable(@org.jetbrains.annotations.NotNull
    android.view.View $this$setEnable, boolean enable) {
    }
    
    public static final boolean isLessAdMode() {
        return false;
    }
    
    public static final boolean isOppoChanceL() {
        return false;
    }
    
    public static final boolean isAudit() {
        return false;
    }
    
    public static final int getAppWidgetEveryShowTime() {
        return 0;
    }
    
    public static final void commonTryCatch(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> t) {
    }
    
    public static final boolean isHUAWEI() {
        return false;
    }
    
    public static final boolean isNoAndroidId() {
        return false;
    }
    
    /**
     * 华为归因特殊处理和非华为
     */
    public static final boolean handleAttributeUser() {
        return false;
    }
    
    public static final boolean isVIVO() {
        return false;
    }
    
    public static final boolean isXIAOMI() {
        return false;
    }
    
    public static final int getFeedWidth(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    public static final boolean isPushFeedApp() {
        return false;
    }
    
    public static final void showCloseView(@org.jetbrains.annotations.NotNull
    android.view.View $this$showCloseView, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope life, boolean loadSuccess) {
    }
    
    public static final boolean is20005P() {
        return false;
    }
    
    public static final boolean isSpecialOppo() {
        return false;
    }
    
    public static final boolean isVivo() {
        return false;
    }
    
    public static final boolean isXxlJl() {
        return false;
    }
    
    public static final int parseColor(@org.jetbrains.annotations.NotNull
    java.lang.String $this$parseColor) {
        return 0;
    }
    
    public static final boolean isSpecialVivo() {
        return false;
    }
    
    public static final boolean showLoadRewardTips() {
        return false;
    }
    
    public static final boolean isXiaomi() {
        return false;
    }
    
    public static final boolean isSpecialGdt() {
        return false;
    }
    
    public static final boolean isYingyongbao() {
        return false;
    }
    
    /**
     * 校验权限：已安装应用列表
     * 部分国产手机有该魔改的权限
     * xml加 <uses-permission android:name="com.android.permission.GET_INSTALLED_APPS" />
     */
    public static final void checkAppListPermission(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
}
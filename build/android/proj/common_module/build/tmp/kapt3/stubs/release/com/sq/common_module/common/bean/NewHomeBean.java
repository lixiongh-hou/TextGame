package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\u0006\u0010!\u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020\f\u00a2\u0006\u0002\u0010#J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\t\u0010B\u001a\u00020\u0016H\u00c6\u0003J\t\u0010C\u001a\u00020\u0016H\u00c6\u0003J\t\u0010D\u001a\u00020\u0016H\u00c6\u0003J\t\u0010E\u001a\u00020\u0011H\u00c6\u0003J\t\u0010F\u001a\u00020\fH\u00c6\u0003J\t\u0010G\u001a\u00020\fH\u00c6\u0003J\t\u0010H\u001a\u00020\fH\u00c6\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\fH\u00c6\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020 0\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\fH\u00c6\u0003J\t\u0010N\u001a\u00020\fH\u00c6\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\nH\u00c6\u0003J\t\u0010R\u001a\u00020\fH\u00c6\u0003J\t\u0010S\u001a\u00020\fH\u00c6\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0011H\u00c6\u0003J\u009d\u0002\u0010V\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u00c6\u0001J\t\u0010W\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u00d6\u0003J\t\u0010[\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\\\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u001b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010-R\u0011\u0010\u001c\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010-R\u0011\u0010\u001d\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010-R\u0011\u0010\u001a\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010-R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\u0018\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u0019\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\"\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010!\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u0014\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101\u00a8\u0006b"}, d2 = {"Lcom/sq/common_module/common/bean/NewHomeBean;", "Landroid/os/Parcelable;", "fixedFloat", "", "Lcom/sq/common_module/common/bean/FixedFloatBean;", "float", "hotActivities", "", "howToEarnMoney", "middleOpSite", "Lcom/sq/common_module/common/bean/MiddleOpSiteBean;", "showNewUserWithdraw", "", "showSevenDayPopup", "topFloatActivity", "Lcom/sq/common_module/common/bean/TopFloatActivity;", "uid", "", "userAmount", "userCoin", "watchAdWithdraw", "flowAdInfo", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "fullAdInfo", "stimulateAdInfo", "todayGetCashRedBagTimes", "isRedBagForNew", "isBindWx", "isBindZfb", "isFirstIn", "list", "listNew", "Lcom/sq/common_module/common/bean/ListNew;", "todayIsSign", "todayIsJoinTwoDaysQuickWithdraw", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sq/common_module/common/bean/MiddleOpSiteBean;ZZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sq/common_module/common/bean/MiddleOpSiteBean;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;IZZZZLjava/util/List;Ljava/util/List;ZZ)V", "getFixedFloat", "()Ljava/util/List;", "getFloat", "getFlowAdInfo", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getFullAdInfo", "getHotActivities", "getHowToEarnMoney", "()Ljava/lang/String;", "()Z", "getList", "getListNew", "getMiddleOpSite", "()Lcom/sq/common_module/common/bean/MiddleOpSiteBean;", "getShowNewUserWithdraw", "getShowSevenDayPopup", "getStimulateAdInfo", "getTodayGetCashRedBagTimes", "()I", "getTodayIsJoinTwoDaysQuickWithdraw", "getTodayIsSign", "getTopFloatActivity", "getUid", "getUserAmount", "getUserCoin", "getWatchAdWithdraw", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_module_release"})
public final class NewHomeBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.FixedFloatBean> fixedFloat = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> hotActivities = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String howToEarnMoney = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.MiddleOpSiteBean middleOpSite = null;
    private final boolean showNewUserWithdraw = false;
    private final boolean showSevenDayPopup = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.TopFloatActivity> topFloatActivity = null;
    private final int uid = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userCoin = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.MiddleOpSiteBean watchAdWithdraw = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo flowAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo fullAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo = null;
    private final int todayGetCashRedBagTimes = 0;
    private final boolean isRedBagForNew = false;
    private final boolean isBindWx = false;
    private final boolean isBindZfb = false;
    private final boolean isFirstIn = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> list = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ListNew> listNew = null;
    private final boolean todayIsSign = false;
    private final boolean todayIsJoinTwoDaysQuickWithdraw = false;
    public static final android.os.Parcelable.Creator<com.sq.common_module.common.bean.NewHomeBean> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.NewHomeBean copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.FixedFloatBean> fixedFloat, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.FixedFloatBean> p1_48763182, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> hotActivities, @org.jetbrains.annotations.NotNull
    java.lang.String howToEarnMoney, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean middleOpSite, boolean showNewUserWithdraw, boolean showSevenDayPopup, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.TopFloatActivity> topFloatActivity, int uid, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, @org.jetbrains.annotations.NotNull
    java.lang.String userCoin, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean watchAdWithdraw, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, int todayGetCashRedBagTimes, boolean isRedBagForNew, boolean isBindWx, boolean isBindZfb, boolean isFirstIn, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ListNew> listNew, boolean todayIsSign, boolean todayIsJoinTwoDaysQuickWithdraw) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public NewHomeBean(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.FixedFloatBean> fixedFloat, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.FixedFloatBean> p1_48763182, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> hotActivities, @org.jetbrains.annotations.NotNull
    java.lang.String howToEarnMoney, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean middleOpSite, boolean showNewUserWithdraw, boolean showSevenDayPopup, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.TopFloatActivity> topFloatActivity, int uid, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, @org.jetbrains.annotations.NotNull
    java.lang.String userCoin, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean watchAdWithdraw, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, int todayGetCashRedBagTimes, boolean isRedBagForNew, boolean isBindWx, boolean isBindZfb, boolean isFirstIn, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ListNew> listNew, boolean todayIsSign, boolean todayIsJoinTwoDaysQuickWithdraw) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.FixedFloatBean> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.FixedFloatBean> getFixedFloat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.FixedFloatBean> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.FixedFloatBean> getFloat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getHotActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHowToEarnMoney() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean getMiddleOpSite() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getShowNewUserWithdraw() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getShowSevenDayPopup() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.TopFloatActivity> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.TopFloatActivity> getTopFloatActivity() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean getWatchAdWithdraw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFlowAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFullAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getStimulateAdInfo() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getTodayGetCashRedBagTimes() {
        return 0;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean isRedBagForNew() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean isBindWx() {
        return false;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean isBindZfb() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean isFirstIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ListNew> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ListNew> getListNew() {
        return null;
    }
    
    public final boolean component23() {
        return false;
    }
    
    public final boolean getTodayIsSign() {
        return false;
    }
    
    public final boolean component24() {
        return false;
    }
    
    public final boolean getTodayIsJoinTwoDaysQuickWithdraw() {
        return false;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.sq.common_module.common.bean.NewHomeBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.NewHomeBean createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.NewHomeBean[] newArray(int size) {
            return null;
        }
    }
}
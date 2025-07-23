package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010/\u001a\u00020\u0013H\u00c6\u0003J\t\u00100\u001a\u00020\u0013H\u00c6\u0003J\t\u00101\u001a\u00020\u0013H\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\u00ad\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001J\t\u0010@\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010!R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#\u00a8\u0006A"}, d2 = {"Lcom/sq/common_module/common/bean/HomeWithdrawalBean;", "", "adNetwork", "", "adSiteId", "", "adUnitType", "rule", "twoDaysWithdrawBanner", "userAmount", "userBindWx", "", "userBindZfb", "watchAdWithdraw", "Lcom/sq/common_module/common/bean/WatchAdWithdrawBean;", "withdrawGoods", "", "Lcom/sq/common_module/common/bean/WithdrawGoodBean;", "stimulateAdInfo", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "fullAdInfo", "flowAdInfo", "isGetNewUserQuicklyWithdraw", "list", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/sq/common_module/common/bean/WatchAdWithdrawBean;Ljava/util/List;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;ZLjava/util/List;)V", "getAdNetwork", "()I", "getAdSiteId", "()Ljava/lang/String;", "getAdUnitType", "getFlowAdInfo", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getFullAdInfo", "()Z", "getList", "()Ljava/util/List;", "getRule", "getStimulateAdInfo", "getTwoDaysWithdrawBanner", "getUserAmount", "getUserBindWx", "getUserBindZfb", "getWatchAdWithdraw", "()Lcom/sq/common_module/common/bean/WatchAdWithdrawBean;", "getWithdrawGoods", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class HomeWithdrawalBean {
    private final int adNetwork = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adSiteId = null;
    private final int adUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String twoDaysWithdrawBanner = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userAmount = null;
    private final boolean userBindWx = false;
    private final boolean userBindZfb = false;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.WatchAdWithdrawBean watchAdWithdraw = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.WithdrawGoodBean> withdrawGoods = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo fullAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo flowAdInfo = null;
    private final boolean isGetNewUserQuicklyWithdraw = false;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> list = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.HomeWithdrawalBean copy(int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String twoDaysWithdrawBanner, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, boolean userBindWx, boolean userBindZfb, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WatchAdWithdrawBean watchAdWithdraw, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WithdrawGoodBean> withdrawGoods, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, boolean isGetNewUserQuicklyWithdraw, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> list) {
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
    
    public HomeWithdrawalBean(int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String twoDaysWithdrawBanner, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, boolean userBindWx, boolean userBindZfb, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WatchAdWithdrawBean watchAdWithdraw, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WithdrawGoodBean> withdrawGoods, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, boolean isGetNewUserQuicklyWithdraw, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> list) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getAdNetwork() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdSiteId() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getAdUnitType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTwoDaysWithdrawBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserAmount() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getUserBindWx() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getUserBindZfb() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WatchAdWithdrawBean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WatchAdWithdrawBean getWatchAdWithdraw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WithdrawGoodBean> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WithdrawGoodBean> getWithdrawGoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getStimulateAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFullAdInfo() {
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
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean isGetNewUserQuicklyWithdraw() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getList() {
        return null;
    }
}
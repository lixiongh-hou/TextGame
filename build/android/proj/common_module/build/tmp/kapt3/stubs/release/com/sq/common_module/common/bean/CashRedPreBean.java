package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000fH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\rH\u00c6\u0003J\t\u0010*\u001a\u00020\u000fH\u00c6\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00060"}, d2 = {"Lcom/sq/common_module/common/bean/CashRedPreBean;", "", "todayGetCashRedBagLimitTimes", "", "todayGetCashRedBagTimes", "flowAdInfo", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "fullAdInfo", "stimulateAdInfo", "redBagType", "watchWithdrawInfo", "Lcom/sq/common_module/common/bean/MiddleOpSiteBean;", "activityName", "", "showWithdrawSign", "", "showDailySign", "(IILcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;ILcom/sq/common_module/common/bean/MiddleOpSiteBean;Ljava/lang/String;ZZ)V", "getActivityName", "()Ljava/lang/String;", "getFlowAdInfo", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getFullAdInfo", "getRedBagType", "()I", "getShowDailySign", "()Z", "getShowWithdrawSign", "getStimulateAdInfo", "getTodayGetCashRedBagLimitTimes", "getTodayGetCashRedBagTimes", "getWatchWithdrawInfo", "()Lcom/sq/common_module/common/bean/MiddleOpSiteBean;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class CashRedPreBean {
    private final int todayGetCashRedBagLimitTimes = 0;
    private final int todayGetCashRedBagTimes = 0;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo flowAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo fullAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo = null;
    private final int redBagType = 0;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.MiddleOpSiteBean watchWithdrawInfo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    private final boolean showWithdrawSign = false;
    private final boolean showDailySign = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.CashRedPreBean copy(int todayGetCashRedBagLimitTimes, int todayGetCashRedBagTimes, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, int redBagType, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean watchWithdrawInfo, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, boolean showWithdrawSign, boolean showDailySign) {
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
    
    public CashRedPreBean(int todayGetCashRedBagLimitTimes, int todayGetCashRedBagTimes, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo flowAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo fullAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo stimulateAdInfo, int redBagType, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.MiddleOpSiteBean watchWithdrawInfo, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, boolean showWithdrawSign, boolean showDailySign) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTodayGetCashRedBagLimitTimes() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTodayGetCashRedBagTimes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFlowAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getFullAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getStimulateAdInfo() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getRedBagType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.MiddleOpSiteBean getWatchWithdrawInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityName() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getShowWithdrawSign() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getShowDailySign() {
        return false;
    }
}
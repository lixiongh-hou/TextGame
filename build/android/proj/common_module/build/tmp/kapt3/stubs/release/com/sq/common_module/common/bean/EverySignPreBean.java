package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u0005H\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015\u00a8\u00065"}, d2 = {"Lcom/sq/common_module/common/bean/EverySignPreBean;", "", "activityName", "", "adNetwork", "", "adUnitId", "adUnitType", "rule", "signInfo", "", "Lcom/sq/common_module/common/bean/SignInfo;", "flowAdNetwork", "flowAdUnitType", "flowAdUnitId", "signDays", "todayIsSign", "", "todaySignRewardAmount", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/util/List;IILjava/lang/String;IZLjava/lang/String;)V", "getActivityName", "()Ljava/lang/String;", "getAdNetwork", "()I", "getAdUnitId", "getAdUnitType", "getFlowAdNetwork", "getFlowAdUnitId", "getFlowAdUnitType", "getRule", "getSignDays", "getSignInfo", "()Ljava/util/List;", "getTodayIsSign", "()Z", "getTodaySignRewardAmount", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class EverySignPreBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    private final int adNetwork = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId = null;
    private final int adUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.SignInfo> signInfo = null;
    private final int flowAdNetwork = 0;
    private final int flowAdUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String flowAdUnitId = null;
    private final int signDays = 0;
    private final boolean todayIsSign = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String todaySignRewardAmount = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.EverySignPreBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.SignInfo> signInfo, int flowAdNetwork, int flowAdUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String flowAdUnitId, int signDays, boolean todayIsSign, @org.jetbrains.annotations.NotNull
    java.lang.String todaySignRewardAmount) {
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
    
    public EverySignPreBean(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.SignInfo> signInfo, int flowAdNetwork, int flowAdUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String flowAdUnitId, int signDays, boolean todayIsSign, @org.jetbrains.annotations.NotNull
    java.lang.String todaySignRewardAmount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityName() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAdNetwork() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitId() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getAdUnitType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.SignInfo> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.SignInfo> getSignInfo() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getFlowAdNetwork() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getFlowAdUnitType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFlowAdUnitId() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getSignDays() {
        return 0;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getTodayIsSign() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTodaySignRewardAmount() {
        return null;
    }
}
package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010\u00a2\u0006\u0002\u0010\u001bJ\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u00105\u001a\u00020\u0013H\u00c6\u0003J\t\u00106\u001a\u00020\u0015H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0015H\u00c6\u0003J\t\u00109\u001a\u00020\u0015H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\u00c9\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H\u00c6\u0001J\u0013\u0010D\u001a\u00020\u00152\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010%R\u0011\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001f\u00a8\u0006H"}, d2 = {"Lcom/sq/common_module/common/bean/SignPreData;", "", "activityName", "", "adNetwork", "", "adUnitId", "adUnitType", "currentAmount", "distanceToEndDays", "distanceToHundredAmount", "joinDay", "remainJoinTimes", "rule", "signActivityName", "signData", "", "Lcom/sq/common_module/common/bean/SignData;", "todayExtTimesInfo", "Lcom/sq/common_module/common/bean/TodayExtTimesInfo;", "todayIsSign", "", "todaySignIndex", "isFirstJoin", "isReset", "list", "Lcom/sq/common_module/common/bean/HundredListBean;", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sq/common_module/common/bean/TodayExtTimesInfo;ZIZZLjava/util/List;)V", "getActivityName", "()Ljava/lang/String;", "getAdNetwork", "()I", "getAdUnitId", "getAdUnitType", "getCurrentAmount", "getDistanceToEndDays", "getDistanceToHundredAmount", "()Z", "getJoinDay", "getList", "()Ljava/util/List;", "getRemainJoinTimes", "getRule", "getSignActivityName", "getSignData", "getTodayExtTimesInfo", "()Lcom/sq/common_module/common/bean/TodayExtTimesInfo;", "getTodayIsSign", "getTodaySignIndex", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class SignPreData {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    private final int adNetwork = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId = null;
    private final int adUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currentAmount = null;
    private final int distanceToEndDays = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String distanceToHundredAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String joinDay = null;
    private final int remainJoinTimes = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String signActivityName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.SignData> signData = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.TodayExtTimesInfo todayExtTimesInfo = null;
    private final boolean todayIsSign = false;
    private final int todaySignIndex = 0;
    private final boolean isFirstJoin = false;
    private final boolean isReset = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.HundredListBean> list = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.SignPreData copy(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String currentAmount, int distanceToEndDays, @org.jetbrains.annotations.NotNull
    java.lang.String distanceToHundredAmount, @org.jetbrains.annotations.NotNull
    java.lang.String joinDay, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String signActivityName, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.SignData> signData, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.TodayExtTimesInfo todayExtTimesInfo, boolean todayIsSign, int todaySignIndex, boolean isFirstJoin, boolean isReset, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.HundredListBean> list) {
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
    
    public SignPreData(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String currentAmount, int distanceToEndDays, @org.jetbrains.annotations.NotNull
    java.lang.String distanceToHundredAmount, @org.jetbrains.annotations.NotNull
    java.lang.String joinDay, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String signActivityName, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.SignData> signData, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.TodayExtTimesInfo todayExtTimesInfo, boolean todayIsSign, int todaySignIndex, boolean isFirstJoin, boolean isReset, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.HundredListBean> list) {
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
    public final java.lang.String getCurrentAmount() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getDistanceToEndDays() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistanceToHundredAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJoinDay() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getRemainJoinTimes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSignActivityName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.SignData> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.SignData> getSignData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.TodayExtTimesInfo component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.TodayExtTimesInfo getTodayExtTimesInfo() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getTodayIsSign() {
        return false;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getTodaySignIndex() {
        return 0;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isFirstJoin() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean isReset() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.HundredListBean> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.HundredListBean> getList() {
        return null;
    }
}
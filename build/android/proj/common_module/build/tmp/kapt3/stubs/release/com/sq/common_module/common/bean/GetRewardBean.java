package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\u00c9\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003H\u00c6\u0001J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0006H\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b\u00a8\u0006M"}, d2 = {"Lcom/sq/common_module/common/bean/GetRewardBean;", "Landroid/os/Parcelable;", "rewardCoin", "", "userCoin", "rewardType", "", "nextCanJoinActivityName", "rewardLogId", "nextJoinTime", "userAmount", "rewardArrIndex", "adUnitType", "adUnitId", "nextActivityAdNetwork", "nextActivityAdUnitType", "nextActivityAdUnitId", "currentActivityName", "rewardCoinAmount", "distanceToLowestWithdrawAmount", "adNetwork", "quickWithdrawAmount", "withdrawOrderId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAdNetwork", "()I", "getAdUnitId", "()Ljava/lang/String;", "getAdUnitType", "getCurrentActivityName", "getDistanceToLowestWithdrawAmount", "getNextActivityAdNetwork", "getNextActivityAdUnitId", "getNextActivityAdUnitType", "getNextCanJoinActivityName", "getNextJoinTime", "getQuickWithdrawAmount", "getRewardArrIndex", "getRewardCoin", "getRewardCoinAmount", "getRewardLogId", "getRewardType", "getUserAmount", "getUserCoin", "getWithdrawOrderId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_module_release"})
public final class GetRewardBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rewardCoin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userCoin = null;
    private final int rewardType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nextCanJoinActivityName = null;
    private final int rewardLogId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nextJoinTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userAmount = null;
    private final int rewardArrIndex = 0;
    private final int adUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId = null;
    private final int nextActivityAdNetwork = 0;
    private final int nextActivityAdUnitType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nextActivityAdUnitId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currentActivityName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rewardCoinAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String distanceToLowestWithdrawAmount = null;
    private final int adNetwork = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String quickWithdrawAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String withdrawOrderId = null;
    public static final android.os.Parcelable.Creator<com.sq.common_module.common.bean.GetRewardBean> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.GetRewardBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String rewardCoin, @org.jetbrains.annotations.NotNull
    java.lang.String userCoin, int rewardType, @org.jetbrains.annotations.NotNull
    java.lang.String nextCanJoinActivityName, int rewardLogId, @org.jetbrains.annotations.NotNull
    java.lang.String nextJoinTime, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, int rewardArrIndex, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int nextActivityAdNetwork, int nextActivityAdUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String nextActivityAdUnitId, @org.jetbrains.annotations.NotNull
    java.lang.String currentActivityName, @org.jetbrains.annotations.NotNull
    java.lang.String rewardCoinAmount, @org.jetbrains.annotations.NotNull
    java.lang.String distanceToLowestWithdrawAmount, int adNetwork, @org.jetbrains.annotations.Nullable
    java.lang.String quickWithdrawAmount, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawOrderId) {
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
    
    public GetRewardBean(@org.jetbrains.annotations.NotNull
    java.lang.String rewardCoin, @org.jetbrains.annotations.NotNull
    java.lang.String userCoin, int rewardType, @org.jetbrains.annotations.NotNull
    java.lang.String nextCanJoinActivityName, int rewardLogId, @org.jetbrains.annotations.NotNull
    java.lang.String nextJoinTime, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, int rewardArrIndex, int adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int nextActivityAdNetwork, int nextActivityAdUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String nextActivityAdUnitId, @org.jetbrains.annotations.NotNull
    java.lang.String currentActivityName, @org.jetbrains.annotations.NotNull
    java.lang.String rewardCoinAmount, @org.jetbrains.annotations.NotNull
    java.lang.String distanceToLowestWithdrawAmount, int adNetwork, @org.jetbrains.annotations.Nullable
    java.lang.String quickWithdrawAmount, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawOrderId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRewardCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserCoin() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getRewardType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNextCanJoinActivityName() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getRewardLogId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNextJoinTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserAmount() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getRewardArrIndex() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getAdUnitType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitId() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getNextActivityAdNetwork() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getNextActivityAdUnitType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNextActivityAdUnitId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentActivityName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRewardCoinAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistanceToLowestWithdrawAmount() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getAdNetwork() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getQuickWithdrawAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWithdrawOrderId() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.sq.common_module.common.bean.GetRewardBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.GetRewardBean createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.GetRewardBean[] newArray(int size) {
            return null;
        }
    }
}
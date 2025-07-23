package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0010H\u00c6\u0003J\t\u0010.\u001a\u00020\u0013H\u00c6\u0003J\t\u0010/\u001a\u00020\u0013H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003J\t\u0010;\u001a\u00020\u0010H\u00c6\u0003J\u00bb\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\t\u0010=\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010>\u001a\u00020\u00102\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010&\u00a8\u0006H"}, d2 = {"Lcom/sq/common_module/common/bean/ShakePreBean;", "Landroid/os/Parcelable;", "shakeCoin", "", "shakeAmount", "leftSeconds", "", "times", "nextExtra", "activityName", "", "Lcom/sq/common_module/common/bean/GuessActivity;", "list", "Lcom/sq/common_module/common/bean/ShakeListBean;", "list2", "isFirstJoin", "", "isReset", "getReward", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "skipReward", "progress", "oneDayLeftSeconds", "isBindWx", "rule", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Ljava/lang/String;IZLjava/lang/String;)V", "getActivityName", "()Ljava/util/List;", "getGetReward", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "()Z", "getLeftSeconds", "()I", "getList", "getList2", "getNextExtra", "getOneDayLeftSeconds", "getProgress", "()Ljava/lang/String;", "getRule", "getShakeAmount", "getShakeCoin", "getSkipReward", "getTimes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_module_release"})
public final class ShakePreBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shakeCoin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shakeAmount = null;
    private final int leftSeconds = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String times = null;
    private final int nextExtra = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.GuessActivity> activityName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ShakeListBean> list = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ShakeListBean> list2 = null;
    private final boolean isFirstJoin = false;
    private final boolean isReset = false;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo getReward = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo skipReward = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String progress = null;
    private final int oneDayLeftSeconds = 0;
    private final boolean isBindWx = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    public static final android.os.Parcelable.Creator<com.sq.common_module.common.bean.ShakePreBean> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.ShakePreBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String shakeCoin, @org.jetbrains.annotations.NotNull
    java.lang.String shakeAmount, int leftSeconds, @org.jetbrains.annotations.NotNull
    java.lang.String times, int nextExtra, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activityName, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list2, boolean isFirstJoin, boolean isReset, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    java.lang.String progress, int oneDayLeftSeconds, boolean isBindWx, @org.jetbrains.annotations.NotNull
    java.lang.String rule) {
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
    
    public ShakePreBean(@org.jetbrains.annotations.NotNull
    java.lang.String shakeCoin, @org.jetbrains.annotations.NotNull
    java.lang.String shakeAmount, int leftSeconds, @org.jetbrains.annotations.NotNull
    java.lang.String times, int nextExtra, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activityName, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list2, boolean isFirstJoin, boolean isReset, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    java.lang.String progress, int oneDayLeftSeconds, boolean isBindWx, @org.jetbrains.annotations.NotNull
    java.lang.String rule) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShakeCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShakeAmount() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getLeftSeconds() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimes() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getNextExtra() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> getActivityName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> getList2() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isFirstJoin() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean isReset() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getGetReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getSkipReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProgress() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getOneDayLeftSeconds() {
        return 0;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean isBindWx() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.sq.common_module.common.bean.ShakePreBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.ShakePreBean createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.ShakePreBean[] newArray(int size) {
            return null;
        }
    }
}
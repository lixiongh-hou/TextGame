package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0015H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\fH\u00c6\u0003J\t\u00102\u001a\u00020\u000eH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\u00bb\u0001\u00104\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\t\u00105\u001a\u00020\u0015H\u00d6\u0001J\u0013\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\u0015H\u00d6\u0001J\t\u0010:\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018\u00a8\u0006@"}, d2 = {"Lcom/sq/common_module/common/bean/WifiPreBean;", "Landroid/os/Parcelable;", "activities", "", "Lcom/sq/common_module/common/bean/ActionListBean;", "dimension", "Lcom/sq/common_module/common/bean/DimensionBean;", "clean", "cleanTools", "cleanV2", "items", "infoAd", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "isWatchAdFirst", "", "rewardAd", "skipReward", "tools", "wifiList", "", "uid", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sq/common_module/common/bean/RewardAdInfo;ZLcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Ljava/util/List;Ljava/util/List;I)V", "getActivities", "()Ljava/util/List;", "getClean", "getCleanTools", "getCleanV2", "getDimension", "getInfoAd", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "()Z", "getItems", "getRewardAd", "getSkipReward", "getTools", "getUid", "()I", "getWifiList", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_module_release"})
public final class WifiPreBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ActionListBean> activities = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.DimensionBean> dimension = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ActionListBean> clean = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanTools = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanV2 = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.DimensionBean> items = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo infoAd = null;
    private final boolean isWatchAdFirst = false;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo rewardAd = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo skipReward = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.DimensionBean> tools = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> wifiList = null;
    private final int uid = 0;
    public static final android.os.Parcelable.Creator<com.sq.common_module.common.bean.WifiPreBean> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WifiPreBean copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ActionListBean> activities, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> dimension, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ActionListBean> clean, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanTools, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanV2, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> items, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo infoAd, boolean isWatchAdFirst, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo rewardAd, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> tools, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> wifiList, int uid) {
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
    
    public WifiPreBean(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ActionListBean> activities, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> dimension, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ActionListBean> clean, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanTools, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> cleanV2, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> items, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo infoAd, boolean isWatchAdFirst, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo rewardAd, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.DimensionBean> tools, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> wifiList, int uid) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ActionListBean> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ActionListBean> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> getDimension() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ActionListBean> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ActionListBean> getClean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> getCleanTools() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> getCleanV2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getInfoAd() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isWatchAdFirst() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getRewardAd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getSkipReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.DimensionBean> getTools() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getWifiList() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.sq.common_module.common.bean.WifiPreBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.WifiPreBean createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.WifiPreBean[] newArray(int size) {
            return null;
        }
    }
}
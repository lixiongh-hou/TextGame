package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015\u00a2\u0006\u0002\u0010\u001eJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0011H\u00c6\u0003J\t\u0010<\u001a\u00020\u0011H\u00c6\u0003J\t\u0010=\u001a\u00020\u0011H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u00c6\u0003J\t\u0010E\u001a\u00020\u0007H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\u00e9\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u00c6\u0001J\u0013\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010O\u001a\u00020\u0005H\u00d6\u0001J\t\u0010P\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010%R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u001a\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\'\"\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\"\u00a8\u0006Q"}, d2 = {"Lcom/sq/common_module/common/bean/NineGridPreBean;", "", "isTodayFirst", "", "remainJoinTimes", "", "pieces", "", "isAddTimes", "joinTimesProgress1", "joinTimesProgress2", "joinTimesProgress3", "progress0CanGet", "progress1CanGet", "progress2CanGet", "progress3CanGet", "getReward", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "skipReward", "adInfo", "prizes", "", "Lcom/sq/common_module/common/bean/NineGridPrizeBean;", "activityNames", "Lcom/sq/common_module/common/bean/GuessActivity;", "rule", "name", "img", "list", "Lcom/sq/common_module/common/bean/ShakeListBean;", "(ZILjava/lang/String;ZIIIZZZZLcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getActivityNames", "()Ljava/util/List;", "getAdInfo", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getGetReward", "getImg", "()Z", "getJoinTimesProgress1", "()I", "getJoinTimesProgress2", "getJoinTimesProgress3", "getList", "getName", "()Ljava/lang/String;", "getPieces", "getPrizes", "getProgress0CanGet", "getProgress1CanGet", "getProgress2CanGet", "getProgress3CanGet", "getRemainJoinTimes", "setRemainJoinTimes", "(I)V", "getRule", "getSkipReward", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class NineGridPreBean {
    private final boolean isTodayFirst = false;
    private int remainJoinTimes;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pieces = null;
    private final boolean isAddTimes = false;
    private final int joinTimesProgress1 = 0;
    private final int joinTimesProgress2 = 0;
    private final int joinTimesProgress3 = 0;
    private final boolean progress0CanGet = false;
    private final boolean progress1CanGet = false;
    private final boolean progress2CanGet = false;
    private final boolean progress3CanGet = false;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo getReward = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo skipReward = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo adInfo = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> prizes = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.GuessActivity> activityNames = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> img = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ShakeListBean> list = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.NineGridPreBean copy(boolean isTodayFirst, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String pieces, boolean isAddTimes, int joinTimesProgress1, int joinTimesProgress2, int joinTimesProgress3, boolean progress0CanGet, boolean progress1CanGet, boolean progress2CanGet, boolean progress3CanGet, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> prizes, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activityNames, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> img, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list) {
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
    
    public NineGridPreBean(boolean isTodayFirst, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String pieces, boolean isAddTimes, int joinTimesProgress1, int joinTimesProgress2, int joinTimesProgress3, boolean progress0CanGet, boolean progress1CanGet, boolean progress2CanGet, boolean progress3CanGet, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo adInfo, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> prizes, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activityNames, @org.jetbrains.annotations.NotNull
    java.lang.String rule, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> img, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeListBean> list) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isTodayFirst() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getRemainJoinTimes() {
        return 0;
    }
    
    public final void setRemainJoinTimes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPieces() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isAddTimes() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getJoinTimesProgress1() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getJoinTimesProgress2() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getJoinTimesProgress3() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getProgress0CanGet() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getProgress1CanGet() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getProgress2CanGet() {
        return false;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getProgress3CanGet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getGetReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getSkipReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> getPrizes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> getActivityNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getImg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeListBean> getList() {
        return null;
    }
}
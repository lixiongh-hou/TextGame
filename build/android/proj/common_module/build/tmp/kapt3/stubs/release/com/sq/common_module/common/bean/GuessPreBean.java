package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

/**
 * Created by town
 * Date :  2022/12/23
 * Time : 15:32
 */
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0015H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u009d\u0001\u00104\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\t\u00105\u001a\u00020\bH\u00d6\u0001J\u0013\u00106\u001a\u00020\u00152\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\bH\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010 R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c\u00a8\u0006A"}, d2 = {"Lcom/sq/common_module/common/bean/GuessPreBean;", "Landroid/os/Parcelable;", "activities", "", "Lcom/sq/common_module/common/bean/GuessActivity;", "getReward", "Lcom/sq/common_module/common/bean/RewardAdInfo;", "getTimes", "", "idiomQuestionLevel", "idiomQuestionProgress", "leftTime", "levelMap", "Lcom/sq/common_module/common/bean/LevelMap;", "questions", "Lcom/sq/common_module/common/bean/GuessQuestionBean;", "skipReward", "infoAd", "todayTimes", "nextLevelNeedRounds", "isBindWx", "", "(Ljava/util/List;Lcom/sq/common_module/common/bean/RewardAdInfo;IIIILjava/util/List;Ljava/util/List;Lcom/sq/common_module/common/bean/RewardAdInfo;Lcom/sq/common_module/common/bean/RewardAdInfo;IIZ)V", "getActivities", "()Ljava/util/List;", "getGetReward", "()Lcom/sq/common_module/common/bean/RewardAdInfo;", "getGetTimes", "()I", "getIdiomQuestionLevel", "getIdiomQuestionProgress", "getInfoAd", "()Z", "getLeftTime", "getLevelMap", "getNextLevelNeedRounds", "getQuestions", "getSkipReward", "getTodayTimes", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_module_release"})
public final class GuessPreBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.GuessActivity> activities = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo getReward = null;
    private final int getTimes = 0;
    private final int idiomQuestionLevel = 0;
    private final int idiomQuestionProgress = 0;
    private final int leftTime = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.LevelMap> levelMap = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.GuessQuestionBean> questions = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo skipReward = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RewardAdInfo infoAd = null;
    private final int todayTimes = 0;
    private final int nextLevelNeedRounds = 0;
    private final boolean isBindWx = false;
    public static final android.os.Parcelable.Creator<com.sq.common_module.common.bean.GuessPreBean> CREATOR = null;
    
    /**
     * Created by town
     * Date :  2022/12/23
     * Time : 15:32
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.GuessPreBean copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activities, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, int getTimes, int idiomQuestionLevel, int idiomQuestionProgress, int leftTime, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.LevelMap> levelMap, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessQuestionBean> questions, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo infoAd, int todayTimes, int nextLevelNeedRounds, boolean isBindWx) {
        return null;
    }
    
    /**
     * Created by town
     * Date :  2022/12/23
     * Time : 15:32
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by town
     * Date :  2022/12/23
     * Time : 15:32
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by town
     * Date :  2022/12/23
     * Time : 15:32
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GuessPreBean(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessActivity> activities, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo getReward, int getTimes, int idiomQuestionLevel, int idiomQuestionProgress, int leftTime, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.LevelMap> levelMap, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.GuessQuestionBean> questions, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo skipReward, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RewardAdInfo infoAd, int todayTimes, int nextLevelNeedRounds, boolean isBindWx) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessActivity> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getGetReward() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getGetTimes() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getIdiomQuestionLevel() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getIdiomQuestionProgress() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getLeftTime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.LevelMap> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.LevelMap> getLevelMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessQuestionBean> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.GuessQuestionBean> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getSkipReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RewardAdInfo getInfoAd() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getTodayTimes() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getNextLevelNeedRounds() {
        return 0;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean isBindWx() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.sq.common_module.common.bean.GuessPreBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.GuessPreBean createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.sq.common_module.common.bean.GuessPreBean[] newArray(int size) {
            return null;
        }
    }
}
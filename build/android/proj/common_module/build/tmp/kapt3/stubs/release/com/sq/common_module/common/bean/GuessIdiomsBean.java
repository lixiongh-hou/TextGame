package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/sq/common_module/common/bean/GuessIdiomsBean;", "", "gameLevel", "", "questions", "", "Lcom/sq/common_module/common/bean/QuestionBean;", "todayRemainJoinTimes", "activityName", "", "(ILjava/util/List;ILjava/lang/String;)V", "getActivityName", "()Ljava/lang/String;", "getGameLevel", "()I", "getQuestions", "()Ljava/util/List;", "getTodayRemainJoinTimes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class GuessIdiomsBean {
    private final int gameLevel = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.QuestionBean> questions = null;
    private final int todayRemainJoinTimes = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.GuessIdiomsBean copy(int gameLevel, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.QuestionBean> questions, int todayRemainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String activityName) {
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
    
    public GuessIdiomsBean(int gameLevel, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.QuestionBean> questions, int todayRemainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String activityName) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getGameLevel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.QuestionBean> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.QuestionBean> getQuestions() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTodayRemainJoinTimes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityName() {
        return null;
    }
}
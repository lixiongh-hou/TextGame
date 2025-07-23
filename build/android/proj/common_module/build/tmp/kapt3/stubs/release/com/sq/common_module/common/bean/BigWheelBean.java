package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\tH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006("}, d2 = {"Lcom/sq/common_module/common/bean/BigWheelBean;", "", "activityName", "", "banner", "", "prizes", "Lcom/sq/common_module/common/bean/WheelPrizeBean;", "remainJoinTimes", "", "rule", "adFrom", "adType", "adId", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;IILjava/lang/String;)V", "getActivityName", "()Ljava/lang/String;", "getAdFrom", "()I", "getAdId", "getAdType", "getBanner", "()Ljava/util/List;", "getPrizes", "getRemainJoinTimes", "getRule", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class BigWheelBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> banner = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.WheelPrizeBean> prizes = null;
    private final int remainJoinTimes = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    private final int adFrom = 0;
    private final int adType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adId = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.BigWheelBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> banner, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WheelPrizeBean> prizes, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String rule, int adFrom, int adType, @org.jetbrains.annotations.NotNull
    java.lang.String adId) {
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
    
    public BigWheelBean(@org.jetbrains.annotations.NotNull
    java.lang.String activityName, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> banner, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WheelPrizeBean> prizes, int remainJoinTimes, @org.jetbrains.annotations.NotNull
    java.lang.String rule, int adFrom, int adType, @org.jetbrains.annotations.NotNull
    java.lang.String adId) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WheelPrizeBean> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WheelPrizeBean> getPrizes() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getRemainJoinTimes() {
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
    
    public final int component6() {
        return 0;
    }
    
    public final int getAdFrom() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getAdType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdId() {
        return null;
    }
}
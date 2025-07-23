package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ce\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\tH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019\u00a8\u0006B"}, d2 = {"Lcom/sq/common_module/common/bean/RealTimeWeather;", "", "city", "", "cityid", "country", "day", "Lcom/sq/common_module/common/bean/Day;", "errcode", "", "errmsg", "hours", "", "Lcom/sq/common_module/common/bean/Hour;", "latitude", "leader", "longitude", "month", "Lcom/sq/common_module/common/bean/Month;", "timeZone", "updateTime", "updateTimeFormat", "updateTimeServer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sq/common_module/common/bean/Day;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCityid", "getCountry", "getDay", "()Lcom/sq/common_module/common/bean/Day;", "getErrcode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrmsg", "getHours", "()Ljava/util/List;", "getLatitude", "getLeader", "getLongitude", "getMonth", "getTimeZone", "getUpdateTime", "getUpdateTimeFormat", "getUpdateTimeServer", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sq/common_module/common/bean/Day;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sq/common_module/common/bean/RealTimeWeather;", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class RealTimeWeather {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cityid = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Day day = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer errcode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errmsg = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.sq.common_module.common.bean.Hour> hours = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String latitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String leader = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String longitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.sq.common_module.common.bean.Month> month = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String timeZone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String updateTime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String updateTimeFormat = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String updateTimeServer = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RealTimeWeather copy(@org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String cityid, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Day day, @org.jetbrains.annotations.Nullable
    java.lang.Integer errcode, @org.jetbrains.annotations.Nullable
    java.lang.String errmsg, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Hour> hours, @org.jetbrains.annotations.Nullable
    java.lang.String latitude, @org.jetbrains.annotations.Nullable
    java.lang.String leader, @org.jetbrains.annotations.Nullable
    java.lang.String longitude, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Month> month, @org.jetbrains.annotations.Nullable
    java.lang.String timeZone, @org.jetbrains.annotations.Nullable
    java.lang.String updateTime, @org.jetbrains.annotations.Nullable
    java.lang.String updateTimeFormat, @org.jetbrains.annotations.Nullable
    java.lang.String updateTimeServer) {
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
    
    public RealTimeWeather(@org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String cityid, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Day day, @org.jetbrains.annotations.Nullable
    java.lang.Integer errcode, @org.jetbrains.annotations.Nullable
    java.lang.String errmsg, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Hour> hours, @org.jetbrains.annotations.Nullable
    java.lang.String latitude, @org.jetbrains.annotations.Nullable
    java.lang.String leader, @org.jetbrains.annotations.Nullable
    java.lang.String longitude, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Month> month, @org.jetbrains.annotations.Nullable
    java.lang.String timeZone, @org.jetbrains.annotations.Nullable
    java.lang.String updateTime, @org.jetbrains.annotations.Nullable
    java.lang.String updateTimeFormat, @org.jetbrains.annotations.Nullable
    java.lang.String updateTimeServer) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCityid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Day component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Day getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getErrcode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrmsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Hour> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Hour> getHours() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLatitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLongitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Month> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Month> getMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdateTimeFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdateTimeServer() {
        return null;
    }
}
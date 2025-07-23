package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\fH\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003J\t\u0010.\u001a\u00020\u0010H\u00c6\u0003Jm\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lcom/sq/common_module/common/bean/ToadyWeatherBean;", "", "tips", "", "air_tips", "temperatureDiff1", "temperatureDiff2", "fate", "Lcom/sq/common_module/common/bean/FateX;", "almanac", "Lcom/sq/common_module/common/bean/Almanac;", "infoAdInfo", "Lcom/sq/common_module/common/bean/WInfoAdInfo;", "life", "Lcom/sq/common_module/common/bean/Life;", "realTimeWeather", "Lcom/sq/common_module/common/bean/RealTimeWeather;", "weekWeather", "Lcom/sq/common_module/common/bean/WeekWeather;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sq/common_module/common/bean/FateX;Lcom/sq/common_module/common/bean/Almanac;Lcom/sq/common_module/common/bean/WInfoAdInfo;Lcom/sq/common_module/common/bean/Life;Lcom/sq/common_module/common/bean/RealTimeWeather;Lcom/sq/common_module/common/bean/WeekWeather;)V", "getAir_tips", "()Ljava/lang/String;", "getAlmanac", "()Lcom/sq/common_module/common/bean/Almanac;", "getFate", "()Lcom/sq/common_module/common/bean/FateX;", "getInfoAdInfo", "()Lcom/sq/common_module/common/bean/WInfoAdInfo;", "getLife", "()Lcom/sq/common_module/common/bean/Life;", "getRealTimeWeather", "()Lcom/sq/common_module/common/bean/RealTimeWeather;", "getTemperatureDiff1", "getTemperatureDiff2", "getTips", "getWeekWeather", "()Lcom/sq/common_module/common/bean/WeekWeather;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "common_module_release"})
public final class ToadyWeatherBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tips = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String air_tips = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String temperatureDiff1 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String temperatureDiff2 = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.FateX fate = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.Almanac almanac = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.WInfoAdInfo infoAdInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.Life life = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.RealTimeWeather realTimeWeather = null;
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.bean.WeekWeather weekWeather = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.ToadyWeatherBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String tips, @org.jetbrains.annotations.NotNull
    java.lang.String air_tips, @org.jetbrains.annotations.NotNull
    java.lang.String temperatureDiff1, @org.jetbrains.annotations.NotNull
    java.lang.String temperatureDiff2, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.FateX fate, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.Almanac almanac, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WInfoAdInfo infoAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.Life life, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RealTimeWeather realTimeWeather, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WeekWeather weekWeather) {
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
    
    public ToadyWeatherBean(@org.jetbrains.annotations.NotNull
    java.lang.String tips, @org.jetbrains.annotations.NotNull
    java.lang.String air_tips, @org.jetbrains.annotations.NotNull
    java.lang.String temperatureDiff1, @org.jetbrains.annotations.NotNull
    java.lang.String temperatureDiff2, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.FateX fate, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.Almanac almanac, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WInfoAdInfo infoAdInfo, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.Life life, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.RealTimeWeather realTimeWeather, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.WeekWeather weekWeather) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAir_tips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTemperatureDiff1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTemperatureDiff2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.FateX component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.FateX getFate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.Almanac component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.Almanac getAlmanac() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WInfoAdInfo component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WInfoAdInfo getInfoAdInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.Life component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.Life getLife() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RealTimeWeather component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.RealTimeWeather getRealTimeWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WeekWeather component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WeekWeather getWeekWeather() {
        return null;
    }
}
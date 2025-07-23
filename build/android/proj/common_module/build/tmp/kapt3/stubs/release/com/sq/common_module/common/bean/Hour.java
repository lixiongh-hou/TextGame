package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00cd\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010H\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00fe\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010O\u001a\u00020\u0005H\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001eR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b5\u0010\u001e\u00a8\u0006Q"}, d2 = {"Lcom/sq/common_module/common/bean/Hour;", "", "air", "", "cloudCover", "", "dayOfWeek", "dayOrNight", "humidity", "icon", "precipPct", "pressure", "", "rain_pcpn", "tem", "temfeels", "time", "timeUtc", "uvIndex", "visibility", "", "wea", "wea_img", "wind", "windLevel", "windSpeed", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAir", "()Ljava/lang/String;", "getCloudCover", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDayOfWeek", "getDayOrNight", "getHumidity", "getIcon", "getPrecipPct", "getPressure", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain_pcpn", "getTem", "getTemfeels", "getTime", "getTimeUtc", "getUvIndex", "getVisibility", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getWea", "getWea_img", "getWind", "getWindLevel", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sq/common_module/common/bean/Hour;", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class Hour {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String air = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer cloudCover = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dayOfWeek = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dayOrNight = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer humidity = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer icon = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer precipPct = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double pressure = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String rain_pcpn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer tem = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer temfeels = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String time = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer timeUtc = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer uvIndex = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Float visibility = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_img = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wind = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String windLevel = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer windSpeed = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.Hour copy(@org.jetbrains.annotations.Nullable
    java.lang.String air, @org.jetbrains.annotations.Nullable
    java.lang.Integer cloudCover, @org.jetbrains.annotations.Nullable
    java.lang.String dayOfWeek, @org.jetbrains.annotations.Nullable
    java.lang.String dayOrNight, @org.jetbrains.annotations.Nullable
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable
    java.lang.Integer icon, @org.jetbrains.annotations.Nullable
    java.lang.Integer precipPct, @org.jetbrains.annotations.Nullable
    java.lang.Double pressure, @org.jetbrains.annotations.Nullable
    java.lang.String rain_pcpn, @org.jetbrains.annotations.Nullable
    java.lang.Integer tem, @org.jetbrains.annotations.Nullable
    java.lang.Integer temfeels, @org.jetbrains.annotations.Nullable
    java.lang.String time, @org.jetbrains.annotations.Nullable
    java.lang.Integer timeUtc, @org.jetbrains.annotations.Nullable
    java.lang.Integer uvIndex, @org.jetbrains.annotations.Nullable
    java.lang.Float visibility, @org.jetbrains.annotations.Nullable
    java.lang.String wea, @org.jetbrains.annotations.Nullable
    java.lang.String wea_img, @org.jetbrains.annotations.Nullable
    java.lang.String wind, @org.jetbrains.annotations.Nullable
    java.lang.String windLevel, @org.jetbrains.annotations.Nullable
    java.lang.Integer windSpeed) {
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
    
    public Hour(@org.jetbrains.annotations.Nullable
    java.lang.String air, @org.jetbrains.annotations.Nullable
    java.lang.Integer cloudCover, @org.jetbrains.annotations.Nullable
    java.lang.String dayOfWeek, @org.jetbrains.annotations.Nullable
    java.lang.String dayOrNight, @org.jetbrains.annotations.Nullable
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable
    java.lang.Integer icon, @org.jetbrains.annotations.Nullable
    java.lang.Integer precipPct, @org.jetbrains.annotations.Nullable
    java.lang.Double pressure, @org.jetbrains.annotations.Nullable
    java.lang.String rain_pcpn, @org.jetbrains.annotations.Nullable
    java.lang.Integer tem, @org.jetbrains.annotations.Nullable
    java.lang.Integer temfeels, @org.jetbrains.annotations.Nullable
    java.lang.String time, @org.jetbrains.annotations.Nullable
    java.lang.Integer timeUtc, @org.jetbrains.annotations.Nullable
    java.lang.Integer uvIndex, @org.jetbrains.annotations.Nullable
    java.lang.Float visibility, @org.jetbrains.annotations.Nullable
    java.lang.String wea, @org.jetbrains.annotations.Nullable
    java.lang.String wea_img, @org.jetbrains.annotations.Nullable
    java.lang.String wind, @org.jetbrains.annotations.Nullable
    java.lang.String windLevel, @org.jetbrains.annotations.Nullable
    java.lang.Integer windSpeed) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAir() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCloudCover() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDayOrNight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPrecipPct() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRain_pcpn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTemfeels() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTimeUtc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUvIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_img() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWindLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getWindSpeed() {
        return null;
    }
}
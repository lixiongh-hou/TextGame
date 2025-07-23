package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00fb\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H\u00c6\u0003J\u00c5\u0003\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010v\u001a\u00020wH\u00d6\u0001J\t\u0010x\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010+R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010+R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010+R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010+R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010+\u00a8\u0006y"}, d2 = {"Lcom/sq/common_module/common/bean/WeekX;", "", "air", "", "air_level", "air_tips", "alarm", "", "date", "day", "hours", "Lcom/sq/common_module/common/bean/HourX;", "humidity", "index", "Lcom/sq/common_module/common/bean/Index;", "moonPhrase", "moonrise", "moonset", "narrative", "phrase", "pressure", "rain", "rain_pcpn", "sunrise", "sunset", "tem", "tem1", "tem2", "uvDescription", "uvIndex", "visibility", "wea", "wea_day", "wea_day_img", "wea_img", "wea_night", "wea_night_img", "week", "win", "win_meter", "win_speed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAir", "()Ljava/lang/String;", "getAir_level", "getAir_tips", "getAlarm", "()Ljava/util/List;", "getDate", "getDay", "getHours", "getHumidity", "getIndex", "getMoonPhrase", "getMoonrise", "getMoonset", "getNarrative", "getPhrase", "getPressure", "getRain", "getRain_pcpn", "getSunrise", "getSunset", "getTem", "getTem1", "getTem2", "getUvDescription", "getUvIndex", "getVisibility", "getWea", "getWea_day", "getWea_day_img", "getWea_img", "getWea_night", "getWea_night_img", "getWeek", "getWin", "getWin_meter", "getWin_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "common_module_release"})
public final class WeekX {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String air = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String air_level = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String air_tips = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.Object> alarm = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String date = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String day = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.sq.common_module.common.bean.HourX> hours = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String humidity = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.sq.common_module.common.bean.Index> index = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moonPhrase = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moonrise = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moonset = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String narrative = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phrase = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String pressure = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String rain = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String rain_pcpn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunrise = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunset = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tem = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tem1 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tem2 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String uvDescription = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String uvIndex = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String visibility = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_day = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_day_img = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_img = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_night = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String wea_night_img = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String week = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> win = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String win_meter = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String win_speed = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WeekX copy(@org.jetbrains.annotations.Nullable
    java.lang.String air, @org.jetbrains.annotations.Nullable
    java.lang.String air_level, @org.jetbrains.annotations.Nullable
    java.lang.String air_tips, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> alarm, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String day, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.HourX> hours, @org.jetbrains.annotations.Nullable
    java.lang.String humidity, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Index> index, @org.jetbrains.annotations.Nullable
    java.lang.String moonPhrase, @org.jetbrains.annotations.Nullable
    java.lang.String moonrise, @org.jetbrains.annotations.Nullable
    java.lang.String moonset, @org.jetbrains.annotations.Nullable
    java.lang.String narrative, @org.jetbrains.annotations.Nullable
    java.lang.String phrase, @org.jetbrains.annotations.Nullable
    java.lang.String pressure, @org.jetbrains.annotations.Nullable
    java.lang.String rain, @org.jetbrains.annotations.Nullable
    java.lang.String rain_pcpn, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String sunset, @org.jetbrains.annotations.Nullable
    java.lang.String tem, @org.jetbrains.annotations.Nullable
    java.lang.String tem1, @org.jetbrains.annotations.Nullable
    java.lang.String tem2, @org.jetbrains.annotations.Nullable
    java.lang.String uvDescription, @org.jetbrains.annotations.Nullable
    java.lang.String uvIndex, @org.jetbrains.annotations.Nullable
    java.lang.String visibility, @org.jetbrains.annotations.Nullable
    java.lang.String wea, @org.jetbrains.annotations.Nullable
    java.lang.String wea_day, @org.jetbrains.annotations.Nullable
    java.lang.String wea_day_img, @org.jetbrains.annotations.Nullable
    java.lang.String wea_img, @org.jetbrains.annotations.Nullable
    java.lang.String wea_night, @org.jetbrains.annotations.Nullable
    java.lang.String wea_night_img, @org.jetbrains.annotations.Nullable
    java.lang.String week, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> win, @org.jetbrains.annotations.Nullable
    java.lang.String win_meter, @org.jetbrains.annotations.Nullable
    java.lang.String win_speed) {
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
    
    public WeekX(@org.jetbrains.annotations.Nullable
    java.lang.String air, @org.jetbrains.annotations.Nullable
    java.lang.String air_level, @org.jetbrains.annotations.Nullable
    java.lang.String air_tips, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> alarm, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String day, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.HourX> hours, @org.jetbrains.annotations.Nullable
    java.lang.String humidity, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.Index> index, @org.jetbrains.annotations.Nullable
    java.lang.String moonPhrase, @org.jetbrains.annotations.Nullable
    java.lang.String moonrise, @org.jetbrains.annotations.Nullable
    java.lang.String moonset, @org.jetbrains.annotations.Nullable
    java.lang.String narrative, @org.jetbrains.annotations.Nullable
    java.lang.String phrase, @org.jetbrains.annotations.Nullable
    java.lang.String pressure, @org.jetbrains.annotations.Nullable
    java.lang.String rain, @org.jetbrains.annotations.Nullable
    java.lang.String rain_pcpn, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String sunset, @org.jetbrains.annotations.Nullable
    java.lang.String tem, @org.jetbrains.annotations.Nullable
    java.lang.String tem1, @org.jetbrains.annotations.Nullable
    java.lang.String tem2, @org.jetbrains.annotations.Nullable
    java.lang.String uvDescription, @org.jetbrains.annotations.Nullable
    java.lang.String uvIndex, @org.jetbrains.annotations.Nullable
    java.lang.String visibility, @org.jetbrains.annotations.Nullable
    java.lang.String wea, @org.jetbrains.annotations.Nullable
    java.lang.String wea_day, @org.jetbrains.annotations.Nullable
    java.lang.String wea_day_img, @org.jetbrains.annotations.Nullable
    java.lang.String wea_img, @org.jetbrains.annotations.Nullable
    java.lang.String wea_night, @org.jetbrains.annotations.Nullable
    java.lang.String wea_night_img, @org.jetbrains.annotations.Nullable
    java.lang.String week, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> win, @org.jetbrains.annotations.Nullable
    java.lang.String win_meter, @org.jetbrains.annotations.Nullable
    java.lang.String win_speed) {
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
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAir_level() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAir_tips() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> getAlarm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.HourX> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.HourX> getHours() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Index> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.Index> getIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoonPhrase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoonrise() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoonset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNarrative() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhrase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRain_pcpn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunrise() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTem1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTem2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUvDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUvIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_day() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_day_img() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_img() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_night() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWea_night_img() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getWin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWin_meter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWin_speed() {
        return null;
    }
}
package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0080\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u000eH\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/sq/common_module/common/bean/WeekWeather;", "", "aqi", "Lcom/sq/common_module/common/bean/Aqi;", "city", "", "cityEn", "cityid", "country", "countryEn", "data", "", "Lcom/sq/common_module/common/bean/WeekX;", "nums", "", "update_time", "(Lcom/sq/common_module/common/bean/Aqi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getAqi", "()Lcom/sq/common_module/common/bean/Aqi;", "getCity", "()Ljava/lang/String;", "getCityEn", "getCityid", "getCountry", "getCountryEn", "getData", "()Ljava/util/List;", "getNums", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdate_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/sq/common_module/common/bean/Aqi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sq/common_module/common/bean/WeekWeather;", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class WeekWeather {
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Aqi aqi = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cityEn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cityid = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String countryEn = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.sq.common_module.common.bean.WeekX> data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer nums = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String update_time = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WeekWeather copy(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aqi aqi, @org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String cityEn, @org.jetbrains.annotations.Nullable
    java.lang.String cityid, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.String countryEn, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.WeekX> data, @org.jetbrains.annotations.Nullable
    java.lang.Integer nums, @org.jetbrains.annotations.Nullable
    java.lang.String update_time) {
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
    
    public WeekWeather(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aqi aqi, @org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String cityEn, @org.jetbrains.annotations.Nullable
    java.lang.String cityid, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.String countryEn, @org.jetbrains.annotations.Nullable
    java.util.List<com.sq.common_module.common.bean.WeekX> data, @org.jetbrains.annotations.Nullable
    java.lang.Integer nums, @org.jetbrains.annotations.Nullable
    java.lang.String update_time) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aqi component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aqi getAqi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCityEn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCityid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountryEn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.WeekX> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sq.common_module.common.bean.WeekX> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNums() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdate_time() {
        return null;
    }
}
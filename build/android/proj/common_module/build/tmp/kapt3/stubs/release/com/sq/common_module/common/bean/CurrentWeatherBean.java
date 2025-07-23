package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003JT\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\t\u0010)\u001a\u00020\nH\u00d6\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/sq/common_module/common/bean/CurrentWeatherBean;", "", "day", "Lcom/sq/common_module/common/bean/CurrentDayBean;", "max", "", "min", "night", "Lcom/sq/common_module/common/bean/CurrentNightBean;", "area", "", "areaId", "(Lcom/sq/common_module/common/bean/CurrentDayBean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sq/common_module/common/bean/CurrentNightBean;Ljava/lang/String;I)V", "getArea", "()Ljava/lang/String;", "setArea", "(Ljava/lang/String;)V", "getAreaId", "()I", "setAreaId", "(I)V", "getDay", "()Lcom/sq/common_module/common/bean/CurrentDayBean;", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMin", "getNight", "()Lcom/sq/common_module/common/bean/CurrentNightBean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/sq/common_module/common/bean/CurrentDayBean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sq/common_module/common/bean/CurrentNightBean;Ljava/lang/String;I)Lcom/sq/common_module/common/bean/CurrentWeatherBean;", "equals", "", "other", "hashCode", "toString", "common_module_release"})
public final class CurrentWeatherBean {
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.CurrentDayBean day = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer max = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer min = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.CurrentNightBean night = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String area;
    private int areaId;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.CurrentWeatherBean copy(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.CurrentDayBean day, @org.jetbrains.annotations.Nullable
    java.lang.Integer max, @org.jetbrains.annotations.Nullable
    java.lang.Integer min, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.CurrentNightBean night, @org.jetbrains.annotations.Nullable
    java.lang.String area, int areaId) {
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
    
    public CurrentWeatherBean(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.CurrentDayBean day, @org.jetbrains.annotations.Nullable
    java.lang.Integer max, @org.jetbrains.annotations.Nullable
    java.lang.Integer min, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.CurrentNightBean night, @org.jetbrains.annotations.Nullable
    java.lang.String area, int areaId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.CurrentDayBean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.CurrentDayBean getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.CurrentNightBean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.CurrentNightBean getNight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getArea() {
        return null;
    }
    
    public final void setArea(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getAreaId() {
        return 0;
    }
    
    public final void setAreaId(int p0) {
    }
}
package com.sq.common_module.common.utils.kt;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.sq.common_module.common.utils.java.L;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a$\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u000e\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001\u001a\b\u0010\u001e\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0010\u001a\u001e\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"DATE_UTILS_TAG", "", "convertSecToTimeArr", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "lSeconds", "convertSecToTimeString", "convertSecToTimeString1", "convertSecToTimeString2", "convertTimeString", "time", "date2TimeStamp", "date", "format", "getDateStr", "Ljava/util/Date;", "getLoginDay", "", "startDay", "endDay", "getOldDateByDay", "beginDate", "distanceDay", "", "getOldDateByMonth", "distanceMonth", "getOldDateByWeeks", "getOneWeeks", "dateStr", "getStartTime", "getWeekAndDay", "parseServerTime", "serverTime", "timeStamp2Date", "common_module_release"})
public final class DateUtilsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATE_UTILS_TAG = "dateUtilsTag";
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String convertTimeString(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.util.Date parseServerTime(@org.jetbrains.annotations.Nullable
    java.lang.String serverTime, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String convertSecToTimeString(long lSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String convertSecToTimeString1(long lSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public static final java.lang.String convertSecToTimeString2(long lSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.ArrayList<java.lang.Long> convertSecToTimeArr(long lSeconds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getDateStr(@org.jetbrains.annotations.Nullable
    java.util.Date date, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String timeStamp2Date(long time, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String date2TimeStamp(@org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    /**
     * 获取某个日期前后N天的日期
     *
     * @param beginDate
     * @param distanceDay 前后几天 如获取前7天日期则传-7即可；如果后7天则传7
     * @param format      日期格式，默认"yyyy-MM-dd"
     * @return
     */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getOldDateByDay(@org.jetbrains.annotations.Nullable
    java.util.Date beginDate, int distanceDay, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getOldDateByWeeks(@org.jetbrains.annotations.Nullable
    java.util.Date beginDate, int distanceDay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getOneWeeks(@org.jetbrains.annotations.NotNull
    java.lang.String dateStr) {
        return null;
    }
    
    public static final int getWeekAndDay(@org.jetbrains.annotations.NotNull
    java.util.Date date) {
        return 0;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final long getStartTime() {
        return 0L;
    }
    
    /**
     * 获取前后几个月的日期
     * @param beginDate
     * @param distanceMonth
     * @param format
     * @return
     */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getOldDateByMonth(@org.jetbrains.annotations.Nullable
    java.util.Date beginDate, int distanceMonth, @org.jetbrains.annotations.Nullable
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> getLoginDay(@org.jetbrains.annotations.NotNull
    java.lang.String startDay, @org.jetbrains.annotations.NotNull
    java.lang.String endDay) {
        return null;
    }
}
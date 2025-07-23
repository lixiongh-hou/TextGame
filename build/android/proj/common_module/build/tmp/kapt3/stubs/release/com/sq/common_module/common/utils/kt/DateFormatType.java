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

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/4/27
 * Time: 14:08
 * 备注：
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/sq/common_module/common/utils/kt/DateFormatType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "YYYYMMDDHHMMSS", "YYYYMMDD", "HHMMSS", "hhMMSS", "DD", "MMYYYY", "common_module_release"})
public enum DateFormatType {
    /*public static final*/ YYYYMMDDHHMMSS /* = new YYYYMMDDHHMMSS(null) */,
    /*public static final*/ YYYYMMDD /* = new YYYYMMDD(null) */,
    /*public static final*/ HHMMSS /* = new HHMMSS(null) */,
    /*public static final*/ hhMMSS /* = new hhMMSS(null) */,
    /*public static final*/ DD /* = new DD(null) */,
    /*public static final*/ MMYYYY /* = new MMYYYY(null) */;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value = null;
    
    DateFormatType(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
}
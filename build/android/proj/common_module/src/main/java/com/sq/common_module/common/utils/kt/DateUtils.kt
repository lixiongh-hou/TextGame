package com.sq.common_module.common.utils.kt

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import com.sq.common_module.common.utils.java.L
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/4/27
 * Time: 14:08
 * 备注：
 */

enum class DateFormatType(val value: String) {
    YYYYMMDDHHMMSS("yyyy-MM-dd HH:mm:ss"),
    YYYYMMDD("yyyy-MM-dd"),
    HHMMSS("HH:mm:ss"),
    hhMMSS("hh:mm:ss"),
    DD("dd"),
    MMYYYY("MM月   yyyy"),

}

const val DATE_UTILS_TAG = "dateUtilsTag"


fun convertTimeString(
    time: Long,
): String {
    // 创建日期格式对象
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())

    // 将时间戳转换为 Date 对象
    val date = Date(time)

    // 格式化日期
    return sdf.format(date)
}

//1、日期字符串转换Date
//参数一：时间字符串； 参数二：日期格式
fun parseServerTime(
    serverTime: String?,
    format: String? = DateFormatType.YYYYMMDDHHMMSS.toString(),
): Date? {
    var format = format
    if (format == null || format.isEmpty()) {
        format = "yyyy-MM-dd HH:mm:ss"
    }
    val sdf = SimpleDateFormat(format, Locale.CHINESE)
    sdf.timeZone = TimeZone.getTimeZone("GMT+8:00")
    var date: Date? = null
    try {
        date = sdf.parse(serverTime)
    } catch (e: Exception) {
        L.d(DATE_UTILS_TAG, e.toString())
    }
    return date
}


//2、秒数转换成时分秒
fun convertSecToTimeString(lSeconds: Long): String? {
    val nHour = lSeconds / 3600
    var nMin = lSeconds % 3600
    val nSec = nMin % 60
    nMin /= 60
    return String.format("%02d小时%02d分钟%02d秒", nHour, nMin, nSec)
}

//2、秒数转换成时分秒
fun convertSecToTimeString1(lSeconds: Long): String? {
    var nMin = lSeconds % 3600
    val nSec = nMin % 60
    nMin /= 60
    return String.format("%02d:%02d", nMin, nSec)
}

@SuppressLint("DefaultLocale")
fun convertSecToTimeString2(lSeconds: Long): String? {
    val nHour = lSeconds / 3600 / 1000
    var nMin = lSeconds / 1000 % 3600
    val nSec = nMin % 60
    nMin /= 60
    if (nHour > 0) {
        var minRe = 0f
        if (nMin > 0) {
            minRe = nMin.toFloat() / 60
        }
        return "${
            BigDecimal(nHour + minRe.toDouble()).setScale(
                2,
                BigDecimal.ROUND_HALF_UP
            ).toDouble()
        }小时"
    } else if (nMin > 0) {
        var mSecRe = 0f
        if (nSec > 0) {
            mSecRe = nSec.toFloat() / 60
        }
        return "${
            BigDecimal(nMin + mSecRe.toDouble()).setScale(
                2,
                BigDecimal.ROUND_HALF_UP
            ).toDouble()
        }分钟"
    } else {
        return "${nSec + 1}秒"
//        String.format("%02d秒", nSec)
    }

}

//2、秒数转换成时分秒
fun convertSecToTimeArr(lSeconds: Long): ArrayList<Long> {
    val nHour = lSeconds / 3600
    var nMin = lSeconds % 3600
    val nSec = nMin % 60
    nMin /= 60
    return arrayListOf(nHour, nMin, nSec)
}

//3、Date对象获取时间字符串
fun getDateStr(date: Date?, format: String?): String? {
    var format = format
    if (format == null || format.isEmpty()) {
        format = "yyyy-MM-dd HH:mm:ss"
    }
    val formatter = SimpleDateFormat(format)
    return formatter.format(date)
}

//4、时间戳转换日期格式字符串
fun timeStamp2Date(time: Long, format: String? = null): String? {
    var format = format
    if (format == null || format.isEmpty()) {
        format = "yyyy-MM-dd HH:mm:ss"
    }
    val sdf = SimpleDateFormat(format)
    return sdf.format(time)
}

//5、日期格式字符串转换时间戳
fun date2TimeStamp(date: String?, format: String?): String? {
    try {
        val sdf = SimpleDateFormat(format)
        return (sdf.parse(date).time / 1000).toString()
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return ""
}

/**
 * 获取某个日期前后N天的日期
 *
 * @param beginDate
 * @param distanceDay 前后几天 如获取前7天日期则传-7即可；如果后7天则传7
 * @param format      日期格式，默认"yyyy-MM-dd"
 * @return
 */
fun getOldDateByDay(beginDate: Date?, distanceDay: Int, format: String?): String? {
    var format = format
    if (format == null || format.isEmpty()) {
        format = "yyyy-MM-dd"
    }
    val dft = SimpleDateFormat(format)
    val date = Calendar.getInstance()
    date.time = beginDate
    date[Calendar.DATE] = date[Calendar.DATE] + distanceDay
    var endDate: Date? = null
    try {
        endDate = dft.parse(dft.format(date.time))
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return dft.format(endDate)
}


//Calendar.ERA          表示纪元
//Calendar.MONTH        表示月
//Calendar.DAY_OF_WEEK  表示星期几
//Calendar.AM_PM        上午还是下午
// 获取星期的显示名称，例如：周一、星期一、Monday等等
//Calendar.SHORT得到的是诸如“周日”的名称，Calendar.LONG得到的是诸如“星期日”的名称
//Locale.CHINA(中文)、Locale.ENGLISH(英文)等等。也可以使用Locale.getDefault()获取默认语言环境
fun getOldDateByWeeks(beginDate: Date?, distanceDay: Int): String? {
    val date = Calendar.getInstance()
    date.time = beginDate
    date[Calendar.DATE] = date[Calendar.DATE] + distanceDay
    val week = date.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.CHINESE);
    return week
}

fun getOneWeeks(dateStr: String): String {
    val date = parseServerTime(dateStr, DateFormatType.YYYYMMDD.value)
    val calendar = Calendar.getInstance()
    calendar.time = date
    var day = calendar[Calendar.DAY_OF_WEEK]
    if (day == 1) {
        day = 7
    } else {
        day -= 1
    }
    var dayReturn = ""
    when (day) {
        1 -> dayReturn = "一"
        2 -> dayReturn = "二"
        3 -> dayReturn = "三"
        4 -> dayReturn = "四"
        5 -> dayReturn = "五"
        6 -> dayReturn = "六"
        7 -> dayReturn = "日"

    }
    if (dateStr == getDateStr(Date(), DateFormatType.YYYYMMDD.value)) {
        dayReturn = "今"
    }

    return dayReturn
}

fun getWeekAndDay(date: Date): Int {
    val calendar = Calendar.getInstance()
    calendar.time = date
    //获取当前时间为本月的第几周
    var week = calendar[Calendar.WEEK_OF_MONTH]
    //获取当前时间为本周的第几天
    var day = calendar[Calendar.DAY_OF_WEEK]
    if (day == 1) {
        day = 7
        week -= 1
    } else {
        day -= 1
    }
    return day
}

@RequiresApi(Build.VERSION_CODES.O)
fun getStartTime(): Long {
    //获取当前天开始的时间戳
//    LocalDateTime.of(LocalDate.now(), LocalTime.MIN).aatZone(ZoneId.systemDefault()).toEpochSecond()
    return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).toEpochSecond(ZoneOffset.of("+8"))
}


/**
 * 获取前后几个月的日期
 * @param beginDate
 * @param distanceMonth
 * @param format
 * @return
 */
fun getOldDateByMonth(beginDate: Date?, distanceMonth: Int, format: String?): String? {
    var format = format
    if (format == null || format.isEmpty()) {
        format = "yyyy-MM-dd"
    }
    val dft = SimpleDateFormat(format)
    val date = Calendar.getInstance()
    date.time = beginDate
    date[Calendar.MONTH] = date[Calendar.MONTH] + distanceMonth
    var endDate: Date? = null
    try {
        endDate = dft.parse(dft.format(date.time))
    } catch (e: java.lang.Exception) {
        e.printStackTrace()
    }
    return dft.format(endDate)
}

//获取以周为单位的日期区间
fun getLoginDay(startDay: String, endDay: String): List<String> {
    val startString = date2TimeStamp(startDay, DateFormatType.YYYYMMDD.value)
    val endString = date2TimeStamp(endDay, DateFormatType.YYYYMMDD.value)
    var allDay = (endString!!.toInt() - startString!!.toInt()) / (24 * 3600)

    var dateStrList = arrayListOf<String>()
    val startTime = parseServerTime(startDay, DateFormatType.YYYYMMDD.value) ?: Date()
    var timeStr = ""

    //起始时间之前
    val startDay =
        getWeekAndDay(parseServerTime(startDay, DateFormatType.YYYYMMDD.value) ?: Date())
    if (startDay > 0) {
        for (index in 1..startDay) {
            timeStr = getOldDateByDay(startTime, -index, DateFormatType.YYYYMMDD.value)!!
            dateStrList.add(0, timeStr)
        }
    }

    val lastDay =
        getWeekAndDay(parseServerTime(endDay, DateFormatType.YYYYMMDD.value) ?: Date())
    allDay += (7 - lastDay)
    for (index in 0 until allDay) {
        timeStr = getOldDateByDay(startTime, index, DateFormatType.YYYYMMDD.value)!!
        dateStrList.add(timeStr)
    }
    return dateStrList
}


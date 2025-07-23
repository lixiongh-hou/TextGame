package com.sq.common_module.common.utils.kt

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.PermissionUtils
import com.blankj.utilcode.util.Utils
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.hjq.toast.Toaster
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.java.UIUtils
import com.sq.common_module.common.utils.kt.UserInfoManager.USER_TOKEN
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

/**
 * Created by town
 * Date :  2022/10/11
 * Time : 15:20
 */
//const val debugUrl: String = "http://192.168.0.95:8080"
//const val debugUrl: String = "https://earn-api.xinyi99.cn/"
const val debugUrl: String = "https://earn-api.shengqu360.com/"

const val releaseUrl: String = "https://earn-api.shengqu360.com/"

fun getBaseUrl() = if (AppUtils.isAppDebug()) debugUrl else releaseUrl


@DelicateCoroutinesApi
fun String.toast() {
    Toaster.showShort(this)
    GlobalScope.launch {
        delay(1000)
        Toaster.cancel()
    }
}


inline fun Boolean.handleBool(block1: () -> Unit, block2: () -> Unit) {
    if (this) block1() else block2()
}


inline fun loginDoNext(next: () -> Unit) {
    (getMMKVString(USER_TOKEN) != "").handleBool({ next() }, {
        //toLogin
    })
}

//简化Observable
fun <T : Any> Observable<T>.simpleObservable(): Observable<T> {
    return this
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

}


//倒计时
fun getDownTimer(time: Int, isReverse: Boolean? = true): Flow<Int> {
    return if (isReverse!!) flow {
        (0..time).reversed().forEach { i ->
            emit(i)
            delay(1000)
        }
    }.flowOn(Dispatchers.Default) else flow {
        (0..time).forEach { i ->
            emit(i)
            delay(1000)
        }
    }.flowOn(Dispatchers.Default)

}



//倒计时
fun getDownTimerMS(time: Float, isReverse: Boolean? = true): Flow<Int> {
    val msTime = (time * 10).toInt()
    return if (isReverse!!) flow {
        (0..msTime).reversed().forEach { i ->
            emit(i)
            delay(100)
        }
    }.flowOn(Dispatchers.Default) else flow {
        (0..msTime).forEach { i ->
            emit(i)
            delay(100)
        }
    }.flowOn(Dispatchers.Default)

}

//倒计时
fun getDownTimerCustom(time: Int, unitTime: Long = 100L, isReverse: Boolean? = true): Flow<Int> {
    val msTime = ((1000L / unitTime) * time).toInt()
    return if (isReverse!!) flow {
        (0..msTime).reversed().forEach { i ->
            emit(i)
            delay(unitTime)
        }
    }.flowOn(Dispatchers.Default) else flow {
        (0..msTime).forEach { i ->
            emit(i)
            delay(unitTime)
        }
    }.flowOn(Dispatchers.Default)

}

/**
 * 获取参数的json形式
 */

fun getRequestBody(any: Any?): RequestBody {
    return Gson().toJson(any).toString()
        .toRequestBody("application/json;charset=utf-8".toMediaType())
}

/**
 * 加载图片
 */
fun loadImageUrl(imageView: ImageView, url: String) {
    Glide.with(imageView.context).load(url).into(imageView)
}

/**
 * 加载图片
 */
fun loadImageRes(imageView: ImageView?, res: Int) {
    if (imageView == null) {
        return
    }
    Glide.with(imageView.context).load(res).into(imageView)
}

/***
 * textView设置值
 */
fun setAnyText(textView: TextView, s: String?) {
    textView.text = s
}


/**
 * 秒转成时分秒
 */
fun secondChangeDetail(time: Int): String {
    var hour = 0
    var minutes = 0
    var second = 0
    val temp = time % 3600
    if (time > 3600) {
        hour = time / 3600
        if (temp != 0) {
            if (temp > 60) {
                minutes = temp / 60
                if (temp % 60 != 0) {
                    second = temp % 60
                }
            } else {
                second = temp
            }
        }
    } else {
        minutes = time / 60
        if (time % 60 != 0) {
            second = time % 60
        }
    }

    val mHour = if (hour < 10) "0$hour" else hour.toString()
    val mMinute = if (minutes < 10) "0$minutes" else minutes.toString()
    val mSecond = if (second < 10) "0$second" else second.toString()

    return "$mHour:$mMinute:$mSecond"
}


/**
 * 秒转成年月日
 */
fun getTimeFormat(time: Long, formatStr: String = "yyyy-MM-dd"): String {
    var date = Date(time)
    var sdf = SimpleDateFormat(formatStr)
    return sdf.format(date)
}


private const val KEY_CURRENT_TIME = "currentTime" //当前时间


fun singleClick(): Boolean {
    return if (System.currentTimeMillis() - getMMKVLong(KEY_CURRENT_TIME) > 1000) {
        System.currentTimeMillis().saveMMKVLong(KEY_CURRENT_TIME)
        true
    } else {
        false
    }
}

inline fun <T> LifecycleOwner.observe(liveData: LiveData<T>, crossinline action: (t: T) -> Unit) {
    liveData.observe(this, Observer { it?.let { t -> action(t) } })
}


val mProgressList =
    arrayListOf(40100, 43000, 43300, 42400, 42200, 41500, 42800, 43200, 44000, 43800)

fun getRandomProgress(): Int = mProgressList.random()


fun getCurrentDay(): String {
    val c = Calendar.getInstance()
    val day = c.get(Calendar.DAY_OF_MONTH)
    val month = c.get(Calendar.MONTH)
    val year = c.get(Calendar.YEAR)
    return "$year$month$day"
}

fun View.setEnable(enable: Boolean) {
    this.isEnabled = enable
}


fun isLessAdMode(): Boolean {
    return getMMKVBool(UserInfoManager.IS_LESS_AD)
}

fun isOppoChanceL(): Boolean {
    return getMMKVString(UserInfoManager.APP_CHANNEL) == "oppo"
}

fun isAudit(): Boolean {
    return getMMKVBool(UserInfoManager.IS_AUDIT)
}


fun getAppWidgetEveryShowTime(): Int {
    return getMMKVInt("${UserInfoManager.APP_WIDGET_EVERY_SHOW}_${getCurrentDay()}")
}


inline fun commonTryCatch(t: () -> Unit) {
    try {
        t.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun isHUAWEI(): Boolean {
    return HttpHeaderUtils.channelCode.contains("huawei") || HttpHeaderUtils.channelCode == "rongyao"
}
fun isNoAndroidId(): Boolean {
    return HttpHeaderUtils.channelCode == "huawei"

}
/**
 * 华为归因特殊处理和非华为
 */
fun handleAttributeUser(): Boolean {
    return (HttpHeaderUtils.channelCode == "huawei" && HttpHeaderUtils.planId != "${HttpHeaderUtils.appCode}-${HttpHeaderUtils.channelCode}") || (HttpHeaderUtils.channelCode != "huawei")
}

fun isVIVO(): Boolean {
    return getMMKVString(UserInfoManager.APP_CHANNEL) == "vivo"
}

fun isXIAOMI(): Boolean {
    return getMMKVString(UserInfoManager.APP_CHANNEL) == "xiaomi"
}

fun getFeedWidth(context: Context): Int {
    return (UIUtils.getScreenWidthInPx(context).toFloat()
            * 2 / 3).toInt()
}

interface CommonDialogCallBack {
    fun confirm() {}
    fun cancel() {}
}

//是否是推广信息流
fun isPushFeedApp(): Boolean {
    return HttpHeaderUtils.channelCode.contains("xxl")
}

fun View.showCloseView(life: LifecycleCoroutineScope, loadSuccess: Boolean) {
    if (isPushFeedApp()) {
        if (loadSuccess) {
            life.launch {
                delay(1000L)
                visibility = View.VISIBLE
            }
        } else {
            visibility = View.VISIBLE
        }

    }
}

fun is20005P(): Boolean =
    getMMKVString(UserInfoManager.APP_CODE) == "20004" || getMMKVString(UserInfoManager.APP_CODE) == "20005"


fun isSpecialOppo(): Boolean =
    (getMMKVString(
        UserInfoManager.APP_CHANNEL
    ) == "oppo")

fun isVivo(): Boolean =
    getMMKVString(UserInfoManager.APP_CHANNEL) == "vivo"

fun isXxlJl(): Boolean =
    getMMKVString(UserInfoManager.APP_CHANNEL).contains("jl")

fun String.parseColor(): Int = Color.parseColor(this)

fun isSpecialVivo(): Boolean = HttpHeaderUtils.channelCode.contains("xxl_vivo")

fun showLoadRewardTips() = !listOf("50002", "55008", "50001").contains(HttpHeaderUtils.appCode)

fun isXiaomi() = getMMKVString(UserInfoManager.APP_CHANNEL) == "xiaomi"

fun isSpecialGdt() = getMMKVString(UserInfoManager.APP_CHANNEL) == "xxl_gdt"

fun isYingyongbao() = getMMKVString(UserInfoManager.APP_CHANNEL) == "yingyongbao"

/**
 * 校验权限：已安装应用列表
 * 部分国产手机有该魔改的权限
 * xml加 <uses-permission android:name="com.android.permission.GET_INSTALLED_APPS" />
 */
inline fun checkAppListPermission(crossinline block: (b: Boolean) -> Unit) {
    val permission = "com.android.permission.GET_INSTALLED_APPS"
    val pInfo = try {
        Utils.getApp()?.applicationContext?.packageManager?.getPermissionInfo(permission, 0)
    } catch (e: Exception) {
        null
    }
    if (pInfo == null) {
        block(true)
        return
    }
    val granted = PermissionUtils.isGranted(permission)
    if (!granted) {
        PermissionUtils.permission(permission)
            .callback(object : PermissionUtils.SimpleCallback {
                override fun onGranted() {
                    block(true)
                }

                override fun onDenied() {
                    block(false)
                }
            })
            .request()
    } else block(true)
}
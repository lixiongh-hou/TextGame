package com.sq.common_module.common.utils.kt

import android.os.Parcelable
import com.tencent.mmkv.MMKV

/**
 * 存储数据管理
 */
object MMKVManager {
    val kv: MMKV = MMKV.defaultMMKV()!!
}
fun getMMKVIntWithDef(tag: String,def:Int) = MMKVManager.kv.decodeInt(tag, def)
//存Boolean类型
fun Boolean.saveMMKVBool(tag: String) = MMKVManager.kv.encode(tag, this)

fun getMMKVBool(tag: String) = MMKVManager.kv.decodeBool(tag, false)

fun String.saveMMKVString(tag: String) = MMKVManager.kv.encode(tag, this)


fun getMMKVString(tag: String): String = MMKVManager.kv.decodeString(tag, "").toString()

fun Int.saveMMKVInt(tag: String) = MMKVManager.kv.encode(tag, this)

fun getMMKVInt(tag: String) = MMKVManager.kv.decodeInt(tag, 0)

fun Parcelable.saveMMKVParcelable(tag: String) = MMKVManager.kv.encode(tag, this)
inline fun <reified T : Parcelable> getMMKVParcelable(tag: String) =
    MMKVManager.kv.decodeParcelable(tag, T::class.java)


fun Double.saveMMKVDouble(tag: String) = MMKVManager.kv.encode(tag, this)

fun getMMKVDouble(tag: String) = MMKVManager.kv.decodeDouble(tag)

fun Float.saveMMKVFloat(tag: String) = MMKVManager.kv.encode(tag, this)

fun getMMKVFloat(tag: String) = MMKVManager.kv.decodeFloat(tag, -1f)

fun Long.saveMMKVLong(tag: String) = MMKVManager.kv.encode(tag, this)

fun getMMKVLong(tag: String) = MMKVManager.kv.decodeLong(tag, 0L)
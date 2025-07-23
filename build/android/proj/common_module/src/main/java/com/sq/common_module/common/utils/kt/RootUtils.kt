package com.sq.common_module.common.utils.kt

import android.os.Build
import com.sq.common_module.common.utils.java.L
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

/**
 * Created by lsy
 * Date : 2023/10/9
 * Desc : root检测工具
 */
object RootUtils {

    fun isRoot(): Boolean {
        val root = checkUnOfficial() || checkSU() || checkBusyBox() || checkRootMethod3()
        L.e("RootUtils", "Root:$root")
        return root
    }

    /**
     * 非正式发布版
     */
    private fun checkUnOfficial(): Boolean {
        val buildTags = Build.TAGS
        return buildTags != null && buildTags.contains("test-keys")
    }

    /**
     * su
     */
    private fun checkSU(): Boolean {
        val paths = listOf(
            "/system/app/Superuser.apk",
            "/sbin/su",
            "/system/bin/su",
            "/system/xbin/su",
            "/data/local/xbin/su",
            "/data/local/bin/su",
            "/system/sd/xbin/su",
            "/system/bin/failsafe/su",
            "/data/local/su",
            "/su/bin/su"
        )
        for (path in paths) {
            if (File(path).exists()) return true
        }
        return false
    }

    /**
     * BusyBox（xp）
     */
    private fun checkBusyBox(): Boolean {
        val paths = listOf(
            "/sbin/busybox",
            "/system/bin/busybox",
            "/system/xbin/busybox",
            "/data/local/xbin/busybox",
            "/data/local/bin/busybox",
            "/system/sd/xbin/busybox",
            "/system/bin/failsafe/busybox",
            "/data/local/busybox",
            "/su/bin/busybox"
        )
        for (path in paths) {
            if (File(path).exists()) return true
        }
        return false
    }

    /**
     * su run
     */
    private fun checkRootMethod3(): Boolean {
        var process: Process? = null
        return try {
            process = Runtime.getRuntime().exec(arrayOf("/system/xbin/which", "su"))
            val br = BufferedReader(InputStreamReader(process.inputStream))
            br.readLine() != null
        } catch (t: Throwable) {
            false
        } finally {
            process?.destroy()
        }
    }
}
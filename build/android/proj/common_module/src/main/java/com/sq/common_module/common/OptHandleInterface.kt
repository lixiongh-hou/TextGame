package com.sq.common_module.common

import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by lsy
 * Date : 2023/11/9
 * Desc : 优化项处理功能集
 */
const val LOAD_TIME_OUT = 5000L

interface OptHandleInterface {

    companion object {
        private var updateOptimizingJob: Job? = null
        private var pageTimeOutJon: Job? = null
    }

    fun updateOptimizing(lifecycleScope: LifecycleCoroutineScope, tv: AppCompatTextView) {
        val repeatCount = (LOAD_TIME_OUT / (4 * 500)).toInt()
        if (repeatCount < 1) return
        updateOptimizingJob = lifecycleScope.launch {
            repeat(repeatCount) {
                tv.text = "正在优化中"
                delay(500)
                tv.text = "正在优化中."
                delay(500)
                tv.text = "正在优化中.."
                delay(500)
                tv.text = "正在优化中..."
                delay(500)
            }
        }
    }

    fun startPageTimeOut(lifecycleScope: LifecycleCoroutineScope, cb: () -> Unit) {
        var count = (LOAD_TIME_OUT / 1000).toInt()
        if (count < 0) count = 1
        pageTimeOutJon = lifecycleScope.launch(Dispatchers.Default) {
            repeat(count) {
                delay(1000)
                if (it == count - 1) cb()
            }
        }
    }

    fun startPageTimeOutAgain(lifecycleScope: LifecycleCoroutineScope, cb: () -> Unit) {
        var count = (LOAD_TIME_OUT / 1000).toInt()
        if (count < 0) count = 1
        pageTimeOutJon?.cancel()
        pageTimeOutJon = null

        pageTimeOutJon = lifecycleScope.launch(Dispatchers.Default) {
            repeat(count) {
                delay(1000)
                if (it == count - 1) cb()
            }
        }
    }

    fun updateOtherOptimizing(lifecycleScope: LifecycleCoroutineScope, tv: AppCompatTextView,text:String) {
        val repeatCount = (LOAD_TIME_OUT / (4 * 500)).toInt()
        if (repeatCount < 1) return
        updateOptimizingJob = lifecycleScope.launch {
            repeat(repeatCount) {
                tv.text = "${text}   "
                delay(500)
                tv.text = "${text}.  "
                delay(500)
                tv.text = "${text}.. "
                delay(500)
                tv.text = "${text}..."
                delay(500)
            }
        }
    }

    fun optHandleDestroy() {
        updateOptimizingJob?.cancel()
        updateOptimizingJob = null
        pageTimeOutJon?.cancel()
        pageTimeOutJon = null
    }
}

interface BaseStepInterface {
    fun onCheckProgress(v: Int) {}
    fun onCheckSuccess() {}
    fun onStartOpt() {}
    fun onOptProgress(v: Int) {}
    fun onOptSuccess() {}
}
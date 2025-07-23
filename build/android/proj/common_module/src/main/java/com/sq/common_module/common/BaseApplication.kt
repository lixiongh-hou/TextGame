package com.sq.common_module.common

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDexApplication
import com.blankj.utilcode.util.Utils
import com.tencent.mmkv.MMKV

/**
 * Created by town
 * Date :  2022/10/11
 * Time : 15:35
 */
open class BaseApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    //获取Application单例
    companion object {
        lateinit var instance: BaseApplication
    }
}
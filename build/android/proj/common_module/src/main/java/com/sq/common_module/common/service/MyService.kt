package com.sq.common_module.common.service

import android.app.Notification
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.CountDownTimer
import android.os.IBinder
import androidx.annotation.RequiresApi
import com.blankj.utilcode.util.AppUtils
//import com.daemon.utils.AppUtil
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.keepAlive.PhoenixUtil


/**
 * Created by town
 * Date :  2023/2/7
 * Time : 14:41
 */
class MyService : Service() {
    private var mContext: Context? = null
    private var totalTime = if (AppUtils.isAppDebug()) 1 * 60 * 1000L else 24 * 60 * 60 * 1000L
    private var downTimer: CountDownTimer? = null



    override fun onCreate() {
        super.onCreate()
        mContext = this
//        downTimer =
//            object : CountDownTimer(totalTime, 1000) {
//                override fun onTick(p0: Long) {
//                    L.i("wwb_MyService_downTimer", "$p0---${AppUtil.isAppForeground(mContext)}")
//                    if (ActivityUtils.getActivityList().any { it is TaskMainActivity }) {
//                        L.i("wwb_MyService_downTimer", "TaskMainActivity_____true")
//                        downTimer?.cancel()
//
//                    } else {
//                        L.i("wwb_MyService_downTimer", "TaskMainActivity____false")
//                    }
//                }
//
//                override fun onFinish() {
//                    L.i("wwb_MyService_downTimer", "onFinish")
////                    val intent = Intent(STANDARD_ACTION)
////                    sendcaBroadcast(intent)
//                    "aaaa".toast()
//                    val intent = Intent(mContext,KeepAliveActivity::class.java)
////                    intent.action = "com.demo.second.test"
////                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//为待启动的Activity指定FLAG_ACTIVITY_NEW_TASK标记位。
//                    startActivity(intent)
//
////                    ActivityUtils.startLauncherActivity()
//                }
//
//            }
//        L.i("wwb_MyService", "onCreate")
//            if (!ActivityUtils.getActivityList().any { it is TaskMainActivity }) {
//                downTimer?.start()
//            }
        L.i("wwb_MyService", "oncreate_service")

    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        L.i("wwb_MyService", "onStartCommand")
        //生成通知栏，提示正在运行状态
        val notification: Notification? = PhoenixUtil.createNotification(this)
        if (notification != null) {
            startForeground(1001, notification)
        }
        return START_STICKY
    }

    override fun onDestroy() {
        stopForeground(true)
        L.i("wwb_MyService", "onDestroy")
        super.onDestroy()
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        stopForeground(true)
        L.i("wwb_MyService", "onTaskRemoved")
        super.onTaskRemoved(rootIntent)
    }
}
package com.sq.common_module.common.utils.keepAlive;

import static android.content.Context.NOTIFICATION_SERVICE;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.blankj.utilcode.util.AppUtils;
import com.sq.common_module.R;

import java.util.List;

/**
 * Author:chris - jason
 * Date:2019-11-29.
 * Package:com.cj.phoenix
 */
public class PhoenixUtil {

    /**
     * 判断app是否处于后台
     *
     * @param context
     * @return
     */
    public static boolean isAppBackground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.processName.equals(context.getPackageName())) {
                if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_BACKGROUND) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    //创建通知栏
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static Notification createNotification(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            PackageManager packageManager = context.getPackageManager();
            String pkgName = context.getPackageName();
            if (packageManager == null || TextUtils.isEmpty(pkgName)) {
                return null;
            }

            //获取启动intent
            Intent launcherIntent = packageManager.getLaunchIntentForPackage(pkgName);
            if (launcherIntent != null) {
                ComponentName componentName = launcherIntent.getComponent();
                if (componentName == null || TextUtils.isEmpty(componentName.getClassName())) {
                    return null;
                }
            }

            Notification.Builder builder = new Notification.Builder(context.getApplicationContext());

            RemoteViews remoteViews = new RemoteViews(pkgName, R.layout.layout_my_notification);
            remoteViews.setTextViewText(R.id.tv_title, AppUtils.getAppName());

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                builder.setContentIntent(PendingIntent.getActivity(context, 0, launcherIntent, PendingIntent.FLAG_IMMUTABLE))
                        .setSmallIcon(R.mipmap.ic_logo)
//                        .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_logo))
                        .setAutoCancel(false)
                        .setContentTitle(AppUtils.getAppName())
//                        .setCustomHeadsUpContentView(remoteViews)
                        .setCustomContentView(remoteViews)
                        .setCustomBigContentView(remoteViews)
                        .setContent(remoteViews)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setVibrate(null)
                        .setSound(null);  // 默认配置,包括通知的提示音,震动效果等;
            } else {
                builder.setContentIntent(PendingIntent.getActivity(context, 0, launcherIntent, 0))
                        .setSmallIcon(R.mipmap.ic_logo)
//                        .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_logo))
                        .setAutoCancel(false)
                        .setContentTitle(AppUtils.getAppName())
//                        .setCustomHeadsUpContentView(remoteViews)
                        .setCustomContentView(remoteViews)
                        .setCustomBigContentView(remoteViews)
//                        .setContent(remoteViews)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setVibrate(null)
                        .setSound(null);  // 默认配置,包括通知的提示音,震动效果等;
            }

//        remoteViews.setTextViewText(R.id.tv_step_today, "今天走了" + MMKVManagerKt.getMMKVInt(UserInfoManager.USER_STEP) + "步");
//        remoteViews.setOnClickPendingIntent(R.id.previousIV, pendingIntent);
//        builder.setContentIntent(PendingIntent.getActivity(context, 0, launcherIntent, 0))
//                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon_phoenix_large))
//                .setSmallIcon(R.mipmap.icon_phoenix_small)
//                .setContentTitle("Phoenix")
//                .setContentText("Phoenix is running")
//                .setWhen(System.currentTimeMillis()).
//                setAutoCancel(false);

            /**
             * 可能触发浮动通知的示例条件包括：
             * 用户的 Activity 处于全屏模式（应用使用 fullScreenIntent）。
             * 通知具有高优先级，并在运行 Android 7.1（API 级别 25）及更低版本的设备上使用铃声或振动。
             * 通知渠道在运行 Android 8.0（API 级别 26）及更高版本的设备上具有很高的重要程度。
             */
            String phoenix_channelId = "default_channel";
            String phoenix_channelName = "default_channel_name";
            //调用这个方法把服务设置成前台服务
            //8.0之上必须设置channel
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O) {
                NotificationChannel notificationChannel = new NotificationChannel(phoenix_channelId, phoenix_channelName, NotificationManager.IMPORTANCE_MIN);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setShowBadge(false);//不显示角标
                notificationChannel.setLockscreenVisibility(Notification.VISIBILITY_SECRET);
                NotificationManager manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
                manager.createNotificationChannel(notificationChannel);
                builder.setChannelId(phoenix_channelId);
            }


            Notification notification = builder.build();
            notification.defaults = Notification.BADGE_ICON_NONE; //不要铃声
            notification.flags = Notification.FLAG_FOREGROUND_SERVICE | Notification.FLAG_ONGOING_EVENT;
            return notification;

        } else return null;
    }
}

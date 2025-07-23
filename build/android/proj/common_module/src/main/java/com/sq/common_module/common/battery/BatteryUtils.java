package com.sq.common_module.common.battery;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.util.Log;

import com.sq.common_module.common.utils.SharedPreferUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by town
 * Date :  2023/3/6
 * Time : 14:02
 */
public class BatteryUtils {

    /**
     * 主动获取当前电池是否在充电 , 即数据线是否插在手机上
     * @return
     */
    public static boolean isBatteryCharging(Context context){
        boolean isBatteryCharging = false;
        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent intent = context.registerReceiver(null, intentFilter);

        // 获取充电状态
        int batteryChargeState = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);

        // 判定是否是 AC 交流电充电
        boolean isAc = batteryChargeState == BatteryManager.BATTERY_PLUGGED_AC;
        // 判断是否是 USB 充电
        boolean isUsb = batteryChargeState == BatteryManager.BATTERY_PLUGGED_USB;
        // 判断是否是 无线充电
        boolean isWireless = batteryChargeState == BatteryManager.BATTERY_PLUGGED_WIRELESS;

        // 如何上述任意一种为 true , 说明当前正在充电
        isBatteryCharging = isAc || isUsb || isWireless;

        return isBatteryCharging;
    }

    /**
     * 主动获取充电接口
     * @return
     */
    public static int getBatteryType(Context context){
        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent intent = context.registerReceiver(null, intentFilter);
        // 获取充电状态
        int batteryChargeState = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        return batteryChargeState;
    }


    /**
     * 获取当前电量百分比
     * @param context 上下文
     * @return 电量百分比
     */
    public static float getBatteryPct(Context context){

        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent batteryStatus = context.registerReceiver(null, intentFilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        return level * 100 / (float)scale;
    }

    /**
     * 获取电池的容量
     *
     * @param context
     * @return
     */
    private static double batteryCapacity;
    public static double getBatteryTotal(Context context) {
        if (batteryCapacity > 0) {
            return batteryCapacity;
        }
        Object mPowerProfile;
        final String POWER_PROFILE_CLASS = "com.android.internal.os.PowerProfile";
        try {
            mPowerProfile = Class.forName(POWER_PROFILE_CLASS).getConstructor(Context.class).newInstance(context);
            batteryCapacity = (double) Class.forName(POWER_PROFILE_CLASS).getMethod("getBatteryCapacity").invoke(mPowerProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return batteryCapacity;
    }

    /**
     * 获取当前电量百分比
     * @param context 上下文
     * @return 电量百分比
     */
    public static float getBatteryTemperature(Context context){

        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent batteryStatus = context.registerReceiver(null, intentFilter);
        float temperature = (float) (batteryStatus.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0) / 10.0); //获取温度(数值)并转为电池摄氏温度
        return temperature;
    }
    public static String useBatteryTime(Context context) {
        int dl = (int) getBatteryPct(context);
        int aa = 26;
        Log.i("mdbnbshfbf", "useBatteryTime: " + SharedPreferUtil.getInt(context, "useBattery", 0));
        if (SharedPreferUtil.getInt(context, "useBattery", 0) == 0) {
            Random rand = new Random();
            aa = rand.nextInt(20) + 10;//[82,108]内的随机整数
            SharedPreferUtil.putInt(context, "useBattery", aa);
        } else {
            aa = SharedPreferUtil.getInt(context, "useBattery", 0);
        }
        double remainHours = 0.0;
        double aveNum = 103;
        remainHours = aa * dl / aveNum;
        Log.i("mdbnbshfbf", "useBatteryTime: " + remainHours);
        // 剩余使用分钟
        int hour = (int) remainHours;
        int min = (int) ((remainHours - hour) * 60);
        return hour + "h" + min + "min";
    }


    public static String StandTimeBatteryTime(String type, Context context) {
        double remainHours = 0;
        double aveNum = 0;
        if ("待机".equals(type)) {
            aveNum = 103;
        } else if ("电话".equals(type)) {
            aveNum = 133;
        } else if ("WI-FI上网".equals(type)) {
            aveNum = 153;
        } else if ("视频".equals(type)) {
            aveNum = 263;
        } else if ("游戏".equals(type)) {
            aveNum = 303;
        } else if ("拍照".equals(type)) {
            aveNum = 223;
        } else if ("音乐".equals(type)) {
            aveNum = 203;
        } else if ("阅读".equals(type)) {
            aveNum = 183;
        }

        int aa = SharedPreferUtil.getInt(context, "useBattery", 26);
        remainHours = aa * getBatteryPct(context) / aveNum;
        // 剩余使用分钟
        int hour = (int) remainHours;
        int min = (int) ((remainHours - hour) * 60);
        return hour + "小时" + min + "分钟";
    }


    public static String batterThreeTime(Context context) {
        int dl = (int) getBatteryPct(context);
        int aa = 26;
        if (SharedPreferUtil.getInt(context, "useBattery", 0) == 0) {
            Random rand = new Random();
            aa = rand.nextInt(20) + 10;//[82,108]内的随机整数
            SharedPreferUtil.putInt(context, "useBattery", aa);
        } else {
            aa = SharedPreferUtil.getInt(context, "useBattery", 0);
        }
        double remainHours = 0.0;
        double aveNum = 103;
        remainHours = aa * dl / aveNum;
        // 剩余使用分钟
        int hour = (int) remainHours;
        int min = (int) ((remainHours - hour) * 60);
        return hour + "小时" + min + "分钟";
    }

    public static String getBatteryThreePct(Context context, int type) {

        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent batteryStatus = context.registerReceiver(null, intentFilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        int sy = 100 - level * 100 / scale;
        String des;
        if (sy == 0) {
            des = "电量已充满";
        } else {
            Random rand = new Random();
            if (type == 0) {
                des = "当前正在充电，预计" + (int) (sy * (rand.nextDouble() * 2 + 1)) + "分钟充满";
            } else {
                des = "当前正在充电，预计" + (int) (sy * (rand.nextDouble() * 1 + 1)) + "分钟充满";
            }
        }

        return des;
    }


    public static String getBatteryFivePct(Context context) {

        // 主动发送包含是否正在充电状态的广播 , 该广播会持续发送
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // 注册广播接受者
        Intent batteryStatus = context.registerReceiver(null, intentFilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        int sy = 100 - level * 100 / scale;
        String des;
        if (sy == 0) {
            des = "电量已充满";
        } else {
            int aa = 26;
            if (SharedPreferUtil.getInt(context, "useBattery", 0) == 0) {
                Random rand = new Random();
                aa = rand.nextInt(20) + 10;
                SharedPreferUtil.putInt(context, "useBattery", aa);
            } else {
                aa = SharedPreferUtil.getInt(context, "useBattery", 0);
            }

            double remainHours = 0.0;
            double aveNum = 777;
            remainHours = aa * sy / aveNum;
            // 剩余使用分钟
            if (remainHours > 1) {
                int hour = (int) remainHours;
                int min = (int) ((remainHours - hour) * 60);

                des = hour + "小时" + min + "分钟";
            } else {
                des = (int) (remainHours * 60) + "分钟";
            }
        }
        return des;
    }
}


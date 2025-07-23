package com.sq.common_module.common.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

import com.sq.common_module.common.utils.java.L;

/**
 * Created by town
 * Date :  2023/3/6
 * Time : 13:57
 */
public class BatteryListener {

    private Context mContext;

    private BatteryBroadcastReceiver receiver;

    private BatteryStateListener mBatteryStateListener;

    public BatteryListener(Context context) {
        mContext = context;
        receiver = new BatteryBroadcastReceiver();
    }

    //    private static String technology;
    public int voltage;//获取电压(mv)
    public int level;
    public double temperature;//获取温度(数值)并转为电池摄氏温度
    public int health;

    public void register(BatteryStateListener listener) {
        mBatteryStateListener = listener;
        if (receiver != null) {
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_BATTERY_CHANGED);
            filter.addAction(Intent.ACTION_BATTERY_LOW);
            filter.addAction(Intent.ACTION_BATTERY_OKAY);
            filter.addAction(Intent.ACTION_POWER_CONNECTED);
            filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
            Intent intent = mContext.registerReceiver(receiver, filter);
            voltage = intent.getIntExtra("voltage", 0); //获取电压(mv)
//            level = intent.getIntExtra("level", 0); //获取当前电量
            temperature = intent.getIntExtra("temperature", 0) / 10.0; //获取温度(数值)并转为电池摄氏温度
            L.i("wwb_battery", voltage + "----" + level + "---" + temperature);
            health = intent.getIntExtra("health",-1);
        }
    }

    public void unregister() {
        if (receiver != null) {
            mContext.unregisterReceiver(receiver);
        }
    }

    private class BatteryBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String acyion = intent.getAction();
                switch (acyion) {
                    case Intent.ACTION_BATTERY_CHANGED://电量发生改变
                        if (mBatteryStateListener != null) {
                            L.e("wwb_battery", "BatteryBroadcastReceiver --> onReceive--> ACTION_BATTERY_CHANGED");
                            mBatteryStateListener.onStateChanged();
                        }
                        break;
                    case Intent.ACTION_BATTERY_LOW://电量低
                        if (mBatteryStateListener != null) {
                            L.e("wwb_battery", "BatteryBroadcastReceiver --> onReceive--> ACTION_BATTERY_LOW");
                            mBatteryStateListener.onStateLow();
                        }
                        break;
                    case Intent.ACTION_BATTERY_OKAY://电量充满
                        if (mBatteryStateListener != null) {
                            L.e("wwb_battery", "BatteryBroadcastReceiver --> onReceive--> ACTION_BATTERY_OKAY");
                            mBatteryStateListener.onStateOkay();
                        }
                        break;
                    case Intent.ACTION_POWER_CONNECTED://接通电源
                        if (mBatteryStateListener != null) {
                            L.e("wwb_battery", "BatteryBroadcastReceiver --> onReceive--> ACTION_POWER_CONNECTED");
                            mBatteryStateListener.onStatePowerConnected();
                        }
                        break;
                    case Intent.ACTION_POWER_DISCONNECTED://拔出电源
                        if (mBatteryStateListener != null) {
                            L.e("wwb_battery", "BatteryBroadcastReceiver --> onReceive--> ACTION_POWER_DISCONNECTED");
                            mBatteryStateListener.onStatePowerDisconnected();
                        }
                        break;
                }
            }
        }
    }

    public interface BatteryStateListener {
        public void onStateChanged();

        public void onStateLow();

        public void onStateOkay();

        public void onStatePowerConnected();

        public void onStatePowerDisconnected();
    }

}

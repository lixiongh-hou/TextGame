package com.sq.common_module.common.utils.java;

import android.util.Log;

import com.blankj.utilcode.util.AppUtils;

/**
 * Log统一管理类
 */
public final class L {

    private static final String LOAN = "ss_";

    private L() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    // 下面四个是默认tag的函数 
    public static void i(String tag, String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.i(LOAN + tag, msg);
            }
        } catch (Exception ex) {

        }
    }

    public static void d(String tag, String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.d(LOAN + tag, msg);
            }
        } catch (Exception ex) {

        }
    }

    public static void d(String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.d(LOAN, msg);
            }
        } catch (Exception ex) {

        }
    }

    public static void e(String tag, String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.e(LOAN + tag, msg);
            }
        } catch (Exception ex) {

        }
    }

    public static void v(String tag, String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.v(LOAN + tag, msg);
            }
        } catch (Exception ex) {

        }
    }

    public static void w(String tag, String msg) {
        try {
            if (AppUtils.isAppDebug()) {
                Log.w(LOAN + tag, msg);
            }
        } catch (Exception ex) {

        }
    }

}
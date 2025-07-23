//package com.sq.common_module.common.utils.keepAlive;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//
//import com.daemon.services.ScheduledService;
//import com.daemon.sync.ProcessManager;
//import com.daemon.sync.SyncManager;
//import com.daemon.utils.ProcessUtil;
//import com.daemon.utils.StringUtil;
//
//import me.weishu.reflection.Reflection;
//
///**
// * Created by town
// * Date :  2022/12/7
// * Time : 16:44
// */
//public class DaemonCoreUtil {
//
//
//    public DaemonCoreUtil() {
//    }
//
//    public static void attachBaseContext(Context context) {
//        Reflection.unseal(context);
//    }
//
//    private static void init(Context context) {
//        String processName = ProcessUtil.getProcessName();
//        String pkg = context.getPackageName();
//        if (StringUtil.append(new Object[]{pkg, ":", "watch"}).equals(processName)) {
//            ProcessManager.getInstance().initPersistentService(context);
//        } else if (StringUtil.append(new Object[]{pkg, ":", "keep"}).equals(processName)) {
//            ProcessManager.getInstance().initAssistantService(context);
//        } else if (StringUtil.append(new Object[]{pkg, ":", "loop"}).equals(processName)) {
//            ProcessManager.getInstance().initPersistentProvider(context);
//        } else if (StringUtil.append(new Object[]{pkg, ":", "listen"}).equals(processName)) {
//            ProcessManager.getInstance().initAssistantProvider(context);
//        } else {
//            ProcessManager.getInstance().init(context);
//        }
//
//    }
//
//    public static boolean onCreate(Context context) {
//        Log.e("DaemonCore", System.currentTimeMillis() + "");
////        if (System.currentTimeMillis() - startTime > 86400000L) {
////            return false;
////        } else {
//        init(context);
//        SyncManager.init();
//        if (context.getPackageName().equals(ProcessUtil.getProcessName())) {
//            context.startService(new Intent(context, ScheduledService.class));
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

package com.sq.common_module.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.DeviceUtils;
import com.blankj.utilcode.util.PhoneUtils;
import com.sq.common_module.common.utils.java.L;

/**
 * Created by town
 * Date :  2023/7/25
 * Time : 11:34
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0012\u001a\u00020\u0004*\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/sq/common_module/common/utils/TDInfoUtils;", "", "()V", "isRiskOpen", "", "()Z", "setRiskOpen", "(Z)V", "isRiskOpenReward", "setRiskOpenReward", "isRiskOpenWithdraw", "setRiskOpenWithdraw", "riskAppcodeList", "", "", "getRiskAppcodeList", "()[Ljava/lang/String;", "[Ljava/lang/String;", "isVpnConnected", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "getAppKey", "getTDBean", "Lcom/sq/common_module/common/utils/TDInfoBean;", "hasInternetValidatedTransport", "Landroid/net/NetworkCapabilities;", "transportType", "", "common_module_release"})
public final class TDInfoUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.TDInfoUtils INSTANCE = null;
    private static boolean isRiskOpen = false;
    private static boolean isRiskOpenReward = false;
    private static boolean isRiskOpenWithdraw = false;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] riskAppcodeList = {"20001", "20003", "20004", "20006", "20008", "20005", "20009", "20010", "20011", "20019", "20020", "20023", "20063", "20015", "20031"};
    
    private TDInfoUtils() {
        super();
    }
    
    public final boolean isRiskOpen() {
        return false;
    }
    
    public final void setRiskOpen(boolean p0) {
    }
    
    public final boolean isRiskOpenReward() {
        return false;
    }
    
    public final void setRiskOpenReward(boolean p0) {
    }
    
    public final boolean isRiskOpenWithdraw() {
        return false;
    }
    
    public final void setRiskOpenWithdraw(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getRiskAppcodeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.TDInfoBean getTDBean() {
        return null;
    }
    
    private final java.lang.String getAppKey() {
        return null;
    }
    
    @androidx.annotation.RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
    public final boolean isVpnConnected(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isVpnConnected) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final boolean hasInternetValidatedTransport(android.net.NetworkCapabilities $this$hasInternetValidatedTransport, int transportType) {
        return false;
    }
}
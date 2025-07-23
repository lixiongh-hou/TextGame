package com.sq.common_module.common.utils.kt;

import android.content.Intent;
import android.provider.Settings;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.StringUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2024/1/12
 * Time: 16:34
 * 备注：
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/sq/common_module/common/utils/kt/WiFiBaseUtils;", "", "()V", "notBtnShowReward", "", "getNotBtnShowReward", "()Z", "setNotBtnShowReward", "(Z)V", "common_module_release"})
public final class WiFiBaseUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.WiFiBaseUtils INSTANCE = null;
    private static boolean notBtnShowReward = false;
    
    private WiFiBaseUtils() {
        super();
    }
    
    public final boolean getNotBtnShowReward() {
        return false;
    }
    
    public final void setNotBtnShowReward(boolean p0) {
    }
}
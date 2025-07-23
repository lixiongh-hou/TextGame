package com.sq.common_module.common.utils;

import android.content.Context;
import com.umeng.commonsdk.UMConfigure;

/**
 * Created by town
 * Date :  2023/12/19
 * Time : 13:35
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0012R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/sq/common_module/common/utils/UMConfigUtils;", "", "()V", "mUMInfoList", "Ljava/util/HashMap;", "", "getMUMInfoList", "()Ljava/util/HashMap;", "setMUMInfoList", "(Ljava/util/HashMap;)V", "getUMKey", "initUMSdk", "", "context", "Landroid/content/Context;", "umengKey", "submitPolicyGrantResult", "grant", "", "common_module_release"})
public final class UMConfigUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.UMConfigUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.util.HashMap<java.lang.String, java.lang.String> mUMInfoList;
    
    private UMConfigUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, java.lang.String> getMUMInfoList() {
        return null;
    }
    
    public final void setMUMInfoList(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUMKey() {
        return null;
    }
    
    public final void initUMSdk(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String umengKey) {
    }
    
    public final void initUMSdk(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void submitPolicyGrantResult(@org.jetbrains.annotations.Nullable
    android.content.Context context, boolean grant) {
    }
}
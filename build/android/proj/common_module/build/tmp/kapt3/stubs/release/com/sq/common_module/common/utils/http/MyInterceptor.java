package com.sq.common_module.common.utils.http;

import android.os.Build;
import androidx.collection.ArrayMap;
import com.blankj.utilcode.util.*;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.java.StringArraySortUtil;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import okhttp3.Interceptor;
import okhttp3.Response;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 14:22
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J4\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/sq/common_module/common/utils/http/MyInterceptor;", "Lokhttp3/Interceptor;", "()V", "appCode", "", "getAppCode", "()Ljava/lang/String;", "channelCode", "getChannelCode", "isXiaomiMi8", "", "()Z", "getDataVersion", "includePrivatekeyHeaderMap", "", "urlString", "paraMap", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "needSignHeaderMap", "common_module_release"})
public final class MyInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String channelCode = null;
    
    @javax.inject.Inject
    public MyInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChannelCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    public final boolean isXiaomiMi8() {
        return false;
    }
    
    /**
     * 参与加签的字段
     *
     * @param
     * @return
     */
    private final java.util.Map<java.lang.String, java.lang.String> needSignHeaderMap(java.lang.String urlString) {
        return null;
    }
    
    /**
     * 添加privatekey的http请求头
     *
     * @param paraMap
     * @return
     */
    private final java.util.Map<java.lang.String, java.lang.String> includePrivatekeyHeaderMap(java.lang.String urlString, java.util.Map<java.lang.String, java.lang.String> paraMap) {
        return null;
    }
    
    private final java.lang.String getDataVersion() {
        return null;
    }
}
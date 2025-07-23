package com.sq.common_module.common.utils;

import com.sq.common_module.common.utils.gson.MyGsonConverterFactory;
import com.sq.common_module.common.utils.http.ApiService;
import com.sq.common_module.common.utils.http.MyInterceptor;
import com.sq.common_module.common.utils.java.L;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by town
 * Date :  2023/7/18
 * Time : 15:27
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\t"}, d2 = {"Lcom/sq/common_module/common/utils/RetrofitUtils;", "", "()V", "getApiService", "Lcom/sq/common_module/common/utils/http/ApiService;", "getHttpRetrofit", "Lretrofit2/Retrofit;", "providerLoggerInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "common_module_release"})
public final class RetrofitUtils {
    
    public RetrofitUtils() {
        super();
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor providerLoggerInterceptor() {
        return null;
    }
    
    private final retrofit2.Retrofit getHttpRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.utils.http.ApiService getApiService() {
        return null;
    }
}
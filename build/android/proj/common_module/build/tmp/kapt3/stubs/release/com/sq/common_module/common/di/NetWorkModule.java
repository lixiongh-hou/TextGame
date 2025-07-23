package com.sq.common_module.common.di;

import com.sq.common_module.common.utils.gson.MyGsonConverterFactory;
import com.sq.common_module.common.utils.http.ApiService;
import com.sq.common_module.common.utils.http.MyInterceptor;
import com.sq.common_module.common.utils.java.L;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

/**
 * Created by town.
 * Date: 2021/8/10
 * Time: 5:06 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/sq/common_module/common/di/NetWorkModule;", "", "()V", "providerApiService", "Lcom/sq/common_module/common/utils/http/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providerLoggerInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providerOkHttpClient", "Lokhttp3/OkHttpClient;", "myInterceptor", "Lcom/sq/common_module/common/utils/http/MyInterceptor;", "providerRetrofit", "okHttpClient", "common_module_release"})
@dagger.Module
public final class NetWorkModule {
    
    public NetWorkModule() {
        super();
    }
    
    /**
     * @Provides 常用于被 @Module 注解标记类的内部的方法，并提供依赖项对象。
     * @Singleton 提供单例
     */
    private final okhttp3.logging.HttpLoggingInterceptor providerLoggerInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient providerOkHttpClient(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.MyInterceptor myInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providerRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.sq.common_module.common.utils.http.ApiService providerApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}
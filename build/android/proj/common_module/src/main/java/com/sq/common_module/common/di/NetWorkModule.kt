package com.sq.common_module.common.di

import com.sq.common_module.common.utils.gson.MyGsonConverterFactory
import com.sq.common_module.common.utils.http.ApiService
import com.sq.common_module.common.utils.http.MyInterceptor
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.getBaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by town.
 * Date: 2021/8/10
 * Time: 5:06 PM
 */
@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    /**
     * @Provides 常用于被 @Module 注解标记类的内部的方法，并提供依赖项对象。
     * @Singleton 提供单例
     */

    private fun providerLoggerInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor(L::d)
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }


    @Singleton
    @Provides
    fun providerOkHttpClient(myInterceptor: MyInterceptor): OkHttpClient {
        return OkHttpClient().newBuilder()
            .readTimeout(10, TimeUnit.SECONDS)
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .connectionPool(ConnectionPool(0, 1, TimeUnit.NANOSECONDS))
            .protocols(listOf(Protocol.HTTP_1_1))
            .addInterceptor(myInterceptor)
            .addInterceptor(providerLoggerInterceptor())
            .retryOnConnectionFailure(false)
            .build()
    }

    @Singleton
    @Provides
    fun providerRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .addConverterFactory(MyGsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(okHttpClient)
            .build()

    }

    @Singleton
    @Provides
    fun providerApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

}
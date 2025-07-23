package com.sq.common_module.common.utils

import com.sq.common_module.common.utils.gson.MyGsonConverterFactory
import com.sq.common_module.common.utils.http.ApiService
import com.sq.common_module.common.utils.http.MyInterceptor
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.getBaseUrl
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by town
 * Date :  2023/7/18
 * Time : 15:27
 */
class RetrofitUtils {
    private fun providerLoggerInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor(L::d)
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    private fun getHttpRetrofit(): Retrofit {
        val okHttpClient = OkHttpClient().newBuilder()
            .readTimeout(8, TimeUnit.SECONDS)
            .connectTimeout(8, TimeUnit.SECONDS)
            .writeTimeout(8, TimeUnit.SECONDS)
            .connectionPool(ConnectionPool(0, 1, TimeUnit.NANOSECONDS))
            .protocols(listOf(Protocol.HTTP_1_1))
            .addInterceptor(MyInterceptor())
            .addInterceptor(providerLoggerInterceptor())
            .retryOnConnectionFailure(false)
            .build()
        val retrofit = Retrofit.Builder()
        retrofit.baseUrl(getBaseUrl())
            .addConverterFactory(MyGsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(okHttpClient)

        return retrofit.build()
    }

    fun getApiService(): ApiService {
        return getHttpRetrofit().create(ApiService::class.java)
    }
}
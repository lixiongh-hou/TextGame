package com.sq.common_module.common.net;

import com.sq.common_module.common.utils.http.MyInterceptor;
import com.sq.common_module.common.utils.java.L;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络请求库
 */
public abstract class NetworkApi implements IEnvironment {
    private static HashMap<String, Retrofit> retrofitHashMap = new HashMap<>();
    private String mBaseUrl;
    private OkHttpClient mOkHttpClient;
    private static boolean mIsFormal = true;

    public NetworkApi() {
        if (!mIsFormal) {
            mBaseUrl = getTest();
        } else {
            mBaseUrl = getFormal();
        }

    }

    public String getmBaseUrl() {
        return mBaseUrl;
    }

    public static void init() {
    }

    protected Retrofit getRetrofit(Class service) {
        if (retrofitHashMap.get(mBaseUrl + service.getName()) != null) {
            return retrofitHashMap.get(mBaseUrl + service.getName());
        }
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
        retrofitBuilder.baseUrl(mBaseUrl);
        retrofitBuilder.client(getOkHttpClient());
        retrofitBuilder.addConverterFactory(GsonConverterFactory.create());
        retrofitBuilder.addCallAdapterFactory(RxJava3CallAdapterFactory.create());

        Retrofit retrofit = retrofitBuilder.build();
        retrofitHashMap.put(mBaseUrl + service.getName(), retrofit);
        return retrofit;
    }

    private HttpLoggingInterceptor providerLoggerInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    private OkHttpClient getOkHttpClient() {
        if (mOkHttpClient == null) {
            List<Protocol> list = new ArrayList<>();
            list.add(Protocol.HTTP_1_1);
            mOkHttpClient = new OkHttpClient().newBuilder()
                    .readTimeout(8, TimeUnit.SECONDS)
                    .connectTimeout(8, TimeUnit.SECONDS)
                    .writeTimeout(8, TimeUnit.SECONDS)
                    .connectionPool(new ConnectionPool(0, 1, TimeUnit.NANOSECONDS))
                    .protocols(list)
                    .addInterceptor(new MyInterceptor())
                    .addInterceptor(providerLoggerInterceptor())
                    .retryOnConnectionFailure(false)
                    .build();
        }
        return mOkHttpClient;
    }

    public <T> ObservableTransformer<T, T> applySchedulers() {
        return upstream -> upstream
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(getAppErrorHandler())
                .onErrorResumeNext(new HttpErrorHandler<T>());
    }
//    public <T> ObservableTransformer<T, T> applySchedulers(final Observer<T> observer) {
//        return upstream -> {
//            //这里进行切换线程，处理错误等一些操作
//            Observable<T> observable = upstream
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .map(getAppErrorHandler())
//                    .onErrorResumeNext(new HttpErrorHandler<T>());
//            observable.subscribe(observer);
//            return observable;
//        };
//    }

    protected abstract Interceptor getInterceptor();

    protected abstract <T> Function<T, T> getAppErrorHandler();
}

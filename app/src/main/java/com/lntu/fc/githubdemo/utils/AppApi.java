package com.lntu.fc.githubdemo.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retorfit2使用
 * Created by FengChen on 2019/9/1.
 */
public class AppApi {

    public  AppService service;

    private AppApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(AppService.class);
    }

    /**
     * 内部类方式单例模式
     */
    private static class SingletonHolder {
        private static final AppApi sInstance = new AppApi();
    }

    public static AppApi getInstance() {
        return SingletonHolder.sInstance;
    }
}

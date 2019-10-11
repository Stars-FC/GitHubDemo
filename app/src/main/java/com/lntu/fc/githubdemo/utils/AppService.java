package com.lntu.fc.githubdemo.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retorfit2使用
 * Created by FengChen on 2019/9/1.
 */
public class AppService {

    private static AppApi api;

    /**
     * 初始化retrofit
     */
    public static void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(AppApi.class);
    }

    /**
     * 获取 api 对象
     *
     * @return api
     */
    public static AppApi getApi() {
        return api;
    }

    /*private AppService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(AppApi.class);
    }
    *//**
     * 内部类方式单例模式
     *//*
    private static class SingletonHolder {
        private static final AppService sInstance = new AppService();
    }

    public static AppService getInstance() {
        return SingletonHolder.sInstance;
    }*/
}

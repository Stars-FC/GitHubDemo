package com.lntu.fc.githubdemo.injection.module;

import com.lntu.fc.githubdemo.app.GithubApplication;
import com.lntu.fc.githubdemo.utils.AppApi;
import com.lntu.fc.githubdemo.utils.AppService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Application的module，负责提供全局变量
 * Created by FengChen on 2019/8/31.
 */
@Module
public class AppModule {
    private final GithubApplication mApplication;

    public AppModule(GithubApplication application) {
        mApplication = application;
    }


    @Provides
    @Singleton
    GithubApplication providerApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    AppApi provideAppApi() {
        AppService.init();
        return AppService.getApi();
    }
}

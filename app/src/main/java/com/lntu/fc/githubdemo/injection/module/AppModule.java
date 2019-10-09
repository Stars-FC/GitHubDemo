package com.lntu.fc.githubdemo.injection.module;

import com.lntu.fc.githubdemo.app.GithubApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Application的module，负责提供全局变量
 * Created by FengChen on 2019/8/31.
 */
@Module
public class AppModule {
    private final GithubApplication mApplication;

    public AppModule(GithubApplication application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    GithubApplication providerApplication() {
        return mApplication;
    }
}

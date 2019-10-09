package com.lntu.fc.githubdemo.injection.component;

import com.lntu.fc.githubdemo.app.GithubApplication;
import com.lntu.fc.githubdemo.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by FengChen on 2019/8/31.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    GithubApplication getApplication();
}

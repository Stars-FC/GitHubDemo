package com.lntu.fc.githubdemo.app;

import android.app.Application;

import com.lntu.fc.githubdemo.injection.component.AppComponent;
import com.lntu.fc.githubdemo.injection.component.DaggerAppComponent;
import com.lntu.fc.githubdemo.injection.module.AppModule;

/**
 * Created by FengChen on 2019/8/31.
 */
public class GithubApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    /**
     * 注册dagger2
     */
    private void inject() {
         DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }
}

package com.lntu.fc.githubdemo.app;

import android.app.Application;

import com.lntu.fc.githubdemo.injection.component.AppComponent;
import com.lntu.fc.githubdemo.injection.component.DaggerAppComponent;
import com.lntu.fc.githubdemo.injection.module.AppModule;

/**
 * @author Created by FengChen on 2019/8/31.
 */
public class GithubApplication extends Application {


    private static GithubApplication instance;

    public static GithubApplication getInstance(){
        return instance;
    }

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        inject();
    }

    /**
     * 注册dagger2
     */
    private void inject() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent
                    .builder()
                    .appModule(new AppModule(this))
                    .build();
        }
    }

    /**
     * 提供appComponent
     * @return
     */
    public AppComponent getAppComponent() {
        return appComponent;
    }
}

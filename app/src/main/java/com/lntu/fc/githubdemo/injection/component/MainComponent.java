package com.lntu.fc.githubdemo.injection.component;

import com.lntu.fc.githubdemo.injection.module.MainModule;
import com.lntu.fc.githubdemo.mvp.MainActivity;
import com.lntu.fc.githubdemo.utils.ActivityScope;

import dagger.Component;

/**
 * @author Created by FengChen on 2019/8/31.
 */
@ActivityScope
@Component(dependencies = AppComponent.class,modules = MainModule.class )
public interface MainComponent {
    /**
     * 注入MainActivity
     *
     * @param activity
     */
    void inject(MainActivity activity);
}

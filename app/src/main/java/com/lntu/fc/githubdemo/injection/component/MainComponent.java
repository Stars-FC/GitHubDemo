package com.lntu.fc.githubdemo.injection.component;

import com.lntu.fc.githubdemo.injection.module.MainModule;
import com.lntu.fc.githubdemo.mvp.MainActivity;

import dagger.Component;

/**
 * Created by FengChen on 2019/8/31.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}

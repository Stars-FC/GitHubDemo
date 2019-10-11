package com.lntu.fc.githubdemo.injection.module;

import com.lntu.fc.githubdemo.mvp.contract.MainContract;
import com.lntu.fc.githubdemo.utils.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author Created by FengChen on 2019/8/31.
 */
@Module
public class MainModule {
    private  MainContract.View mView;

    public MainModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    @ActivityScope
    public MainContract.View provideMainView() {
        return mView;
    }
}

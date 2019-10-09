package com.lntu.fc.githubdemo.injection.module;

import com.lntu.fc.githubdemo.mvp.contract.MainContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by FengChen on 2019/8/31.
 */
@Module
public class MainModule {
    private final MainContract.View mView;

    public MainModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    public MainContract.View provideMainView() {
        return mView;
    }
}

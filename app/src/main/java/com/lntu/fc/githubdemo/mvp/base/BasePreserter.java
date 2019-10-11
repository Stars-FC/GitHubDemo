package com.lntu.fc.githubdemo.mvp.base;

import javax.inject.Inject;

/**
 * @author Created by FengChen on 2019/8/31.
 */
public abstract class BasePreserter<T extends BaseView> {
    @Inject
    protected T view;

    public BasePreserter(T view) {
        this.view = view;
    }

    /**
     * 绑定view
     */
    public abstract void attachView();

    /**
     * 解除绑定的view
     */
    public abstract void detachView();
}

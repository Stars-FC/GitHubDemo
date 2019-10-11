package com.lntu.fc.githubdemo.mvp.base;

/**
 * @author Created by FengChen on 2019/8/31.
 */
public interface BaseView {
    /**
     * 显示消息
     * @param msg 内容
     */
    void showMessage(String msg);

    /**
     * 显示错误信息
     * @param msg  内容
     */
    void  showErrorMessage(String msg);
}

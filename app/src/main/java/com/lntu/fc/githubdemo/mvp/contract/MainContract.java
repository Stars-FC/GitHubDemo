package com.lntu.fc.githubdemo.mvp.contract;


import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.mvp.base.BasePreserter;
import com.lntu.fc.githubdemo.mvp.base.BaseView;

/**
 * 契约类
 * Created by FengChen on 2019/8/31.
 */
public interface MainContract {
    interface Presenter extends BasePreserter<View> {
        /**
         * 获取GitHub的数据
         */
        void loadGitHub();
    }

    interface View extends BaseView {
        /**
         * 位recycler赋值并显示
         */
        void showRecyclerView(Repo repo);
    }

}

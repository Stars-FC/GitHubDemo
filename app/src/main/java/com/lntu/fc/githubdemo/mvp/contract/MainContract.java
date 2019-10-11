package com.lntu.fc.githubdemo.mvp.contract;


import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.mvp.base.BasePreserter;
import com.lntu.fc.githubdemo.mvp.base.BaseView;
import com.lntu.fc.githubdemo.utils.AppApi;

import javax.inject.Inject;

/**
 * 契约类
 * @author Created by FengChen on 2019/8/31.
 */
public interface MainContract {
    abstract class Presenter extends BasePreserter<View> {

        public Presenter(View view) {
            super(view);
        }

        /**
         * 获取GitHub的数据
         */
        public abstract void loadGitHub();
    }

    interface View extends BaseView {
        /**
         * 位recycler赋值并显示
         *
         * @param repo
         */
        void showRecyclerView(Repo repo);
    }

}

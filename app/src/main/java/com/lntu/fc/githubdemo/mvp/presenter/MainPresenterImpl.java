package com.lntu.fc.githubdemo.mvp.presenter;

import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.utils.AppApi;
import com.lntu.fc.githubdemo.utils.AppService;
import com.lntu.fc.githubdemo.mvp.contract.MainContract;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * @author Created by FengChen on 2019/8/31.
 */
public class MainPresenterImpl extends MainContract.Presenter {

    @Inject
    AppApi mApi;

    @Inject
    public MainPresenterImpl(MainContract.View view) {
        super(view);
    }

    @Override
    public void attachView() {

    }

    @Override
    public void detachView() {

    }


    @Override
    public void loadGitHub() {
        // TODO: 2019/9/1 请求网络获取数据
        mApi.getRepositories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Repo>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Repo repo) {
                        //请求网络成功，加载recyclerview
                        view.showRecyclerView(repo);
                    }

                    @Override
                    public void onError(Throwable e) {
                        //加载失败，显示错误信息
                        view.showErrorMessage(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

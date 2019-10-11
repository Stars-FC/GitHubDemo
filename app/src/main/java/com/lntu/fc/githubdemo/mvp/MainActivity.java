package com.lntu.fc.githubdemo.mvp;

import android.os.Bundle;
import android.util.Log;

import com.lntu.fc.githubdemo.R;
import com.lntu.fc.githubdemo.adapter.RepoListAdapter;
import com.lntu.fc.githubdemo.injection.component.DaggerMainComponent;
import com.lntu.fc.githubdemo.injection.module.MainModule;
import com.lntu.fc.githubdemo.mvp.base.BaseActivity;
import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.mvp.contract.MainContract;
import com.lntu.fc.githubdemo.mvp.presenter.MainPresenterImpl;

import javax.inject.Inject;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

/**
 * @author fengchen
 */
public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.View {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mPresenter.loadGitHub();
    }


    @Override
    protected void initInjects() {
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .appComponent(getAppComponent())
                .build()
                .inject(this);
    }

    @Override
    public void showRecyclerView(Repo repo) {
        RepoListAdapter adapter = new RepoListAdapter(this, repo);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void showErrorMessage(String msg) {
        Log.e("---showErrorMessage-", msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

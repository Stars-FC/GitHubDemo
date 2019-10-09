package com.lntu.fc.githubdemo.mvp;

import android.os.Bundle;
import android.util.Log;

import com.lntu.fc.githubdemo.R;
import com.lntu.fc.githubdemo.adapter.RepoListAdapter;
import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.injection.component.DaggerMainComponent;
import com.lntu.fc.githubdemo.injection.module.MainModule;
import com.lntu.fc.githubdemo.mvp.presenter.MainPresenterImpl;
import com.lntu.fc.githubdemo.mvp.contract.MainContract;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private Unbinder mBind;

    @Inject
    MainPresenterImpl mPresenter;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBind = ButterKnife.bind(this);

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        mPresenter.loadGitHub();
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
        mBind.unbind();
    }
}

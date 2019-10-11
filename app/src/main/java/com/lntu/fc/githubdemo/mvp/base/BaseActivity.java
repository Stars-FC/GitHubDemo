package com.lntu.fc.githubdemo.mvp.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.lntu.fc.githubdemo.R;
import com.lntu.fc.githubdemo.app.GithubApplication;
import com.lntu.fc.githubdemo.injection.component.AppComponent;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * activity基类
 *
 * @author Created by FengChen on 2019/10/9.
 */
public abstract class BaseActivity<T extends BasePreserter> extends AppCompatActivity {
    @Inject
    protected T mPresenter;

    private Unbinder mBind;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        mBind = ButterKnife.bind(this);
        initInjects();
        mPresenter.attachView();

        initData();
    }

    /**
     * 设置布局
     *
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     */
    protected abstract void initData();


    /**
     * 绑定dagger2
     */
    protected abstract void initInjects();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
        mPresenter.detachView();
    }

    protected AppComponent getAppComponent(){
        return GithubApplication.getInstance().getAppComponent();
    }
}

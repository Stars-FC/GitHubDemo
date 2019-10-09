package com.lntu.fc.githubdemo.utils;

import com.lntu.fc.githubdemo.mvp.bean.Repo;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 接口方法类
 * Created by FengChen on 2019/9/1.
 */
public interface AppService {

    @GET("search/repositories?q=Android in:name,description+language:java,kotlin&sort=stars&order=desc")
    Observable<Repo> getRepositories();

}

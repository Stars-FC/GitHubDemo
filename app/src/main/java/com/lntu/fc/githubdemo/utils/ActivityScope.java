package com.lntu.fc.githubdemo.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


/**
 * @author Created by FengChen on 2019/10/9.
 * <p>
 * 参考Scope的写法
 * Documented 标记在文档
 * Retention 运行时级别
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}

package com.lntu.fc.githubdemo.utils;

import android.content.Context;
import android.widget.ImageView;

import com.lntu.fc.githubdemo.R;
import com.squareup.picasso.Picasso;

/**
 * 加载网络图片
 * Created by FengChen on 2019/9/2.
 */
public class PicassoUtil {
    /**
     * 普通加载
     */
    public static void loadImageView(String url, ImageView imageView) {
        Picasso.get().load(url)
                .placeholder(R.mipmap.loading_avatar)
                .error(R.mipmap.loading_avatar)
                .noFade()
                .into(imageView);
    }
}

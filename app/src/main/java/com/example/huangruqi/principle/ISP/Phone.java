package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:42
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 座机，功能有：有线、拨打电话
 */
public class Phone implements ICommon {

    private static final String TAG = "接口隔离";

    @Override
    public void wired() {
        Log.d(TAG, "Phone_wired: 有线");
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void calling() {
        Log.d(TAG, "Phone_calling: 拨打电话");
    }

    @Override
    public void listenToMusic() {

    }

    @Override
    public void watchVideos() {

    }
}

package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:38
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 手机，功能有：发送短信、拨打电话、听音乐和观看视频
 */
public class Mobile implements ICommon {

    private static final String TAG = "接口隔离";

    @Override
    public void wired() {

    }

    @Override
    public void sendMessage() {
        Log.d(TAG, "Mobile_sendMessage: 发送短信");
    }

    @Override
    public void calling() {
        Log.d(TAG, "Mobile_calling: 拨打电话");
    }

    @Override
    public void listenToMusic() {
        Log.d(TAG, "Mobile_listenToMusic: 听音乐");
    }

    @Override
    public void watchVideos() {
        Log.d(TAG, "Mobile_watchVideos: 观看视频");
    }
}

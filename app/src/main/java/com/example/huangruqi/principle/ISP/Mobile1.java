package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:40
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: (优化后)手机，功能有：发送短信、拨打电话、听音乐和观看视频
 */
public class Mobile1 implements ICommon2,ICommon3 {

    private static final String TAG = "接口隔离";

    @Override
    public void calling() {
        Log.d(TAG, "Mobile1Calling: 拨打电话");
    }

    @Override
    public void sendMessage() {
        Log.d(TAG, "Mobile1SendMessage: 发送短信");
    }

    @Override
    public void listenToMusic() {
        Log.d(TAG, "Mobile1ListenToMusic: 听音乐");
    }

    @Override
    public void watchVideos() {
        Log.d(TAG, "Mobile1WatchVideos: 观看视频");
    }
}

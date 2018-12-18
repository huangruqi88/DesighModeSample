package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:48
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: (优化后)穷人使用座机 有线、拨打电话
 */
public class WealthMan {

    private static final String TAG = "接口隔离";

    public void sendMsg(ICommon common){
        Log.i(TAG, "WealthMan_sendMsg");
        common.sendMessage();
    }

    public void call(ICommon common){
        Log.i(TAG, "WealthMan_call");
        common.calling();
    }

    public void music(ICommon common){
        Log.i(TAG, "WealthMan_music");
        common.listenToMusic();
    }

    public void video(ICommon common){
        Log.i(TAG, "WealthMan_video");
        common.watchVideos();
    }
}

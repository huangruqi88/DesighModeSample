package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:49
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class WealthMan1 {

    private static final String TAG = "接口隔离";

    public void sendMsg(ICommon3 common){
        Log.i(TAG, "WealthMan1_sendMsg");
        common.sendMessage();
    }

    public void call(ICommon2 common){
        Log.i(TAG, "WealthMan1_call");
        common.calling();
    }

    public void music(ICommon3 common){
        Log.i(TAG, "WealthMan1_music");
        common.listenToMusic();
    }

    public void video(ICommon3 common){
        Log.i(TAG, "WealthMan1_video");
        common.watchVideos();
    }
}

package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:45
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 穷人使用座机 有线、拨打电话
 */
public class PoorMan {

    private static final String TAG = "接口隔离";

    public void isWired(ICommon common){
        Log.d(TAG, "PoorMan_isWired");
        common.wired();
    }

    public void call(ICommon common){
        Log.d(TAG, "PoorMan_call");
        common.calling();
    }
}

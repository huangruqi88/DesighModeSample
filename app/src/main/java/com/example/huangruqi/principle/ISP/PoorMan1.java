package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:47
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: (优化后)穷人使用座机 有线、拨打电话
 */
public class PoorMan1 {

    private static final String TAG = "接口隔离";

    public void isWired(ICommon1 common){
        Log.d(TAG, "PoorMan_isWired");
        common.wired();
    }

    public void call(ICommon2 common){
        Log.d(TAG, "PoorMan_call");
        common.calling();
    }
}

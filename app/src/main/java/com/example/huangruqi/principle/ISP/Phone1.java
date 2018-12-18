package com.example.huangruqi.principle.ISP;

import android.util.Log;

/**
 * @data: 2018/12/17 18:44
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: (优化后)座机，功能有：有线、拨打电话
 */
public class Phone1 implements ICommon1, ICommon2 {

    private static final String TAG = "接口隔离";

    @Override
    public void wired() {
        Log.d(TAG, "Phone1_wired: 有线");
    }

    @Override
    public void calling() {
        Log.d(TAG, "Phone1_calling: 拨打电话");
    }
}

package com.example.huangruqi.pattern.factory_method;

import android.util.Log;

/**
 * @data: 2019/1/23 15:25
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class LeiFeng {
    private static final String TAG = "工厂方法模式";
    public void sweep(){
        Log.d(TAG, "sweep: ------扫地--");
    }
    public void wash(){
        Log.d(TAG, "sweep: ------洗衣服--");
    }
    public void buyRice(){
        Log.d(TAG, "sweep: ------买大米--");
    }
}

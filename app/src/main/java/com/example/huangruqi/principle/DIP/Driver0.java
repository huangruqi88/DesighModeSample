package com.example.huangruqi.principle.DIP;

import android.util.Log;

/**
 * @data: 2018/12/17 16:01
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class Driver0 {

    private static final String TAG = "依赖倒转";

    private String name;

    public Driver0(String name) {
        this.name = name;
    }

    public void drive(Benz0 benz0) {
        Log.d(TAG, "drive: " + this.name + "开车了，" + benz0.run());
    }
}

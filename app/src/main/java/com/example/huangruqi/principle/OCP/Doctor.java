package com.example.huangruqi.principle.OCP;

import android.util.Log;

/**
 * @data: 2018/12/17 15:32
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class Doctor implements Role {

    private static final String TAG = "开闭原则";

    @Override
    public void son() {
        Log.d(TAG, "医生有母亲，所以医生是儿子");
    }

    @Override
    public void doctor() {
        Log.d(TAG, "医生的职业医生");
    }

    @Override
    public void man() {
        Log.d(TAG, "医生的性别是男人");
    }
}

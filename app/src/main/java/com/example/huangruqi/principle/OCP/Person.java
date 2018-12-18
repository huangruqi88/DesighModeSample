package com.example.huangruqi.principle.OCP;

import android.util.Log;

/**
 * @data: 2018/12/17 14:55
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class Person {

    private static final String TAG = "开闭原则";

    public void son() {
        Log.d(TAG, "我有母亲，所以我是儿子");
    }

    public void doctor() {
        Log.d(TAG, "我的职业医生");
    }

    public void man() {
        Log.d(TAG, "我的性别是男人");
    }
}

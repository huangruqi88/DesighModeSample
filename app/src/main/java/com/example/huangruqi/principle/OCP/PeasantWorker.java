package com.example.huangruqi.principle.OCP;

import android.util.Log;

/**
 * @data: 2018/12/17 15:35
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public class PeasantWorker implements Role {

    private static final String TAG = "开闭原则";

    @Override
    public void son() {
        Log.d(TAG, "农民工有母亲，所以农民工是儿子");
    }


    @Override
    public void doctor() {

    }

    @Override
    public void man() {
        Log.d(TAG, "农民工的性别是男人");
    }

    public void peasantWorker() {
        Log.d(TAG, "农民工的职业农民工");
    }


}

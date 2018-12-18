package com.example.huangruqi.principle.SRP;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.designprinciple.SRP
 * @data 2018/12/15 11:41
 */
public class Persion {

    public static final String TAG = "单一职责";

    public void doctor() {
        Log.d(TAG, "我的职业是医生，我的职责是看病");
    }

    public void programmer() {
        Log.d(TAG, "我的职业是程序员，我的职责是写代码");
    }

    public void peasantWorker(){
        Log.d(TAG, "我的职业是农民工，我的职责是打工，种地");
    }
}

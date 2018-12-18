package com.example.huangruqi.principle.SRP;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.designprinciple.SRP
 * @data 2018/12/17 14:22
 */
public class Doctor {

    public static final String TAG = "单一职责";

    public void doctor() {
        Log.d(TAG, "我的职业是医生，我的职责是看病");
    }
}

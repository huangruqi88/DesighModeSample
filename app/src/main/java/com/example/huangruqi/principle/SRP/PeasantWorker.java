package com.example.huangruqi.principle.SRP;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.designprinciple.SRP
 * @data 2018/12/17 14:26
 */
public class PeasantWorker {

    public static final String TAG = "单一职责";

    public void peasantWorker() {
        Log.d(TAG, "我的职业是农民工，我的职责是打工，种地");
    }
}

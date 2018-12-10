package com.example.huangruqi.desighmodesample.strategy;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy
 * @data 2018/11/26 18:57
 */
public class ConcreteStrategyC extends Strategy {
    private static final String TAG = "ConcreteStrategyC";
    @Override
    public void algorithmInterface() {
        Log.d(TAG, "algorithmInterface: --------  商场策略算法C");
    }
}

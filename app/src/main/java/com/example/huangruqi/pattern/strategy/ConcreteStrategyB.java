package com.example.huangruqi.pattern.strategy;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy
 * @data 2018/11/26 18:55
 */
public class ConcreteStrategyB extends Strategy {
    private static final String TAG = "ConcreteStrategyB";
    @Override
    public void algorithmInterface() {
        Log.d(TAG, "algorithmInterface: --------  商场策略算法B");
    }
}

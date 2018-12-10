package com.example.huangruqi.desighmodesample.strategy;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy
 * @data 2018/11/26 18:54
 * 具体的策略A（及商场打折A方案促销活动）
 */
public class ConcreteStrategyA extends Strategy {
    private static final String TAG = "ConcreteStrategyA";
    @Override
    public void algorithmInterface() {
        Log.d(TAG, "algorithmInterface: --------  商场策略算法A");
    }
}

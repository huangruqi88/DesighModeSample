package com.example.huangruqi.pattern.sample_factory;

import android.util.Log;

/**
 * @author huangruqi
 * @Description: 装饰设计模式
 * @Package: com.example.huangruqi.desighmodesample.factory
 * @data 2018/11/26 10:41
 */
public class SampleFactory {

    private static final String TAG = "SampleFactory";

    public static Animal createInstence(String type) {
        Animal mAnimal = null;
        if ("Cat".equals(type)) {
            mAnimal = new Cat();
        } else if ("Dog".equals(type)) {
            mAnimal = new Dog();
        } else {
            Log.e(TAG, "createInstence: -----工厂没有生成出对应的动物-----");
        }
        return mAnimal;
    }
}

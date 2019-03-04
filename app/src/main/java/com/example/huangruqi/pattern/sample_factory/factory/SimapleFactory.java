package com.example.huangruqi.pattern.sample_factory.factory;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.factory
 * @data 2018/11/26 10:41
 */
public class SimapleFactory {

    private static final String TAG = "SimapleFactory";

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

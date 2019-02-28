package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 15:32
 * @author: 黄汝琪
 * @Email:
 * @Description: 懒汉式
 */
public class Singleton {
    private static Singleton mInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (null == mInstance) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

}

package com.example.huangruqi.pattern.decorator;

import android.util.Log;

/**
 * @data: 2018/12/24 18:16
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class ConcreteDecoratorA extends Decorator {

    private static final String TAG = "装饰模式";
    /**
     * 本类独有的功能，用于区别ConcreteDecoratorB
     */
    private String addedState;

    /**
     * 首先运行原Component的operation再执行本类的功能 如：addedState，相当于对原Component进行装饰
     */
    @Override
    public void operation() {
        mComponent.operation();
        addedState = "New State";
        Log.d(TAG, "具体的对象A的操作");
    }
}

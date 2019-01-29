package com.example.huangruqi.pattern.decorator.Person;

import android.util.Log;

/**
 * @data: 2018/12/24 19:46
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式  是定义的一个具体的对象，也可以给对象添加一些职责
 */
public class Person {
    protected String name;

    public static final String TAG = "装饰模式";

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        Log.d(TAG, "show: name = " + name);
    }
}

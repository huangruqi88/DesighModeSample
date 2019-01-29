package com.example.huangruqi.pattern.decorator.Person;


/**
 * @data: 2018/12/24 19:48
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class Finery extends Person {
    protected Person mComponet;
    public static final String TAG = "装饰模式";
    public void decorator(Person componet) {
        mComponet = componet;
    }

    @Override
    public void show() {
        if (null != mComponet) {
            mComponet.show();
        }
    }

}

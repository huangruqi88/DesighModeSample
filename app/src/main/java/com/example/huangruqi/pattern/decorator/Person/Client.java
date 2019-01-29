package com.example.huangruqi.pattern.decorator.Person;

import android.util.Log;

/**
 * @data: 2018/12/24 20:01
 * @author: 黄汝琪
 * @Email:
 * @Description: 装饰设计模式
 */
public class Client {
    public static final String TAG = "装饰模式";
    public static void main(String[] args){
        Log.d(TAG, " ");
        Person person = new Person();
        person.setName("隔壁老王");

        GreenHeadgear greenHeadgear = new GreenHeadgear();
        greenHeadgear.decorator(person);
        greenHeadgear.show();

        YellowTShorts yellowTShorts = new YellowTShorts();
        yellowTShorts.decorator(person);
        yellowTShorts.show();
    }
}

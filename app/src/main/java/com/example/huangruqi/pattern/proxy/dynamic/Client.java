package com.example.huangruqi.pattern.proxy.dynamic;

import android.util.Log;

import java.lang.reflect.Proxy;

/**
 * @data: 2019/1/23 11:50
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    private static final String TAG = "动态代理";

    public static void main(String[] args) {
        //第一种方式
        PersonInvocationHandler handler =
                new PersonInvocationHandler(new PersonImpl());
        Person person = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class}, handler);
        person.setAge(18);
        person.setName("张三");
        person.setGender("不男不女");
        Log.d(TAG, "main: " + handler.getModifiedTimes());

        //第二种方式
        Person person1 = PersonFactory.getPerson();
        person1.setAge(21);
        person1.setName("梅超风");
        person1.setGender("女");
        Log.d(TAG, "main: " + handler.getModifiedTimes());

    }
}

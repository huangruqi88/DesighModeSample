package com.example.huangruqi.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @data: 2019/1/23 11:58
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class PersonFactory {
    public static Person getPerson(){
        PersonInvocationHandler handler = new PersonInvocationHandler(new PersonImpl());
        return (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class},handler);
    }
}

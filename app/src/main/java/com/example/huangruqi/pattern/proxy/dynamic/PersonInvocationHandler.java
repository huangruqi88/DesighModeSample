package com.example.huangruqi.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @data: 2019/1/23 11:35
 * @author: 黄汝琪
 * @Email:
 * @Description:  InvocationHandler Java 提供的一个代理类
 */
public class PersonInvocationHandler implements InvocationHandler {
    private Person mPerson;
    private int modifiedTimes;

    public PersonInvocationHandler(Person person) {
        this.mPerson = person;
    }

    public int getModifiedTimes() {
        return modifiedTimes;
    }

    /**
     * 如果Person类拥有很多的setXXX,为每一个setter方法增加代码都会很繁琐，
     * 或者当需要给Person类增加一个属性时，DecorPerson也要跟着修改所以使用
     * java.lang.reflect.Proxy，可以通过Proxy.newProxyInstance(ClassLoader loader,
     * Class[] interfaces, InvocationHandler h)这个方法创建代理对象。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")){
            modifiedTimes++;
        }
        return method.invoke(proxy,args);
    }
}

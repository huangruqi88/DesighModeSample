package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Mediator {
    /**
     * 中介者对象发送
     * @param mesage
     * @param colleague
     */
    public abstract void send(String mesage,Colleague colleague);
}

package com.example.huangruqi.pattern.mediator.sample;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Mediator {


    /**
     * 同事对象改变时通知中介者的方法
     * 在同事对象改变时由中介者去通知其他的同事对象
     *
     * @param colleague
     */
    public abstract void changed(Colleague colleague);
}

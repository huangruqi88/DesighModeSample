package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

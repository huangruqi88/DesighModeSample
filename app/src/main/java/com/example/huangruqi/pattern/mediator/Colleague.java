package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Colleage {
    protected Mediator mediator;

    public Colleage(Mediator mediator) {
        this.mediator = mediator;
    }
}

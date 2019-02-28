package com.example.huangruqi.pattern.bridge.sample;

/**
 * date:2019/2/28
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}


package com.example.huangruqi.pattern.bridge.sample;

/**
 * date:2019/2/28
 * author:huang
 * Description:请详细描述当前类
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + impl + "咖啡");
    }
}

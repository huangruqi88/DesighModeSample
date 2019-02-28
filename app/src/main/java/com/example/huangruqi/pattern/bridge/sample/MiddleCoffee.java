package com.example.huangruqi.pattern.bridge.sample;

/**
 * date:2019/2/28
 * author:huang
 * Description:咖啡厅新推出中杯咖啡
 */
public class MiddleCoffee extends Coffee {
    public MiddleCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl + "咖啡");
    }
}

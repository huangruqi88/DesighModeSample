package com.example.huangruqi.pattern.bridge.sample;

/**
 * date:2019/2/28
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {

    public static void main(String[] args) {
        //原汁原味
        Oridinary oridinary = new Oridinary();

        //准备加糖
        Sugar sugar = new Sugar();

        //大杯咖啡 原味
        LargeCoffee largeCoffee = new LargeCoffee(oridinary);
        largeCoffee.makeCoffee();

        //小杯咖啡 原味
        SmallCoffee smallCoffee = new SmallCoffee(oridinary);
        smallCoffee.makeCoffee();

        //大杯咖啡 加糖
        LargeCoffee largeSugarCoffee = new LargeCoffee(sugar);
        largeSugarCoffee.makeCoffee();

        //小杯咖啡 加糖
        SmallCoffee smallSugarCoffee = new SmallCoffee(sugar);
        smallSugarCoffee.makeCoffee();

//==========================================================================================
        //咖啡厅新推出中杯咖啡，这时候只需要新建MiddleCoffee类


        //大杯咖啡 原味
        MiddleCoffee middleCoffee = new MiddleCoffee(oridinary);
        middleCoffee.makeCoffee();

        //大杯咖啡 加糖
        MiddleCoffee middleSugarCoffee = new MiddleCoffee(sugar);
        middleSugarCoffee.makeCoffee();

    }
}

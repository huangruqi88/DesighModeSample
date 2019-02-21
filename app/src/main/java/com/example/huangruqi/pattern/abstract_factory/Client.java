package com.example.huangruqi.pattern.abstract_factory;

/**
 * @data: 2019/2/21 14:18
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProductA().method();
        concreteFactory1.createProductB().method();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory2.createProductA().method();
        concreteFactory2.createProductB().method();
    }
}

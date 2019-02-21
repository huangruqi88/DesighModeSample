package com.example.huangruqi.pattern.abstract_factory;

/**
 * @data: 2019/2/21 14:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}

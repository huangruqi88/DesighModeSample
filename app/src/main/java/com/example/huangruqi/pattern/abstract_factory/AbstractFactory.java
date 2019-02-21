package com.example.huangruqi.pattern.abstract_factory;

/**
 * @data: 2019/2/21 14:14
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AbstractFactory {

    /**
     * 创建产品A的方法
     *
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     *
     * @return 产品B对象
     */
    public abstract AbstractProductB createProductB();
}

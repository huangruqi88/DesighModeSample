package com.example.huangruqi.pattern.sample_factory.car;

/**
 * @data: 2019/2/16 10:11
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class AudiCar {

    /**
     * 汽车的抽象产品类
     * 定义汽车的一个行为方法 车可以启动开走。
     */
    public abstract void drive();

    /**
     * 汽车的抽象产品类
     * 定义汽车的一个行为方法 车可以自动巡航。
     */
    public abstract void selNavigation();
}

package com.example.huangruqi.pattern.sample_factory.car;

/**
 * @data: 2019/2/16 10:18
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        // 构造一个制造汽车的工厂对象
        AudiFactory factory = new AudiCarFractory();

        // 生产 Q3 并启动
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selNavigation();

        // 生产 Q5 并启动
        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selNavigation();

        // 生产 Q3 并启动
        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selNavigation();
    }
}

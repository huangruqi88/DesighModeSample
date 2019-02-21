package com.example.huangruqi.pattern.sample_factory.car;

/**
 * @data: 2019/2/16 10:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println(" Q7 启动啦！");
    }

    @Override
    public void selNavigation() {
        System.out.println(" Q7 开启自动巡航！");
    }
}

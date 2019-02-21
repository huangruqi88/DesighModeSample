package com.example.huangruqi.pattern.abstract_factory.sample;

/**
 * @data: 2019/2/21 15:58
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动！");
    }
}

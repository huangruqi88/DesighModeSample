package com.example.huangruqi.pattern.abstract_factory.sample;

/**
 * @data: 2019/2/21 15:55
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎！");
    }
}

package com.example.huangruqi.pattern.facade.sample;

/**
 * @data: 2019/2/20 11:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class PhoneImpl implements Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂电话");
    }
}

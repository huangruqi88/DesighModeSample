package com.example.huangruqi.pattern.adapter;

/**
 * @data: 2019/2/25 15:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Apdater extends Target {

    private Adaptee mAdaptee = new Adaptee();

    @Override
    public void request() {
        mAdaptee.spesificRequest();
    }
}

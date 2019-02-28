package com.example.huangruqi.pattern.singleton;

/**
 * @data: 2019/2/28 14:51
 * @author: 黄汝琪
 * @Email:
 * @Description: CEO 饿汉式单例
 */
public class CEO extends Staff {
    private static final CEO mCeo = new CEO();

    private CEO() {
    }

    public static CEO getInstance(){
        return mCeo;
    }

    @Override
    public void work() {
        System.out.println("管理副总裁");
    }
}

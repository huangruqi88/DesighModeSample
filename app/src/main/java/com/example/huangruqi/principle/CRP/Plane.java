package com.example.huangruqi.principle.CRP;

/**
 * @data: 2018/12/17 19:16
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 飞机
 */
public class Plane {
    /**
     * 在一个对象中声明另外一个对象的变量。
     */
    private Airfoil airfoil;

    public void fly() {
        //使用组合复用
        airfoil.AdjustAngle();
    }

    public Airfoil getAirfoil() {
        return airfoil;
    }

    public void setAirfoil(Airfoil airfoil) {
        this.airfoil = airfoil;
    }
}

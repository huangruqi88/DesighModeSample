package com.example.huangruqi.principle.DIP;

import android.util.Log;

/**
 * @data: 2018/12/17 16:36
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description: 依赖的三种写法
 */
public class Driver implements IDriver {
    
    private static final String TAG = "依赖倒转原则";
    
    private String name;

    private ICar mCar;

    public Driver(String name) {
        this.name = name;
    }

    /**
     * 1.构造函数注入依赖
     * @param mCar
     */
    public Driver(ICar mCar) {
        this.mCar = mCar;
    }

    @Override
    public void drive() {
        this.mCar.run();
    }

    /**
     * 2.Setter方法传递依赖对象
     * @param car
     */
    @Override
    public void setCar(ICar car) {
        this.mCar = car;
    }

    /**
     * 3.接口声明依赖对象
     * @param car
     */
    @Override
    public void drive(ICar car) {

        Log.d(TAG, "drive: " + this.name + "开车了，" + car.run());
    }


}

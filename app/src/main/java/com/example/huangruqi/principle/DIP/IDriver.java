package com.example.huangruqi.principle.DIP;

/**
 * @data: 2018/12/17 16:35
 * @author: 黄汝琪
 * @Email: hrq@hzgjgc.com
 * @Description:
 */
public interface IDriver {

     void drive();

    /**
     * Setter方法传递依赖对象
     * @param car
     */
     void setCar(ICar car);


    void drive(ICar car);

}

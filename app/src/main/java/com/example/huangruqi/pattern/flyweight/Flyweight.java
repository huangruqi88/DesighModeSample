package com.example.huangruqi.pattern.flyweight;

/**
 * @data: 2019/3/8 14:11
 * @Email:
 * @Description: 所有具体亨元类的超类或者接口，通过这个接口Flayweight可以接受并作用于外部状态。
 */
public abstract class Flyweight {
    /**
     * 接受外部状态的方法
     * @param extrinsicstate
     */
    public abstract void operation(int extrinsicstate);
}

package com.example.huangruqi.pattern.flyweight;

/**
 * @data: 2019/3/8 14:23
 * @author: hrq
 * @Email:
 * @Description:
 */
public class UnSharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享具体的Flyweight：" + extrinsicstate);
    }
}

package com.example.huangruqi.pattern.flyweight;

/**
 * @data: 2019/3/8 14:20
 * @author: hrq
 * @Email:
 * @Description: 继承或实现Flyweight接口，并为内部增加储存状态
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate );
    }
}

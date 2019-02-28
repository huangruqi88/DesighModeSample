package com.example.huangruqi.pattern.bridge;

public class ConcreteImplemetorB extends Implementor {
    @Override
    void operation() {
        System.out.println("具体实现B的方法执行");
    }
}

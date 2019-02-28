package com.example.huangruqi.pattern.bridge;

public class ConcreteImplemetorA extends Implementor {
    @Override
    void operation() {
        System.out.println("具体实现A的方法执行");
    }
}

package com.example.huangruqi.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.setImplementor(new ConcreteImplemetorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplemetorB());
        abstraction.operation();
    }
}

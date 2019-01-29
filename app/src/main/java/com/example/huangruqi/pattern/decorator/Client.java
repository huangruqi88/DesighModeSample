package com.example.huangruqi.pattern.decorator;

/**
 * @data: 2018/12/24 18:34
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        ConcreteComponet concreteComponet = new ConcreteComponet();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorA.setComponent(concreteComponet);
        decoratorB.setComponent(decoratorB);
        decoratorB.operation();
    }
}

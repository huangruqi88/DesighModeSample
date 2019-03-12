package com.example.huangruqi.pattern.visitor;

/**
 * @data: 2019/3/11 10:48
 * @author: hrq
 * @Email:
 * @Description:
 */
public class ConcreteVisitorA extends Visitor {
    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("具体的访问者A : " + concreteElementA.operationA());
    }

    @Override
    public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("具体的访问者A : " + concreteElementB.operationB());
    }
}

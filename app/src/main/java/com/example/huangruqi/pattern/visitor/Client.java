package com.example.huangruqi.pattern.visitor;

import com.example.huangruqi.pattern.mediator.ConcretaColleague1;

/**
 * @data: 2019/3/11 11:02
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitorA visitorA = new ConcreteVisitorA();
        ConcreteVisitorB visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);
    }
}

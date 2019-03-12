package com.example.huangruqi.pattern.visitor;

/**
 * @data: 2019/3/11 10:41
 * @author: hrq
 * @Email:
 * @Description:
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementB(this);
    }

    public String operationB(){
        return "具体的操作元素B!";
    }
}

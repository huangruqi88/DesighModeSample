package com.example.huangruqi.pattern.visitor;

/**
 * @data: 2019/3/11 10:41
 * @author: hrq
 * @Email:
 * @Description:
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorConcreteElementA(this);
    }

    public String operationA(){
        return "具体的操作元素A!";
    }
}

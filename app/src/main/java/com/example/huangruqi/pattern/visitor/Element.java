package com.example.huangruqi.pattern.visitor;

/**
 * @data: 2019/3/11 10:39
 * @author: hrq
 * @Email:
 * @Description:
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}

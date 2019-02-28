package com.example.huangruqi.pattern.iterator;

import java.util.List;

/**
 * @data: 2019/2/28 10:15
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        List<Object> items = aggregate.getItems();
        items.add("菜鸟");
        items.add("话唠");
        items.add("扯淡");
        items.add("聊天");
        items.add("偷吃");
        Iterator iterator = aggregate.createIterator();
        Object first = iterator.first();
        System.out.println(first.toString() + " 第一位！");
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem().toString() + " 请买车票！");
            iterator.next();
        }
    }
}

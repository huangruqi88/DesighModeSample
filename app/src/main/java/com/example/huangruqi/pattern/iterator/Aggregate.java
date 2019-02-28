package com.example.huangruqi.pattern.iterator;

/**
 * @data: 2019/2/28 09:31
 * @author: 黄汝琪
 * @Email:
 * @Description: 容器的抽象类
 */
public abstract class Aggregate {
    /**
     * 创建迭代器
     * @return
     */
    abstract Iterator createIterator();
}

package com.example.huangruqi.pattern.iterator;

/**
 * @data: 2019/2/28 09:29
 * @author: 黄汝琪
 * @Email:
 * @Description: 迭代器抽象类
 */
public abstract class Iterator {

    /**
     * 得到容器中的第一个对象
     * @return
     */
    abstract Object first();

    /**
     * 得到容器中的下一个对象
     * @return
     */
    abstract Object next();

    /**
     * 是否遍历到结尾
     * @return
     */
    abstract boolean isDone();

    /**
     *
     * 返回容器中当前的对象
     * @return
     */
    abstract Object currentItem();
}

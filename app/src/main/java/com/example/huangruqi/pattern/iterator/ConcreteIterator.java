package com.example.huangruqi.pattern.iterator;

/**
 * @data: 2019/2/28 09:33
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteIterator extends Iterator {
    /**
     * 定义了一个具体的对象
     */
    private ConcreteAggregate mConcreteAggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.mConcreteAggregate = concreteAggregate;
    }

    @Override
    Object first() {
        return mConcreteAggregate.getItems().get(0);
    }

    @Override
    Object next() {
        Object o = null;
        current++;
        if (current < mConcreteAggregate.getCount()) {
            o =  mConcreteAggregate.getItems().get(current);
        }

        return o;
    }

    @Override
    boolean isDone() {
        return current >= mConcreteAggregate.getCount();
    }


    @Override
    Object currentItem() {
        return mConcreteAggregate.getItems().get(current);
    }
}

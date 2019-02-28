package com.example.huangruqi.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @data: 2019/2/28 09:34
 * @author: 黄汝琪
 * @Email:
 * @Description: 容器具体的实现类
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> mItem = new ArrayList<>();

    @Override
    Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public List<Object> getItems() {
        return mItem;
    }

    public int getCount() {
        return mItem.size();
    }
}

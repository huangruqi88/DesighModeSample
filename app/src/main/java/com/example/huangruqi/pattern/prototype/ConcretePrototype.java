package com.example.huangruqi.pattern.prototype;

/**
 * @data: 2019/1/23 19:20
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcretePrototype extends Prototype {
    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}

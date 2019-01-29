package com.example.huangruqi.pattern.prototype;

/**
 * @data: 2019/1/23 19:17
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class Prototype extends Object {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public abstract Prototype clone();
}

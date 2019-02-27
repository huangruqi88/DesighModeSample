package com.example.huangruqi.pattern.composite;

public abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    abstract void add(Component component);
    abstract void remove(Component component);
    abstract void display(int depth);
}

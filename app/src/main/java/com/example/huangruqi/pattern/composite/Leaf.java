package com.example.huangruqi.pattern.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        System.out.println("Cannot add to a leaf!!");
    }

    @Override
    void remove(Component component) {
        System.out.println("Cannot remove to a leaf!!");
    }

    @Override
    void display(int depth) {
        System.out.println(" display = " + depth + " ,name = " + name);
    }
}

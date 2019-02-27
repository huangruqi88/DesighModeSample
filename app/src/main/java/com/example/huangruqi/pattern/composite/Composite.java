package com.example.huangruqi.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        children.add(component);
    }

    @Override
    void remove(Component component) {
        children.remove(component);
    }

    @Override
    void display(int depth) {
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}

package com.example.huangruqi.pattern.composite;

public class Client {
    
    public static void main(String[] args) {

        //生成树根Root,根上长出两个叶子，叶子A和叶子B
        Composite root = new Composite("Root");
        root.add(new Leaf("叶子 A"));
        root.add(new Leaf("叶子 B"));

        //根上长出分枝Composite X 分枝上也有两个叶子 叶子XA和叶子XB
        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("叶子 XA"));
        composite.add(new Leaf("叶子 XB"));

        root.add(composite);

        //在分枝Composite X 上又长出分枝Composite X 分枝上也有两个叶子 叶子XYA和叶子XYB
        Composite composite1 = new Composite("Composite XY");
        composite.add(new Leaf("叶子 XYA"));
        composite.add(new Leaf("叶子 XYB"));

        root.add(composite1);

        //根部长出了两个叶子 C 和 叶子D ，但是叶子D没长牢被封吹走了
        root.add(new Leaf("叶子 C"));

        Leaf leaf = new Leaf("叶子 D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);

    }
}

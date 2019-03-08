package com.example.huangruqi.pattern.flyweight;

/**
 * @data: 2019/3/8 14:32
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight laoWang = factory.getFlyweight("隔壁老王");
        laoWang.operation(--extrinsicstate);

        Flyweight daJie = factory.getFlyweight("隔壁大姐");
        daJie.operation(--extrinsicstate);

        Flyweight maZi = factory.getFlyweight("对门麻子");
        maZi.operation(--extrinsicstate);

        UnSharedConcreteFlyweight unFlyweight = new UnSharedConcreteFlyweight();
        unFlyweight.operation(--extrinsicstate);

    }
}

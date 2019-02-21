package com.example.huangruqi.pattern.sample_factory.sample;


/**
 * @data: 2019/2/16 09:32
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        //普通方法生产抽象工厂对象，需要哪一个就去生产哪一个(注：因为Android不推荐
        // 使用反射参考“例1”)，这样有个弊端，factory.createProduct()每次都需要重新new
        // 一个所以我们使用反射可以很轻松的实现不同对象的(注：参考“例2”)。

/******************************* 例1 ************************************/
        Factory factory1A = new ConcreteFactoryA();
        Factory factory1B = new ConcreteFactoryB();
        Product product1A = factory1A.createProduct();
        Product product1B = factory1B.createProduct();
        product1A.method();
        product1B.method();

/****************************** 例2 **********************************/
        Factory factory = new ConcreteFactory();
        Product productA = factory.createProduct(ConcreteProductA.class);
        Product productB = factory.createProduct(ConcreteProductB.class);
        System.out.println("反射的生产的对象");
        productA.method();
        productB.method();
    }

}

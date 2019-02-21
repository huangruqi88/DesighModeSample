package com.example.huangruqi.pattern.factory_method.product;

/**
 * @data: 2019/1/23 15:54
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        //第一种方式
        Factory factoryA = new ConcreteProductAFactory();
        ConcreteProductA productA = (ConcreteProductA) factoryA.createProduct();
        productA.method();
        Factory factoryB = new ConcreteProductBFactory();

        ConcreteProductB productB = (ConcreteProductB) factoryB.createProduct();
        productB.method();

        //第二种方式
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProductB.class);
        product.method();
    }
}

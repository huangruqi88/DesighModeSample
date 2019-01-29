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
        Fractory fractoryA = new ConcreteProductAFractory();
        ConcreteProductA productA = (ConcreteProductA) fractoryA.createProduct();
        productA.method();
        Fractory fractoryB = new ConcreteProductBFractory();

        ConcreteProductB productB = (ConcreteProductB) fractoryB.createProduct();
        productB.method();

        //第二种方式
        Fractory fractory = new ConcreteFactory();
        Product product = fractory.createProduct(ConcreteProductB.class);
        product.method();
    }
}

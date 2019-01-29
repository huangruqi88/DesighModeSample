package com.example.huangruqi.pattern.factory_method.product;

/**
 * @data: 2019/1/23 15:53
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteProductAFractory extends Fractory {
    @Override
    public <T extends Product> Product createProduct(Class<T> clzz) {
        return null;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

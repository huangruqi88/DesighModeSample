package com.example.huangruqi.pattern.sample_factory.sample;

/**
 * @data: 2019/2/16 09:31
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        return null;
    }

}

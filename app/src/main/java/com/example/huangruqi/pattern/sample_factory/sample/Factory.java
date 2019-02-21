package com.example.huangruqi.pattern.sample_factory.sample;

/**
 * @data: 2019/2/16 09:27
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class Factory  {

    /**
     * 抽象工厂方法具体产生什么由子类去实现
     * @return
     */
    public abstract  Product createProduct();/**
     * 抽象工厂方法具体产生什么由子类去实现
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}

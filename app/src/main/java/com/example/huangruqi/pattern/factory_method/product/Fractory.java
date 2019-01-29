package com.example.huangruqi.pattern.factory_method.product;

/**
 * @data: 2019/1/23 15:51
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public abstract class Fractory {
    public abstract <T extends Product>Product createProduct(Class<T> clzz);
    public abstract Product createProduct();
}

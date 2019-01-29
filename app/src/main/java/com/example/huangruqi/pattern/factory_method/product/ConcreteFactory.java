package com.example.huangruqi.pattern.factory_method.product;

/**
 * @data: 2019/1/23 16:05
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteFactory extends Fractory {
    @Override
    public <T extends Product> Product createProduct(Class<T> clzz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clzz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public Product createProduct() {
        return null;
    }
}

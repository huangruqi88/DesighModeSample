package com.example.huangruqi.pattern.sample_factory.sample;

/**
 * @data: 2019/2/16 09:31
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return null;
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

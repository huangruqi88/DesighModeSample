package com.example.huangruqi.pattern.template_method;

/**
 * @data: 2019/2/16 11:24
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    void primitiveOperation1() {
        System.out.println("具体类B 方法1 实现");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("具体类B 方法2 实现");
    }
}

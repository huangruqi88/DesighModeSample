package com.example.huangruqi.pattern.template_method;

/**
 * @data: 2019/1/26 09:32
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    void prinitiveOperation1() {
        System.out.println("具体的实现类A方法1的实现");
    }

    @Override
    void prinitiveOperation2() {
        System.out.println("具体的实现类A方法2的实现");
    }
}

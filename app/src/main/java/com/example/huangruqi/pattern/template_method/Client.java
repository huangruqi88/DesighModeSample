package com.example.huangruqi.pattern.template_method;

/**
 * @data: 2019/2/16 11:27
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass clazz;
        clazz = new ConcreteClassA();
        clazz.templateMethod();
        System.out.println("------------- 分割线 --------------");
        clazz = new ConcreteClassB();
        clazz.templateMethod();
    }
}

package com.example.huangruqi.pattern.facade;

/**
 * @data: 2019/2/20 11:57
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}

package com.example.huangruqi.pattern.sate;

/**
 * @data: 2019/2/22 09:45
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        System.out.println("------------------");
    }
}

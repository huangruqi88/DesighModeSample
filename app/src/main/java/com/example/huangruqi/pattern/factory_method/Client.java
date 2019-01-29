package com.example.huangruqi.pattern.factory_method;

/**
 * @data: 2019/1/23 15:29
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        IFactory iFactory = new StudentFractory();

        LeiFeng student = iFactory.createLeiFeng();
        student.wash();
        student.sweep();
        student.buyRice();
    }
}

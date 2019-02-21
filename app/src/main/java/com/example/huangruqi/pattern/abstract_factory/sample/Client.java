package com.example.huangruqi.pattern.abstract_factory.sample;

/**
 * @data: 2019/2/21 16:10
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //构造一个生产Q3的工厂
        CarFactory Q3CarFactory = new Q3Factory();
        Q3CarFactory.createTire().tire();
        Q3CarFactory.createEngine().engine();
        Q3CarFactory.createBrake().brake();
        System.out.println("-------------------");

        //构造一个Q7的工厂
        CarFactory Q7CarFactory = new Q7Factory();
        Q7CarFactory.createTire().tire();
        Q7CarFactory.createEngine().engine();
        Q7CarFactory.createBrake().brake();
    }
}

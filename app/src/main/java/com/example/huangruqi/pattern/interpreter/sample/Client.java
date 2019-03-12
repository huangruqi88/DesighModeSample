package com.example.huangruqi.pattern.interpreter.sample;

/**
 * @data: 2019/3/9 11:37
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("158 + 108 + 1 + 32 - 100 + 89 - 300");
        System.out.println(calculator.calculate());
    }
}

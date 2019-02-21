package com.example.huangruqi.pattern.builder;

/**
 * @data: 2019/2/20 15:47
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new MacProBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "三星显示器");
        System.out.println("电脑信息:" + builder.create().toString());
    }
}

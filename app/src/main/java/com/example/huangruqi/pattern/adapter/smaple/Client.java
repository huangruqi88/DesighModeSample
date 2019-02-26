package com.example.huangruqi.pattern.adapter.smaple;

/**
 * @data: 2019/2/25 15:43
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压：" + adapter.getVolt5());
    }
}

package com.example.huangruqi.pattern.responsibility.sample1;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销" + money + "元");
    }
}

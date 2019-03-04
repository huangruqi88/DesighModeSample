package com.example.huangruqi.pattern.responsibility.sample1;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class ZhangSan  {

    public static void main(String[] args) {
        //构造各个对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置上一级领导处理者对象
        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boss;

        //发起报账申请
        groupLeader.handlerRequest(50000);
    }

}

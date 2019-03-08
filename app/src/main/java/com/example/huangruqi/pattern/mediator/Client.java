package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {
    public static void main(String[] args) {

        ConcretaMediator mediator = new ConcretaMediator();
        ConcretaColleague1 colleage1 = new ConcretaColleague1(mediator);
        ConcretaColleague2 colleage2 = new ConcretaColleague2(mediator);
        mediator.setColleage1(colleage1);
        mediator.setColleage2(colleage2);

        colleage1.send("吃过饭了吗？");
        colleage2.send("没有吃，刚下班，今天加班到深夜！！");

    }
}

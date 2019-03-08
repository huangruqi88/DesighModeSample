package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcretaColleague1 extends Colleague {
    public ConcretaColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String mesage) {
        mediator.send(mesage,this);
    }

    public void notify(String message){
        System.out.println("同事1 得到的信息：" + message);
    }
}

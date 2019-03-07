package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcretaColleage2 extends Colleage {
    public ConcretaColleage2(Mediator mediator) {
        super(mediator);
    }

    public void send(String mesage) {
        mediator.send(mesage,this);
    }

    public void notify(String message){
        System.out.println("同事2 得到的信息：" + message);
    }
}

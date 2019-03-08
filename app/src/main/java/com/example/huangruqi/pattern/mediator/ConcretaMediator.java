package com.example.huangruqi.pattern.mediator;

/**
 * date:2019/3/7
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcretaMediator extends Mediator {

    private ConcretaColleague1 colleage1;
    private ConcretaColleague2 colleage2;

    public void setColleage1(ConcretaColleague1 colleage1) {
        this.colleage1 = colleage1;
    }

    public void setColleage2(ConcretaColleague2 colleage2) {
        this.colleage2 = colleage2;
    }

    @Override
    public void send(String mesage, Colleague colleague) {
        if (colleague.equals(colleage1)) {
            colleage2.notify(mesage);
        } else {
            colleage1.notify(mesage);
        }
    }
}

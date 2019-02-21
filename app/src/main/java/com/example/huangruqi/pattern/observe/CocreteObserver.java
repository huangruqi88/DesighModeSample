package com.example.huangruqi.pattern.observe;

/**
 * @data: 2019/2/21 10:11
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class CocreteObserver extends Observer {

    private String name;
    private String state;
    private ConcreteSubject mSubject;

    public CocreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        mSubject = subject;
    }

    @Override
    void update() {
        state = mSubject.getState();
        System.out.println("观察者的新状态state = " + state + " ,name =" + name);
    }

    public ConcreteSubject getSubject() {
        return mSubject;
    }

    public void setSubject(ConcreteSubject subject) {
        mSubject = subject;
    }
}

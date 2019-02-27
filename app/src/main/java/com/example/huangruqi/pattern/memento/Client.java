package com.example.huangruqi.pattern.memento;

/**
 * @data: 2019/2/27 15:37
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        //Originator 初始状态属性为“ON”
        Originator mOriginator = new Originator();
        mOriginator.setState("ON");
        mOriginator.show();

        System.out.println("========================================");

        //保存状态时，由于有了很好的封装性可以隐藏Originator的实现细节
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(mOriginator.createMemento());

        //Originator 改变了状态属性为“ON”
        mOriginator.setState("OFF");
        mOriginator.show();

        System.out.println("========================================");

        mOriginator.setMemento(caretaker.getMemento());
        mOriginator.show();
    }
}

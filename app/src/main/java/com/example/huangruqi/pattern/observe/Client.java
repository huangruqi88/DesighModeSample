package com.example.huangruqi.pattern.observe;

/**
 * @data: 2019/2/21 10:19
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.subscribe(new CocreteObserver("订阅者1",subject));
        subject.subscribe(new CocreteObserver("订阅者2",subject));
        subject.subscribe(new CocreteObserver("订阅者3",subject));
        subject.setState("已经订阅");
        subject.notifyObserver();
        System.out.println("客户端执行完成！");
    }
}

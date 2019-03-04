package com.example.huangruqi.pattern.responsibility;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            handlerA.handlerRequest(request);
        }

    }

}

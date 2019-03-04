package com.example.huangruqi.pattern.responsibility;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandlerA 处理请求：" + request);
        } else if (successor != null){
            successor.handlerRequest(request);
        }
    }
}

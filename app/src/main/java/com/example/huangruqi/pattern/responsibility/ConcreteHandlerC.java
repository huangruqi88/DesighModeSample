package com.example.huangruqi.pattern.responsibility;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandlerC 处理请求：" + request);
        } else if (successor != null){
            successor.handlerRequest(request);
        }
    }
}

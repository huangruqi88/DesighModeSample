package com.example.huangruqi.pattern.responsibility.sample;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2 handler request:" + request.getRequestLevel());
    }
}

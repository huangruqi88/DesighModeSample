package com.example.huangruqi.pattern.responsibility.sample;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public final void handlerRequst(AbstractRequest request){
        //判断当前处理者对象的处理级别是否与请求者一致
        if (getHandleLevel() == request.getRequestLevel()) {
            //一致则由该对象处理
            handle(request);
        } else {
            //否则将该请求对象转发给下一个节点上的请求对象
            if (nextHandler != null) {
                nextHandler.handlerRequst(request);
            } else {
                //当所有处理者不能处理该请求时输出
                System.out.println("All of handler can not handle the request!!");
            }
        }

    }

    /**
     * 获取处理者对象的处理级别
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}

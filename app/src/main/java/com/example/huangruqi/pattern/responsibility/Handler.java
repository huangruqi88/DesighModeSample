package com.example.huangruqi.pattern.responsibility;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 请求处理对象
     * @param request
     */
    public abstract void handlerRequest(int request);

}

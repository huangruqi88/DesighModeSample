package com.example.huangruqi.pattern.responsibility.sample;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public abstract class AbstractRequest {
    private Object object;

    public AbstractRequest(Object object) {
        this.object = object;
    }

    /**
     * 获取处理的内容对象
     * @return 具体的内容对象
     */
    public Object getObject() {
        return object;
    }

    /**
     *
     * 获取请求级别
     * @return 请求级别
     */
    public abstract int  getRequestLevel();
}

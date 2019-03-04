package com.example.huangruqi.pattern.responsibility.sample;

/**
 * date:2019/3/4
 * author:huang
 * Description:请详细描述当前类
 */
public class Request1 extends AbstractRequest {

    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}

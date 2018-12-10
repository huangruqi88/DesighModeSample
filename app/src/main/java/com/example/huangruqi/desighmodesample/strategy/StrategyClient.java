package com.example.huangruqi.desighmodesample.strategy;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy
 * @data 2018/11/29 10:22
 *
 * 策略模式客户端的实现即，策略封装的最终调用
 */
public class StrategyClient {
    private static Context mContext;
    public static void main(String[] args){
        mContext = new Context(new ConcreteStrategyA());
        mContext.contextInterface();

        mContext = new Context(new ConcreteStrategyB());
        mContext.contextInterface();

        mContext = new Context(new ConcreteStrategyC());
    }
}

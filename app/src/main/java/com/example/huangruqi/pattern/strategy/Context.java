package com.example.huangruqi.pattern.strategy;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy
 * @data 2018/11/27 08:35
 *
 * 策略上下文
 */
public class Context {
    Strategy mStrategy;

    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface(){
        mStrategy.algorithmInterface();
    }
}

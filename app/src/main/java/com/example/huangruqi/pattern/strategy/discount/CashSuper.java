package com.example.huangruqi.pattern.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 10:47
 */
public abstract class CashSuper {

    /**
     * 收取现金
     * @param money 原件
     * @return 活动价
     */
    protected abstract double acceptCash(double money);
}

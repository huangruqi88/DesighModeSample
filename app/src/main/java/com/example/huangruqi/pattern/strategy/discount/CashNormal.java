package com.example.huangruqi.pattern.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 10:49
 * 给商品设置价格（即商品的原价）
 */
public class CashNormal extends CashSuper {

    @Override
    protected double acceptCash(double money) {
        return money;
    }
}

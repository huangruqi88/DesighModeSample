package com.example.huangruqi.desighmodesample.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 10:50
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1D;

    /**
     * 打折收费，初始化时，必须要输入折扣率，如八折，就是0.8
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    protected double acceptCash(double money) {
        return money * moneyRebate;
    }
}

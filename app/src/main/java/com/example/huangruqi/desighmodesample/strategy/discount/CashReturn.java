package com.example.huangruqi.desighmodesample.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 10:56
 * 现金返现活动
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0D;
    private double moneyReturn = 0.0D;

    /**
     * 返利费，初始化时必须要输入返利和返回值，比如满300返100，则moneyCondition为300，moneyReturn 为100
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    protected double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}

package com.example.huangruqi.desighmodesample.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 15:17
 *
 * 策略模式结合简单工厂模式的应用
 */
public class CashContext {

    private CashSuper mCashSuper;

    /**
     * 参数不是具体的收费策略对象，而是一个字符串，表示收费类型
     * @param type
     */
    public CashContext(String type) {
        //将实例化具体策略的过程由客户端转移到Context类中，简单工厂的运用
        switch (type) {
            case "正常收费":
                mCashSuper = new CashNormal();
                break;
            case "满300返100":
                mCashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                mCashSuper = new CashRebate(0.8);
                break;
            default:
                break;
        }
    }

    public double getResult(double money){
        return mCashSuper.acceptCash(money);
    }

}

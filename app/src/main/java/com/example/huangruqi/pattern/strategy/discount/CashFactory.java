package com.example.huangruqi.pattern.strategy.discount;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 11:07
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
            default:
                break;
        }
        return cashSuper;
    }
}

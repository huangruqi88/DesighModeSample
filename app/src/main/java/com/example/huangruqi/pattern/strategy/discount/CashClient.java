package com.example.huangruqi.pattern.strategy.discount;

import android.util.Log;

/**
 * @author huangruqi
 * @Description:
 * @Package: com.example.huangruqi.desighmodesample.strategy.discount
 * @data 2018/11/29 11:14
 * 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，
 *      只是实现不同，它可以以相同的方式调用所有的算法，减少各种算法类与使用算法类之间的耦合
 *
 *      优点：1.策略模式的Strategy类层次为Context定义了一系列的可供重用的算法与行为。
 *              集成有助于析取出这些短发中的公共功能
 *            2.建华路单元测试，因为每个算法都有自己的算法类，可以通过自己的接口单独调试
 *            3.当不同的行为堆砌在一个类中时，很难避免使用条件语句来选择合适的行为。将这
 *             些行为封装在一个个Strategy类中，可以在使用这些行为的勒种消除条件语句
 *
 *      作用：用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，
 *           只要在分析过程中需要在不同时间应用不同的业务规则，都可以使用，在基本策略模式中，
 *           选择所用具体实现的职责由客户端对象承担，并转给策略模式的Context对象。
 *
 */
public class CashClient {
    /**
     * 最终显示的结果
     */
    private double total = 0.0D;
    private static final String TAG = "CashClient";

    private void onClick() {

        CashContext cashContext0 = new CashContext("正常收费");
        double totalPrices0 = cashContext0.getResult(0.8);
        Log.e(TAG, "btnClick: --------正常收费----" + totalPrices0);

        CashContext cashContext1 = new CashContext("0.8");
        double totalPrices1 = cashContext1.getResult(0.8);
        Log.e(TAG, "btnClick: --------打八折----" + totalPrices1);

    }
}

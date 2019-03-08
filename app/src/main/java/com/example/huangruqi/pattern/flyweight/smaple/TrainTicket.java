package com.example.huangruqi.pattern.flyweight.smaple;

import java.util.Random;

/**
 * @data: 2019/3/8 15:08
 * @author: hrq
 * @Email:
 * @Description:
 */
public class TrainTicket implements Ticket {

    /**
     * 始发地
     */
    private String frome;
    /**
     * 目的地
     */
    private String to;
    /**
     * 铺位
     */
    private String bunk;

    /**
     * 价格
     */
    public int price;

    public TrainTicket(String frome, String to) {
        this.frome = frome;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买从 " + frome + " 到 " + to + "的" + bunk + "火车票" + ",价格：" + price);
    }


}

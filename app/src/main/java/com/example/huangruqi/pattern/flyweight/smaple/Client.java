package com.example.huangruqi.pattern.flyweight.smaple;

/**
 * @data: 2019/3/8 15:33
 * @author: hrq
 * @Email:
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Ticket ticket01 = new TicketFactory().getTiket("杭州","民权");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = new TicketFactory().getTiket("杭州","郑州");
        ticket02.showTicketInfo("下铺");
        Ticket ticket03 = new TicketFactory().getTiket("民权","上海");
        ticket03.showTicketInfo("坐票");
    }

}

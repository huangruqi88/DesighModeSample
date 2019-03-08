package com.example.huangruqi.pattern.flyweight.smaple;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @data: 2019/3/8 15:14
 * @author: hrq
 * @Email:
 * @Description:
 */
public class TicketFactory {
    private Map<String,Ticket> mTicketMap = new ConcurrentHashMap<>();

    public Ticket getTiket(String from,String to){
        String key = from + "-" + to;
        if (mTicketMap.containsKey(key)) {
            System.out.println("使用缓存 ==> " + key);
            return mTicketMap.get(key);
        }else {
            System.out.println("创建对象 ==> " + key);
            Ticket ticket = new TrainTicket(from,to);
            mTicketMap.put(key,ticket);
            return ticket;
        }
    }
}

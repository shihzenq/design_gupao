package com.shizhenqiang.design_gupao.design.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

    private static Map<String, ITicket> pool = new ConcurrentHashMap<>();


    public ITicket getTicket(String from, String to) {
        String key = from + "->" + to;

        if (pool.containsKey(key)) {
            System.out.println("从缓存中查询找到。。。。。");
            return pool.get(key);
        } else {
            System.out.println("首次创建对象。。。。。");
            ITicket iTicket = new TrainTicket(from, to);
            pool.put(key, iTicket);

            return iTicket;
        }
    }
}

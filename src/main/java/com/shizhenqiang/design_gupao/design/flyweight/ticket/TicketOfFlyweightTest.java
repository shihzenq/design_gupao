package com.shizhenqiang.design_gupao.design.flyweight.ticket;

public class TicketOfFlyweightTest {

    public static void main(String[] args) {
        TicketFactory ticketFactory = new TicketFactory();
        ITicket ticket1 = ticketFactory.getTicket("泰安站", "北京南");
        ticket1.showInfo("一等座");
        System.out.println("----------------------------------------");
        ITicket ticket2 = ticketFactory.getTicket("潍坊站", "北京南");
        ticket2.showInfo("一等座");

        System.out.println("----------------------------------------");

        ITicket ticket3 = ticketFactory.getTicket("泰安站", "北京南");
        ticket3.showInfo("一等座");

    }
}

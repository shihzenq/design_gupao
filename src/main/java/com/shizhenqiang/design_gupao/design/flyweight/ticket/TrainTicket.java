package com.shizhenqiang.design_gupao.design.flyweight.ticket;

import java.util.Random;

public class TrainTicket implements ITicket {

    private String form;

    private String to;

    private int price;

    public TrainTicket(String form, String to) {
        this.form = form;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(form + "->" + to + ", 价格：" + price);
    }
}

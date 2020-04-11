package com.shizhenqiang.design_gupao.design.factory.job;

public class JobTest {

    public static void main(String[] args) {
        // 使用简单工厂来创建支付方式
        Pay pay = new PayFactory().create(AliPay.class);
        pay.payMoney();
    }
}

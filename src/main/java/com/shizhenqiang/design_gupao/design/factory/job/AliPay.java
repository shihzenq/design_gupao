package com.shizhenqiang.design_gupao.design.factory.job;

public class AliPay implements Pay{
    @Override
    public void payMoney() {
        System.out.println("使用支付宝付钱。。。。。");
    }
}

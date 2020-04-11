package com.shizhenqiang.design_gupao.design.factory.job;

public class UnionPay implements Pay{
    @Override
    public void payMoney() {
        System.out.println("使用银联付钱。。。。。");
    }
}

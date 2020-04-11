package com.shizhenqiang.design_gupao.design.factory.job;

public class WeChatPay implements Pay{
    @Override
    public void payMoney() {
        System.out.println("使用微信付钱。。。。");
    }
}

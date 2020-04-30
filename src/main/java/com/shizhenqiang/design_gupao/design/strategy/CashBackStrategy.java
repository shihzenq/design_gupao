package com.shizhenqiang.design_gupao.design.strategy;

public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打到微信或支付宝上");
    }
}

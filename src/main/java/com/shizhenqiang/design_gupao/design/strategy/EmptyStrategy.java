package com.shizhenqiang.design_gupao.design.strategy;

public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无任何优惠");
    }
}

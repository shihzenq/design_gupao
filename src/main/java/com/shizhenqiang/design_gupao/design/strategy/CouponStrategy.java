package com.shizhenqiang.design_gupao.design.strategy;

/**
 * 优惠卷
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠卷抵扣");
    }
}

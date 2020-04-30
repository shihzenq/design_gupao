package com.shizhenqiang.design_gupao.design.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        String key = "coupon";
        PromotionStrategyFactory promotionStrategyFactory = new PromotionStrategyFactory();

        IPromotionStrategy promotionStrategy = promotionStrategyFactory.getPromotionStrategy(key);

        promotionStrategy.doPromotion();

    }
}

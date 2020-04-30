package com.shizhenqiang.design_gupao.design.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static final Map<String, IPromotionStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        strategyMap.put(PromotionKey.CASH_BACK, new CashBackStrategy());
        strategyMap.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public IPromotionStrategy getPromotionStrategy(String key) {
        IPromotionStrategy iPromotionStrategy = strategyMap.get(key);
        return iPromotionStrategy == null ? EMPTY : iPromotionStrategy;
    }

}

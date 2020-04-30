package com.shizhenqiang.design_gupao.design.state;

import java.util.Map;

public interface IOrderService {
    // 创建新订单
    Order create();

    // 发起支付
    Order pay(int id);

    // 订单发货
    Order deliver(int id);

    // 订单收获
    Order receive(int id);

    // 获取所有订单信息
    Map<Integer, Order> getOrders();
}

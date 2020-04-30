package com.shizhenqiang.design_gupao.design.state;

public enum OrderStatus {

    WAIT_PAYMENT, // 待支付
    WAIT_DELIVER, // 待发货
    WAIT_RECEIVE, // 待收获
    FINISH; // 订单结束
}

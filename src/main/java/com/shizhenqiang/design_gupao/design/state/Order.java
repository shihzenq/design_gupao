package com.shizhenqiang.design_gupao.design.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    private int id;

    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    @Override
    public String toString() {
        return "订单号：" +id +", 订单状态：" + orderStatus;
    }
}

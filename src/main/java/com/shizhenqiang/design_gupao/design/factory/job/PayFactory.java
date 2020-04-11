package com.shizhenqiang.design_gupao.design.factory.job;

import java.util.Objects;

public class PayFactory {

    public Pay create(Class<? extends Pay> clazz ) {
        if (Objects.nonNull(clazz)) {
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new RuntimeException("支付方式不存在！");
    }
}

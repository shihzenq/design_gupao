package com.shizhenqiang.design_gupao.design.factory.simpleFactory;

import java.util.Objects;

public class ICourseFactory {

    public ICourse create(Class<? extends ICourse> clazz) {
        if (Objects.nonNull(clazz)) {
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

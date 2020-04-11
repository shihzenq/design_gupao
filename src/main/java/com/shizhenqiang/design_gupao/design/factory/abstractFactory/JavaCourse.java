package com.shizhenqiang.design_gupao.design.factory.abstractFactory;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("本人正在学习Java。。。。。。");
    }
}

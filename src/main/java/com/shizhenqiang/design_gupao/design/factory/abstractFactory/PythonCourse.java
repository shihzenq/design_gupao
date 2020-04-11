package com.shizhenqiang.design_gupao.design.factory.abstractFactory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("本人正在学习Python。。。。。。");
    }
}

package com.shizhenqiang.design_gupao.design.design_principles_seven.dependenceInversion;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom正在学习Python。。。。。。");
    }
}

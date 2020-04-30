package com.shizhenqiang.design_gupao.design.delegate;

public class EmployeeOne implements WorkTask{

    @Override
    public void delegateWork(String name) {
        System.out.println("做数据采集工作。。。。。");
    }
}

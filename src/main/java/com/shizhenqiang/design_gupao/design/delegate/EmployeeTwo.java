package com.shizhenqiang.design_gupao.design.delegate;

public class EmployeeTwo implements WorkTask {
    @Override
    public void delegateWork(String name) {
        System.out.println("指标管理工作。。。。。。");
    }
}

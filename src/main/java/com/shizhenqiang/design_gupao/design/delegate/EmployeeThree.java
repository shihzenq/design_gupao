package com.shizhenqiang.design_gupao.design.delegate;

public class EmployeeThree implements WorkTask {
    @Override
    public void delegateWork(String name) {
        System.out.println("风险管理工作。。。。。");
    }
}

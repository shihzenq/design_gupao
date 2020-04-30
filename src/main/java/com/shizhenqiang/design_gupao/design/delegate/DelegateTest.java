package com.shizhenqiang.design_gupao.design.delegate;

public class DelegateTest {

    public static void main(String[] args) {
        WorkTask workTask = new Leader();
        workTask.delegateWork("数据采集");
    }
}

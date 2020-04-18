package com.shizhenqiang.design_gupao.design.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        IPassportForThird passportForThird = new IPassportForThirdAdapter();
        ResultMsg resultMsg = passportForThird.loginForQQ("qqqqqqq_shizhenqiang");
        System.out.println(resultMsg);
    }
}

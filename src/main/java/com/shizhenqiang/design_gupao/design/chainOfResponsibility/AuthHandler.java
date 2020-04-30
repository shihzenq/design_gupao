package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理，无法操作！");
            return;
        }
        System.out.println("您是管理，可以进行操作！");
    }
}

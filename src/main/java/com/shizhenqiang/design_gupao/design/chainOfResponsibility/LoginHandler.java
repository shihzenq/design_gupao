package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        chain.doHandler(member);
    }
}

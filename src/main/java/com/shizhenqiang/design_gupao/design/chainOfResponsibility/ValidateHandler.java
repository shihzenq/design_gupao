package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

import org.springframework.util.StringUtils;

public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPassWord())) {
            System.out.println("用户名或密码为空！");
            return;
        }
        System.out.println("用户名和密码校验成功，------------");
        chain.doHandler(member);
    }
}

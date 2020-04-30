package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

public class ChainTest {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("shizhenqiang","123456");
    }
}

package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Member {

    private String loginName;

    private String loginPassWord;

    private String roleName;


    public Member(String loginName, String loginPassWord) {
        this.loginName = loginName;
        this.loginPassWord = loginPassWord;
    }

    @Override
    public String toString() {
        return "Member{" +
                "loginName='" + loginName + '\'' +
                ", loginPassWord='" + loginPassWord + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

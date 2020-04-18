package com.shizhenqiang.design_gupao.design.adapter;

import lombok.Data;

@Data
public class Member {

    private String username;

    private String password;

    private String mid;

    private String info;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Member(String username, String password, String mid, String info) {
        this.username = username;
        this.password = password;
        this.mid = mid;
        this.info = info;
    }
}

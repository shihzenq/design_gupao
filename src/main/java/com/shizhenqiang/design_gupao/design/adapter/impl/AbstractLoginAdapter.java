package com.shizhenqiang.design_gupao.design.adapter.impl;

import com.shizhenqiang.design_gupao.design.adapter.PassportService;
import com.shizhenqiang.design_gupao.design.adapter.ResultMsg;
import org.springframework.util.StringUtils;

public abstract class AbstractLoginAdapter extends PassportService implements LoginAdapter {

    protected ResultMsg loginForRegister(String username, String password) {
        if (StringUtils.isEmpty(password)) {
            password = "login_third";
        }
        return super.login(username, password);
    }
}

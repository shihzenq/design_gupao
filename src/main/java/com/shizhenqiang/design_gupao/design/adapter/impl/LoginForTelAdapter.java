package com.shizhenqiang.design_gupao.design.adapter.impl;

import com.shizhenqiang.design_gupao.design.adapter.ResultMsg;

public class LoginForTelAdapter extends  AbstractLoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegister(id, null);
    }
}

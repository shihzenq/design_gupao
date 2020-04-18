package com.shizhenqiang.design_gupao.design.adapter.impl;

import com.shizhenqiang.design_gupao.design.adapter.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}

package com.shizhenqiang.design_gupao.design.adapter;

/**
 * 一开始的登录和注册逻辑
 * 源角色
 */
public class PassportService {

    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功！", new Member(username, password));
    }


    public ResultMsg login(String username, String password){
        // 中间判断逻辑；
        return new ResultMsg(200, "登录成功！");
    }
}

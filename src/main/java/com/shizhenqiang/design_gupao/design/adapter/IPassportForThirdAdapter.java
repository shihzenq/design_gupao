package com.shizhenqiang.design_gupao.design.adapter;

import com.shizhenqiang.design_gupao.design.adapter.impl.LoginAdapter;
import com.shizhenqiang.design_gupao.design.adapter.impl.LoginForQQAdapter;
import com.shizhenqiang.design_gupao.design.adapter.impl.LoginForTelAdapter;
import com.shizhenqiang.design_gupao.design.adapter.impl.LoginForWeChatAdapter;

/**
 * 适配器
 */
public class IPassportForThirdAdapter extends PassportService implements IPassportForThird {


    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String openid) {
        return processLogin(openid, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone) {
        return processLogin(phone, LoginForTelAdapter.class);
    }

    public ResultMsg processLogin(String param, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter loginAdapter = clazz.getDeclaredConstructor().newInstance();
            if (loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(param, loginAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // ---------------------V1-------------------------

//    @Override
//    public ResultMsg loginForQQ(String openId) {
//        // 中间逻辑是调用qq第三方接口，然后将信息再存到本系统一份
//        return register(openId, null);
//    }
//
//    @Override
//    public ResultMsg loginForWeChat(String openid) {
//        return register(openid, null);
//    }
//
//    @Override
//    public ResultMsg loginForToken(String token) {
//        return register(token, null);
//    }
//
//    @Override
//    public ResultMsg loginForTelPhone(String phone) {
//        return register(phone, null);
//    }
//
//    @Override
//    public ResultMsg register(String username, String password) {
//        if (StringUtils.isEmpty(password)) {
//            password = "register_third";
//        }
//        super.register(username, password);
//        return super.login(username, password);
//    }
}

package com.shizhenqiang.design_gupao.design.adapter;

/**
 * 目标角色，目前登录和注册都是支持第三方的，当需要第三方时，使用此接口
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWeChat(String openid);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String phone);
}

package com.shizhenqiang.design_gupao.design.bridge;

/**
 * 实现消息发送的统一接口
 */
public interface IMessage {

    public void send(String message, String tuUser);

}

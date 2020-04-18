package com.shizhenqiang.design_gupao.design.bridge;

public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String tuUser) {
        System.out.println(String.format("使用邮箱发送消息，消息内容: %s, 发送给: %s", message, tuUser));
    }
}

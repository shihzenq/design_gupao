package com.shizhenqiang.design_gupao.design.bridge;

// 桥接抽象角色
public abstract class AbstractMessage {

    private IMessage iMessage;

    public AbstractMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    public void sendMessage(String message, String toUser) {
        this.iMessage.send(message, toUser);
    }
}

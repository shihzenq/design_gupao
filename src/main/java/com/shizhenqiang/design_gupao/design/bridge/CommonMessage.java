package com.shizhenqiang.design_gupao.design.bridge;

/**
 * 创建普通消息，具体实现类
 */
public class CommonMessage extends AbstractMessage {
    public CommonMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}

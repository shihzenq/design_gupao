package com.shizhenqiang.design_gupao.design.bridge;


/**
 * 创建加急消息，具体实现类
 */
public class UrgentMessage extends AbstractMessage {

    public UrgentMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //
        message = "加急："+ message;
        super.sendMessage(message, toUser);
    }

    /**
     * 自定义方法，用于监控消息的处理状态
     * @param messageId
     * @return
     */
    public Object watch(String messageId) {
        // 根据自定义逻辑，可以做消息状态的扩展方法
        return null;
    }
}

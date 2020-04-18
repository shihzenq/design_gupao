package com.shizhenqiang.design_gupao.design.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        // 普通消息处理

        IMessage iMessage = new EmailMessage();
        AbstractMessage email = new CommonMessage(iMessage);
        email.sendMessage("加班申请", "张三");

        AbstractMessage urgentEmail = new UrgentMessage(iMessage);
        urgentEmail.sendMessage("加班申请", "张三");
    }
}

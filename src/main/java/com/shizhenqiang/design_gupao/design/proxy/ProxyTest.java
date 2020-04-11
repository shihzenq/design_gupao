package com.shizhenqiang.design_gupao.design.proxy;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class ProxyTest {

    public static void main(String[] args) {
        IBoy boy = new IBoy();
        ProxyTarget proxyTarget = new ProxyTarget(boy);
        try {

            ICondition instance = proxyTarget.getInstance();
            List<String> instanceLove = instance.findLove("我的条件：温柔可人", 5);
            System.out.println("找到候选人：" + JSON.toJSONString(instanceLove));

            String chooseOne = boy.chooseOne("小白");
            System.out.println("男孩选择了：" + chooseOne);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

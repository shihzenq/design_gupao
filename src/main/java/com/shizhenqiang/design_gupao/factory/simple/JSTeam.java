package com.shizhenqiang.design_gupao.factory.simple;

public class JSTeam implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建前端团队.....");
    }
}

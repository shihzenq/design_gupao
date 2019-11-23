package com.shizhenqiang.design_gupao.factory.template;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JavaPrimary implements ResearchTeam {

    @Override
    public void buildTeam() {
        System.out.println("创建Java初级工程师团队");
    }
}

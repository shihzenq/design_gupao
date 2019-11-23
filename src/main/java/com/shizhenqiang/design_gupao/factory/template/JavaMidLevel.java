package com.shizhenqiang.design_gupao.factory.template;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JavaMidLevel implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建Java中级工程师团队");
    }
}

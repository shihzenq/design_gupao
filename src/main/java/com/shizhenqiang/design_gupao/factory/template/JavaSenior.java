package com.shizhenqiang.design_gupao.factory.template;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JavaSenior implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建Java高级工程团队");
    }
}

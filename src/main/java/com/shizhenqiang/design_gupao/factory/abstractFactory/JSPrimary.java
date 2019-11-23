package com.shizhenqiang.design_gupao.factory.abstractFactory;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JSPrimary implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建JS初级工程师团队");
    }
}

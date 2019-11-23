package com.shizhenqiang.design_gupao.factory.abstractFactory;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JSMidLevel implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建JS中级工程师团队");
    }
}

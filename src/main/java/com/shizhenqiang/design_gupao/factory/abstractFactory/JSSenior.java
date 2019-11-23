package com.shizhenqiang.design_gupao.factory.abstractFactory;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JSSenior implements ResearchTeam {
    @Override
    public void buildTeam() {
        System.out.println("创建JS高级工程师团队");
    }
}

package com.shizhenqiang.design_gupao.factory.simple;

public class TeamFactory {

    public ResearchTeam bulidTeam(int bulid) {
        ResearchTeam researchTeam = null;
        if (1 ==bulid) {
            researchTeam = new JavaTeam();
        } else if (2 == bulid) {
            researchTeam = new JSTeam();
        } else if (3 == bulid) {
            researchTeam = new ProductTeam();
        }
        return researchTeam;
    }
}

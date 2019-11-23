package com.shizhenqiang.design_gupao.factory.template;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class JavaTeamFactory extends TeamFactory{

    @Override
    public ResearchTeam buildTeam(int build) {
        switch (build) {
            case 1:
                return new JavaPrimary();
            case 2:
                return new JavaMidLevel();
            case 3:
                return new JavaSenior();
        }
        return new JavaPrimary();
    }
}

package com.shizhenqiang.design_gupao.factory.abstractFactory;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;
import com.shizhenqiang.design_gupao.factory.template.TeamFactory;

public class JSTeamFactory extends TeamFactory {
    @Override
    public ResearchTeam buildTeam(int build) {
        switch (build) {
            case 1:
                return new JSPrimary();
            case 2:
                return new JSMidLevel();
            case 3:
                return new JSSenior();
        }
        return new JSSenior();
    }
}

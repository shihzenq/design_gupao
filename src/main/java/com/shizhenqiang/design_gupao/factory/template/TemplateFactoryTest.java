package com.shizhenqiang.design_gupao.factory.template;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;

public class TemplateFactoryTest {

    public static void main(String[] args) {
        TeamFactory teamFactory = new JavaTeamFactory();
        ResearchTeam primary = teamFactory.buildTeam(1);
        primary.buildTeam();

        ResearchTeam midLevel = teamFactory.buildTeam(2);
        midLevel.buildTeam();

    }
}

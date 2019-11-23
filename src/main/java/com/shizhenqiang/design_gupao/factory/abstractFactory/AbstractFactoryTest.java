package com.shizhenqiang.design_gupao.factory.abstractFactory;

import com.shizhenqiang.design_gupao.factory.simple.ResearchTeam;
import com.shizhenqiang.design_gupao.factory.template.JavaTeamFactory;
import com.shizhenqiang.design_gupao.factory.template.TeamFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        // JS
        TeamFactory teamFactory = new JSTeamFactory();
        ResearchTeam jsPrimary = teamFactory.buildTeam(1);
        jsPrimary.buildTeam();
        ResearchTeam jsMidLevel = teamFactory.buildTeam(2);
        jsMidLevel.buildTeam();

        // Java
        TeamFactory javaTeamFactory = new JavaTeamFactory();
        ResearchTeam primary = javaTeamFactory.buildTeam(1);
        primary.buildTeam();

        ResearchTeam midLevel = javaTeamFactory.buildTeam(2);
        midLevel.buildTeam();

    }
}

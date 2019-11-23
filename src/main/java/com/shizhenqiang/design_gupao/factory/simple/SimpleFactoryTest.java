package com.shizhenqiang.design_gupao.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        TeamFactory teamFactory = new TeamFactory();
        ResearchTeam researchTeam = teamFactory.bulidTeam(1);
        researchTeam.buildTeam();


    }
}

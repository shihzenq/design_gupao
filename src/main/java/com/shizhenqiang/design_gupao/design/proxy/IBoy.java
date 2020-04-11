package com.shizhenqiang.design_gupao.design.proxy;

import java.util.ArrayList;
import java.util.List;

public class IBoy implements ICondition {
    @Override
    public List<String> findLove(String condition, Integer num) {
        System.out.println(condition);
        System.out.println("候选人个数：" + num);
        List<String> candidate = new ArrayList<>();
        candidate.add("女001");
        candidate.add("女002");
        candidate.add("女003");
        return candidate;
    }

    @Override
    public String chooseOne(String name) {
        return name;
    }
}

package com.shizhenqiang.design_gupao.design.proxy;

import java.util.List;

public interface ICondition {
    List<String> findLove(String condition, Integer num);

    String chooseOne(String name);
}

package com.shizhenqiang.design_gupao.design.prototype.deep;

import com.shizhenqiang.design_gupao.design.prototype.Nature;
import com.shizhenqiang.design_gupao.design.prototype.Person;

public class DeepTest {

    public static void main(String[] args) {
        Nature nature = new Nature();
        nature.setName("大自然。");
        nature.setPerson(new Person("时贞强", 18));

        Nature covert = CopyUtils.covert(nature, Nature.class);

        nature.setName("修改-> 大自然");

        covert.setName("copy-> 大自然");
        covert.setPerson(new Person("李傻叉子", 16));
        System.out.println(nature);
        System.out.println(covert);
        System.out.println(nature == covert);
    }
}

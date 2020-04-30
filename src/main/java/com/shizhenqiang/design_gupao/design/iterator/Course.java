package com.shizhenqiang.design_gupao.design.iterator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }
}

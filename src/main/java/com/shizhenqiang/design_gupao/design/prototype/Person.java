package com.shizhenqiang.design_gupao.design.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

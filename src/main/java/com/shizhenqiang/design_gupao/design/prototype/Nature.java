package com.shizhenqiang.design_gupao.design.prototype;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nature {

    private String name;

    private Person person;


    @Override
    public String toString() {
        return "Nature{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}

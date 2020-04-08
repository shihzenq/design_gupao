package com.shizhenqiang.design_gupao.design.design_principles_seven.open_closed;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }


    public Double getDisCountCourse() {
        return super.getPrice() * 0.6;
    }
}

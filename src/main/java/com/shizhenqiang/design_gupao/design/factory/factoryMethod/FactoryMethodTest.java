package com.shizhenqiang.design_gupao.design.factory.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourse iCourse = new JavaCourseFactory().create();
        iCourse.record();
    }
}

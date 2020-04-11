package com.shizhenqiang.design_gupao.design.factory.simpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICourse iCourse = new ICourseFactory().create(JavaCourse.class);
        iCourse.record();
    }
}

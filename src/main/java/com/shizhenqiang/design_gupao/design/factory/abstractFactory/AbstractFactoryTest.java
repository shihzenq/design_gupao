package com.shizhenqiang.design_gupao.design.factory.abstractFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        INote edit = iCourseFactory.createEdit();
        iCourse.record();
        edit.edit();
    }
}

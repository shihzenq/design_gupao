package com.shizhenqiang.design_gupao.design.factory.factoryMethod;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}

package com.shizhenqiang.design_gupao.design.factory.factoryMethod;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

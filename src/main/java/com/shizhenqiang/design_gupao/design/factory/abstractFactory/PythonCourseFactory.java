package com.shizhenqiang.design_gupao.design.factory.abstractFactory;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }

    @Override
    public INote createEdit() {
        return new PythonNote();
    }
}

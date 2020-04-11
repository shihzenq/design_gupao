package com.shizhenqiang.design_gupao.design.factory.abstractFactory;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }

    @Override
    public INote createEdit() {
        return new JavaNote();
    }


}

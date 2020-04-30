package com.shizhenqiang.design_gupao.design.iterator;

public interface CourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}

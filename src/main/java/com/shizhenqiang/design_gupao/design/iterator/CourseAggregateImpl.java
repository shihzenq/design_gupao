package com.shizhenqiang.design_gupao.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courseList);
    }
}

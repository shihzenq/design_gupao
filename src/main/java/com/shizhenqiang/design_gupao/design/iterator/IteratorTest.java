package com.shizhenqiang.design_gupao.design.iterator;

public class IteratorTest {

    public static void main(String[] args) {
        Course java = new Course("Java 架构");
        Course javaBase = new Course("Java 基础");
        Course design = new Course("Java设计模式");
        Course ai = new Course("AI");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.add(java);
        courseAggregate.add(javaBase);
        courseAggregate.add(design);
        courseAggregate.add(ai);

        System.out.println("-------课程列表---------");

        printCourse(courseAggregate);

        courseAggregate.remove(ai);

        System.out.println("-------删除之后的课程列表---------");
        printCourse(courseAggregate);
    }

    private static void printCourse(CourseAggregate courseAggregate) {

        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("《"+ course.getName()+"》");
        }
    }
}

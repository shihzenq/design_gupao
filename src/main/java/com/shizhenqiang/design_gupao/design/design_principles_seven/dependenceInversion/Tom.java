package com.shizhenqiang.design_gupao.design.design_principles_seven.dependenceInversion;

public class Tom {

//    public void studyJavaCourse() {
//        System.out.println("Tom正在学习Java。。。。。。");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Tom正在学习Python。。。。。。");
//    }

//     ------------v1---------------------
//    public void study(ICourse iCourse) {
//        iCourse.study();
//    }

    //     ------------v2---------------------
//    private ICourse iCourse;
//
//    public Tom(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void  study() {
//        iCourse.study();
//    }


    //     ------------v3---------------------
    private ICourse iCourse;

    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void  study() {
        iCourse.study();
    }
}

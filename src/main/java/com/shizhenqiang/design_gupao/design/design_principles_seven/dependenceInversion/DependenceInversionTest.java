package com.shizhenqiang.design_gupao.design.design_principles_seven.dependenceInversion;

public class DependenceInversionTest {

    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();


        // -----------V1------------
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());


        // -----------V2------------
//        Tom java = new Tom(new JavaCourse());
//        java.study();
//
//        Tom python = new Tom(new PythonCourse());
//        python.study();

        // -----------V3------------
        Tom tom = new Tom();
        tom.setICourse(new JavaCourse());
        tom.study();

        tom.setICourse(new PythonCourse());
        tom.study();
    }

}

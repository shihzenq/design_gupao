package com.shizhenqiang.design_gupao.design.design_principles_seven.open_closed;

public class OpenClosedTest {

    public static void main(String[] args) {
        // 原来实现的类
       originalCourse();
        System.out.println("---------------------------------------------------------------------");
       // 打折之后
        discountCourse();
    }

    private static void originalCourse() {
        JavaCourse javaCourse = new JavaCourse(1, "Java_DougLea_成神之路", 12000.00);
        System.out.println("课程ID：" + javaCourse.getId() +
                "\n课程标题：《" +  javaCourse.getName() + "》" +
                "\n售价：" + javaCourse.getPrice());
    }

    private static void  discountCourse() {
        JavaDiscountCourse iCourse = new JavaDiscountCourse(1, "Java_DougLea_成神之路", 12000.00);
        System.out.println("课程ID：" + iCourse.getId() +
                "\n课程标题：《" +  iCourse.getName() + "》" +
                "\n原价：" + iCourse.getPrice() +
                "\n售价：" + iCourse.getDisCountCourse());
    }
}

package com.shizhenqiang.design_gupao.register;

import com.shizhenqiang.design_gupao.design.singleton.register.EnumSingleton;
import com.shizhenqiang.design_gupao.design.singleton.register.SingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setSingletonClass(new SingletonClass());

        SingletonClass singletonClass = instance.getSingletonClass();
        System.out.println(singletonClass);
        Class<?> clazz = EnumSingleton.class;
        try {

            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
//         判断是枚举的话，不能进行反射获取   if ((clazz.getModifiers() & Modifier.ENUM) != 0)
//                throw new IllegalArgumentException("Cannot reflectively create enum objects");
            Object instance1 = constructor.newInstance();
            System.out.println(instance1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

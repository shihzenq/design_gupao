package com.shizhenqiang.design_gupao.lazySingleton;

import com.shizhenqiang.design_gupao.design.singleton.lazy.LazyStaticInnerCLassSingleton;

import java.lang.reflect.Constructor;


/**
 * 通过反射，获取到的实例是不同的，违反了单例的定义：任何情况下一个类都只有一个实例
 */
public class ReflectLazyStaticClassSingletonTest{


    public static void main(String[] args) {
        Class<?> clazz = LazyStaticInnerCLassSingleton.class;
        try {

            Constructor<?> constructor = clazz.getDeclaredConstructor((Class<?>) null);
            // 暴力访问
            constructor.setAccessible(true);
            Object instance1 = constructor.newInstance();
            Object instance2 = constructor.newInstance();

            System.out.println(instance1);
            System.out.println(instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

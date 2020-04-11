package com.shizhenqiang.design_gupao.design.singleton.hungary;

/**
 * 饿汉式单列创建
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：会造成内存浪费
 */
public class HungarySingleton {

    private static final HungarySingleton instance = new HungarySingleton();

    private HungarySingleton() {}

    public static HungarySingleton getInstance() {
        return instance;
    }
}

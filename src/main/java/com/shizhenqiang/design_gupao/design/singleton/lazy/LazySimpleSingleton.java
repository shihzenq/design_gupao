package com.shizhenqiang.design_gupao.design.singleton.lazy;


/**
 * 优点：节省了内存
 * 缺点：线程不安全, 多个线程执行的情况下会出现多个线程持有不同的LazySimpleSingleton实例，违反了单列定义：任何情况下一个类都只有一个实例
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    // ----------------------V1------------------------

    /**
     * 优点：节省了内存
     * 缺点：线程不安全, 多个线程执行的情况下会出现多个线程持有不同的LazySimpleSingleton实例，违反了单列定义：任何情况下一个类都只有一个实例
     *
     */
//    public static LazySimpleSingleton getInstance() {
//        if (null == instance) {
//            return instance = new LazySimpleSingleton();
//        }
//        return instance;
//    }

    /**
     * 缺点：加锁，性能低
     */
    public static synchronized LazySimpleSingleton getInstance() {
        if (null == instance) {
            return instance = new LazySimpleSingleton();
        }
        return instance;
    }
}

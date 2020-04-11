package com.shizhenqiang.design_gupao.design.singleton.lazy;

/**
 * 优点：并发情况下可以保证线程安全
 * 缺点：
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == instance) {
                    return instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

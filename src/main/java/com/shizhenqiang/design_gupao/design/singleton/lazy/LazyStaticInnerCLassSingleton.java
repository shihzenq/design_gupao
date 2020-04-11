package com.shizhenqiang.design_gupao.design.singleton.lazy;

/**
 * 静态内部类单列
 * <p>
 * classPath: com.shizhenqiang.design_gupao.design.singleton.lazy.LazyStaticInnerCLassSingleton.class
 * com.shizhenqiang.design_gupao.design.singleton.lazy.LazyStaticInnerCLassSingleton.class$LazyHolder.class
 * <p>
 * 优点：利用Java本身语法特点，写法优雅， 性能高，避免内存浪费。线程安全， 因为在加载LazyStaticInnerCLassSingleton时，内部类不会被加载
 *       而是在调用getInstance()方法时，才会去加载内部类
 * 缺点：能够被反射破坏
 */
public class LazyStaticInnerCLassSingleton {

    private LazyStaticInnerCLassSingleton() {
        // 加上判断空，可以防止反射破坏
        throw new RuntimeException("非法访问！");
    }

    public static LazyStaticInnerCLassSingleton getInstance() {
        return LazyHolder.singleton;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerCLassSingleton singleton = new LazyStaticInnerCLassSingleton();
    }
}

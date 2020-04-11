package com.shizhenqiang.design_gupao.design.singleton.register;

/**
 * 枚举式单列
 * INSTANCE此变量也是常量，存储到map集合中， 每次创建都会放到集合中
 *
 * 是一种更优雅的饿汉式单例
 *
 */
public enum  EnumSingleton {

    INSTANCE;

    private SingletonClass singletonClass;

    public SingletonClass getSingletonClass() {
        return singletonClass;
    }

    public void setSingletonClass(SingletonClass singletonClass) {
        this.singletonClass = singletonClass;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}

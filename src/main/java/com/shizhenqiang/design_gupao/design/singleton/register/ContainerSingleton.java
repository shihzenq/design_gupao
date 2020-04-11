package com.shizhenqiang.design_gupao.design.singleton.register;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static  Map<String, Pojo> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Pojo getInstance(String name) {
        Pojo instance = null;

        if (ioc.containsKey(name)) {
            return ioc.get(name);
        } else {
            try {
                synchronized (ContainerSingleton.class) {
                    Class<?> aClass = Class.forName(name);
                    instance = (Pojo) aClass.getDeclaredConstructor().newInstance();
                    ioc.put(name, instance);
                    return instance;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static Pojo getInstanceByMap(String name) {
        Pojo instance = null;
        try {
            ioc.putIfAbsent(name, (Pojo) Class.forName(name).getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ioc.get(name);
    }
}

package com.shizhenqiang.design_gupao.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTargetProxy implements InvocationHandler {

    private Object target;

    public JDKProxyTargetProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用JDKProxy代理操作");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}

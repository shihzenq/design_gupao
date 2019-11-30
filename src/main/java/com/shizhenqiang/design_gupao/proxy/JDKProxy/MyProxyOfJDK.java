package com.shizhenqiang.design_gupao.proxy.JDKProxy;

import com.shizhenqiang.design_gupao.proxy.myProxyJDK.MyClassLoader;
import com.shizhenqiang.design_gupao.proxy.myProxyJDK.MyInvocationHandler;
import com.shizhenqiang.design_gupao.proxy.myProxyJDK.MyProxy;

import java.lang.reflect.Method;

public class MyProxyOfJDK implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        return MyProxy.newProxyInstance(new MyClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("自己实现的JDK代理源码。。。。。。");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}

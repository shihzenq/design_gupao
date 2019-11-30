package com.shizhenqiang.design_gupao.proxy.myProxyJDK;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}

package com.shizhenqiang.design_gupao.proxy;

import com.shizhenqiang.design_gupao.proxy.JDKProxy.JDKProxyImpl;
import com.shizhenqiang.design_gupao.proxy.JDKProxy.JDKProxyInterface;
import com.shizhenqiang.design_gupao.proxy.JDKProxy.JDKProxyTargetProxy;
import com.shizhenqiang.design_gupao.proxy.JDKProxy.MyProxyOfJDK;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // jdk
        JDKProxyInterface jdkProxyInterface = new JDKProxyImpl();
        JDKProxyTargetProxy targetProxy = new JDKProxyTargetProxy(jdkProxyInterface);
        Object instance = targetProxy.getInstance();
        Method proxyCodeByJDK = instance.getClass().getMethod("proxyCodeByJDK", null);
        proxyCodeByJDK.invoke(instance);

        // 自己实现的JDK代码
        MyProxyOfJDK myProxyOfJDK = new MyProxyOfJDK();
        Object instance1 = myProxyOfJDK.getInstance(jdkProxyInterface);
        Method proxyCodeByJDK1 = instance1.getClass().getMethod("proxyCodeByJDK", null);
        proxyCodeByJDK1.invoke(instance1);

    }
}

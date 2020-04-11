package com.shizhenqiang.design_gupao.design.proxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyTarget implements MyInvocationHandler {

    private ICondition target;

    public ProxyTarget(ICondition target) {
        this.target = target;
    }

    public ICondition getInstance() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Class<? extends ICondition> aClass = target.getClass();
        return (ICondition)MyProxy.newProxyInstance(new MyClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 注意，这里传入的第一个参数，应该为上面的target实例，是张三本身，而不是传入的proxy实例，这个是媒婆代理类，
        // 如果使用proxy，会一直调用invoke方法，造成不断调用before方法，而无法进入真正的zhangsan本身的findLove()方法
        Object o = method.invoke(this.target, args);
        after();
        return o;
    }

    private void before(){
        System.out.println("交给媒婆");
    }

    private void after(){
        System.out.println("媒婆根据条件来筛选");
    }
}

package com.shizhenqiang.design_gupao.lazySingleton;

import com.shizhenqiang.design_gupao.design.singleton.lazy.LazyDoubleCheckSingleton;
import com.shizhenqiang.design_gupao.design.singleton.lazy.LazySimpleSingleton;
import com.shizhenqiang.design_gupao.design.singleton.lazy.LazyStaticInnerCLassSingleton;

public class ExecutorThread implements Runnable {

    @Override
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton lazySimpleSingleton = LazyDoubleCheckSingleton.getInstance();
        LazyStaticInnerCLassSingleton instance = LazyStaticInnerCLassSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}

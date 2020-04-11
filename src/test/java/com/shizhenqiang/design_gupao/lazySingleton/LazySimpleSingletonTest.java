package com.shizhenqiang.design_gupao.lazySingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new ExecutorThread());
        }
        executorService.shutdown();
    }
}

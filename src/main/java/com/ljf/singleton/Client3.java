package com.ljf.singleton;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lujiafeng on 2018/12/3.
 * 测试多线程下五种创建单例模式的效率
 */
public class Client3 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i=0; i<threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<10000000; i++) {
                        Object o = SingletonDemo3.getInstance();
                        //Object o = SingletonDemo5.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();  // main线程阻塞，直到计数器变为0，才会继续执行下去

        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - start));

    }
}

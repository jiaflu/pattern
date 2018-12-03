package com.ljf.singleton;

/**
 * Created by lujiafeng on 2018/12/3.
 * 双重检测锁式（由于JVM底层内部模型原因。偶尔会出现问题。不建议使用）
 */
public class SingletonDemo3 {
    private volatile static SingletonDemo3 instance;
    private SingletonDemo3() {}
    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}

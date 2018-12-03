package com.ljf.singleton;

/**
 * Created by lujiafeng on 2018/12/3.
 * 静态内部类式（线程安全，调用效率高。但是，可以延时加载)
 */
public class SingletonDemo4 {
    private static class SingletonClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }
    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }
    private SingletonDemo4() {
    }
}

package com.ljf.singleton;

/**
 * Created by lujiafeng on 2018/12/3.
 * 懒汉式（线程安全，调用效率不高。但是，可以延时加载）
 */
public class SingletonDemo2 {
    // 类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static SingletonDemo2 instance;
    private SingletonDemo2() { // 私有化构造器，防止该类被实例化
    }
    // 方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}

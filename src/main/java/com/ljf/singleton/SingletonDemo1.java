package com.ljf.singleton;

/**
 * Created by lujiafeng on 2018/12/3.
 * 饿汉式（线程安全，调用效率高。但是，不能延时加载）
 */
public class SingletonDemo1 {
    // 类初始化时，立即加载这个对象；加载类时，天然的是线程安全
    private static SingletonDemo1 instance = new SingletonDemo1();
    private SingletonDemo1() {}
    // 方法没有同步，调用效率高
    public static SingletonDemo1 getInstance() {
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}

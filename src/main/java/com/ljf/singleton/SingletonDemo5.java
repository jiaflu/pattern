package com.ljf.singleton;

/**
 * Created by lujiafeng on 2018/12/3.
 * 枚举单例（线程安全，调用效率高，不能延时加载）
 */
public enum SingletonDemo5 {
    // 这个枚举元素本身就是单例模式
    INSTANCE;
    // 添加自己需要的操作
    public void singletonOperation() {
    }
}

package com.ljf.singleton;

import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by lujiafeng on 2018/12/3.
 * 测试懒汉式单例单例模式（如何防止反射和反序列化）
 */
public class SingletonDemo6 implements Serializable {
    // 类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static SingletonDemo6 instance;
    private SingletonDemo6() { // 私有化构造器，防止该类被实例化
        //抛出异常，防止通过反射绕过单例
//        if (instance != null) {
//            throw new RuntimeException();
//        }
    }
    // 方法同步，调用效率低
    public static synchronized SingletonDemo6 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo6();
        }
        return instance;
    }

    // 在反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要单独再创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
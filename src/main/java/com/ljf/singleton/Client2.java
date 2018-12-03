package com.ljf.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        // 通过反射的方式直接调用私有构造器
//        Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("com.ljf.singleton.SingletonDemo6");
//        Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//        // 若想访问私有内容，需要跳过权限检查
//        c.setAccessible(true);
//        SingletonDemo6 s3 = c.newInstance();
//        SingletonDemo6 s4 = c.newInstance();
//        System.out.println(s3);
//        System.out.println(s4);

        // 通过反序列化的方式构造多个对象
        // 序列化
        FileOutputStream fos = new FileOutputStream("src/main/resources/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/a.txt"));
        SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
        System.out.println(s3);

    }
}

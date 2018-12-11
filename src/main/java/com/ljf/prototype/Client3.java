package com.ljf.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 */
public class Client3 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1212321321321L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);

        // 使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();   // 克隆好的对象

        System.out.println(s1.getSname());
        System.out.println(s2.getSname());

        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
        // s1,s2的Birthday指向同一对象
        date.setTime(121232132123121L);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());

    }
}

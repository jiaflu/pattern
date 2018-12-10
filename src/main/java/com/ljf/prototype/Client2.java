package com.ljf.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 */

public class Client2 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1212321321321L);
        Sheep2 s1 = new Sheep2("少利", date);
        System.out.println(s1);

        Sheep2 s2 = (Sheep2) s1.clone();  // 实现深复制；s2对象的birthday是一个新对象
        System.out.println(s2);

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

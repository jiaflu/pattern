package com.ljf.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 */

public class Client {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1212321321321L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);

        Sheep s2 = (Sheep) s1.clone();
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

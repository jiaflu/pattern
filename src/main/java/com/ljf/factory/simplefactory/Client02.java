package com.ljf.factory.simplefactory;

/**
 * Created by lujiafeng on 2018/12/3.
 * 简单工厂情况下
 */
public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.craeteCar("奥迪");
        Car c2 = CarFactory.craeteCar("比亚迪");

        c1.run();
        c2.run();
    }
}

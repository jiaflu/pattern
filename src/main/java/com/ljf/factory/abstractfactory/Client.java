package com.ljf.factory.abstractfactory;

import com.ljf.factory.factorymethod.Car;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
}

package com.ljf.factory.simplefactory;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪！");
    }
}

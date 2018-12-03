package com.ljf.factory.simplefactory;

import com.sun.org.glassfish.gmbal.ManagedObject;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪!");
    }
}

package com.ljf.factory.simplefactory;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class CarFactory {
    public static Car craeteCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }
}

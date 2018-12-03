package com.ljf.factory.factorymethod;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}

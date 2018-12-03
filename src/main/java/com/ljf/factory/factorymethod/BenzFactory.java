package com.ljf.factory.factorymethod;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}

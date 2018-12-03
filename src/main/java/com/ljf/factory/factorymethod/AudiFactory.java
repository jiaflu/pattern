package com.ljf.factory.factorymethod;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

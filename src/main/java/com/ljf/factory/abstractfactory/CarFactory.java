package com.ljf.factory.abstractfactory;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}



package com.ljf.factory.abstractfactory;

/**
 * Created by lujiafeng on 2018/12/3.
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("可以自动按摩!");
    }
}

class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("可以自动按摩!");
    }
}

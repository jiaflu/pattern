package com.ljf.observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state;

    public void setState(int s) {
        state = s;
        setChanged(); // 表示目标对象已经做了更改
        notifyObservers(state); // 通知所有观察者
    }

    public int getState() {
        return state;
    }
}

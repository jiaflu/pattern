package com.ljf.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    // 通知所有的观察者更状态
    public void notifyAllObserver() {
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}


package com.ljf.memento;


import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento memento;

    // 若需要保存多个备份，可使用如下
    // private List<EmpMemento> list = new ArrayList<EmpMemento>();


    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}

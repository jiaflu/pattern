package com.ljf.state;


/**
 * 空闲状态
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲!");
    }
}

package com.ljf.state;

/**
 * 房间已预订
 */
public class BookState implements State {
    @Override
    public void handle() {
        System.out.println("房间已预订!");
    }
}

package com.ljf.command;

/**
 * 命令的调用者/发起者
 */
public class Invoke {
    private Command command; //也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的实现

    public Invoke(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的方法
    public void call() {
        command.execute();
    }
}

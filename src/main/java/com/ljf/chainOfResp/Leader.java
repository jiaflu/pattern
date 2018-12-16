package com.ljf.chainOfResp;

/**
 * 抽象类
 */

public abstract class Leader {
    protected String name;
    protected Leader nextLeader; // 责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    // 设置责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    // 处理请求的核心业务方法
    public abstract void handleRequest(LeaveRequest request);
}

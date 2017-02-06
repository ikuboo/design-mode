package com.b_observer.customer;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 收到消息 处理方法
     * @param information 消息对象
     */
    void update(Information information);
}

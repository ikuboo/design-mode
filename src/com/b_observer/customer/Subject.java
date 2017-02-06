package com.b_observer.customer;

/**
 * 主题
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 发送消息
     * @param information 消息对象
     */
    void notifyObservers(Information information);
}

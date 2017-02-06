package com.b_observer;

/**
 * 主题
 */
public interface Subject {

    void registObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers(Information information);
}

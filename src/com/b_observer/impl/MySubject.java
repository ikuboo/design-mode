package com.b_observer.impl;

import com.b_observer.Information;
import com.b_observer.Observer;
import com.b_observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/4.
 */
public class MySubject implements Subject {
    List<Observer> observers = new ArrayList<>(0);



    public void registObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyObservers(Information information) {
        for(Observer observer : observers){
            observer.update(information);
        }
    }
}

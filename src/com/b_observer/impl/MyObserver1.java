package com.b_observer.impl;

import com.b_observer.Information;
import com.b_observer.Observer;
import com.b_observer.Subject;

/**
 * 自定义观察者1
 */
public class MyObserver1 implements Observer {

    private Subject subject;

    public MyObserver1(Subject subject){
        this.subject = subject;
        subject.registObserver(this);
    }

    @Override
    public void update(Information information) {
        System.out.println("我是观察者MyObserver1");
        System.out.println(information.getCode());
        System.out.println(information.getMessage());
    }
}

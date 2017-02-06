package com.b_observer.customer.impl;

import com.b_observer.customer.Information;
import com.b_observer.customer.Observer;
import com.b_observer.customer.Subject;

/**
 * 自定义观察者1
 */
public class MyObserver1 implements Observer {

    /**
     * 主题对象，用于取消注册
     */
    private Subject subject;

    public MyObserver1(Subject subject){
        this.subject = subject;
        //注册
        subject.registObserver(this);
    }

    @Override
    public void update(Information information) {
        System.out.println("我是观察者MyObserver1");
        System.out.println(information.getCode());
        System.out.println(information.getMessage());
    }
}

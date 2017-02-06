package com.b_observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 */
public class Observer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是观察者1");
        MySubject subject = (MySubject) o;
        System.out.println("message:" + subject.getMessage());
        System.out.println("arg:" + arg);
        System.out.println("------------------------------------------");
    }
}

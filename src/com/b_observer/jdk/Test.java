package com.b_observer.jdk;


import java.util.Observable;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 */
public class Test {
    public static void main(String[] args) {
        MySubject subject = new MySubject();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        //subject.setChange();
        subject.change("我是消息");

    }
}

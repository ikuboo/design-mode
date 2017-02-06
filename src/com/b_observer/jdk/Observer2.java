package com.b_observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 */
public class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是观察者2");
        MySubject subject = (MySubject) o;
        //从主题拉取消息
        System.out.println("message:" + subject.getMessage());
        //主题推送消息
        System.out.println("arg:" + arg);
        System.out.println("------------------------------------------");
    }
}

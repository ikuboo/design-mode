package com.b_observer;

import com.b_observer.impl.MyObserver1;
import com.b_observer.impl.MyObserver2;
import com.b_observer.impl.MySubject;

/**
 * 测试方法
 */
public class Test {
    public static void main(String[] args) {

        Subject subject = new MySubject();

        Observer o1 = new MyObserver1(subject);
        Observer o2 = new MyObserver2(subject);


        subject.notifyObservers(new Information(200,"成功"));
        //subject.notifyObservers(new Information(400,"失败"));

    }
}

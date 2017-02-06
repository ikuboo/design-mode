package com.b_observer.jdk;

import java.util.Observable;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 */
public class MySubject extends Observable {

    private String message;

    public void change(String message){
        this.message = message;
        setChanged();
        //notifyObservers();
        notifyObservers(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

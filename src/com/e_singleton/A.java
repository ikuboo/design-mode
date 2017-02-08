package com.e_singleton;

/**
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */
public class A {

    private static A a;

    private A(){}

    public static A getInstance(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(a == null){

            System.out.println("if");
            //synchronized (A.class){
                if(a == null) {
                    a = new A();
                }
            //}
        }
        return a;
    }
}

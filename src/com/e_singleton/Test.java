package com.e_singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(500);

        for (int i = 0; i < 500; i++) {
            final  int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    if(A.getInstance() != A.getInstance()){
                        System.out.println("error");
                    }

                }
            });
        }

        executorService.shutdown();
    }
}

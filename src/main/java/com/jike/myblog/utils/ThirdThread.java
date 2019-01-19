package com.jike.myblog.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThread {

    public static void main(String[] args){
        FutureTask<Integer> task=new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int j=0;
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName()+"死亡");
                return j;
            }
        });
        Thread th=new Thread(task,"有返回值的线程");
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main线程死亡");

        /*try {
            System.out.println("子线程的返回值"+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
    }
}

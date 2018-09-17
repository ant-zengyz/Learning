package com.example.learning.多线程.多线程模拟3;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:41
 */
public class EmployeeDPZRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"我在拿货");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"仗着自己胖，拼命拿货");
        }
        System.out.println(Thread.currentThread().getName()+"我拿完货了");
    }
}

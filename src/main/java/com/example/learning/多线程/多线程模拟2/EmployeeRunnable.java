package com.example.learning.多线程.多线程模拟2;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:41
 */
public class EmployeeRunnable implements Runnable {

    //volatile保证了线程可以正确的读取其他线程写入的值，为什么volatile可以保证，哈哈，我也不懂，但是我知道这样做是可以的，你们百度吧
    volatile boolean isBoolean=true;

    @Override
    public void run() {
        while (isBoolean){
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName()+"我在拿货,拿了"+i+"件");
                //让出处理器时间，下次哪条线程执行还是未知数
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"我拿完货了");
    }
}

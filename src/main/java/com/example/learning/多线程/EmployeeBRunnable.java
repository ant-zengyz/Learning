package com.example.learning.多线程;

/**
 * 描述：实现Runnable接口，实现线程
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:15
 */
public class EmployeeBRunnable implements Runnable {//实现Runnable接口

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"我是一个员工");
        int count=0;

        boolean isBoolean=true;
        while (isBoolean){
            System.out.println(Thread.currentThread().getName()+"我在拿货,拿了"+(++count)+"件");
            if (count==100){
                isBoolean=false;
            }

            if (count%5==0){
                try {
                    Thread.sleep(3000);//休息3秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"我拿完货了");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new EmployeeBRunnable(),"小金牙");
        thread.start();
    }
}

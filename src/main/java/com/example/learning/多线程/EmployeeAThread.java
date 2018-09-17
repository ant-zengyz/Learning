package com.example.learning.多线程;

/**
 * 描述：继承Thread，实现线程
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:02
 */
public class EmployeeAThread extends Thread {//第一种方式，继承Thread

    @Override
    public void run() {//重写run方法
        System.out.println(getName()+"我是一个员工");
        int count=0;

        boolean isBoolean=true;
        while (isBoolean){
            System.out.println(getName()+"我在拿货,拿了"+(++count)+"件");
            if (count==100){
                isBoolean=false;
            }

            if (count%5==0){
                try {
                    sleep(3000);//休息3秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName()+"我拿完货了");
    }

    public static void main(String[] args) {
        Thread thread=new EmployeeAThread();
        thread.setName("大金牙");
        thread.start();
    }
}

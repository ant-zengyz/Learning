package com.example.learning.多线程.多线程模拟3;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:46
 */
public class FactoryThread extends Thread {

    @Override
    public void run() {//重写run方法

        EmployeeRunnable djy=new EmployeeRunnable();
        EmployeeRunnable xjy=new EmployeeRunnable();
        Thread djyThread=new Thread(djy,"大金牙");
        Thread xjyThread=new Thread(xjy,"小金牙");

        djyThread.start();
        xjyThread.start();

        //主线程停止，让子线程执行
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread dpzThread=new Thread(new EmployeeDPZRunnable(),"大胖子");

        //让线程停止
        djy.isBoolean=false;
        xjy.isBoolean=false;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dpzThread.start();

        //等待线程执行完成
        try {
            dpzThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("结束了");
    }

    public static void main(String[] args) {
        new FactoryThread().start();
    }
}

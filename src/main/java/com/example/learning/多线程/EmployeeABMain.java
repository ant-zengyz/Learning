package com.example.learning.多线程;

/**
 * 描述：两个线程一起执行
 * User: 曾远征
 * Date: 2018-09-17
 * Time: 21:19
 */
public class EmployeeABMain {

    public static void main(String[] args) {
        Thread threadA=new EmployeeAThread();
        threadA.setName("大金牙");
        threadA.start();
        Thread threadB=new Thread(new EmployeeBRunnable(),"小金牙");
        threadB.start();
    }
}

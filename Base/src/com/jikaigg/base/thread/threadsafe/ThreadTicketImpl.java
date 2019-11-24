package com.jikaigg.base.thread.threadsafe;

import java.util.Objects;

/*
实现买票案例
*/
public class ThreadTicketImpl implements Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;
    // 创建一个锁对象
    Object obj = new Object();

    // 设置线程任务：买票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复执行
        while (true) {
            synchronized (obj) {
                /*// 先判断票是否存在
                if (ticket > 0) {
                    // 票存在，卖票
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }*/
                saleTicket();
            }
        }
    }

    // 定义一个同步方法
    /*
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的所对象就是实现类对象 new ThreadDemo()
        也就是this
    */
    public synchronized void saleTicket() {
        // 先判断票是否存在
        if (ticket > 0) {
            // 票存在，卖票
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}


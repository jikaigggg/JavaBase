package com.jikaigg.base.thread;

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyThread2 my5 = new MyThread2();
        Thread t = new Thread(my5);
        
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

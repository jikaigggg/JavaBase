package com.jikaigg.base.thread;
/*
匿名内部类方式实现线程的创建：
匿名：没有名字
内部类：写在其他类内部的类
匿名内部类作用：简化代码
    把子类继承父类，重写父类的方法，创建子类对象合一步完成
    把实现类实现类接口，重写接口中的方法，创建实现类对象合成一步完成
匿名内部类的最终产物：子类/实现类对象，而这个类没有名字
*/

public class ThreadDemo6 {
    public static void main(String[] args) {
        // 线程的父类是Thread
        //new Mythread2().start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Thread内部类" + i);
                }
            }
        }.start();

        // 线程的接口Runable
        // RunnableImpl r = new RunnaleImpl();
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {

                    System.out.println("Runnable内部类" + i);
                }
            }
        }).start();
    }
}

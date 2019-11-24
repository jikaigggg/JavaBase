package com.jikaigg.base.thread.threadsafe;
/*
解决线程安全问题的第一种方案
同步代码块：
    格式：
        synchronized(所对象){
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }
注意：
    1.通过代码块中的所对象，可以使用任意的对象
    2.但是必须保证多个线程使用的所对象是同一个
    3.所对象的作用：把同步代码块锁住，只让一个线程在同步代码块中执行
*/
public class SynchronizedDemo1 {
}

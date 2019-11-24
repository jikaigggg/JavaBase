package com.jikaigg.base.thread.threadsafe;
/*
解决线程安全问题的第二种方案：使用同步方法
使用步骤：
    1.吧访问了共享数据的代码抽取出来，放到一个方法中
    2.在方法上添加synchronized修饰符
格式：
    public synchronized 返回值类型 方法名(参数列表){
        可能出现线程安全的代码
    }
*/
public class SynchronizedDemo2 {
}

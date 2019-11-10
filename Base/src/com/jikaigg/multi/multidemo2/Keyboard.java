package com.jikaigg.multi.multidemo2;

// 键盘就是一种USB设备
public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void imput() {
        System.out.println("键盘输入");
    }
}

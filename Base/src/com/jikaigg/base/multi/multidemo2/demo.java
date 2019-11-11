package com.jikaigg.base.multi.multidemo2;

public class demo {
    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer c = new Computer();
        c.powerOn();
        // 准备一个鼠标，供电脑使用
        // Mouse m = new Mouse();
        // 首先进行向上转型
        USB usb = new Mouse();
        // 参数是USB类型，正好传递进去的就是USB鼠标
        c.usbDevice(usb);

        // 创建一个USB键盘
        Keyboard k = new Keyboard();  // 没有使用多态写法
        c.usbDevice(k);
        c.powerOff();
    }
}

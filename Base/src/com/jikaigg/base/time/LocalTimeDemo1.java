package com.jikaigg.base.time;

import java.time.LocalTime;

public class LocalTimeDemo1 {
    public static void main(String[] args) {
        //获取时间
        //获取当前时间，包含毫秒级
        //LocalTime now = LocalTime.now();
        //获取当前时间，去掉毫秒级
        LocalTime now = LocalTime.now().withNano(0);

        //构造时间
        //根据时分秒
        LocalTime now1 = LocalTime.of(1, 2, 3);
        System.out.println(now1);
    }
}

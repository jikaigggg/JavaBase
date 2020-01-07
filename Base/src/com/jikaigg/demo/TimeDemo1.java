package com.jikaigg.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);
    }
}

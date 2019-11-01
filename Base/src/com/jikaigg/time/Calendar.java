package com.jikaigg.time;

import java.time.LocalDate;
/*
* 需求：
*       编写程序，实现一个日历，当日用"*"标记
* */
public class Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        //date = date.minusDays(da);
        System.out.println(date);


        System.out.println("Mon Tus Wed Thu Fri Sat Sun");
    }
}

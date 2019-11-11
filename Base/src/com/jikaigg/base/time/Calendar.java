package com.jikaigg.base.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
  需求：
        编写程序，实现一个日历，当日用"*"标记
*/
public class Calendar {
    public static void main(String[] args) {
        // 获取当前时间
        LocalDate date = LocalDate.now();
        // 获取当前月份
        int month = date.getMonthValue();
        // 获取当前在本月中的第几天
        int day = date.getDayOfMonth();
        date = date.minusDays(day - 1);
        // 获取今天是星期几
        DayOfWeek weekday = date.getDayOfWeek();
        //获取今天是本周中的第几天
        int value = weekday.getValue();
        int valuef = value;
        // 测试输出
        System.out.println(month + "," + day + "," + date + "," + weekday + "," + value);
        // 打印输出表头
        System.out.println("Mon Tus Wed Thu Fri Sat Sun");
        // 将本月号前的空格打印输出
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        // 打印
        for (int i = 1; i < date.lengthOfMonth() + 1; i++) {
            if (value % 7 == 0 && value < valuef + 9) {
                System.out.println("   " + i);
            } else if (value % 7 == 0) {
                System.out.println("  " + i);
            } else if (value < valuef + 9) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }
            value++;
        }
    }
}

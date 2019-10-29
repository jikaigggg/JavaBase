package com.jikaigg.time;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        //日期获取
        //取当前日期
        LocalDate today = LocalDate.now();

        //根据年月日取日期，12月就是12
        LocalDate history = LocalDate.of(2019, 10, 29);

        //根据字符串取日期，严格按照yyyy-mm-dd
        LocalDate StringTime = LocalDate.parse("2020-11-11");
        //无效日起会报错，比如2月30号
        //LocalDate errorTime = LocalDate.parse("2015-2-30");

        System.out.println(today);
        System.out.println(history);
        System.out.println(StringTime);
        //System.out.println(errorTime);


        //日期转换
        //取本月第一天
        LocalDate Ftoday = today.with(TemporalAdjusters.firstDayOfMonth());
        //取本月第二天
        LocalDate Stoday = today.withDayOfMonth(2);
        //取本月第八天
        LocalDate Etoday = today.withDayOfMonth(8);
        //取本月最后一天
        LocalDate Ztoday = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(Ztoday);
    }
}

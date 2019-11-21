package com.jikaigg.algorithm;

/*
输入成绩，返回成绩评价
小于100大于90为A
小于90大于60为B
小于60大于0为C
*/

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int sco = sca.nextInt();
        if (sco <= 100 && sco >= 0) {
            String grade = sco >= 90 ? "A" : sco >= 60 ? "B" : "C";
            System.out.println(grade);
        } else {
            System.out.println("输入不合法！！！");
        }
    }

}

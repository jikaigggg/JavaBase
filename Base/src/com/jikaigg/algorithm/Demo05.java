package com.jikaigg.algorithm;

/*
1.指数计算问题
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....

*/
public class Demo05 {
    public static void main(String[] args) {
        System.out.println(getNum(8));
    }

    private static int getNum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getNum(month - 1) + getNum(month - 2);
        }

    }
}

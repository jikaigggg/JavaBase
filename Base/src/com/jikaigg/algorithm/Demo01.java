package com.jikaigg.algorithm;

import java.util.ArrayList;

/*
    判断101-200之间有多少个素数，并输出所有素数。
*/
public class Demo01 {
    public static void main(String[] args) {
        // 创建一个ArrayList用来存放素数
        ArrayList<Integer> arr = new ArrayList<>();
        // 计数器
        int count = 0;
        // 双层循环嵌套
        // 外层循环101-200之间的数
        for (int i = 101; i < 201; i++) {
            // 定义一个flag标记判断情况
            boolean flag = true;
            // 内层循环循环3 到 该数本身-1的数
            for (int j = 2; j < (i / 2); j++) {
                // 判断外循环对内循环取余，如果 == 0 则证明能整除，非素数
                if (i % j == 0) {
                    // 如果能被整出，flag标记为false
                    flag = false;
                }
            }
            // 统计过完循环flag仍为true
            if (flag == true) {
                // 计数器+1
                count++;
                // 将i添加进ArrayList中
                arr.add(i);
            }
        }
        System.out.println(count);
        System.out.println(arr);


    }
}

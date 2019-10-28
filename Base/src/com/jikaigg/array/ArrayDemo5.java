package com.jikaigg.array;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //定义一个数组，并获取数组的长度，length是数组的一个属性
        int[] arrayA = {1, 2, 3, 4, 5};
        //System.out.println(arrayA.length);
        arrayFanzhuan(arrayA);
        //遍历数组
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println(Arrays.toString(arrayA));
    }

    //数组反转
    public static int[] arrayFanzhuan(int[] arrayT) {
        int min = 0;
        int max = arrayT.length - 1;
        int temp;
        while (true) {
            if (min < max) {
                temp = arrayT[min];
                arrayT[min] = arrayT[max];
                arrayT[max] = temp;
                min += 1;
                max -= 1;
            } else {
                return arrayT;
            }
        }
    }
}

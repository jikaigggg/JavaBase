package com.jikaigg.base.array;

import java.util.Arrays;

/*
  实用API：

*/
public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arrayA = {5, 9, 1, 2, 7, 3, 8};
        // 输出数组toString
        System.out.println(Arrays.toString(arrayA));

        // 数组中是否包含某个值
        System.out.println(Arrays.asList(new String[]{"aa", "bb"}).contains("aa"));

        // 数组排序
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));

    }
}

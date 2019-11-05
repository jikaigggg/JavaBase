package com.jikaigg.array;

import java.util.Arrays;

/*
 * public static String toString(数组):将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3....]）
 * public static void sort(数组):按照默认升序（从小到大），排列数组
 *   备注：
 *       1.如果是数值，sort按照由小到大.
 *       2.如果是字符串，sort按照字母升序.
 *       3.如果是自定义类型，这个自定义的类需要有Comparable或者comparator接口的支持。
 * */
public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] array = {10, 0, 30};
        String str = Arrays.toString(array);
        System.out.println(str);
        // 默认升序排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

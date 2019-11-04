package com.jikaigg.jString;


/*
 * 字符串拼接：
 *   定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式参照如下：[word1#word2#word3#]
 * */
public class StringDemo8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array) {
        String s1 = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                s1 += "word" + array[i]+"]";
            } else {
                s1 += "word" + array[i] + "#";
            }
        }
        return s1;
    }
}

package com.jikaigg.method;

/*
   方法就是封装
   关键字private也是一种封装
   封装就是将一些细节信息隐藏起来，对于外界不可见
*/
public class MethodDemo2 {
    public static void main(String[] args) {

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

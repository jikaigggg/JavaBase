package com.jikaigg.base.array;
/*
  使用建议：如果不确定数组中的具体内容，用动态初始化，否则，已经确定了具体内容，用静态初始化
*/

public class Arraydemo1 {
    public static void main(String[] args) {
        // 动态初始化创建一个数组
        int[] arrayB = new int[10];
        // 动态初始化也可以拆分成两个步骤
        int[] arrayD;
        arrayD = new int[4];

        // 静态初始化创建一个数组
        int[] arrayA = new int[]{1, 2, 3};
        // 静态初始化的标准格式，可以拆分成两个步骤
        int[] arrayC;
        arrayC = new int[]{1, 4, 5, 6};
        // 静态初始化的省略格式
        int[] arrayE = {7, 8, 9};
    }

}

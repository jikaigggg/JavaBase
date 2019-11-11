package com.jikaigg.base.array;

/*
  直接打印数组名称，得到的是数组对应的内存地址哈希值
  访问数组元素的格式，代表数组当中元素的编号
  【注意】索引值从0开始，一直到“数组长度-1”为止
*/
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 静态初始化一个数组
        int[] arrayA = {1, 2, 3, 4};

        // 直接打印数组名称，
        System.out.println(arrayA);  // 输出为：[I@74a14482    这个为数组在内存中的地址哈希值

        // 打印数组中的每个元素具体值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);

        // 将数组中的元素赋值给变量
        int a = arrayA[2];
        System.out.println(a);
    }

}

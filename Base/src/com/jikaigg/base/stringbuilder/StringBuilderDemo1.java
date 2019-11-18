package com.jikaigg.base.stringbuilder;


/*
StringBuilder类
    字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
    底层也是一个数组，但是没有被final修饰，可以改变长度
    byte[] value = new byte[16];

    StringBuilder在内存中始终是一个数组，占用的空间小，效率高
    如果超出了StringBuilder的容量，会自动扩容
*/
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // StringBuilder()  构造一个不带任何字符的字符串生成器，其初始容量为16个字符串
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:" + sb1);  // sb1:

        // StringBuilder(String str)  构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder sb2 = new StringBuilder("yaojikai");
        System.out.println("sb2:" + sb2);  // sb2:yaojikai

        // append()  添加任意类型数据的字符串，并返回当前对象自身
        // append()返回的是this，调用方法的对象
        StringBuilder sb3 = new StringBuilder("yao");
        System.out.println("sb3:" + sb3);
        sb3.append("ji");
        System.out.println("sb3:" + sb3);
        System.out.println("sb3:" + sb3.append("kai"));

        // 链式编程：方法返回值是一个对象，可以继续调用方法
        StringBuilder sb4 = new StringBuilder("yao");
        System.out.println("sb4:" + sb4.append("ji").append("kai").append("ai").append("shimengyu"));
    }
}

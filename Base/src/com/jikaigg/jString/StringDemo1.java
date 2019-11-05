package com.jikaigg.jString;

/*
 * java.lang.String类代表字符串
 * API当中说，Java程序中的所有字符串字面值（如："abc"）都作为此类的实例实现
 * 其实就是说：程序中所有的双引号字符串，都是String累的对象（就算没有new，也照样是）
 *
 * 字符串的特点：
 *   1.字符串的内容永不可变【重点】
 *   2.正是因为字符串不可改变，所以字符串是可以共享使用的
 *   3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。
 *
 * 创建字符串的3+1种方式：
 *   1.public String():创建一个空白字符串，不含任何内容。
 *   2.public String(char[] array):根据字符数组的内容，来创建字符串。
 *   3.public String(byte[] array):根据字节数组的内容，来创建字符串。
 *   +1.直接创建
 *
 * 注意：直接协商双引号，就是字符串对象。
 * */
public class StringDemo1 {
    public static void main(String[] args) {
        // 使用空参构造
        String s1 = new String();
        System.out.println("第一个字符串：" + s1);

        // 根据字符数组创建,注意char[]数组里的元素一定要用单引号
        char[] charArray = {'y', 'j', 'k'};
        String s2 = new String(charArray);
        System.out.println("第二个字符串：" + s2);

        // 使用字节数组创建字符串,字符串的底层用的就是用字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String s3 = new String(byteArray);
        System.out.println("第三个字符串：" + s3);

        // 直接创建
        String s4 = "hello!";
        System.out.println("第四个字符串：" + s4);
    }
}

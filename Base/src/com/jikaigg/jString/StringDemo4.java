package com.jikaigg.jString;

/*
 * String当中与获取相关的常用方法有：
 *   public int length();获取字符串当中含有的字符数，拿到字符串长度
 *   public String concat():将当前字符串和参数字符串拼接成为返回值新的字符串
 *   public char charAt(int index):获取指定索引为止的单个字符（索引从0开始）
 *   public int indexOf(String):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 * */
public class StringDemo4 {
    public static void main(String[] args) {
        // length()方法，获取字符串的长度
        int len = "yaojikaiaishimengyu".length();
        System.out.println("字符串的长度是" + len);

        String s1 = "Hello ";
        String s2 = "World！";
        // concat拼接完之后产生新的字符串，原字符串不会发生改变
        System.out.println(s1.concat(s2));
        System.out.println(s1);
        System.out.println(s2);

        // 获取指定索引位置的单个字符
        char c1 = "Hello".charAt(1);
        System.out.println("c1中索引为1的字符是" + c1);
        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本了没有，则返回-1
        String s4 = "HelloWorld!";
        int i1 = s4.indexOf("llo");
        System.out.println("第一次出现字符串“llo”的位置是：" + i1);
        int i2 = s4.indexOf("abc");
        System.out.println("第一次出现字符串“abc”的位置是：" + i2);
    }
}

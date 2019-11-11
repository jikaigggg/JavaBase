package com.jikaigg.jString;

/*
  字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中

  对于基本类型来说，==是进行数值的比较。
  对于引用类型来说，==是进行[地址值]的比较。
*/
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        char[] ss = {'a', 'b', 'c'};
        String s3 = new String(ss);
        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s2 == s3);  // false
    }
}

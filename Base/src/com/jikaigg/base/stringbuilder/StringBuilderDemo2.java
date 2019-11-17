package com.jikaigg.base.stringbuilder;

/*
StringBuilder和String可以相互转换：
    String->StringBuilder:可以使用StringBuilder的构造方法
        StringBuilder(String str)  构造一个字符串生成器，并初始化为指定的字符串内容
    StringBuilder->String：可以使用StringBuilder中的toString方法
        public String toString()：  将当前StringBuilder对象转换为String对象
*/
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // String -> StringBuilder
        String str1 = "yaojikai";
        System.out.println("str1:" + str1);
        StringBuilder str2 = new StringBuilder(str1);
        // 往StringBuilder中添加数据
        str2.append("aioshimengyu");
        System.out.println("str2:" + str2);

        //StringBuilder -> String
        StringBuilder str3 = new StringBuilder("shimengyu");
        String str4 = str3.toString();
        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);
    }
}

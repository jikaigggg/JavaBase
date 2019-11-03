package com.jikaigg.jString;


/*
* 字符串的截取方法：
*   public String subString(int index): 截取从参数位置一直到字符串结尾，返回新的字符串
*   public String subString(int begin,int end): 截取从begin开始，一直到end结束，中间的字符串。，备注：（左闭右开）包含左边，不包含右边
* */
public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = s1.substring(5);
        System.out.println(s1);  // HelloWorld
        System.out.println(s2);  // World
        String s3 = s1.substring(4,7);
        System.out.println(s3);  // oWo
    }
}

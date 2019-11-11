package com.jikaigg.jString;

/*
  字符串的分割方法：
    public String[] split(String regex):按照参数的规则，将字符串切分成为若干部分
  注意事项：
    split方法的参数其实是一个正则表达式，如果按照英文句号切分必须写"\\."(两个反斜杠)
*/
public class StringDemo7 {
    public static void main(String[] args) {
        String s1 = "aaa,bbb,ccc!";
        // 根据规则切分字符串，切分的标记为","
        String[] array1 = s1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String s2 = "aaa bbb ccc!";
        // 根据规则切分字符串，切分的标记为" "
        String[] array2 = s2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String s3 = "aaa.bbb.ccc!";
        // 根据规则切分字符串，切分的标记为"."
        String[] array3 = s3.split("\\.");
        System.out.println("array3数组的长度" + array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}

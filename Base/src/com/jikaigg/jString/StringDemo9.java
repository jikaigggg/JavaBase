package com.jikaigg.jString;

import java.util.Scanner;

/*
 键盘输入一个字符串，并且统计其中各种字符出现的次数
 种类有：大写字母，小写字母，其他

 ????如果输入的字符串之间带空格，长度统计的有异常
*/
public class StringDemo9 {
    public static void main(String[] args) {
        System.out.println("请输入你要分析的字符串：");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        System.out.println("字符串的长度是："+str.length());
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A'<= ch && ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper+"个");
        System.out.println("小写字母有："+countLower+"个");
        System.out.println("数字有："+countNumber+"个");
        System.out.println("其他字符有："+countOther+"个");
    }
}

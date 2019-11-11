package com.jikaigg.jString;

/*
  ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法

  public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会个true，否则返回false

  equels()注意事项
  1.任何对象都能用Object进行接收
  2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
  推荐："abc".equals(a)

  public boolean equalsIgnareCase(String str):忽略大小写，进行内容比较
*/

public class StringDemo3 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(charArray);
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s2.equals(s3));  // true

        String s4 = "abc";
        System.out.println("abc".equals(s4));   // 推荐
        System.out.println(s4.equals("abc"));   // 不推荐

        String s5 = "JAVA";
        String s6 = "java";

        // 只有英文字母区分大小写，其他都不区分大小写
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s5));

    }
}

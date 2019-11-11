package com.jikaigg.scanner;

/*
  Scanner类的功能：可以实现键盘输入数据到程序当中。
  引用类型的一般使用步骤
    import 包路径.类名称;  // 如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
                         // 只有java.lang包下的内容不需要导包，其他的包都需要import语句。
    创建
        类名称 对象名 = new 类名称();
    使用
        对象名.成员方法名();
*/

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);  // System.in代表从键盘输入

        // 获取键盘中输入的数字
         /*int num = s1.nextInt();
        System.out.println(num);*/

        // 获取键盘中输入的字符串，因为Scanner的next默认匹配的是空格和换行符
        // String str = s1.next();
        // System.out.println(str);
        // 如果接受用户输入空格需要记入一行代码
        s1.useDelimiter("\n");
        String str1 = s1.next();
        System.out.println(str1);
    }

}

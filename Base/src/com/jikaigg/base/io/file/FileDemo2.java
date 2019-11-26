package com.jikaigg.base.io.file;

import java.io.File;

/*
    File类的构造方法

*/
public class FileDemo2 {
    public static void main(String[] args) {
        /*
        File类的构造方法
        */
        method1();
        method2();
        method3();
    }

    /*
    File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
    参数：
        String pathname：字符串的路径名称
        路径可以是以文件结尾，也可以是一文件夹结尾
        路径可以是相对路径，也可以是绝对路径
        路径可以是存在的，也可以是不存在的
        创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void method1() {
        // 返回路径
        File f1 = new File("/home/yaojikai/git");
        System.out.println(f1);
        // 相对路径
        File f2 = new File("../FileDemo1");
        System.out.println(f2);
    }

    /*
    File(String parent,String child)：根据parent路径名字符串和child路径名字符串创建一个新File实例
    参数：把路径分成了两部分
        String parent父路径
        String child子路径
    好处：
        父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
    */
    private static void method2() {
        File f3 = new File("/home/jikaigg", "git");
        System.out.println(f3);
    }

    /*
    File(File parent,String child)：根据parent抽象路径名和child路径名字符串创建一个新File实例
    参数：把路径分成了两部分
        File parent：父路径
        String child：子路径
    好处：
        父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
        父路径是File类型，可以使用File的方法对路径进行一些操作，在使用路径创建对象
    */
    private static void method3() {
        File f4 = new File("/home/jikaigg");
        File f5 = new File(f4, "git");
        System.out.println(f5);
    }
}

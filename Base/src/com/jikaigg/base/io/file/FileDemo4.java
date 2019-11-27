package com.jikaigg.base.io.file;

import java.io.File;

/*
File判断功能的方法
public boolean exists()：此File表示的文件或目录是否真实存在
public boolean isDirectory()：此File表示的是否为目录
public boolean isFile()：此File表示的是否为文件
*/
public class FileDemo4 {
    public static void main(String[] args) {
        // method1();
        // method2();
        method3();
    }

    // public boolean exists()：此File表示的文件或目录是否真实存在
    private static void method1() {
        // 传绝对路径和相对路径，真实存在和非真实存在的文件
        File f1 = new File("D:\\githuby\\JavaBase\\README.md");
        File f2 = new File("D:\\githuby\\JavaBase\\yaojikai.md");
        boolean exists1 = f1.exists();
        boolean exists2 = f2.exists();
        System.out.println(exists1);
        System.out.println(exists2);

        File f3 = new File("README.md");
        boolean exists3 = f3.exists();
        System.out.println(exists3);
    }

    //public boolean isDirectory()：此File表示的是否为目录
    private static void method2() {
        // File为一个文件，返回false
        File f4 = new File("D:\\githuby\\JavaBase\\README.md");
        boolean directory1 = f4.isDirectory();
        System.out.println(directory1);

        // File为一个目录，返回true
        File f5 = new File("D:\\githuby\\JavaBase");
        boolean directory2 = f5.isDirectory();
        System.out.println(directory2);
    }

    // public boolean isFile()：此File表示的是否为文件
    private static void method3() {
        // File为一个文件，返回true
        File f6 = new File("D:\\githuby\\JavaBase\\README.md");
        boolean file1 = f6.isFile();
        System.out.println(file1);

        // File为一个目录，返回false
        File f7 = new File("D:\\githuby\\JavaBase");
        boolean file2 = f7.isFile();
        System.out.println(file2);
    }

}

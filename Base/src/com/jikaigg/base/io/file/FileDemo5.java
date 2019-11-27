package com.jikaigg.base.io.file;

import java.io.File;
import java.io.IOException;

/*
创建删除功能的方法：
    public boolean createNewFile()：当且仅当具有该名称的文件上不存在时，创建一个空的文件
    public boolean delete()：删除由此File表示的文件或目录
    public boolean mkdir()：创建由此File表示的目录
    public booleanmkdirs()：创建由此File表示的目录包括任何必需但不存在的父目录
*/
public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        //method1();
        // method2();
        // method3();
        method4();
    }

    // public boolean createNewFile()：当且仅当具有该名称的文件上不存在时，创建一个空的文件
    private static void method1() throws IOException {
        File f1 = new File("D:\\yaojikaitest");
        boolean newFile1 = f1.createNewFile();
        System.out.println(newFile1);
    }

    // public boolean delete()：删除由此File表示的文件或目录,如果目录或文件不存在返回false
    private static void method2() {
        File f2 = new File("D:\\yaojikaitest");
        boolean delete1 = f2.delete();
        System.out.println(delete1);
    }

    // public boolean mkdir()：创建由此File表示的目录
    private static void method3() {
        // 在已有的目录中创建目录
        File f3 = new File("D:\\yaojikaitest\\123\\456");
        // 不能创建多级目录，返回false
        // File f3 = new File("D:\\yaojikaitest\\123\\456");
        boolean mkdir1 = f3.mkdir();
        System.out.println(mkdir1);
    }

    // public booleanmkdirs()：创建由此File表示的目录包括任何必需但不存在的父目录
    private static void method4() {
        // 创建多级目录,也可创建一个文件夹
        File f4 = new File("D:\\yaojikaitest");
        boolean mkdirs1 = f4.mkdirs();
        System.out.println(mkdirs1);
    }
}

package com.jikaigg.base.io.file;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
FileFilter接口：用于抽象路径名的过滤器
File[] listFiles(FileFilter filter)
作用：用来过滤文件（File对象）
抽象方法：用来过滤文件的方法
    boolean accept(File pathname) 测试制定抽象路径名是否应该包含在某个路径名列表中
    参数：File pathname：使用ListFIles方法遍历目录得到的每一个文件对象
File[] listFiles(FilenameFilter filter)
实现此接口的类实例可用于过滤器文件名
    作用：用于过滤文件名称
    抽象方法：用来过滤文件的方法
    boolean accept(File dir，String name)测试制定文件是否应该包含在某一文件列表中
    参数：
         File dir：构造方法中传递的被遍历的目录
         String name：使用ListFIle方法遍历目录，获取的每一个文件/文件夹的名称
注意事项：
    两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
*/
public class FIleDemo7 {
    public static void main(String[] args) {
        // File f = new File("/home/jikaigg/git");
        File f = new File("D:\\test");
        // method3(f);
        method2(f);
    }

    private static void method2(File f) {
        new FileFilterImpl().accept(f);
    }

    private static void method3(File dir) {
        File[] f = dir.listFiles(new FileFilterImpl());
        for (File file : f) {
            if (file.isDirectory()) {
                method3(file);
            }
            System.out.println(file);
        }
    }
}

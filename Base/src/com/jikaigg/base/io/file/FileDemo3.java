package com.jikaigg.base.io.file;

import java.io.File;

/*
File类的常用方法：
    public String getAbsolutePath():返回此file的绝对路径名字符串
    public String getPath():将此File转换为路径名字符串
    public String getName():返回由此File表示的文件或目录的名称
    public long Length():返回由此File还表示的文件的长度
*/
public class FileDemo3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    /*
        public String getAbsolutePath():返回此file的绝对路径名字符串
        获取的构造方法中传递的路径
        无论路径是绝对的还是相对的，getAbsolutePath()返回的都是绝对路径
     */
    private static void method1() {
        // 传绝对路径(Ubuntu下)
        // File f1 = new File("/home/jikaigg/git/JavaBase/README.md");
        // 传绝对路径(Windows下)
        File f1 = new File("D:\\githuby\\JavaBase\\README.md");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        // 传相对路径
        File f2 = new File("README.md");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }

    /*
        public String getPath():将此File转换为路径名字符串

        toString()调用的就是getPath方法
     */
    private static void method2() {
        // 将File转换为字符串
        File f3 = new File("/home/jikaigg/git/JavaBase/README.md");
        String path1 = f3.getPath();
        System.out.println(path1);
        // toString()源码调用的就是getPath()方法
        System.out.println(f3.toString());

        // 将File转换为字符串
        File f4 = new File("README.md");
        String path2 = f4.getPath();
        System.out.println(path2);
    }

    /*
        public String getName():返回由此File表示的文件或目录的名称
        获取的就是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void method3() {
        // 返回文件的名字，下面例子返回README.md
        File f5 = new File("/home/jikaigg/git/JavaBase/README.md");
        String name1 = f5.getName();
        System.out.println(name1);

        // 返回目录的名字，下面例子返回JavaBase
        File f6 = new File("/home/jikaigg/git/JavaBase");
        String name2 = f6.getName();
        System.out.println(name2);
    }

    /*
        public long Length():返回由此File还表示的文件的长度
        获取的是构造方法指向的文件的大小，以字节为单位
        注意：
            文件夹没有大小概念，不能获取文件夹的大小
            如果构造方法中给出的路径不存在，那么Length方法返回0
     */
    private static void method4() {
        // 绝对路径获取文件的大小，下面例子返回了10
        // File f7 = new File("/home/jikaigg/git/JavaBase/README.md");
        File f7 = new File("D:\\githuby\\JavaBase\\README.md");
        long length1 = f7.length();
        System.out.println(length1);

        // 相对路径获取文件的大小 下面例子返回了10
        File f8 = new File("README.md");
        long length2 = f8.length();
        System.out.println(length2);

        // 文件是一个目录，返回值不确定，Linux下返回了4096，有的地方说会返回0(Windows下返回了0)
        // File f9 = new File("/home/jikaigg/git/JavaBase");
        File f9 = new File("D:\\githuby\\JavaBase");
        long length3 = f9.length();
        System.out.println(length3);

        // 文件不存在，返回0
        // File f10 = new File("/home/jikaigg/git/JavaBase/yaojikai.txt");
        File f10 = new File("D:\\githuby\\JavaBase\\yaojikai.md");
        long length4 = f10.length();
        System.out.println(length4);
    }
}

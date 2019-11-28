package com.jikaigg.base.io.file;

import java.io.File;

/*
File类遍历（文件夹）目录功能
    public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录
    public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录
注意：
    list方法和listFiles方法遍历的是构造方法中给出的目录
    如果构造方法中给出的目录的路径不存在，抛出空指针异常
    如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
*/
public class FileDemo6 {
    public static void main(String[] args) {
        // method1();
        method2();
    }

    /*
    public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录
    遍历构造方法中给出的目录，会获取目录中所有文件/文件夹名称，把获取到的多个名称存储到一个String类型的数组中
    */
    private static void method1() {
        File f1 = new File("/home/jikaigg/git/JavaBase");
        String[] s1 = f1.list();
        for (String s : s1) {
            System.out.println(s);
        }
        // 遍历的File必须是目录，如果是一个文件，会报NullPointerException错误
        File f2 = new File("/home/jikaigg/git/JavaBase/README.md");
        String[] s2 = f2.list();
        for (String s : s2) {
            System.out.println(s);
        }
        // 遍历的File不存在，也会报NullPointException错误
        File f3 = new File("/home/jikaigg/git/Javabase");
        String[] s3 = f3.list();
        for (String s : s3) {
            System.out.println(s);
        }
    }

    /*
    public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录
    股遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，吧文件、文件夹封装为File对象，多个File对象存储到File数组中
    */
    private static void method2(){
        File f4 = new File("/home/jikaigg/git/JavaBase");
        File[] files = f4.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }

}

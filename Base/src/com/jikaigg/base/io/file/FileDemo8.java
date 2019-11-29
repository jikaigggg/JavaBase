package com.jikaigg.base.io.file;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        File f = new File("D:\\test");
        accept(f);
    }
    public static void accept(File pathname) {
        File[] f = pathname.listFiles();
        for (File file : f) {
            if (file.isFile()) {
                System.out.println(file);
            } else {
                accept(file);
            }
        }
    }
}

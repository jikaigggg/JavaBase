package com.jikaigg.demo;
/*
照片比对程序：
    传入一个照片文件所在的路径，对路径下的所有照片进行两两比对，并返回是否是相同照片
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhotoCompare {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\githuby\\JavaBase\\AAA");
        fileArr(f);
    }

    // 传入文件夹，遍历文件夹，对文件夹中的照片两两比较

    public static void fileArr(File f) throws IOException {
        // 定义一个ArrayList用来存放File，注意：只要是Object的子类都能放在List中
        List<File> l = new ArrayList<>();
        // 遍历路径下的文件，并放入数组中
        File[] files = f.listFiles();
        for (File file : files) {
            // if (file.toString().endsWith(".jpg") || file.toString().endsWith(".png")) {
            l.add(file);
            // }
        }
        // 双层循环保证数组中的所有文件都能两两作比较
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                System.out.print(l.get(i) + "和" + l.get(j) + "    ");
                // 调用比较方法，对两个文件进行比对
                compareTwo(l.get(i), l.get(j));
            }
        }
    }

    // 比较两张照片是否相同
    public static void compareTwo(File f1, File f2) throws IOException {
        // 定义一个起止时间统计下一次比对的耗时
        long start = System.currentTimeMillis();

        FileInputStream fi1 = new FileInputStream(f1);
        FileInputStream fi2 = new FileInputStream(f2);

        byte[] b1 = new byte[1024];
        byte[] b2 = new byte[1024];

        int len = 0;

        // 定义一个标志，用来最后统计照片是否一致
        boolean flag = true;
        // 读取文件，与另一个文件作比较
        while ((len = fi1.read(b1)) != -1) {
            // 如果文件不相等，标记为false并结束循环
            if (len != fi2.read(b2)) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.print("same picture");
        } else {
            System.out.print("no same     ");
        }
        fi1.close();
        fi2.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("耗时：" + time + "毫秒");
    }
}

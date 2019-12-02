package com.jikaigg.base.io.stream;

import java.io.FileWriter;
import java.io.IOException;

/*
writer:字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类
    void write(int c)：写入单个字符
    void write(char[] cbuf)：写入字符数组
    abstract void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数
    void write(String str)：写入字符串
    void write(String str, int off, int len)：写入字符串的某一部分，off字符串的开始索引，len写的字符个数
    void flush()：刷新该流的缓冲
    void close()：关闭此流，但要先刷新它

FileWriter：文件字符输出流
作用：把内存中字符数据写入到文件中
构造方法：
    FileWriter(File file):根据给定的File对象构造一个FileWriter对象
    FileWriter(String fileName):根据给定的文件名构造一个FileWriter对象
字符输出流的使用步骤：
    1.创建FIleWriter对象，构造方法中绑定要写入数据的目的地
    2.使用FIleWriter中的方法write方法，把数据写入到内存缓冲区中（字符转换为字节的过程）
    3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
    4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
flush和close方法的区别：
    flush方法刷新缓冲区，流对象可以继续使用
    close方法先刷新缓冲区，然后通知系统释放资源，流对象不可以在使用
*/
public class StreamDemo9 {
    public static void main(String[] args) throws IOException {
        // 1.创建FIleWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("/home/jikaigg/git/a.txt",true);
        // 2.使用FIleWriter中的方法write方法，把数据写入到内存缓冲区中（字符转换为字节的过程）
        fw.write(97);
        // 使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        //fw.flush();
        // 4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();
    }
}

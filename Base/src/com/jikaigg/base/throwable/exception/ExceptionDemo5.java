package com.jikaigg.base.throwable.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch：异常处理的第二种方式，自己处理异常
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        异常的处理逻辑，异常对象之后，怎么处理异常对象
        工作中，会把异常的信息记录到一个日志中
    }catch(异常类名 变量名){
        ...
    }...

注意：
    1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    2.如果try中长生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
      如果try中没有产生异常，那么就不会执行catch中的异常处理逻辑，执行完try中的代码，继续执行try...catch之后的代码
*/
public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            readFile("abc");
        } catch (FileNotFoundException i) {  // try中抛出什么异常处理逻辑，catch就定义什么异常变量，用来就收这个异常对象
            System.out.println("传递的文件的名字不对");
        }
        System.out.println("后续代码！！！");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不对");
        }
        System.out.println("路径没问题！！！");
    }
}

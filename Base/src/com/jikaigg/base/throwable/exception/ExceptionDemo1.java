package com.jikaigg.base.throwable.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Throwable类是java语言中所有错误或异常的超类
    Exception：编译期异常，进行编译（写代码）java程序出现的问题
        RuntimeException：运行期异常，java程序运行过程中出现的问题
        异常就相当于程序得了一个小毛病，吧异常处理掉，程序可以继续执行
    Error：错误
        错误无法解决，必须修改源代码，程序才能继续执行
*/
public class ExceptionDemo1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int[] arr = {1, 2, 3};
//        System.out.println(arr[0]);
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(date);
    }
}

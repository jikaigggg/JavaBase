package com.jikaigg.base.throwable.exception;

import java.util.Objects;

/*
Objects类中的静态方法
public static <T> requireNonNull(T obj):查看指定引用对象是不是null。
源码：
    public static <T> requireNonNull(T obj){
        if(obj == null){
            throw new NUllNonNullException();
        }
        return obj;
    }
*/
public class ExceptionDemo3 {
    public static void main(String[] args) {
//        method(null);

//        Objects.requireNonNull(null);
        Objects.requireNonNull(null, "参数为空了啊！！");
    }

    // 对传递过来的参数进行合法性判断，判断是否为null
    public static void method(Object obj) {
        if (obj == null) {
            throw new NullPointerException("参数为空！！");
        }
    }
}

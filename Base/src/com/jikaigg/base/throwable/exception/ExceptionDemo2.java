package com.jikaigg.base.throwable.exception;

/*
throw关键字：
    作用： 可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式： throw new xxxException("异常产生的原因")
    注意：
        1.必须写在方法的内部
        2.throw关键字后边new的对象，必须是Exception或者Exception的子类对象
        3.throw关键字抛出的指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序）
            throw关键字后边创建的是编译异常（写代码的时候报错），我们就必须处理这个异常。要么throw要么try...catch
*/
public class ExceptionDemo2 {
    /*
    定义一个方法，获取数组指定索引出的元素
    参数：
        int[] arr
        int index
    工作中首先必须对方法传递过来的参数进行合法性校验
    如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
    注意：
        NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理
     */
    public static void main(String[] args) {
        int[] arr = {1};
        int a = getElement(arr, 1);
        System.out.println(a);
    }

    public static int getElement(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("传递数组的值为空！！！！");
        }
        if (index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组越界了！！！");
        }
        int e = arr[index];
        return e;
    }
}

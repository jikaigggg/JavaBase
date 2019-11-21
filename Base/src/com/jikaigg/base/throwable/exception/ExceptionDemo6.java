package com.jikaigg.base.throwable.exception;
/*
finally
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            工作中，会把异常的信息记录到一个日志中
        }catch(异常类名 变量名){
            ...
        }finally{
            无论是否出现异常都会执行
        }
注意：
    1.finally不能单独使用，必须和try一起使用
    2.finally一般用于资源释放(资源回收)，无论程序是否出现异常，最后都要资源释放
*/
public class ExceptionDemo6 {

}

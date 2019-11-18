package com.jikaigg.base.generics;
/*
定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间

格式：
    修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
        方法体;
    }
*/
public class GenericsDemo4 {
    // 带有泛型的方法
    public <M> void method(M m){
        System.out.println(m);
    }

    // 带有泛型的静态方法
    public static <M> void method1(M m){
        System.out.println(m);
    }
}

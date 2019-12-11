package com.jikaigg.base.annotation;

/*
* 代码里就没有任何警告了，一般传递参数all
* */
@SuppressWarnings("all")
public class AnnotationDemo2 {
    /*
    * 加上注解能够检测下面方法是不是继承自父类方法
    *
    * */
    @Override
    public String toString() {
        return super.toString();
    }

    /*
    * 标注show1()已过时，不建议使用，但是还能正常使用
    * */
    @Deprecated
    public void show1(){
        System.out.println("");
    }
    /*
    * 调用已过时的方法，方法上会有一条横线，提示已过时
    * */
    public void demo(){
        show1();
    }
    @AnnotationDemo3
    public void show2(){
        System.out.println("");
    }
}

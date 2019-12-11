package com.jikaigg.base.annotation;
/*
注解：
    概念：说明程序的。给计算机看的
    注释：用文字描述程序的。给程序员看的

    定义：注解(Annotation)，也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举实在同一个层次。
         它声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
    作用分类：
        1.编写文档：通过代码里表示的元数据生成文档【生成文档doc文档】
        2.代码分析：通过代码里表示的元数据对代码进行分析【使用反射】
        3.编译检查：通过代码里表示的元数据让编译器能够实现基本的编译检查【Override】
    JDK中预定义的一些注解
        @Override ： 检测被该注解标注的方法是否是继承自父类(接口)的
        @Deprecated ： 将该注解标注的内容，已过时。
        @SupperessWarnings ： 压制警告

    自定义注解
        格式：
            元注解
            public @interface 注解名称{}

        本质 ： 注解本质上就是一个接口该接口默认继承Annotation接口
            public interface AnnotationDemo3 extends java.lang.annotation.Annotation{}

        属性：接口中的抽象方法
            要求：
                1.属性的返回值类型：基本数据类型；String；枚举；注解；以上类型的数组；没有viod
                2.定义了属性，在使用时必须给属性赋值
                    1.如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值
                    2.如果一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可
        元注解：用于描述注解的注解
            @Target：描述注解能够作用的位置
                ElementType取值：
                    TYPE：可以作用于类上
                    METHOD：可以作用于方法上
                    FIELD：可以作用于成员变量上
            @Retention：描述注解被保留的阶段
            @Documented：描述注解是否被抽取到api文档中
            @Inherited：描述注解是否被子类继承

    在程序中使用(解析)注解

*/

/**
 * @author jikaigg
 * @version 1.0
 * @since 1.5
 */
public class AnnotationDemo1 {
    /**
     * @param a
     * @param b
     * @return add
     * */
    public int add(int a, int b) {
        return a + b;
    }
}

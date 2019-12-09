package com.jikaigg.base.reflect;
/*
1.Class.forName("全类名"):将字节码文件加载进内存，返回class对象
    多用于配置文件，将类名定义在配置文件中。读取文件，加载类。
2.类名.class:通过类名的属性class获取
    多用于参数的传递
3.对象.getClass():getClass()方法在Object类中定义着
    多用于对象的获取字节码的方式
结论：同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个


*/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.Class.forName("全类名"):将字节码文件加载进内存，返回class对象
        Class cls1 = Class.forName("com.jikaigg.base.reflect.Person");
        System.out.println(cls1);

        // 2.类名.class:通过类名的属性class获取
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 3.对象.getClass():getClass()方法在Object类中定义着
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
    }
}
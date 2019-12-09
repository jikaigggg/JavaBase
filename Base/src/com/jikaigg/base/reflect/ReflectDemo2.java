package com.jikaigg.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/*
Class对象功能：
    获取功能
        1.获取成员变量们
            Field[] getFields()                 获取所有public修饰的成员变量
            Field getField(String name)
            Field[] getDeclaredFields()         获取所有的成员变量，不考虑修饰符
            Field getDeclaredField(String name)

        2.获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)
            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)

        3.获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)
            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)

        4.获取类名
            String getName()

Field 成员变量：
    操作：
        设置值：set(Object obj,Object value)
        获取值：get(Object obj)
Constructor：构造方法
    创建对象：
        T newInstance(Object... initargs)
        如果使用空参数构造方法，可以省略，class对象的newInstance方法
Method：方法对象
    执行方法：invoke(Object obj,Object... args)
    获取方法名称：String getName():获取方法名
*/
public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // 0.获取Person的class对象
        Class per = Person.class;

        /*
        1.获取成员变量们
            Field[] getFields()
            Field getField(String name)
            Field[] getDeclaredFields()
            Field getDeclaredField(String nam
         */
        /*// 获取public修饰的所有成员变量，放入field数组中
        Field[] fields = per.getFields();
        // 遍历field数组，打印所有成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========");
        // 获取name成员变量
        Field a = per.getField("name");
        // 创建一个对象，下面用
        Person p = new Person();
        // 获取对象的成员变量值
        Object o = a.get(p);
        System.out.println(o);
        // 设置成员变量的值
        a.set(p,"zhangsan");
        System.out.println(p);
        System.out.println("==========");*/

        /*
        Field[] getDeclaredFields()
        Field getDeclaredField(String name)
         */
        /*// 获取任何修饰符修饰的所有成员变量，放入Field数组中
        Field[] declaredFields = per.getDeclaredFields();
        // 遍历Field数组
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        Person p2 = new Person();
        Field b = per.getDeclaredField("hello");
        // 忽略访问权限修饰符的安全检查，暴力反射，能够修改private修饰符修饰的成员变量
        b.setAccessible(true);

        Object o2 = b.get(p2);
        System.out.println(o2);

        b.set(p2,"zhangsan");
        System.out.println(p2);*/

        /*
        2.获取构造方法们
            Constructor<?>[] getConstructors()
            Constructor<T> getConstructor(类<?>... parameterTypes)
            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
        */
        /*Constructor cons = per.getConstructor(String.class, String.class, String.class, int.class);
        System.out.println(cons);
        // 创建对象
        Object pp = cons.newInstance("么济恺","爱","石梦宇",1314);
        System.out.println(pp);*/
        /*
        3.获取成员方法们
            Method[] getMethods()
            Method getMethod(String name, 类<?>... parameterTypes)
            Method[] getDeclaredMethods()
            Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */
        /*
        4.获取类名
            String getName()
         */

    }
}


package com.jikaigg.base.throwable.exception;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

/*
子父类异常：
    如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
    父类方法没有抛出异常，子类重写父类该方法时也不可能抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
注意：
    父类异常时什么样，子类也什么样
*/
public class ExceptionDemo8 {
    public void show01() throws NullPointerException, ClassCastException {
    }

    public void show02() throws IndexOutOfBoundsException {
    }

    public void show03() throws IndexOutOfBoundsException {
    }

    public void show04() {
    }
}

class ExceptionZi extends ExceptionDemo8 {
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException {
    }

    // 子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException {
    }

    // 子类重写父类方法时，不抛出异常
    public void show03() {
    }

    // 父类方法没有抛出异常，子类重写父类该方法时也不可能抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
    // public void show04() throws Exception {}
    public void show04() {
        try {

        } catch (Exception e) {

        }
    }

}

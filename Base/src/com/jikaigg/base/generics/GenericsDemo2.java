package com.jikaigg.base.generics;
/*
带有泛型的类的定义与使用：
    public class 类名称<E>{
        private E name；
        Getter and Setter方法
    }
*/
public class GenericsDemo2<E> {
    // 定义一个含有泛型的类
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

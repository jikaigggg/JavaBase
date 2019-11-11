package com.jikaigg.base.anonymous;

/*
 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 new 类名称();
 注意事项：
      匿名对象只能使用唯一的一次，下次在使用不得不再创建一个新对象。
 使用建议：
      如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象。
*/
public class AnonymousDemo1 {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "yaojikai";
        one.showName();
        System.out.println("============");
        // 匿名对象
        new Person().name = "shimengyu";
        new Person().showName();
    }
}

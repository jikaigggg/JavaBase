package com.jikaigg.base.method;

/*
  构造方法：
    专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
  格式：
    public 类名称（参数类型 参数名称）{
        方法体
    }
   注意事项：
       1、构造方法的名称必须和所在的类名称完全一样，就连大小写也要一致。
       2、构造方法不要写返回值，连void也不要写。
       3、构造方法不能return一个具体的返回值。
       4、如果没有编写任何构造方法，那么编译器会默认编写一个构造方法，没有参数、方法体什么事情都不做。（便一起帮助创建的为：public Student(){ }）
       5、一旦编写了至少一个构造方法，那么编译器将不再编写
       6、构造方法也是可以重载的
*/
public class Student {
    //无参数的构造方法
    public Student() {
        System.out.println("构造方法执行了！");
    }

    //有参数的构造方法
    public Student(String name, int age) {
        System.out.println("有参的构造方法执行了！！");
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private boolean male;//是否为男的

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //对于基本数据类型当中的boolean型，一定要写成isXxx，get方法不变
    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

}

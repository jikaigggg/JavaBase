package com.jikaigg.method;
/*
 * 构造方法：
 *   专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
 * 格式：
 *   public 类名称（参数类型 参数名称）{
 *       方法体
 *   }
 *
 * */
public class Student {
    public Student(){
        System.out.println("构造方法执行了！");
    }
    private String name;
    private int age;
    private boolean male;//是否为男的

    public void setName(String na) {
        name = na;
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

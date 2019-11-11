package com.jikaigg.arraylist;

import java.util.ArrayList;

/*
  自定义四个学生对象，添加到集合中并遍历
*/
public class ArrayLiseDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> s1 = new ArrayList<Student>();
        Student ss1 = new Student("1号", 27);
        Student ss2 = new Student("2号", 54);
        Student ss3 = new Student("3号", 98);
        Student ss4 = new Student("4号", 12);
        Student ss5 = new Student("5号", 52);
        Student ss6 = new Student("6号", 14);

        s1.add(ss1);
        s1.add(ss2);
        s1.add(ss3);
        s1.add(ss4);
        s1.add(ss5);
        s1.add(ss6);
        // 传统for循环遍历
        for (int i = 0; i < 6; i++) {
            System.out.println("姓名是：" + s1.get(i).getName() + "    年龄是" + s1.get(i).getAge());
        }
    }

    // 创建学生类
    public static class Student {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

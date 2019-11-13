package com.jikaigg.base.math;

/*
  java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
  public static double abs(double num):获取绝对值
  public static double ceil(double num):向上取整q
  public static double floor(double num):向下取整
  public static double round(double num):四舍五入

  Math.PI代表近似的圆周率常亮
*/
public class MathDemo1 {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));

        // 向上取整
        System.out.println(Math.ceil(3.14));

        // 向下取整
        System.out.println(Math.floor(3.14));

        // 四舍五入
        System.out.println(Math.round(5.14));

        System.out.println(Math.PI);
    }

}

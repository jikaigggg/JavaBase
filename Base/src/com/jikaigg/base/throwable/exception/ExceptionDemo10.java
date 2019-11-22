package com.jikaigg.base.throwable.exception;
/*
需求：模拟注册操作，如果用户名已存在，则抛出异常并提示：该用户已被注册
分析：
    1.使用数组保存已经注册过的用户名（数据库）
    2.使用Scanner获取用户输入的注册用户名（前端、页面）
    3.定义一个方法，对用户输入的注册用户名进行判断
        遍历存储已经注册的用户名数组，获取每一个用户名
        使用获取到的用户名和用户输入作比对
            true：
                用户名被注册，抛出异常，告知用户
            false：
                继续遍历比较
        如果循环结束了，还没有找到重复的用户名，注册成功，add进数组
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo10 {
    public static void main(String[] args) {

    }
}

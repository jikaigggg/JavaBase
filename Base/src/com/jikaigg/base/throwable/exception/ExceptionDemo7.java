package com.jikaigg.base.throwable.exception;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

/*
    如果finally中有return语句，永远返回finally中的结果，避免出现该情况
*/
public class ExceptionDemo7 {
    public static void main(String[] args) {
        int x = getA();
        System.out.println(x);  // 结果为：50
    }

    public static int getA() {
        int a = 100;
        try {
            return a;
        } catch (Exception e) {
            e.toString();
        } finally {
            a = 50;
            return a;
        }
    }
}

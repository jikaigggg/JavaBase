package com.jikaigg.random;

import java.util.Random;

/*
  调用getRandom方法，获取[1，n]的随机数，0取不到，n取得到
*/
public class OneToTen {
    public int getRandom(int n) {
        boolean a = true;
        while (true) {
            int r = new Random().nextInt(n + 1);
            if (r == 0) {
                a = true;
            } else {
                a = false;
                return r;
            }
        }
    }
}

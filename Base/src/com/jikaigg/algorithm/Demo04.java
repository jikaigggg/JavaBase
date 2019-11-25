package com.jikaigg.algorithm;

/*
    画三角形星星
*/
public class Demo04 {
    public static void main(String[] args) {
        getTriangle(5);
    }

    public static void getTriangle(int x) {
        //
        for (int i = 0; i < x; i++) {
            for (int k = x - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


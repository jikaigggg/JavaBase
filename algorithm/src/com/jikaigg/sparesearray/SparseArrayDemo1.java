package com.jikaigg.sparesearray;

public class SparseArrayDemo1 {
    public static void main(String[] args) {
        // 创建一个原始的二维数组11*11
        //0表示没有棋子，1表示黑子，2表示白子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][4] = 2;
        // 输出原始二维数组
        for (int[] ints : chessArr1) {
            for (int anInt : ints) {
                // System.out.print(anInt + " ");
            }
            // System.out.println();
        }

        // 将二维数组 转 稀疏数组
        //1.先遍历二位数组 得到非0的个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        // System.out.println("sum = " + sum);
        //2.创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        // 给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        int count = 0;//计数器变量，计算式稀疏数组的第几行
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i ;
                    sparseArr[count][1] = j ;
                    sparseArr[count][2] = chessArr1[i][j] ;
                }
            }
        }

        for (int[] ints : sparseArr) {
            for (int anInt : ints) {
                 System.out.print(anInt + " ");
            }
             System.out.println();
        }

        //将稀疏数组恢复成原始的二维数组

    }
}

package com.sgtesting.p3;

public class Matrixmultiplication {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int b[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int c[][] = new int[a.length][b[0].length];
        int k = 0;
        for (int i = 0; i <= a.length-1 ; i++) {
            for (int j = 0; j <= b[i].length-1 ; j++) {
                for(k=0;k<=a.length-1;k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i <= c.length - 1; i++) {
            for (int j = 0; j <= c[0].length - 1; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

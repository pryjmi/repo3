package com.pryjmi;

public class Test2 {
    public static void main(String[] args) {
        float[][] matice = {{10, 2, 3},
                            {4, 50, 6},
                            {7, 8, 90}};
        System.out.println(jeDiagonalneDominantni(matice));
    }

    public static boolean jeDiagonalneDominantni(float[][] matrix) {
        boolean test = true;
        float dom = 0;
        float sumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumRow = 0;
            dom = matrix[i][i];
            for (int j = 0; j < matrix[0].length; j++) {
                sumRow = sumRow + matrix[i][j];

            }
            if (dom >= sumRow - dom) {
                continue;
            } else {
                test = false;
                break;
            }
        }
        return test;
    }
}

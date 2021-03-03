package com.pryjmi;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        float[][] matrix = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        float norm = 0;
        float sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.abs(matrix[i][j]);
            }
            if (sum > norm) {
                norm = sum;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i][j]/norm;
                System.out.println(matrix[i][j]);
            }
        }
    }
}

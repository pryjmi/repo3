package com.pryjmi;
import java.util.Scanner;

public class Test4 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        reverseHorizontally(a);
    }

    public static void reverseHorizontally(int[][] a) {
        int temp;
        int k = a.length - 1;
        for (int i = 0; i < (a.length/2); i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp = a[i][j];
                a[i][j] = a[k][j];
                a[k][j] = temp;
            }
            k--;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

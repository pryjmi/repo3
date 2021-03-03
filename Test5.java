package com.pryjmi;
import java.util.Scanner;

public class Test5 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {-3,-6,-3,-6,-9,-6};
        System.out.println(onlyNegativeDivisibleByThree(a));
    }
    public static boolean onlyNegativeDivisibleByThree(int[] a) {
        boolean test = true;
        for (int i = 0; i < a.length; i++) {
            if (((a[i] % 3) != 0) || ((a[i] >= 0))) {
                test = false;
                break;
            }

        }
        return test;
    }
}

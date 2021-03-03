package com.pryjmi;
import java.util.Scanner;

public class Test6 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        float[][] sada = new float[n][2];
        float vzd = 0;
        float prumernaVzd;
        //nacteni bodu
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sada[i].length; j++) {
                sada[i][j] = sc.nextFloat();
            }
        }
        //vzdalenost
        for (int i = 0; i < sada.length - 1; i++) {
            for (int j = i+1; j < sada.length; j++) {
            vzd += Math.sqrt(Math.pow(sada[i][0] - sada[j][0], 2) + Math.pow(sada[i][1] - sada[j][1], 2));
        }
        }
        prumernaVzd = vzd/n;
        System.out.printf("%.2f",prumernaVzd);
    }
}

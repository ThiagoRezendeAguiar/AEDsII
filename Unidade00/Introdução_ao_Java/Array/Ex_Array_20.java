/*
Faça um programa que leia duas matrizes com os mesmos números de linhas e colunas, faça a soma das mesmas e imprima na tela a matriz resultante.  
*/
package Unidade00.Introdução_ao_Java.Array;

import java.util.Scanner;

public class Ex_Array_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 2;

        int[][] m1 = new int[n][n];
        System.out.println("Matriz 1 : ");
        preencher(m1,n,scanner);
        System.out.println();

        int[][] m2 = new int[n][n];
        System.out.println("Matriz 2 : ");
        preencher(m2,n,scanner);
        System.out.println();

        int[][] m3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void preencher(int[][] matriz, int n, Scanner scanner) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posição [" + i + "][" + j + "] : ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}

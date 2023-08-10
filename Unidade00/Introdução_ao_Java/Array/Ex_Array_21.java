/*
Faça um programa que leia os elementos de uma matriz quadrada com N linhas e N colunas e mostre as diagonais principal e secundária.
*/
package Unidade00.Introdução_ao_Java.Array;

import java.util.Scanner;

public class Ex_Array_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas e colunas: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posição [" + i + "][" + j + "] : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    System.out.print("  ");
                else
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal secundária: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j ==  n - 1)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

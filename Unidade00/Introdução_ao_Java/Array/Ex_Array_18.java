/*
Faça um programa que leia os elementos de uma matriz com L linhas e C colunas e mostre na tela os elementos da matriz em formato de grid.
*/
package Unidade00.Introdução_ao_Java.Array;

import java.util.Scanner;

public class Ex_Array_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int l = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int c = scanner.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Posição [" + i + "][" + j + "] : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}

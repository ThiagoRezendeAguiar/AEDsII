/*
Faça um programa que leia os elementos de uma matriz e mostre a média dos elementos. 
*/
package Unidade00.Introdução_ao_Java.Array;

import java.util.Scanner;

public class Ex_Array_22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int l = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int c = scanner.nextInt();

        int[][] matriz = new int[l][c];
        double media = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Posição [" + i + "][" + j + "] : ");
                matriz[i][j] = scanner.nextInt();
                media += matriz[i][j];
            }
        }

        media /= (l*c);
        System.out.println("A média dos elementos da matriz é " + media);

        scanner.close();
    }
}

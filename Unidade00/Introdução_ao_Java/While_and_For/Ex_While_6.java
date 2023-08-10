/*
Faça um programa que leia um número inteiro n e mostre na tela o n-ésimo termo da sequência de Fibonacci
*/
package Unidade00.Introdução_ao_Java.While_and_For;

import java.util.Scanner;

public class Ex_While_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        int i = 0;
        int x = 1;
        int y = 0;
        int z = 0;
        while(i < N){
            System.out.print(x + " ");
            z = y;
            y = x;
            x = y + z;
            i++;
        }
        scanner.close();
    }
}

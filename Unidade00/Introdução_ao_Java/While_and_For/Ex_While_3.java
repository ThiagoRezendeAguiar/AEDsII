/*
Faça um programa que leia um número inteiro N e mostre na tela os N primeiros números inteiros ímpares.
*/
package Unidade00.Introdução_ao_Java.While_and_For;

import java.util.Scanner;

public class Ex_While_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int N = scanner.nextInt();
        scanner.close();
        int i = 0;
        while (i < (N*2)){
          if(i % 2 == 0) System.out.println(i+1);
          i++;
        }
    }
}

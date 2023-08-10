/*
Faça um programa que leia um número inteiro N e mostre na tela os N primeiros números da sequência 1, 5, 12, 16, 23, 27 34.
*/
package Unidade00.Introdução_ao_Java.While_and_For;
import java.util.Scanner;

public class Ex_While_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        int i = 0;
        int num = 1;
        while (i < N) {
            if (i == 0) System.out.print("1 ");
            else if (i % 2 == 0){ 
                num += 7;
                System.out.print(num + " ");
            }
            else{
                num += 4;
                System.out.print(num + " ");
            }
            i++;
        }
        scanner.close();
    }
}

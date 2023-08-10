/*
Faça um programa que leia N números inteiros e mostre na tela a soma daqueles que forem múltiplos de três.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int soma = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            array[i] = scanner.nextInt();
            if(array[i] % 3 == 0) soma += array[i];
        }
         System.out.println("A soma dos números multiplos de 3 é: " + soma);
        scanner.close();
    }
}

/*
Faça um programa para ler um número inteiro N e N elementos de um array. Em seguida, calcular e mostrar o número de elementos pares e o de divisíveis por três.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;


public class Ex_Array_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int pares = 0, d3 = 0;
        for (int i = 0; i < N; i++) {
            if(array[i] % 2 == 0) pares++;
            else if(array[i] % 3 == 0) d3++;
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números divisíveis por 3: " + d3);
        scanner.close();
    }
}

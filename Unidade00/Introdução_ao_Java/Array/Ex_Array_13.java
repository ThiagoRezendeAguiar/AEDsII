/*
Faça um programa para ler um número inteiro N e N elementos de um array. Em seguida, encontre a posição do menor elemento. 
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int pos = 0 , menor = array[0];
        for (int i = 1; i < N; i++){
          if(array[i] < menor){
            menor = array[i];
            pos = i;
          }
        }
        System.out.print("A posição do menor número é " + pos);
        scanner.close();
    }
}

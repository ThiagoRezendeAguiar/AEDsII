/*
Faça um programa que leia os elementos de um array de tamanho n e mostre a posição do menor elemento do array.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_6 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o tamanho do array: ");
       int n = scanner.nextInt();
       int[] array = new int[n];
       for(int i = 0; i < n; i++){
        System.out.print("Digite o número da posição " + i + ": ");
        array[i] = scanner.nextInt();
       }
       int menor = array[0];
       int pos = 0;
       for(int i = 1; i < n; i++){
        if(array[i] < menor){
            menor = array[i];
            pos = i;
        }
       }
       System.out.println("A posição do menor número é " + pos);
       scanner.close();
    }
}

/*
Faça um programa que leia dois arrays contendo números inteiros e mostre a união e a intercessão entre os elementos desses arrays.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();
        int[] array1 = new int[tamanho];
        int[] array2 = new int[tamanho];
        int[] array = new int[2*tamanho];
        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite o número da posição " + i + ": ");
            array1[i] = scanner.nextInt();
        }
        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite o número da posição " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        int j = 0;
        for(int i = 0; i < 2*tamanho; i+=2){
           array[i] = array1[j];
           array[i+1] = array2[j];
           j++;
        }
        for(int i = 0; i < 2*tamanho; i++){
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}

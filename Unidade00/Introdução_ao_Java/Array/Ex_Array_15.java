/*
Faça um programa que leia N números inteiros e mostre na tela a soma do primeiro e do último, a do segundo e do penúltimo, a do terceiro e do antepenúltimo, … 
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < N/2; i++){
            System.out.println("Soma do " + (i+1) + "o com o " + (N-i) + "o :" + (array[i] + array[N-i-1]));
        }
        scanner.close();
    }
}

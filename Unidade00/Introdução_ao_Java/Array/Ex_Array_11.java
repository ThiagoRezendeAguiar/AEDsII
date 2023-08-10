/*
Faça um programa para ler N números inteiros, calcular a média deles e mostrar aqueles que forem maiores que a média.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        double media = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            media += array[i];
        }
        media /= N;
        for (int i = 0; i < N; i++){
            if(array[i] > media){
                System.out.print( array[i] + " ");
            }
        }
        scanner.close();
    }
}

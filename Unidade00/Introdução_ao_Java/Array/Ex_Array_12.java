/*
Faça um programa para ler um número inteiro N e N elementos de um array. Em seguida, se N for par mostrar na tela a soma do 1o e 2o elemento, 3o e 4o, … 
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que serão lidos: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número da posição " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        if( N % 2 == 0){
            for (int i = 0; i < N; i+=2){
               System.out.println("Soma entre " + (i+1) + "o e " + (i+2) +"o : " + (array[i] + array[i+1]));
            }
        }
        scanner.close();
    }
}

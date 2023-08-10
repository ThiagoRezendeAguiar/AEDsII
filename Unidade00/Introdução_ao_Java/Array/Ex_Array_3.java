/*
Faça um programa que leia n números e mostre quais deles são maiores que a média. 
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();
        double media = 0;
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            media += numeros[i];
        }
        media /= n;
        scanner.close();
        System.out.println("Média: " + media);
        System.out.println("Números maiores que a média:");
        
        for (int i = 0; i < n; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
}

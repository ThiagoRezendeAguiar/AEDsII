/*
Faça um programa que leia os elementos de um array de tamanho n e mostre o maior e o menor elementos do array  
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), maior, menor;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        menor = array[0];
        maior = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > maior) {
                maior = array[i];
            } else if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);

        scanner.close();
    }
}

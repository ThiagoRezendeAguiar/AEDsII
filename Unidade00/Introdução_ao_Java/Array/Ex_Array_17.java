/*
Faça um programa para ler um vetor contendo N elementos e outro contendo M elementos. Em seguida, mostre os elementos de forma intercalada. 
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do primeiro vetor: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Digite o tamanho do segundo vetor: ");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Vetores intercalados:");
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n) {
                System.out.print(array1[i] + " ");
                i++;
            }
            if (j < m) {
                System.out.print(array2[j] + " ");
                j++;
            }
        }
        scanner.close();
    }
}

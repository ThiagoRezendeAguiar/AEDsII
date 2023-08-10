/*
Faça um programa que leia n números e os armazene em um array e, em seguida, mostre cada número na tela.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "\u00BA "  + array[i]);
        }            
        scanner.close();
    }
}

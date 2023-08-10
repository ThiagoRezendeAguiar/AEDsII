/*
Faça um programa que receba um array e ordene os elementos desse array.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++){
            int menor = array[i];
            int temp = 0;
            for(int j = i + 1; j < 5; j++){
               if(array[j] < menor){
                 menor = array[j];
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
               }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}

/*
Leia 10 números inteiros, selecione o maior e imprima seu valor na tela. 
*/

package Unidade00.Introdução_ao_Java.If;
import java.util.Scanner;

public class Ex_If_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int maior = array[0];
        for(int i = 0; i < 10; i++){
          if(array[i] > maior) maior = array[i];
        }
        System.out.println("O maior número é " + maior);
    }
}

/*
Faça um programa que leia n números e mostre a soma do i-ésimo com o (2*i+1)-ésimo termo até que (2*i+1) < n.
*/
package Unidade00.Introdução_ao_Java.Array;
import java.util.Scanner;

public class Ex_Array_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        int soma = 0;
        for (int i = 1; (2 * i + 1) < n; i++) {
            int termo1 = i;
            int termo2 = 2 * i + 1;
            soma += termo1 + termo2;
            System.out.println("Termo " + termo1 + ": " + termo1);
            System.out.println("Termo " + termo2 + ": " + termo2);
        }
        
        System.out.println("A soma dos termos é: " + soma);
        
        scanner.close();
    }
}

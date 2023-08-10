/*
Faça um programa para ler uma palavra. Em seguida, mostre o número de caracteres da mesma e seu número de caracteres maiúsculos.  
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int total = palavra.length();
        int maiusculos = 0;

        for (int i = 0; i < total; i++) {
            char caractere = palavra.charAt(i);
            if (Character.isUpperCase(caractere)) {
                maiusculos++;
            }
        }

        System.out.println("Número total de caracteres: " + total);
        System.out.println("Número de caracteres maiúsculos: " + maiusculos);

        scanner.close();
    }
}

/*
Faça um programa que leia uma String e um caractere e mostre na tela quantas vezes esse caractere aparece na String.
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String texto = scanner.nextLine();

        System.out.println("Digite um caractere: ");
        char x = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == x)
                contador++;
        }

        System.out.println("O caractere " + x + " aparece " + contador + " vezes na frase.");

        scanner.close();
    }
}

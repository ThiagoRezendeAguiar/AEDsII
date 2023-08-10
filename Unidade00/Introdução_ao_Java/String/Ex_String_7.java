/*
Faça um programa para ler uma palavra. Em seguida, mostre os números de caracteres, letras, não letras, vogais e consoantes.
*/
package Unidade00.Introdução_ao_Java.String;

import java.util.Scanner;

public class Ex_String_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        int caracteres = palavra.length();
        int letras = 0;
        int nLetras = 0;
        int vogais = 0;

        for (int i = 0; i < caracteres; i++) {
            char caracter = palavra.charAt(i);
            if (Character.isLetter(caracter)) {
                letras++;
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                   vogais++;
                }
            } else {
                nLetras++;
            }
        }
        
        System.out.println("Número de caracteres: " + caracteres);
        System.out.println("Número de letras: " + letras);
        System.out.println("Número de não letras: " + nLetras);
        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + (letras - vogais));

        scanner.close();
    }
}
